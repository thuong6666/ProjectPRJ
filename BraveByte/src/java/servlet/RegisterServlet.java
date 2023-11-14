/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;
import dao.AccountDAO;

/**
 *
 * @author LENOVO
 */
public class RegisterServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            AccountDAO accountDAO = new AccountDAO();
            /* TODO output your page here. You may use following sample code. */
            String username = request.getParameter("usnregister");
            String Email = request.getParameter("emailregister");
            String password = request.getParameter("pwregister");
            String repassword = request.getParameter("rpwregister");
            String fullname = request.getParameter("fullnameregister");
            String phone = request.getParameter("phoneregister");
            try {
                if (password.equals(repassword) == true && accountDAO.isRegister(username, Email, phone) && Email.contains("@gmail.com")) {
                    out.println(username + Email + password + repassword + fullname + phone);
                    accountDAO.setAccount(username, Email, password, fullname, phone);
                    Account acc = accountDAO.getAccount(username, password);
                    HttpSession session = request.getSession();
                    session.setAttribute("acc", acc);
                    response.sendRedirect("home.jsp");
                } else {
                    response.sendRedirect("index.jsp?status=Failed to register!!");
                }
                
            } catch (Exception e) {
                System.out.println(e);
            }
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

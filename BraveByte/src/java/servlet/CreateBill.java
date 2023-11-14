/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlet;

import dao.BillDAO;
import java.io.IOException;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Bill;
import model.Game;

/**
 *
 * @author ADMIN
 */
@WebServlet(name = "CreateBill", urlPatterns = {"/createbill"})
public class CreateBill extends HttpServlet {

    
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    HttpSession session = request.getSession();
    BillDAO billDAO = new BillDAO();
    Bill newBill = new Bill();
    
    List<Game> cartGames = (List<Game>) session.getAttribute("games");
    String randomBillID = generateRandomBillID(16);
    newBill.setBillID(randomBillID);
  
    newBill.setAccID(1);
    
    LocalDate currentDate = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String formattedDate = currentDate.format(formatter);
    newBill.setBillDate(formattedDate);
    
    double total = (double) session.getAttribute("total");
    newBill.setTotal(total); 
    session.setAttribute("billID", randomBillID);
    
    billDAO.createBillAndBillDetails(newBill, cartGames);
    request.getRequestDispatcher("showfullbill").forward(request, response);
}


   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
public String generateRandomBillID(int length) {
    SecureRandom random = new SecureRandom();
    byte[] bytes = new byte[length / 2];
    random.nextBytes(bytes);
    String randomString = new BigInteger(1, bytes).toString(16);
    
    // Pad the string with zeros if it's shorter than the desired length
    while (randomString.length() < length) {
        randomString = "0" + randomString;
    }
    
    return randomString;
}
}

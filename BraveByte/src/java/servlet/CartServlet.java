/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlet;

import dao.CartDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Game;

/**
 *
 * @author ADMIN
 */
@WebServlet(name = "CartServlet", urlPatterns = {"/cart"})
public class CartServlet extends HttpServlet {

  
 
    @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    HttpSession session = request.getSession();
    
    CartDAO cartDAO = new CartDAO();
    List<Game> cartItems = cartDAO.getAllGamesForUser(request);
    
    double total = 0.0;
    for (Game game : cartItems) {
        total += game.getPrice(); 
    }
    
    session.setAttribute("cart", cartItems);
    request.setAttribute("totalPrice", total); 
    
    int itemCount = cartItems.size();
    request.setAttribute("count", itemCount);
    request.getRequestDispatcher("Cart.jsp").forward(request, response);
}

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

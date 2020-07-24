/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
@WebServlet(name = "CartController", urlPatterns = {"/CartController"})
public class CartController extends HttpServlet {

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
        String idsanpham = request.getParameter("idsanpham");// lay gai tri cua doi tuong idsanpham
        HashMap<String, Integer> Cart = new HashMap<String, Integer>();
        HttpSession session = request.getSession();// tao 1 cai session dung de lay yeu cau
        if (idsanpham != null) {
            //lay session
            //kiem tra id 
            int quantity = Integer.parseInt(request.getParameter("BuyQuantity"));// khai bao bien quantity la so nguyen
           
            if (session.getAttribute("listCart") != null) {
                //neu id co trong session, so luong +1
                Cart = (HashMap<String, Integer>) session.getAttribute("listCart");

                if (Cart.containsKey(idsanpham)) {
                    int q = Cart.get(idsanpham);
                    q += quantity;
                    Cart.put(idsanpham, q);
                    session.setAttribute("listCart", Cart);
                } else {
                    Cart.put(idsanpham, quantity);
                    session.setAttribute("listCart", Cart);
                }
            } else {
                // gan gia tri cho list cart
             
                Cart.put(idsanpham, quantity);
                session.setAttribute("listCart", Cart);
            }
            //xoa all neu nguoi dung muon
        } else if (request.getParameter("removeall").equals("clear")) {
            Cart.remove(idsanpham);
            session.setAttribute("listCart", Cart);
           
        }//neu nguoi ding muon mua ngay thi thuc thi
        String buy = request.getParameter("BuyNow");
        if (buy != null) {
            response.sendRedirect("checkout.jsp");
        } else {
            response.sendRedirect(request.getHeader("referer"));
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
        processRequest(request, response);
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

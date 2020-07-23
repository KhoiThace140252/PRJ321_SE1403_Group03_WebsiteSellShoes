/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.admin;

import Dao.DonHangDAO;
import Model.DonHang;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(name = "EditOrderController", urlPatterns = {"/EditOrderController"})
public class EditOrderController extends HttpServlet {

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
        String id = request.getParameter("id");
        if (Integer.parseInt(id) != 0) {
            DonHang dh = new DonHangDAO().getOrderByID(Integer.parseInt(id));
            request.setAttribute("infoOrder", dh);
            RequestDispatcher requestorder = request.getRequestDispatcher("updateOrder.jsp");
            requestorder.forward(request, response);
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
        String idorder = request.getParameter("txtId");
        String customer = request.getParameter("txtCustomerName");
        String products = request.getParameter("txtProductName");
        String amount = request.getParameter("txtAmount");
        String total = request.getParameter("txtTotal");
        Date date = Date.valueOf(request.getParameter("txtDate"));
        String address = request.getParameter("txtAddress");
        String number = request.getParameter("txtPhone");
        String email = request.getParameter("txtEmail");
        String status = request.getParameter("txtStatus");
        DonHang dh = new DonHang(idorder, customer, products, amount, total, date, address, number, email, "Already");
        new DonHangDAO().edit(idorder, dh);
        response.sendRedirect("order.jsp");
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

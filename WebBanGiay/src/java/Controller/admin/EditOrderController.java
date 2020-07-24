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
        String id = request.getParameter("id");//lay gia tri cua id
        /*
        neu id khong phai la so 0 thi thuc thi
        */
        if (Integer.parseInt(id) != 0) {
            DonHang dh = new DonHangDAO().getOrderByID(Integer.parseInt(id));
            request.setAttribute("infoOrder", dh);//gui ket qua ve infoOrder
            RequestDispatcher requestorder = request.getRequestDispatcher("updateOrder.jsp");//chuyen trang ve updateOrder.jsp
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
        String idorder = request.getParameter("txtId");// lay id
        String customer = request.getParameter("txtCustomerName");//lay ten khach hang
        String products = request.getParameter("txtProductName");//lay ten san pham
        String amount = request.getParameter("txtAmount");// lay so luong
        String total = request.getParameter("txtTotal");// lay tong so luong
        Date date = Date.valueOf(request.getParameter("txtDate"));// lay ngay
        String address = request.getParameter("txtAddress");//lay dia chi
        String number = request.getParameter("txtPhone");// lay so dien thoai
        String email = request.getParameter("txtEmail");// lay email
        String status = request.getParameter("txtStatus");// lay trang thai
        DonHang dh = new DonHang(idorder, customer, products, amount, total, date, address, number, email, "Already");
        new DonHangDAO().edit(idorder, dh);
        response.sendRedirect("order.jsp");// chuyen ket qua sang trang order.jsp
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

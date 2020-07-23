/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.admin;

import Dao.KhachHangDAO;
import Model.KhachHang;
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
@WebServlet(name = "EditAccountController", urlPatterns = {"/EditAccountController"})
public class EditAccountController extends HttpServlet {

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
            KhachHang kh = new KhachHangDAO().getAccountByID(Integer.parseInt(id));
            request.setAttribute("infoUser", kh);
            RequestDispatcher requestaccount = request.getRequestDispatcher("updateAccount.jsp");
            requestaccount.forward(request, response);
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
        String idaccount = request.getParameter("txtId");
        String user = request.getParameter("txtUser");
        String pass = request.getParameter("txtPass");
        String fullname = request.getParameter("txtName");
        String gender = request.getParameter("txtGender");
        String phone = request.getParameter("txtPhone");
        String email = request.getParameter("txtEmail");
        Date birth = Date.valueOf(request.getParameter("txtBirth"));
        String address = request.getParameter("txtAddress");
        String number = request.getParameter("txtNumber");
        String role = request.getParameter("txtRole");
        KhachHang kh = new KhachHang(Integer.parseInt(idaccount), user, pass, fullname, gender, phone, email, birth, address, number, role,"Used");
        new KhachHangDAO().edit(Integer.parseInt(idaccount), kh);
        response.sendRedirect("account.jsp");
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

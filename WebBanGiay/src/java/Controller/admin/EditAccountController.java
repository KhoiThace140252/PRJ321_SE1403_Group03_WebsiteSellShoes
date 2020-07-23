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
        String id = request.getParameter("id");//get id khach hang
        if (Integer.parseInt(id) != 0) {//neu id !=0
            KhachHang kh = new KhachHangDAO().getAccountByID(Integer.parseInt(id));//get khach hang by id
            request.setAttribute("infoUser", kh);//tao request luu thong tin
            RequestDispatcher requestaccount = request.getRequestDispatcher("updateAccount.jsp");//chuyen tiep den trang updateAccount.jsp
            requestaccount.forward(request, response);//thuc hien chuyen tiep
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
        String idaccount = request.getParameter("txtId");//get id
        String user = request.getParameter("txtUser");//get user
        String pass = request.getParameter("txtPass");//get pass
        String fullname = request.getParameter("txtName");//get fullname
        String gender = request.getParameter("txtGender");//get gender
        String phone = request.getParameter("txtPhone");//get phone
        String email = request.getParameter("txtEmail");//get email
        Date birth = Date.valueOf(request.getParameter("txtBirth"));//get birthday
        String address = request.getParameter("txtAddress");//get address
        String number = request.getParameter("txtNumber");//get quantity
        String role = request.getParameter("txtRole");//get role
        KhachHang kh = new KhachHang(Integer.parseInt(idaccount), user, pass, fullname, gender, phone, email, birth, address, number, role, "Used");//luu thong tin khach hang vao kh
        new KhachHangDAO().edit(Integer.parseInt(idaccount), kh);//thuc hien update thong tin khach hang
        response.sendRedirect("account.jsp");//chuyen den trang account.jsp
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

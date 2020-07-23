/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.KhachHangDAO;
import Model.KhachHang;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(name = "InformationController", urlPatterns = {"/InformationController"})
public class InformationController extends HttpServlet {

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
        if (request.getParameter("btnChangeInformation") != null) {
            String idaccount = request.getParameter("txtInforId");
            String user = request.getParameter("txtInforUser");
            String pass = request.getParameter("txtInforPass");
            String fullname = request.getParameter("txtInforName");
            String gender = request.getParameter("txtInforGender");
            String phone = request.getParameter("txtInforPhone");
            String email = request.getParameter("txtInforEmail");
            Date birth = Date.valueOf(request.getParameter("txtInforBirth"));
            String address = request.getParameter("txtInforAddress");
            String number = request.getParameter("txtInforNumber");
            String role = request.getParameter("txtInforRole");
            KhachHang kh = new KhachHang(Integer.parseInt(idaccount), user, pass, fullname, gender, phone, email, birth, address, number, role,"Used");
            new KhachHangDAO().edit(Integer.parseInt(idaccount), kh);
            Cookie username1 = new Cookie("username", user);
            Cookie id1 = new Cookie("ID", String.valueOf(kh.getIdTaikhoan()));
            username1.setMaxAge(60 * 60 * 24);
            id1.setMaxAge(60 * 60 * 24);
            response.addCookie(username1);
            response.addCookie(id1);
            response.sendRedirect("index.jsp");
        } else if (request.getParameter("btnChangePassword") != null) {
            String currentpw = request.getParameter("Currentpassword");
            String newpw = request.getParameter("Newpassword");
            String idpw = request.getParameter("IdCookieUser");
            boolean checkChangePW = new KhachHangDAO().changePass(Integer.parseInt(idpw), currentpw, newpw);
            if (checkChangePW) {
                response.sendRedirect("index.jsp");
            } else {
                response.sendRedirect("changepassword.jsp");
            }
        } else if (request.getParameter("btnChangePasswordAdmin") != null) {
            String currentpw = request.getParameter("Currentpasswordadmin");
            String newpw = request.getParameter("Newpasswordadmin");
            String idpw = request.getParameter("IdCookieUseradmin");
            boolean checkChangePW = new KhachHangDAO().changePass(Integer.parseInt(idpw), currentpw, newpw);
            if (checkChangePW) {
                response.sendRedirect("indexadmin.jsp");
            } else {
                response.sendRedirect("passwordadmin.jsp");
            }
        }
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

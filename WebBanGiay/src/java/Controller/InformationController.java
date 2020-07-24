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
            String idaccount = request.getParameter("txtInforId");//lay yeu cau cua doi tuong txtInfoId
            String user = request.getParameter("txtInforUser");// lay yeu cau cua doi tuong txtInforUser
            String pass = request.getParameter("txtInforPass");//lay yeu cau cua doi tuong txtInforPass
            String fullname = request.getParameter("txtInforName");//lay yeu cau cua doi tuong txtInforName
            String gender = request.getParameter("txtInforGender");//lay yeu cau cua doi tuong InforGender
            String phone = request.getParameter("txtInforPhone");//lay yeu cau cua doi tuong txtInforPhone
            String email = request.getParameter("txtInforEmail");//lay yeu cau cua doi tuong InforEmail
            Date birth = Date.valueOf(request.getParameter("txtInforBirth"));//lay yeu cau cua doi tuong txtInforBirth
            String address = request.getParameter("txtInforAddress");//lay yeu cau cua doi tuong txtInforAddress
            String number = request.getParameter("txtInforNumber");//lay yeu cau cua doi tuong txtInforNumber
            String role = request.getParameter("txtInforRole");// lay yeu cau cua doi tuong txtInforRole
            KhachHang kh = new KhachHang(Integer.parseInt(idaccount), user, pass, fullname, gender, phone, email, birth, address, number, role,"Used");
            new KhachHangDAO().edit(Integer.parseInt(idaccount), kh);// id cua khach hang la so nguyen
            Cookie username1 = new Cookie("username", user);//tao moi cookie
            Cookie id1 = new Cookie("ID", String.valueOf(kh.getIdTaikhoan()));
            username1.setMaxAge(60 * 60 * 24);
            id1.setMaxAge(60 * 60 * 24);
            response.addCookie(username1);
            response.addCookie(id1);
            response.sendRedirect("index.jsp");//gui yeu cau ve trang index.jsp
        } else if (request.getParameter("btnChangePassword") != null) {//neu yeu cau thay doi pass khac rong thi thuc thi
            String currentpw = request.getParameter("Currentpassword");// lay gia tri cua Currentpassword
            String newpw = request.getParameter("Newpassword");//lay gia tri cua Newpassword
            String idpw = request.getParameter("IdCookieUser");// lay gia tri cua IdCookieUser
            boolean checkChangePW = new KhachHangDAO().changePass(Integer.parseInt(idpw), currentpw, newpw);//check password cua user
            if (checkChangePW) {//neu khach hang doi password thi gui yeu cau ve index.jsp
                response.sendRedirect("index.jsp");
            } else {
                response.sendRedirect("changepassword.jsp");// nguoc lai thi quay lai trang changepassword.jsp
            }
        } else if (request.getParameter("btnChangePasswordAdmin") != null) {//neu admin muon thay doi password thi thuc thi
            String currentpw = request.getParameter("Currentpasswordadmin");// lay gia tri cua Currentpasswordadmin
            String newpw = request.getParameter("Newpasswordadmin");// lay gia tri cua Newpasswordadmin
            String idpw = request.getParameter("IdCookieUseradmin");// lay gia tri cua IdCookieUseradmin
            boolean checkChangePW = new KhachHangDAO().changePass(Integer.parseInt(idpw), currentpw, newpw);// check password after change
            if (checkChangePW) {
                response.sendRedirect("indexadmin.jsp");// neu co doi mat khau thi chuyen ve index
            } else {
                response.sendRedirect("passwordadmin.jsp");// nguoc lai thi tro nguoc ve trang passwordadmin.jsp
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

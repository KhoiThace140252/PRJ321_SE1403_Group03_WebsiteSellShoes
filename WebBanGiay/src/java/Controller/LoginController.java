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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
@WebServlet(name = "LoginController", urlPatterns = {"/LoginController"})
public class LoginController extends HttpServlet {

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
            String action = request.getParameter("action");
            if (action.equals("Logout")) {
                HttpSession session = request.getSession();
                session.invalidate();
                Cookie[] list = request.getCookies();

                for (Cookie items : list) {
                    if (items.getName().equals("username")) {
                        items.setMaxAge(0);
                        response.addCookie(items);
                    }
                    if (items.getName().equals("ID")) {
                        items.setMaxAge(0);
                        response.addCookie(items);
                    }
                }
            }

            response.sendRedirect("index.jsp");

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
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        String action = request.getParameter("action");
        //res
        String taiKhoan = request.getParameter("taiKhoan");
        String matKhau = request.getParameter("matKhau");
        String tenKhachHang = request.getParameter("ten");
        String gioiTinh = request.getParameter("gioiTinh");
        String soDienThoai = request.getParameter("soDienThoai");
        String email = request.getParameter("email");
        String ngaySinh = request.getParameter("ngaySinh");
        String diaChi = request.getParameter("diaChi");
        String soLuongMua = request.getParameter("soLuongMua");
        String role = request.getParameter("role");
        //login
        String userName = request.getParameter("username");
        String passWord = request.getParameter("password");
        HttpSession session = request.getSession();
        if (action == null) {
        } else if (action.equals("Login")) {
            boolean checkLoginForm = new KhachHangDAO().checkLogin(userName, passWord);
            if (checkLoginForm) {
                KhachHang kh = KhachHangDAO.mapKhachHang.get(userName);
                session.setAttribute("isLogin", true);
                session.setAttribute("userlogin", kh);
                Cookie username1 = new Cookie("username", userName);
                Cookie id1 = new Cookie("ID", String.valueOf(kh.getIdTaikhoan()));
                username1.setMaxAge(60 * 60 * 24);
                id1.setMaxAge(60 * 60 * 24);
                response.addCookie(username1);
                response.addCookie(id1);
                KhachHangDAO khoi = new KhachHangDAO();
                if (khoi.checkRole(userName, passWord)) {
                    response.sendRedirect("indexadmin.jsp");
                } else {
                    response.sendRedirect("index.jsp");
                }
            } else {
                response.sendRedirect("signup.jsp?action=error");
            }
        } else if (action.equals("Res")) {
            //res
            Date ngaySinh1 = Date.valueOf(ngaySinh);
            String quyen = "Customer";
            soLuongMua = "0";
            int IdTaikhoan = 0;
            KhachHang kh = new KhachHang(IdTaikhoan, taiKhoan, matKhau, tenKhachHang, gioiTinh, soDienThoai, email, ngaySinh1,
                    diaChi, soLuongMua, quyen, "Used");
            KhachHangDAO.mapKhachHang.put(kh.getTaiKhoan(), kh);
            new KhachHangDAO().add(kh);
            session.setAttribute("isLogin", true);
            session.setAttribute("userlogin", kh);
            Cookie username2 = new Cookie("username", taiKhoan);
            KhachHang getkh = (KhachHang) new KhachHangDAO().searchCustomer(taiKhoan);
            Cookie id2 = new Cookie("ID", String.valueOf(getkh.getIdTaikhoan()));
            username2.setMaxAge(60 * 60 * 24);
            id2.setMaxAge(60 * 60 * 24);
            response.addCookie(username2);
            response.addCookie(id2);
            response.sendRedirect("index.jsp");
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

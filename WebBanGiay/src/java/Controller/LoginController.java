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
        response.setContentType("text/html;charset=UTF-8");//chap nhan ki tu tieng viet
        try (PrintWriter out = response.getWriter()) {
            String action = request.getParameter("action");//get action
            if (action.equals("Logout")) {//neu nhu gia tri action bang Logout
                HttpSession session = request.getSession();//tao session
                session.invalidate();//xoa session
                Cookie[] list = request.getCookies();//lay danh sach cookie

                for (Cookie items : list) {//vong lap xoa het cac gia tri trong cookie
                    if (items.getName().equals("username")) {//neu nhu ten bang username
                        items.setMaxAge(0);//dat thoi gian lai la 0
                        response.addCookie(items);//thuc hien add cookie lai
                    }
                    if (items.getName().equals("ID")) {//neu nhu ten bang ID
                        items.setMaxAge(0);//dat thoi gian lai la 0
                        response.addCookie(items);//thuc hien add cookie lai
                    }
                }
            }

            response.sendRedirect("index.jsp");//chuyen den trang index.jsp

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
        response.setContentType("text/html;charset=utf-8");//phuong thuc chap nhan kieu chu tieng viet
        String action = request.getParameter("action");//get action
        //res
        String taiKhoan = request.getParameter("taiKhoan");//lay tai khoan nguoi dung
        String matKhau = request.getParameter("matKhau");//lay mat khau nguoi dung
        String tenKhachHang = request.getParameter("ten");//lay ten nguoi dung
        String gioiTinh = request.getParameter("gioiTinh");//lay gioi tinh nguoi dung
        String soDienThoai = request.getParameter("soDienThoai");//lay so dien thoai nguoi dung
        String email = request.getParameter("email");//lay email nguoi dung
        String ngaySinh = request.getParameter("ngaySinh");//lay ngay sinh nguoi dung
        String diaChi = request.getParameter("diaChi");//lay dia chi nguoi dung
        String soLuongMua = request.getParameter("soLuongMua");//lay so luong mua nguoi dung
        String role = request.getParameter("role");//lay vai tro nguoi dung
        //login
        String userName = request.getParameter("username");//lay tai khoan nguoi dung
        String passWord = request.getParameter("password");//lay mat khau nguoi dung
        HttpSession session = request.getSession();//tao session
        if (action == null) {//neu nhu action == null
        } else if (action.equals("Login")) {//neu nhu gia tri action bang Login
            boolean checkLoginForm = new KhachHangDAO().checkLogin(userName, passWord);//kiem tra user va pass
            if (checkLoginForm) {//neu user and pass dung 
                KhachHang kh = KhachHangDAO.mapKhachHang.get(userName);//lay username ve
                session.setAttribute("isLogin", true);//tao session show ten nguoi dung
                session.setAttribute("userlogin", kh);//tao session show ten nguoi dung
                Cookie username1 = new Cookie("username", userName);//tao cookie luu ten nguoi dung
                Cookie id1 = new Cookie("ID", String.valueOf(kh.getIdTaikhoan()));//tao cookie luu Id nguoi dung
                username1.setMaxAge(60 * 60 * 24);//luu trong vong 24h
                id1.setMaxAge(60 * 60 * 24);//luu trong vong 24h
                response.addCookie(username1);//add cookie user
                response.addCookie(id1);//add cookie id
                KhachHangDAO khoi = new KhachHangDAO();//tao mot object
                if (khoi.checkRole(userName, passWord)) {//kiem tra quyen cua nguoi dung neu la admin
                    response.sendRedirect("indexadmin.jsp");
                } else { //neu la user
                    response.sendRedirect("index.jsp");
                }
            } else {//neu dang nhap that bai (pass hoac user khong chinh xac
                response.sendRedirect("signup.jsp?action=error");
            }
        } else if (action.equals("Res")) {//neu nguoi dung chon dang ky
            //res
            Date ngaySinh1 = Date.valueOf(ngaySinh);//lay ngay gio nguoi dung nhap
            String quyen = "Customer";//Khai bao bien quyen voi vai tro mac dinh la Customer
            soLuongMua = "0";//khai bao bien soluongMua mac dinh la 0
            int IdTaikhoan = 0; //khai bao bien IdTaikhoan
            KhachHang kh = new KhachHang(IdTaikhoan, taiKhoan, matKhau, tenKhachHang, gioiTinh, soDienThoai, email, ngaySinh1,
                    diaChi, soLuongMua, quyen, "Used");//luu thong tin vao object khachhang
            KhachHangDAO.mapKhachHang.put(kh.getTaiKhoan(), kh);//luu thong tin vao mapKhachHang
            new KhachHangDAO().add(kh);//luu tai khoan len database
            session.setAttribute("isLogin", true);//tao session show ten nguoi dung
            session.setAttribute("userlogin", kh);//tao session show ten nguoi dung
            Cookie username2 = new Cookie("username", taiKhoan);//tao cookie luu ten nguoi dung
            KhachHang getkh = (KhachHang) new KhachHangDAO().searchCustomer(taiKhoan);//get thong tin khach hang
            Cookie id2 = new Cookie("ID", String.valueOf(getkh.getIdTaikhoan()));//luu id khach hang vao database
            username2.setMaxAge(60 * 60 * 24);//luu trong vong 24h
            id2.setMaxAge(60 * 60 * 24);//luu trong vong 24h
            response.addCookie(username2);//add cookie user
            response.addCookie(id2);//add cookie id
            response.sendRedirect("index.jsp"); //chuyen huong den trang index.jsp
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.DonHangDAO;
import Dao.KhachHangDAO;
import Dao.SanPhamDAO;
import Model.DonHang;
import Model.KhachHang;
import Model.SanPham;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import javax.servlet.RequestDispatcher;
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
@WebServlet(name = "BuyController", urlPatterns = {"/BuyController"})
public class BuyController extends HttpServlet {

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
        Cookie[] list = request.getCookies();//lay danh sach cookie
        if (list.length <= 1) {//neu nguoi dung chua dang nhap
            response.sendRedirect("signup.jsp");//chuyen huong den trang dang nhap
        } else {//neu nguoi dung da dang nhap
            String total_buy = request.getParameter("total");//lay tong tien 
            RequestDispatcher buytotal = request.getRequestDispatcher("buy.jsp");//chuyen huong den trang buy.jsp xac nhan thong tin
            buytotal.forward(request, response);//thuc hien chuyen huong
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
        if (request.getParameter("btnBuy") != null) {//neu nguoi dung quyet dinh mua san pham (cho vao gio hang)
            HashMap<String, Integer> BuyProducts = new HashMap<String, Integer>();//tao mot hashmap 
            HttpSession session = request.getSession();//tao session
            if (session.getAttribute("listCart") != null) {//neu gio hang khac null
                BuyProducts = (HashMap<String, Integer>) session.getAttribute("listCart");//lay thong tin luu vao hashmap voi ten BuyProducts
                String Userbuy = request.getParameter("NameBuy");//ten nguoi mua
                String Useraddress = request.getParameter("AddressBuy");//dia chi nguoi mua
                String Userphone = request.getParameter("PhoneBuy");//so dien thoai nguoi mua
                String Useremail = request.getParameter("EmailBuy");//email nguoi mua
                SanPham sp = null;//tao object sp
                String total_buy = request.getParameter("TotalBuy");//tong tien can thanh toan
                int quantity = 0;//so luong san pham
                int totalExport = 0;//so luong san pham ban
                String listName = "";//ten cac san pham
                for (String i : BuyProducts.keySet()) {//vong lap lay cac key
                    quantity = quantity + BuyProducts.get(i);//so luong san pham = so luong san pham + so luong mua
                    totalExport = totalExport + BuyProducts.get(i);//so luong ban = so luong ban + so luong mua
                    sp = new SanPhamDAO().getProductByID(i);//get san pham
                    listName = listName + " " + sp.getTenSanPham();//luu ten cac san pham nguoi dung da mua
                    //giam so luong san pham sau khi mua            
                    SanPham spUpdate = new SanPhamDAO().getProductByID(i);//get san pham
                    int amount = Integer.parseInt(spUpdate.getSoLuong()) - quantity;//so luong con lai cua 1 san pham
                    int Export = Integer.parseInt(spUpdate.getSoLuongBan()) + quantity;//so luong ban cua 1 san pham
                    new SanPhamDAO().updateQuantity(String.valueOf(amount), String.valueOf(Export), i);//update so luong va so luong ban ben bang san pham
                    quantity = 0;//dat gia tri ve lai ban dau
                    amount = 0;//dat gia tri ve lai ban dau
                    Export = 0;//dat gia tri ve lai ban dau
                }
                DonHang dh = new DonHang("1", Userbuy, listName, String.valueOf(totalExport), total_buy, null, Useraddress, Userphone, Useremail, "Already");//luu don hang
                boolean checkAddBill = new DonHangDAO().add(dh);//luu don hang 
                Cookie[] cookies = request.getCookies();
                KhachHang kh = new KhachHang();//lay danh sach cookie
                if (cookies.length > 1) {//neu nguoi dung da dang nhap roi
                    for (Cookie cookie : cookies) {//vong lap lay gia tri trong cookie
                        if (cookie.getName().equals("ID")) {//neu name cookie bang ID
                            kh = new KhachHangDAO().getAccountByID(Integer.parseInt(cookie.getValue()));//lay thong tin khach hang bang id
                        }
                    }
                }
                new KhachHangDAO().updateBill(Integer.parseInt(kh.getSoLuongMua()) + totalExport, kh.getIdTaikhoan());//cap nhat thong tin khach hang
                if (checkAddBill) {//neu mua thanh cong
                    session.removeAttribute("listCart");//xoa gio hang
                    response.sendRedirect("index.jsp?buySuccess=true");//truyen qua index.jsp
                } else {//neu mua that bai
                    response.sendRedirect("index.jsp?buySuccess=false");//truyen qua index.jsp
                }
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

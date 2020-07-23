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
        Cookie[] list = request.getCookies();
        if (list.length <= 1) {
            response.sendRedirect("signup.jsp");
        } else {
            String total_buy = request.getParameter("total");
            RequestDispatcher buytotal = request.getRequestDispatcher("buy.jsp");
            buytotal.forward(request, response);
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
        if (request.getParameter("btnBuy") != null) {
            HashMap<String, Integer> BuyProducts = new HashMap<String, Integer>();
            HttpSession session = request.getSession();
            if (session.getAttribute("listCart") != null) {
                BuyProducts = (HashMap<String, Integer>) session.getAttribute("listCart");
                String Userbuy = request.getParameter("NameBuy");
                String Useraddress = request.getParameter("AddressBuy");
                String Userphone = request.getParameter("PhoneBuy");
                String Useremail = request.getParameter("EmailBuy");
                SanPham sp = null;
                String total_buy = request.getParameter("TotalBuy");
                int quantity = 0;
                int totalExport = 0;
                String listName = "";
                String listId = "";
                for (String i : BuyProducts.keySet()) {
                    quantity = quantity + BuyProducts.get(i);
                    totalExport = totalExport + BuyProducts.get(i);
                    sp = new SanPhamDAO().getProductByID(i);
                    listName = listName + " " + sp.getTenSanPham();
                    //giam so luong san pham sau khi mua            
                    SanPham spUpdate = new SanPhamDAO().getProductByID(i);
                    int amount = Integer.parseInt(spUpdate.getSoLuong()) - quantity;
                    int Export = Integer.parseInt(spUpdate.getSoLuongBan()) + quantity;
                    new SanPhamDAO().updateQuantity(String.valueOf(amount), String.valueOf(Export), i);
                    quantity = 0;
                    amount = 0;
                    Export = 0;
                }
                DonHang dh = new DonHang("1", Userbuy, listName, String.valueOf(totalExport), total_buy, null, Useraddress, Userphone, Useremail, "Already");
                boolean checkAddBill = new DonHangDAO().add(dh);
                Cookie[] cookies = request.getCookies();
                KhachHang kh = new KhachHang();
                if (cookies.length > 1) {
                    for (Cookie cookie : cookies) {
                        if (cookie.getName().equals("ID")) {
                            kh = new KhachHangDAO().getAccountByID(Integer.parseInt(cookie.getValue()));
                        }
                    }
                }
                new KhachHangDAO().updateBill(Integer.parseInt(kh.getSoLuongMua()) + totalExport, kh.getIdTaikhoan());
                if (checkAddBill) {
                    session.removeAttribute("listCart");
                    response.sendRedirect("index.jsp?buySuccess=true");
                } else {
                    response.sendRedirect("index.jsp?buySuccess=false");
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

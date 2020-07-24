/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.admin;

import Dao.SanPhamDAO;
import Model.SanPham;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author HAOVNCE140475
 */
public class InsertProductController extends HttpServlet {

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
        String masp = (String) request.getParameter("InsertmaSanPham");     //get input id product
        String tensp = (String) request.getParameter("InserttenSanPham");     //get input name product
        String giagiam = (String) request.getParameter("InsertgiaDaGiam");     //get input discount price of product
        String giaban = (String) request.getParameter("InsertgiaBan");     //get input price product
        String nhacungcap = (String) request.getParameter("InsertnhaCungCap");     //get input supplier product
        String maloai = (String) request.getParameter("InsertmaLoai");     //get input id type product product
        String DIR = "images\\";     //get input image product
        String filename = "";
        try {
            filename = DIR + request.getParameter("InserthinhAnh");
        } catch (Exception e) {
        }
        String slnhap = request.getParameter("InsertsoLuongNhap");        //get input quantity product
        int nhap = Integer.parseInt(slnhap);       //convert string to integer
        String soluong = String.valueOf(nhap);       //convert integer to string
        SanPham sp = new SanPham(masp, tensp, giagiam, giaban, soluong, nhacungcap, maloai, filename, slnhap, "0", "Already");
        SanPhamDAO.mapSanPham.put(sp.getMaSanPham(), sp);       //updata data
        new SanPhamDAO().add(sp);      //call method use to insert data
        response.sendRedirect("productsadmin.jsp");     //Redirect to productsadmin.jsp
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

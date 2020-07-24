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
 * @author Admin
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
        String masp = (String) request.getParameter("InsertmaSanPham");//creat masp to request paramater
        String tensp = (String) request.getParameter("InserttenSanPham");//creat tensp to request paramater
        String giagiam = (String) request.getParameter("InsertgiaDaGiam");//creat giagiam to request paramater
        String giaban = (String) request.getParameter("InsertgiaBan");//creat giaban to request paramater
        String nhacungcap = (String) request.getParameter("InsertnhaCungCap");//creat nhacungcap to request paramater
        String maloai = (String) request.getParameter("InsertmaLoai");//creat maloai to request paramater
        String DIR = "images\\";
        String filename = "";
        try {//catch exception
            filename = DIR + request.getParameter("InserthinhAnh"); 
        } catch (Exception e) {         
        }
        String slnhap = request.getParameter("InsertsoLuongNhap");   // creat slnhap 
        int nhap = Integer.parseInt(slnhap);       // slnhap must be integer
        String soluong = String.valueOf(nhap);
        SanPham sp = new SanPham(masp, tensp, giagiam, giaban, soluong, nhacungcap, maloai, filename, slnhap, "0", "Already");
        SanPhamDAO.mapSanPham.put(sp.getMaSanPham(), sp);
        new SanPhamDAO().add(sp);
        response.sendRedirect("productsadmin.jsp");// response to productadmin.jsp
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

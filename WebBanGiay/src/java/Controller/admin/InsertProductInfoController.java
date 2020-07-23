/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.admin;

import Dao.ChiTietSanPhamDAO;
import Model.ChiTietSanPham;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class InsertProductInfoController extends HttpServlet {

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
        String idproductinfo = request.getParameter("txtId");
        String mota1 = request.getParameter("txtDetail");
        String DIR = "images\\";
        String filename = "", filename1 = "", filename2 = "", filename3 = "";
        try {
            filename = DIR + request.getParameter("txtLogo1");
            filename1 = DIR + request.getParameter("txtLogo2");
            filename2 = DIR + request.getParameter("txtLogo3");
            filename3 = DIR + request.getParameter("txtLogo4");
        } catch (Exception e) {

        }
        ChiTietSanPham ctsp = new ChiTietSanPham(idproductinfo, mota1, filename, filename1, filename2, filename3);
        ChiTietSanPhamDAO ctspDAO = new ChiTietSanPhamDAO();
        boolean checkDuplicate = ctspDAO.checkProductIDDuplicate(idproductinfo);
        if (!checkDuplicate) {
            ctspDAO.add(ctsp);
        } else {
            response.sendRedirect("productInfo.jsp");
        }

        response.sendRedirect("productInfo.jsp");
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
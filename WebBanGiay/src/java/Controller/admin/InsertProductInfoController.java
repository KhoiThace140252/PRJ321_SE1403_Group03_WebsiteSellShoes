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
 * @author HAOVNCE140475
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
        String idproductinfo = request.getParameter("txtId");   //get input id product
        String mota1 = request.getParameter("txtDetail");   //get input detail product
        String DIR = "images\\";
        String filename = "", filename1 = "", filename2 = "", filename3 = "";
        try {
            filename = DIR + request.getParameter("txtLogo1");   //get input image 1 product
            filename1 = DIR + request.getParameter("txtLogo2");   //get input image 2  product
            filename2 = DIR + request.getParameter("txtLogo3");   //get input image 3 product
            filename3 = DIR + request.getParameter("txtLogo4");   //get input image 4 product
        } catch (Exception e) {

        }
        ChiTietSanPham ctsp = new ChiTietSanPham(idproductinfo, mota1, filename, filename1, filename2, filename3);
        ChiTietSanPhamDAO ctspDAO = new ChiTietSanPhamDAO();
        boolean checkDuplicate = ctspDAO.checkProductIDDuplicate(idproductinfo);        //check exist
        if (!checkDuplicate) {      //if not exist, insert data
            ctspDAO.add(ctsp);
        } else {
            response.sendRedirect("productInfo.jsp");       //Redirect to productInfo.jsp
        }

        response.sendRedirect("productInfo.jsp");       //Redirect to productInfo.jsp
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.admin;

import Dao.ChiTietSanPhamDAO;
import Model.ChiTietSanPham;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
//@WebServlet(name = "EditProductInfoController", urlPatterns = {"/EditProductInfoController"})
public class EditProductInfoController extends HttpServlet {

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
        String id = request.getParameter("id");
        ChiTietSanPham ctsp = new ChiTietSanPhamDAO().getDetailProductById(id);
        request.setAttribute("infoDetailProduct", ctsp);
        RequestDispatcher requestdetailproduct = request.getRequestDispatcher("updateProductInfo.jsp");
        requestdetailproduct.forward(request, response);

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
        ChiTietSanPham ctsp = new ChiTietSanPhamDAO().getDetailProductById(idproductinfo);
        String oldfilename1 = ctsp.getHinhAnhChiTiet1();
        String oldfilename2 = ctsp.getHinhAnhChiTiet2();
        String oldfilename3 = ctsp.getHinhAnhChiTiet3();
        String oldfilename4 = ctsp.getHinhAnhChiTiet4();
        String filename1 = "", filename2 = "", filename3 = "", filename4 = "";
        try {
            filename1 = DIR + request.getParameter("txtLogo1");
            filename2 = DIR + request.getParameter("txtLogo2");
            filename3 = DIR + request.getParameter("txtLogo3");
            filename4 = DIR + request.getParameter("txtLogo4");
            for (int i = 0; i < 1; i++) {
                if (request.getParameter("txtLogo1").isEmpty()) {
                    filename1 = oldfilename1;
                }
                if (request.getParameter("txtLogo2").isEmpty()) {
                    filename2 = oldfilename2;
                }
                if (request.getParameter("txtLogo3").isEmpty()) {
                    filename3 = oldfilename3;
                }
                if (request.getParameter("txtLogo4").isEmpty()) {
                    filename4 = oldfilename4;
                }
            }
        } catch (Exception ex) {
        }
        ctsp = new ChiTietSanPham(idproductinfo, mota1, filename1, filename2, filename3, filename4);
        new ChiTietSanPhamDAO().edit(idproductinfo, ctsp);
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

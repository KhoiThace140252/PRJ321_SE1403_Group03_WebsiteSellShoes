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
 * @author HAOVNCE140475
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
        String id = request.getParameter("id");     //get id product
        ChiTietSanPham ctsp = new ChiTietSanPhamDAO().getDetailProductById(id);     //get all data about product
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
        String idproductinfo = request.getParameter("txtId");       //get id product
        String mota1 = request.getParameter("txtDetail");       //get product detail
        String DIR = "images\\";
        ChiTietSanPham ctsp = new ChiTietSanPhamDAO().getDetailProductById(idproductinfo);  //get product data
        String oldfilename1 = ctsp.getHinhAnhChiTiet1();    //get link product image
        String oldfilename2 = ctsp.getHinhAnhChiTiet2();    //get link product image
        String oldfilename3 = ctsp.getHinhAnhChiTiet3();    //get link product image
        String oldfilename4 = ctsp.getHinhAnhChiTiet4();    //get link product image
        String filename1 = "", filename2 = "", filename3 = "", filename4 = "";
        try {
            filename1 = DIR + request.getParameter("txtLogo1");         //get image input 
            filename2 = DIR + request.getParameter("txtLogo2");         //get image input 
            filename3 = DIR + request.getParameter("txtLogo3");         //get image input 
            filename4 = DIR + request.getParameter("txtLogo4");         //get image input 
            for (int i = 0; i < 1; i++) { //loop use to check empty
                if (request.getParameter("txtLogo1").isEmpty()) {   //if image null, set new file is old file
                    filename1 = oldfilename1;
                }
                if (request.getParameter("txtLogo2").isEmpty()) {   //if image null, set new file is old file
                    filename2 = oldfilename2;
                }
                if (request.getParameter("txtLogo3").isEmpty()) {   //if image null, set new file is old file
                    filename3 = oldfilename3;
                }
                if (request.getParameter("txtLogo4").isEmpty()) {   //if image null, set new file is old file
                    filename4 = oldfilename4;
                }
            }
        } catch (Exception ex) {
        }
        ctsp = new ChiTietSanPham(idproductinfo, mota1, filename1, filename2, filename3, filename4);
        new ChiTietSanPhamDAO().edit(idproductinfo, ctsp);//upadate data
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

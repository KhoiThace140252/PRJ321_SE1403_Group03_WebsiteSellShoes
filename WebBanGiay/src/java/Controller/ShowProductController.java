/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.ChiTietSanPhamDAO;
import Dao.NhaCungCapDAO;
import Dao.SanPhamDAO;
import Model.ChiTietSanPham;
import Model.NhaCungCap;
import Model.SanPham;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(name = "ShowProductController", urlPatterns = {"/ShowProductController"})
public class ShowProductController extends HttpServlet {

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
        
            String idproductshow = request.getParameter("iddetailproduct"); // lay gia tri tu doi tuong iddetailproduct
            ChiTietSanPham ctsp = new ChiTietSanPhamDAO().getDetailProductById(idproductshow);// tao chi tiet san pham vaf lay gia tri
            SanPham sp=new SanPhamDAO().getProductByID(idproductshow);// lay id cua san pham
            String supplier=sp.getMaNhaCungCap();// lay ma nha cung cap
            NhaCungCap ncc=new NhaCungCapDAO().getSupplierByID(supplier);
            request.setAttribute("showfromindex1", ctsp);//gui yeu cau ve showfromindex1
            request.setAttribute("showfromindex2", sp);// gui yeu cau ve showfromindex2
            request.setAttribute("showfromindex3", ncc);// gui yeu cau ve showfromindex3
            RequestDispatcher requestshowfromindex = request.getRequestDispatcher("single.jsp");// gui yeu cau ve single.jsp
            requestshowfromindex.forward(request, response);//gui yeu cau 
        
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
        processRequest(request, response);
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

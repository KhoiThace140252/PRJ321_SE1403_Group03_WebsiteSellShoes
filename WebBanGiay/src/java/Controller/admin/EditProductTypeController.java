/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.admin;

import Dao.LoaiSanPhamDAO;
import Model.LoaiSanPham;
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
 * @author HAOVNCE140475
 */
@WebServlet(name = "EditProductTypeController", urlPatterns = {"/EditProductTypeController"})
public class EditProductTypeController extends HttpServlet {

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
        String id = request.getParameter("id");     //get input id type product 
        if (id != null) {   //if id not null
            LoaiSanPham lsp = new LoaiSanPhamDAO().getTypeProductByID(id);  //call method use to get data type product by id    
            request.setAttribute("infoTypeProduct", lsp);
            //Redirect to updateTypeProduct.jsp
            RequestDispatcher requesttypeproduct = request.getRequestDispatcher("updateTypeProduct.jsp");
            requesttypeproduct.forward(request, response);
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
        String id = request.getParameter("txtID");      //get input id type product
        String name = request.getParameter("txtNameType");      //get input name type of product
        String supplierid = request.getParameter("txtSupplier");      //get input supplier type product
        String description = request.getParameter("txtDescription");      //get input description type product
        LoaiSanPham lsp = new LoaiSanPham(id, name, supplierid, description);
        new LoaiSanPhamDAO().edit(id, lsp);     //update type product
        response.sendRedirect("typesProduct.jsp");     //Redirect to typesProduct.jsp
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

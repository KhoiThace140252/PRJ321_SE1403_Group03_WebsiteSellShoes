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
@WebServlet(name = "EditProductController", urlPatterns = {"/EditProductController"})
@MultipartConfig
public class EditProductController extends HttpServlet {

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
        String id = request.getParameter("id");     //get Id product
        if (id != null) {   //if id not null 
            SanPham sp = new SanPhamDAO().getProductByID(id);       //call method use to get product data by id
            request.setAttribute("infoProduct", sp);        //set attribute for product data
            RequestDispatcher requestproduct = request.getRequestDispatcher("updateProduct.jsp");         //Redirec to updateProduct.jsp
            requestproduct.forward(request, response);
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
     *
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String idproduct = request.getParameter("txtId");       //get id product
        String name = request.getParameter("txtNameProduct");       //get name product
        String giagiam = request.getParameter("txtDiscount");       //get discount product
        String giaban = request.getParameter("txtPrice");       //get price product
        String soluong = request.getParameter("txtQuantity");       //get quantity product
        String nhacungcap = request.getParameter("txtIdSupplier");       //get supplier product
        String maloai = request.getParameter("txtIdType");       //get id type product
        String DIR = "images";       //get link image product

        SanPhamDAO sd = new SanPhamDAO();
        String filename = sd.getProductByID(idproduct).getHinhAnh();        //get link image product
        try {

            String path = getServletContext().getRealPath("") + File.separator;
            Part part = request.getPart("txtLogo");
            String subFile = part.getSubmittedFileName();
            if (!subFile.equals("")) {
                filename = DIR + File.separator + subFile;
                String path2 = path + filename;
                part.write(path2);

            }
        } catch (Exception e) {

        }
        String soluongnhap = request.getParameter("txtImport");     //get input quantity
        String soluongban = request.getParameter("txtExport");     //get solde quantity
        SanPham sp = new SanPham(idproduct, name, giagiam, giaban, soluong, nhacungcap, maloai, filename, soluongnhap, soluongban, "Already");
        sd.edit(idproduct, sp);     //add data after edit
        response.sendRedirect("productsadmin.jsp");         //Redirect to productsadmin.jsp
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

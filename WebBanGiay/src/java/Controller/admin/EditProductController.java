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
        String id = request.getParameter("id");
        if (id != null) {
            SanPham sp = new SanPhamDAO().getProductByID(id);
            request.setAttribute("infoProduct", sp);
            RequestDispatcher requestproduct = request.getRequestDispatcher("updateProduct.jsp");
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

        String idproduct = request.getParameter("txtId");
        String name = request.getParameter("txtNameProduct");
        String giagiam = request.getParameter("txtDiscount");
        String giaban = request.getParameter("txtPrice");
        String soluong = request.getParameter("txtQuantity");
        String nhacungcap = request.getParameter("txtIdSupplier");
        String maloai = request.getParameter("txtIdType");
        String DIR = "images";

        SanPhamDAO sd = new SanPhamDAO();
        String filename = sd.getProductByID(idproduct).getHinhAnh();
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
        String soluongnhap = request.getParameter("txtImport");
        String soluongban = request.getParameter("txtExport");
        SanPham sp = new SanPham(idproduct, name, giagiam, giaban, soluong, nhacungcap, maloai, filename, soluongnhap, soluongban, "Already");
        sd.edit(idproduct, sp);
        response.sendRedirect("productsadmin.jsp");
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

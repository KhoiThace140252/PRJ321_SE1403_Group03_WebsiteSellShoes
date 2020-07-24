/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.admin;

import Dao.NhaCungCapDAO;
import Model.NhaCungCap;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author Admin
 */
@WebServlet(name = "EditSupplierController", urlPatterns = {"/EditSupplierController"})
public class EditSupplierController extends HttpServlet {

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
        String id = request.getParameter("id");//gui phan hoi ve id
        /*
        neu id khac gia tri rong thi thuc thi 
        */
        if (id != null) {
            NhaCungCap ncc = new NhaCungCapDAO().getSupplierByID(id);//lay id cua nha cung cap
            request.setAttribute("infoSupplierProduct", ncc);
            RequestDispatcher requestsupplier = request.getRequestDispatcher("updateSupplier.jsp");//chuyen ket qua trang trang updateSupplier.jsp
            requestsupplier.forward(request, response);
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
        String id = request.getParameter("UpdateIdSupplier");//lay gia tri cua doi tuong UpdateIdSupplier
        String name = request.getParameter("UpdateNameSupplier"); //lay gia tri cua doi tuong UpdateNameSupplier
        String diachi = request.getParameter("UpdateAddressSupplier");// lay gia tri cua UpdateNameSupplier
        String sodt = request.getParameter("UpdatePhoneSupplier");// lay gia tri cua UpdatePhoneSupplier
        String DIR = "images\\";
        String filename = "";
        String oldfilename = new NhaCungCapDAO().getSupplierByID(id).getLogo();
        // bat loi neu UpdateLogoSupplier la rong thi ten se bang ten cu
        try {
            if (request.getParameter("UpdateLogoSupplier").equals("")) {
                filename = oldfilename;
            } else {
                filename = DIR + request.getParameter("UpdateLogoSupplier");
            }
        } catch (Exception e) {
        }
        String mota = request.getParameter("UpdateDescriptionSupplier");//lay ket qua cua doi tuong UpdateDescriptionSupplier
        NhaCungCap ncc = new NhaCungCap(id, name, diachi, sodt, filename, mota, "Already");
        new NhaCungCapDAO().edit(id, ncc);
        response.sendRedirect("suppliers.jsp");// chuyen trang suppliers.jsp
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

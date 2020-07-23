package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.DonHang;
import Dao.DonHangDAO;
import Dao.KhachHangDAO;
import Model.KhachHang;

public final class information_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <title>Information</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core CSS-->\n");
      out.write("        <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom fonts for this template-->\n");
      out.write("        <link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("        <!-- Custom styles for this template-->\n");
      out.write("        <link href=\"css/sb-admin.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body class=\"bg-dark\">\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"card card-register mx-auto mt-5\">\n");
      out.write("                <div class=\"card-header\">Change Information</div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <form id=\"edit-form-update\" action=\"InformationController\" method=\"post\">        \n");
      out.write("                        ");

                            Cookie[] cookies = request.getCookies();
                            if (cookies.length > 1) {
                                for (Cookie cookie : cookies) {
                                    if (cookie.getName().equals("ID")) {
                                        KhachHang kh = new KhachHangDAO().getAccountByID(Integer.parseInt(cookie.getValue()));
                                        DonHang dh = new DonHangDAO().getOrderByID(Integer.parseInt(cookie.getValue()));

                        
      out.write("\n");
      out.write("\n");
      out.write("                        <!--Account's ID -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-label-group\">\n");
      out.write("                                <input type=\"hidden\"  name=\"txtInforId\" value=\"");
      out.print(kh.getIdTaikhoan());
      out.write("\" class=\"form-control\" > \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!--Account's Name -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-label-group\">\n");
      out.write("                                <input type=\"text\"  name=\"txtInforUser\" value=\"");
      out.print(kh.getTaiKhoan());
      out.write("\" class=\"form-control\" >\n");
      out.write("                                <label>Account's Name</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!--Password-->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-label-group\">\n");
      out.write("                                <input type=\"hidden\"  name=\"txtInforPass\" value=\"");
      out.print(kh.getMatKhau());
      out.write("\" class=\"form-control\" >          \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!--Fullname -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-label-group\">\n");
      out.write("                                <input type=\"text\"  name=\"txtInforName\" value=\"");
      out.print(kh.getTen());
      out.write("\" class=\"form-control\" >\n");
      out.write("                                <label>Fullname</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!--Gender -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                            <label>Gender</label>\n");
      out.write("                            <div class=\"form-label-group\">\n");
      out.write("                                <select name=\"txtInforGender\" value=\"");
      out.print(kh.getGioiTinh());
      out.write("\" class=\"form-control\">\n");
      out.write("                                    <option value=\"Male\">Male</option>\n");
      out.write("                                    <option value=\"Female\">Female</option>\n");
      out.write("                                    <option value=\"Other\">Other</option>\n");
      out.write("                                </select>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!--Phone Number -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-label-group\">\n");
      out.write("                                <input type=\"text\"  name=\"txtInforPhone\" value=\"");
      out.print(kh.getSoDienThoai());
      out.write("\" class=\"form-control\" >\n");
      out.write("                                <label>Phone Number</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!--Email -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-label-group\">\n");
      out.write("                                <input type=\"email\"  name=\"txtInforEmail\" value=\"");
      out.print(kh.getEmail());
      out.write("\" class=\"form-control\" >\n");
      out.write("                                <label>Email</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!--Birthday -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-label-group\">\n");
      out.write("                                <input type=\"date\"  name=\"txtInforBirth\" value=\"");
      out.print(kh.getNgaySinh());
      out.write("\" class=\"form-control\" >\n");
      out.write("                                <label>Birthday</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!--Address -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-label-group\">\n");
      out.write("                                <input type=\"text\"  name=\"txtInforAddress\" value=\"");
      out.print(kh.getDiaChi());
      out.write("\" class=\"form-control\" >\n");
      out.write("                                <label>Address</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!--Quantity -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-label-group\">\n");
      out.write("                                <input type=\"text\"  name=\"txtInforNumber\" value=\"");
      out.print(kh.getSoLuongMua());
      out.write("\" class=\"form-control\" readonly>\n");
      out.write("                                <label>Quantity</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!--Customer's Name -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-label-group\">\n");
      out.write("                                <input type=\"text\"  name=\"txtInforNumber\" value=\"");
      out.print(kh.get());
      out.write("\" class=\"form-control\" readonly>\n");
      out.write("                                <label>Total of money</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!--Role -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-label-group\">\n");
      out.write("                                <input type=\"hidden\"  name=\"txtInforRole\" value=\"");
      out.print(kh.getRole());
      out.write("\" class=\"form-control\" >\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        ");
                                    }
                                }
                            }
                        
      out.write("\n");
      out.write("                        <input class=\"btn btn-primary btn-block\" type=\"submit\" name=\"btnChangeInformation\" value=\"Change\"/>\n");
      out.write("                        <a class=\"btn btn-dark btn-block\" href=\"changepassword.jsp\">Change PassWord</a>\n");
      out.write("                        <a class=\"btn btn-dark btn-block\" href=\"index.jsp\">Cancel</a>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>     \n");
      out.write("        <!-- Bootstrap core JavaScript-->\n");
      out.write("        <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("        <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Core plugin JavaScript-->\n");
      out.write("        <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.KhachHang;

public final class updateAccount_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <title>Update Account</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core CSS-->\n");
      out.write("        <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom fonts for this template-->\n");
      out.write("        <link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("        <!-- Custom styles for this template-->\n");
      out.write("        <link href=\"css/sb-admin.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\"bg-dark\">\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"card card-register mx-auto mt-5\">\n");
      out.write("                <div class=\"card-header\">Update Account</div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <form id=\"edit-form-update\" action=\"EditAccountController\" method=\"post\">        \n");
      out.write("                        ");

                            KhachHang kh = (KhachHang) request.getAttribute("infoUser");
                        
      out.write("\n");
      out.write("                        <!--Account's ID -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-label-group\">\n");
      out.write("                                <input type=\"hidden\"  name=\"txtId\" value=\"");
      out.print(kh.getIdTaikhoan());
      out.write("\" class=\"form-control\" > \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!--Account's Name -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-label-group\">\n");
      out.write("                                <input type=\"text\"  name=\"txtUser\" value=\"");
      out.print(kh.getTaiKhoan());
      out.write("\" class=\"form-control\" >\n");
      out.write("                                <label>Account's Name</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!--Password-->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-label-group\">\n");
      out.write("                                <input type=\"hidden\"  name=\"txtPass\" value=\"");
      out.print(kh.getMatKhau());
      out.write("\" class=\"form-control\" >          \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!--Fullname -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-label-group\">\n");
      out.write("                                <input type=\"text\"  name=\"txtName\" value=\"");
      out.print(kh.getTen());
      out.write("\" class=\"form-control\" >\n");
      out.write("                                <label>Fullname</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!--Gender -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-label-group\">\n");
      out.write("                                <td> <select name=\"txtGender\" value=\"");
      out.print(kh.getGioiTinh());
      out.write("\" class=\"form-control\" >\n");
      out.write("                                        <option value=\"Male\">Male</option>\n");
      out.write("                                        <option value=\"Female\">Female</option>\n");
      out.write("                                        <option value=\"Other\">Other</option>\n");
      out.write("                                    </select></td>\n");
      out.write("                              \n");
      out.write("                                <label>Gender</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!--Phone Number -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-label-group\">\n");
      out.write("                                <input type=\"text\"  name=\"txtPhone\" value=\"");
      out.print(kh.getSoDienThoai());
      out.write("\" class=\"form-control\" >\n");
      out.write("                                <label>Phone Number</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!--Email -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-label-group\">\n");
      out.write("                                <input type=\"email\"  name=\"txtEmail\" value=\"");
      out.print(kh.getEmail());
      out.write("\" class=\"form-control\" >\n");
      out.write("                                <label>Email</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!--Birthday -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-label-group\">\n");
      out.write("                                <input type=\"date\"  name=\"txtBirth\" value=\"");
      out.print(kh.getNgaySinh());
      out.write("\" class=\"form-control\" >\n");
      out.write("                                <label>Birthday</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!--Address -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-label-group\">\n");
      out.write("                                <input type=\"text\"  name=\"txtAddress\" value=\"");
      out.print(kh.getDiaChi());
      out.write("\" class=\"form-control\" >\n");
      out.write("                                <label>Address</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!--Customer's Name -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-label-group\">\n");
      out.write("                                <input type=\"hidden\"  name=\"txtNumber\" value=\"");
      out.print(kh.getSoLuongMua());
      out.write("\" class=\"form-control\" >\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!--Role -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-label-group\">\n");
      out.write("                                <input type=\"hidden\"  name=\"txtRole\" value=\"");
      out.print(kh.getRole());
      out.write("\" class=\"form-control\" >\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>                      \n");
      out.write("                        <input class=\"btn btn-primary btn-block\" type=\"submit\" value=\"Update\"/>\n");
      out.write("                        <a class=\"btn btn-dark btn-block\" href=\"account.jsp\">Cancel</a>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            function actionEdit() {\n");
      out.write("                $(\"#edit-form-update\").submit();\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <!-- Bootstrap core JavaScript-->\n");
      out.write("        <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("        <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Core plugin JavaScript-->\n");
      out.write("        <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
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

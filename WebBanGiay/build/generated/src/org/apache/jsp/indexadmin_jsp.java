package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class indexadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Dashboard</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core CSS-->\n");
      out.write("        <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom fonts for this template-->\n");
      out.write("        <link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("        <!-- Page level plugin CSS-->\n");
      out.write("        <link href=\"vendor/datatables/dataTables.bootstrap4.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom styles for this template-->\n");
      out.write("        <link href=\"css/sb-admin.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body id=\"page-top\">\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header-admin/header-top.jsp", out, false);
      out.write("\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("            <!-- Sidebar -->\n");
      out.write("               <!-- Headerbottom -->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header-admin/header-bottom.jsp", out, false);
      out.write("\n");
      out.write("            <!-- Header bottom -->\n");
      out.write("\n");
      out.write("            <div id=\"content-wrapper\">\n");
      out.write("\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                    <!-- Breadcrumbs-->\n");
      out.write("          <ol class=\"breadcrumb\">\n");
      out.write("            <li class=\"breadcrumb-item\">\n");
      out.write("              <a href=\"#\">Dashboard</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"breadcrumb-item active\">Overview</li>\n");
      out.write("          </ol>\n");
      out.write("\n");
      out.write("          <!-- Icon Cards-->\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-xl-3 col-sm-6 mb-3\">\n");
      out.write("              <div class=\"card text-white bg-primary o-hidden h-100\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                  <div class=\"card-body-icon\">\n");
      out.write("                    <i class=\"fas fa-fw fa-user\"></i>\n");
      out.write("                  </div>\n");
      out.write("                    <div class=\"mr-5\"><h2>Accounts</h2></div>\n");
      out.write("                </div>\n");
      out.write("                <a class=\"card-footer text-white clearfix small z-1\" href=\"account.jsp\">\n");
      out.write("                  <span class=\"float-left\">View Details</span>\n");
      out.write("                  <span class=\"float-right\">\n");
      out.write("                    <i class=\"fas fa-angle-right\"></i>\n");
      out.write("                  </span>\n");
      out.write("                </a>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xl-3 col-sm-6 mb-3\">\n");
      out.write("              <div class=\"card text-white bg-warning o-hidden h-100\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                  <div class=\"card-body-icon\">\n");
      out.write("                    <i class=\"fas fa-fw fa-paper-plane\"></i>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"mr-5\"><h2>Orders</h2></div>\n");
      out.write("                </div>\n");
      out.write("                <a class=\"card-footer text-white clearfix small z-1\" href=\"order.jsp\">\n");
      out.write("                  <span class=\"float-left\">View Details</span>\n");
      out.write("                  <span class=\"float-right\">\n");
      out.write("                    <i class=\"fas fa-angle-right\"></i>\n");
      out.write("                  </span>\n");
      out.write("                </a>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xl-3 col-sm-6 mb-3\">\n");
      out.write("              <div class=\"card text-white bg-success o-hidden h-100\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                  <div class=\"card-body-icon\">\n");
      out.write("                    <i class=\"fas fa-fw fa-shopping-cart\"></i>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"mr-5\"><h2>Products</h2></div>\n");
      out.write("                </div>\n");
      out.write("                <a class=\"card-footer text-white clearfix small z-1\" href=\"productsadmin.jsp\">\n");
      out.write("                  <span class=\"float-left\">View Details</span>\n");
      out.write("                  <span class=\"float-right\">\n");
      out.write("                    <i class=\"fas fa-angle-right\"></i>\n");
      out.write("                  </span>\n");
      out.write("                </a>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("              \n");
      out.write("           \n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("          <div class=\"row\">\n");
      out.write("               <div class=\"col-xl-3 col-sm-6 mb-3\">\n");
      out.write("              <div class=\"card text-white bg-danger o-hidden h-100\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                  <div class=\"card-body-icon\">\n");
      out.write("                    <i class=\"fas fa-fw fa-box\"></i>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"mr-5\"><h2>Suppliers</h2></div>\n");
      out.write("                </div>\n");
      out.write("                <a class=\"card-footer text-white clearfix small z-1\" href=\"suppliers.jsp\">\n");
      out.write("                  <span class=\"float-left\">View Details</span>\n");
      out.write("                  <span class=\"float-right\">\n");
      out.write("                    <i class=\"fas fa-angle-right\"></i>\n");
      out.write("                  </span>\n");
      out.write("                </a>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("               <div class=\"col-xl-3 col-sm-6 mb-3\">\n");
      out.write("              <div class=\"card text-white bg-dark o-hidden h-100\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                  <div class=\"card-body-icon\">\n");
      out.write("                    <i class=\"fas fa-fw fa-comments\"></i>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"mr-5\"><h2>Feedbacks</h2></div>\n");
      out.write("                </div>\n");
      out.write("                <a class=\"card-footer text-white clearfix small z-1\" href=\"feedback.jsp\">\n");
      out.write("                  <span class=\"float-left\">View Details</span>\n");
      out.write("                  <span class=\"float-right\">\n");
      out.write("                    <i class=\"fas fa-angle-right\"></i>\n");
      out.write("                  </span>\n");
      out.write("                </a>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          \n");
      out.write("    </div>\n");
      out.write("    <!-- /#wrapper -->\n");
      out.write("\n");
      out.write("    <!-- Scroll to Top Button-->\n");
      out.write("    <a class=\"scroll-to-top rounded\" href=\"#page-top\">\n");
      out.write("      <i class=\"fas fa-angle-up\"></i>\n");
      out.write("    </a>\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <!-- Bootstrap core JavaScript-->\n");
      out.write("    <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("    <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Core plugin JavaScript-->\n");
      out.write("    <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Page level plugin JavaScript-->\n");
      out.write("    <script src=\"vendor/chart.js/Chart.min.js\"></script>\n");
      out.write("    <script src=\"vendor/datatables/jquery.dataTables.js\"></script>\n");
      out.write("    <script src=\"vendor/datatables/dataTables.bootstrap4.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Custom scripts for all pages-->\n");
      out.write("    <script src=\"js/sb-admin.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Demo scripts for this page-->\n");
      out.write("    <script src=\"js/demo/datatables-demo.js\"></script>\n");
      out.write("    <script src=\"js/demo/chart-area-demo.js\"></script>\n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("\n");
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
package org.apache.jsp.header;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_002dbottom_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header-botom\">\n");
      out.write("            <div class=\"content white\">\n");
      out.write("                <nav class=\"navbar navbar-default nav-menu\" role=\"navigation\">\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <!--/.navbar-header-->\n");
      out.write("\n");
      out.write("                    <div class=\"collapse navbar-collapse collapse-pdng\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                        <ul class=\"nav navbar-nav nav-font\">\n");
      out.write("                            <li class=\"dropdown\">\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Shop<b class=\"caret\"></b></a>\n");
      out.write("                                <ul class=\"dropdown-menu\">\n");
      out.write("                                    <li><a href=\"products.jsp\">Shoes</a></li>\n");
      out.write("                                    <li><a href=\"products.jsp\">Tees</a></li>\n");
      out.write("                                    <li><a href=\"products.jsp\">Tops</a></li>\n");
      out.write("                                    <li class=\"divider\"></li>\n");
      out.write("                                    <li><a href=\"products.jsp\">Tracks</a></li>\n");
      out.write("                                    <li class=\"divider\"></li>\n");
      out.write("                                    <li><a href=\"products.jsp\">Gear</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"dropdown\">\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Men<b class=\"caret\"></b></a>\n");
      out.write("                                <ul class=\"dropdown-menu multi-column columns-3\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-sm-4 menu-img-pad\">\n");
      out.write("                                            <ul class=\"multi-column-dropdown\">\n");
      out.write("                                                <li><a href=\"products.jsp\">Joggers</a></li>\n");
      out.write("                                                <li><a href=\"products.jsp\">Foot Ball</a></li>\n");
      out.write("                                                <li><a href=\"products.jsp\">Cricket</a></li>\n");
      out.write("                                                <li class=\"divider\"></li>\n");
      out.write("                                                <li><a href=\"products.jsp\">Tennis</a></li>\n");
      out.write("                                                <li class=\"divider\"></li>\n");
      out.write("                                                <li><a href=\"products.jsp\">Casual</a></li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-sm-4 menu-img-pad\">\n");
      out.write("                                            <a href=\"#\"><img src=\"images/menu1.jpg\" alt=\"/\" class=\"img-rsponsive men-img-wid\" /></a>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-sm-4 menu-img-pad\">\n");
      out.write("                                            <a href=\"#\"><img src=\"images/menu2.jpg\" alt=\"/\" class=\"img-rsponsive men-img-wid\" /></a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"dropdown\">\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Women<b class=\"caret\"></b></a>\n");
      out.write("                                <ul class=\"dropdown-menu multi-column columns-2\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-sm-6\">\n");
      out.write("                                            <ul class=\"multi-column-dropdown\">\n");
      out.write("                                                <li><a href=\"products.jsp\">Tops</a></li>\n");
      out.write("                                                <li><a href=\"products.jsp\">Bottoms</a></li>\n");
      out.write("                                                <li><a href=\"products.jsp\">Yoga Pants</a></li>\n");
      out.write("                                                <li class=\"divider\"></li>\n");
      out.write("                                                <li><a href=\"products.jsp\">Sports</a></li>\n");
      out.write("                                                <li class=\"divider\"></li>\n");
      out.write("                                                <li><a href=\"products.jsp\">Gym</a></li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-sm-6\">\n");
      out.write("                                            <a href=\"#\"><img src=\"images/menu3.jpg\" alt=\"/\" class=\"img-rsponsive men-img-wid\" /></a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"dropdown\">\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Kids<b class=\"caret\"></b></a>\n");
      out.write("                                <ul class=\"dropdown-menu\">\n");
      out.write("                                    <li><a href=\"products.jsp\">Tees</a></li>\n");
      out.write("                                    <li><a href=\"products.jsp\">Shorts</a></li>\n");
      out.write("                                    <li><a href=\"products.jsp\">Gear</a></li>\n");
      out.write("                                    <li class=\"divider\"></li>\n");
      out.write("                                    <li><a href=\"products.jsp\">Watches</a></li>\n");
      out.write("                                    <li class=\"divider\"></li>\n");
      out.write("                                    <li><a href=\"products.jsp\">Shoes</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"contact.jsp\">Catch</a></li>\n");
      out.write("                            <div class=\"clearfix\"></div>\n");
      out.write("                        </ul>\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--/.navbar-collapse-->\n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("                </nav>\n");
      out.write("                <!--/.navbar-->   \n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("            </div>\n");
      out.write("            <!--/.content--->\n");
      out.write("        </div>\n");
      out.write("        <div class=\"search\">\n");
      out.write("            <div class=\"mobile-nav-button\">\n");
      out.write("                <button id=\"trigger-overlay\" type=\"button\">\n");
      out.write("                    <i class=\"fas fa-search\"></i>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </div>\n");
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

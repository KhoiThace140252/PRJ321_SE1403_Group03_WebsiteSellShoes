package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Dao.SanPhamDAO;
import Model.SanPham;
import java.util.Enumeration;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--A Design by W3layouts\n");
      out.write("Author: W3layout\n");
      out.write("Author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Cart-Buy</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"keywords\" content=\"N-Air Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() {setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <meta charset utf=\"8\">\n");
      out.write("        <!--fonts-->\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Fredoka+One' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("        <!--fonts-->\n");
      out.write("        <!--bootstrap-->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <!--coustom css-->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!--shop-kart-js-->\n");
      out.write("        <script src=\"js/simpleCart.min.js\"></script>\n");
      out.write("        <!--default-js-->\n");
      out.write("        <script src=\"js/jquery-2.1.4.min.js\"></script>\n");
      out.write("        <!--bootstrap-js-->\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <!--script-->\n");
      out.write("        <!-- FlexSlider -->\n");
      out.write("        <script src=\"js/imagezoom.js\"></script>\n");
      out.write("        <script defer src=\"js/jquery.flexslider.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/flexslider.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            // Can also be used with $(document).ready()\n");
      out.write("            $(window).load(function () {\n");
      out.write("                $('.flexslider').flexslider({\n");
      out.write("                    animation: \"slide\",\n");
      out.write("                    controlNav: \"thumbnails\"\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!-- //FlexSlider-->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <!--Header-top!-->\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header/header-top.jsp", out, false);
      out.write("\n");
      out.write("                    <!--Header-top!-->     \n");
      out.write("                    <!---menu-----bar--->\n");
      out.write("                    <!--header-bottom-->\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header/header-bottom.jsp", out, false);
      out.write("\n");
      out.write("                    <!--header-bottom-->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"head-bread\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <ol class=\"breadcrumb\">\n");
      out.write("                        <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"products.jsp\">Products</a></li>\n");
      out.write("                        <li class=\"active\">CART</li>\n");
      out.write("                    </ol>\n");
      out.write("                </div>\n");
      out.write("            </div>            <!-- check-out -->\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"container-fluid padding\" >\n");
      out.write("                <div class=\"row text-center padding\">\n");
      out.write("\n");
      out.write("                    <div class=\"col-xs-12 col-sm-6\" >\n");
      out.write("                        <a class=\"continue\" href=\"index.jsp\">Continue to basket</a>\n");
      out.write("                        <ul class=\"total_price\">\n");
      out.write("                            <li class=\"last_price\"> <h4>TOTAL</h4></li>\t\n");
      out.write("                            <li class=\"last_price\"><span>6150.00</span></li>\n");
      out.write("                            <div class=\"clearfix\"> </div>\n");
      out.write("                        </ul> \n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                        <a class=\"order\" href=\"BuyController\">Place Order</a>\n");
      out.write("\n");
      out.write("                    ");

                        Enumeration<String> pName = session.getAttributeNames();
                        while (pName.hasMoreElements()) {
                            String id = pName.nextElement().toString();
                            SanPham sp = new SanPhamDAO().getProductByID(id);

                    
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div col-xs-12 col-sm-6>\n");
      out.write("                    <ul class=\"qty\">    \n");
      out.write("                        <li><p>Name : ");
      out.print(sp.getTenSanPham());
      out.write("</p></li>\n");
      out.write("                        <li><p>Quantity : ");
      out.print( session.getAttribute(id));
      out.write("</p></li>              \n");
      out.write("                        <li><p>Price each : $");
      out.print(sp.getGiaTien());
      out.write("</p></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <div class=\"delivery\">\n");
      out.write("                        <p>Delivered in 2-3 business days</p>\n");
      out.write("                    </div>\t\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <h1>My Shopping Bag</h1>     \n");
      out.write("        ");
            }
        
      out.write("\n");
      out.write("        <!--footer!-->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer/footerlevel1.jsp", out, false);
      out.write("\n");
      out.write("        <!--footer!-->\n");
      out.write("    </body>\n");
      out.write("</html>");
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

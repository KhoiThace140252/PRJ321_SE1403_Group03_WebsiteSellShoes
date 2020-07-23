package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.SanPham;
import java.util.Collection;
import Dao.SanPhamDAO;
import java.util.Map;

public final class products_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Shop</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"keywords\" content=\"N-Air Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() {setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <meta charset utf=\"8\">\n");
      out.write("        <!--fonts-->\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Fredoka+One' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("        <!--fonts-->\n");
      out.write("        <!--form-css-->\n");
      out.write("        <link href=\"css/form.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
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
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"head-bread\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <ol class=\"breadcrumb\">\n");
      out.write("                        <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                        <li class=\"active\">PRODUCTS</li>\n");
      out.write("                    </ol>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"products-gallery\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"col-xs-12 grid-gallery\">\n");
      out.write("\n");
      out.write("                    ");

                        Map<String, SanPham> map = new SanPhamDAO().getTinhTrangSanPham();;
                        Collection<SanPham> values = map.values();
                        int i = 0;
                        for (SanPham row : values) {
                            i++;
                            if (i > 12) {
                                break;
                            }

                    
      out.write("\n");
      out.write("                    <div class=\"col-md-4 col-sm-4 col-xs-12  grid-stn simpleCart_shelfItem\">\n");
      out.write("                        <!-- normal -->\n");
      out.write("                        <div class=\"ih-item square effect3 bottom_to_top\">\n");
      out.write("                            <div class=\"bottom-2-top\">\n");
      out.write("                                <div class=\"img\"  ><img src=\"");
      out.print(row.getHinhAnh());
      out.write("\"  alt=\"\" class=\"img-responsive gri-wid\"></div>\n");
      out.write("                                <div class=\"info\">\n");
      out.write("                                    <div class=\"pull-left styl-hdn\">\n");
      out.write("                                        <h3>");
      out.print(row.getTenSanPham());
      out.write("</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"pull-right styl-price\">\n");
      out.write("                                        <p><a  href=\"CartController?idsanpham=");
      out.print(row.getMaSanPham());
      out.write("\" class=\"item_add\"><span class=\"glyphicon glyphicon-shopping-cart grid-cart\" aria-hidden=\"true\"></span> <span class=\" item_price\">$");
      out.print(row.getGiaTien());
      out.write("</span></a></p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"clearfix\"></div>\n");
      out.write("                                </div></div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- end normal -->\n");
      out.write("                        <div class=\"quick-view\">\n");
      out.write("                            <a href=\"ShowProductController?iddetailproduct=");
      out.print( row.getMaSanPham());
      out.write("\">Quick view</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("\n");
      out.write("                    ");
                              }
                    
      out.write("\n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("            </div> \n");
      out.write("        </div>\n");
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

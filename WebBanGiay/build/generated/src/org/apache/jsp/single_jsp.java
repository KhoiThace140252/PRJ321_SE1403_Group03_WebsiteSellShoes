package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.NhaCungCap;
import Model.SanPham;
import Dao.ChiTietSanPhamDAO;
import Model.ChiTietSanPham;

public final class single_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                    <!--Header-top!-->\n");
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
      out.write("                        <li><a href=\"#\">Home</a></li>                       \n");
      out.write("                        <li class=\"active\">Shop</li>\n");
      out.write("                    </ol>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"showcase-grid\">\n");
      out.write("\n");
      out.write("            ");

                ChiTietSanPham getctsp = (ChiTietSanPham) request.getAttribute("showfromindex1");
                if (getctsp != null) {
                    SanPham sp = (SanPham) request.getAttribute("showfromindex2");
                    NhaCungCap ncc=(NhaCungCap) request.getAttribute("showfromindex3");

            
      out.write("\n");
      out.write("            <div class=\"container \" >\n");
      out.write("                <div class=\"col-sm-5 showcase\">\n");
      out.write("                    <div class=\"flexslider\">\n");
      out.write("                        <ul class=\"slides\">\n");
      out.write("                            <li data-thumb=\"");
      out.print(getctsp.getHinhAnhChiTiet1());
      out.write("\">\n");
      out.write("                                <div class=\"thumb-image\"><img width=\"50\" height=\"50\" src=\"");
      out.print(getctsp.getHinhAnhChiTiet1());
      out.write("\" data-imagezoom=\"true\" class=\"img-responsive\"></div>\n");
      out.write("                            </li>\n");
      out.write("                            <li data-thumb=\"");
      out.print(getctsp.getHinhAnhChiTiet2());
      out.write("\">\n");
      out.write("                                <div class=\"thumb-image\"> <img  width=\"50\" height=\"50\" src=\"");
      out.print(getctsp.getHinhAnhChiTiet2());
      out.write("\" data-imagezoom=\"true\" class=\"img-responsive\"> </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li data-thumb=\"");
      out.print(getctsp.getHinhAnhChiTiet3());
      out.write("\">\n");
      out.write("                                <div class=\"thumb-image\"> <img  width=\"50\" height=\"50\" src=\"");
      out.print(getctsp.getHinhAnhChiTiet3());
      out.write("\" data-imagezoom=\"true\" class=\"img-responsive\"> </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li data-thumb=\"");
      out.print(getctsp.getHinhAnhChiTiet4());
      out.write("\">\n");
      out.write("                                <div class=\"thumb-image\"> <img  width=\"50\" height=\"50\" src=\"");
      out.print(getctsp.getHinhAnhChiTiet4());
      out.write("\" data-imagezoom=\"true\" class=\"img-responsive\"> </div>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-5 showcase\">\n");
      out.write("                    <div class=\"showcase-rt-top\">\n");
      out.write("                        <div class=\"pull-left shoe-name\">\n");
      out.write("                            <h3>");
      out.print(sp.getTenSanPham());
      out.write("</h3>                    \n");
      out.write("                            <h4>&#36;");
      out.print(sp.getGiaTien());
      out.write("</h4>\n");
      out.write("                        </div>          \n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <hr class=\"featurette-divider\">\n");
      out.write("                    <div class=\"shocase-rt-bot\">\n");
      out.write("                        <div class=\"float-qty-chart\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li class=\"qty\">\n");
      out.write("                                    <h4>QTY</h4>\n");
      out.write("                                    <select class=\"form-control qnty-chrt\">\n");
      out.write("                                        <option>1</option>\n");
      out.write("                                        <option>2</option>\n");
      out.write("                                        <option>3</option>\n");
      out.write("                                        <option>4</option>\n");
      out.write("                                        <option>5</option>\n");
      out.write("                                        <option>6</option>\n");
      out.write("                                        <option>7</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                            <div class=\"clearfix\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <ul>\n");
      out.write("                            <li class=\"ad-2-crt simpleCart_shelfItem\">\n");
      out.write("                                <a class=\"btn item_add\" href=\"ShowProductController?iddetailproduct=");
      out.print( sp.getMaSanPham());
      out.write("\" role=\"button\">Add To Cart</a>\n");
      out.write("                                <a class=\"btn\" href=\"ShowProductController?iddetailproduct=");
      out.print( sp.getMaSanPham());
      out.write("\" role=\"button\">Buy Now</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"showcase-last\">\n");
      out.write("                        <h3>product details</h3>\n");
      out.write("                        <ul>\n");
      out.write("                            <li>");
      out.print(getctsp.getMoTa1());
      out.write("</li>\n");
      out.write("                           \n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"specifications\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h3>Item Details</h3> \n");
      out.write("                <div class=\"detai-tabs\">\n");
      out.write("                    <!-- Nav tabs -->\n");
      out.write("                    <ul class=\"nav nav-pills tab-nike\" role=\"tablist\">\n");
      out.write("                      \n");
      out.write("                        <li role=\"presentation\"><a href=\"#profile\" aria-controls=\"profile\" role=\"tab\" data-toggle=\"tab\">Description</a></li>\n");
      out.write("                        <li role=\"presentation\"><a href=\"#messages\" aria-controls=\"messages\" role=\"tab\" data-toggle=\"tab\">Terms & conditiona</a></li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                    <!-- Tab panes -->\n");
      out.write("                    <div class=\"tab-content\">               \n");
      out.write("                        <div role=\"tabpanel\" class=\"tab-pane\" id=\"profile\">\n");
      out.write("                            <p>");
      out.print(ncc.getMota());
      out.write("</p>    \n");
      out.write("                        </div>\n");
      out.write("                        <div role=\"tabpanel\" class=\"tab-pane\" id=\"messages\">\n");
      out.write("                            The images represent actual product though color of the image and product may slightly differ.    \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("        <!--footer!-->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer/footerlevel1.jsp", out, false);
      out.write("\n");
      out.write("        <!--footer!-->\n");
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

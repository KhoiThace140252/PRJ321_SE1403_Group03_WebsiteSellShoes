package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.KhachHang;
import Dao.SanPhamDAO;
import java.util.Collection;
import Model.SanPham;
import java.util.Map;
import java.util.HashMap;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Home</title>\n");
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
      out.write("        <!--custom css-->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!--shop-kart-js-->\n");
      out.write("        <script src=\"js/simpleCart.min.js\"></script>\n");
      out.write("        <!--default-js-->\n");
      out.write("        <script src=\"js/jquery-2.1.4.min.js\"></script>\n");
      out.write("        <!--bootstrap-js-->\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <!--script-->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <!--Header-top!-->\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header/header-top.jsp", out, false);
      out.write("\n");
      out.write("                    <!--Header-top!-->        \n");
      out.write("                    <!---menu-----bar--->\n");
      out.write("                    <!--header-bottom-->\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header/header-bottom.jsp", out, false);
      out.write("\n");
      out.write("                    <!--header-bottom-->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        ");

            String buySuccess = request.getParameter("buySuccess");//tao mot bien string kiem tra xem nguoi dung mua hang thanh cong hay that bai
            if (buySuccess != null) {//neu nhu gia tri string khac null
                if (buySuccess.equals("true")) {//neu mua thanh cong
                    out.print("<script>alert('Purchase Successful')</script>");//thong bao mua thanh cong
                    out.print("<script>location.href='/WebBanGiay/index.jsp'</script>");//load lai trang chu
                } else {//neu mua that bai
                    out.print("<script>alert('Purchase Failed')</script>");//thong bao mua that bai
                    out.print("<script>location.href='/WebBanGiay/index.jsp'</script>");//load lai trang chu
                }
            }
        
      out.write("\n");
      out.write("        <div class=\"header-end\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                    <!-- Indicators -->\n");
      out.write("                    <ol class=\"carousel-indicators\">\n");
      out.write("                        <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                        <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("                        <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("                    </ol>\n");
      out.write("\n");
      out.write("                    <!-- Wrapper for slides -->\n");
      out.write("                    <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("                        <div class=\"item active\">\n");
      out.write("                            <img src=\"./images/shoe3.jpg\" alt=\"...\">\n");
      out.write("                            <div class=\"carousel-caption car-re-posn\">\n");
      out.write("                                <h3>AirMax</h3>\n");
      out.write("                                <h4>You feel to fall</h4>\n");
      out.write("                                <span class=\"color-bar\"></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"item\">\n");
      out.write("                            <img src=\"./images/shoe1.jpg\" alt=\"...\">\n");
      out.write("                            <div class=\"carousel-caption car-re-posn\">\n");
      out.write("                                <h3>AirMax</h3>\n");
      out.write("                                <h4>You feel to fall</h4>\n");
      out.write("                                <span class=\"color-bar\"></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"item\">\n");
      out.write("                            <img src=\"./images/shoe2.jpg\" alt=\"...\">\n");
      out.write("                            <div class=\"carousel-caption car-re-posn\">\n");
      out.write("                                <h3>AirMax</h3>\n");
      out.write("                                <h4>You feel to fall</h4>\n");
      out.write("                                <span class=\"color-bar\"></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- Controls -->\n");
      out.write("                    <a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                        <span class=\"glyphicon glyphicon-chevron-left car-icn\" aria-hidden=\"true\"></span>\n");
      out.write("                        <span class=\"sr-only\">Previous</span>\n");
      out.write("                    </a>\n");
      out.write("                    <a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\n");
      out.write("                        <span class=\"glyphicon glyphicon-chevron-right car-icn\" aria-hidden=\"true\"></span>\n");
      out.write("                        <span class=\"sr-only\">Next</span>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"feel-fall\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"pull-left fal-box\">\n");
      out.write("                    <div class=\" fall-left\">\n");
      out.write("                        <h3>Fall</h3>\n");
      out.write("                        <img src=\"images/f-l.png\" alt=\"/\" class=\"img-responsive fl-img-wid\">\n");
      out.write("                        <p>Inspiration and innovation<br> for every athlete in the world</p>\n");
      out.write("                        <span class=\"fel-fal-bar\"></span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"pull-right fel-box\">\n");
      out.write("                    <div class=\"feel-right\">\n");
      out.write("                        <h3>Feel</h3>\n");
      out.write("                        <img src=\"images/f-r.png\" alt=\"/\" class=\"img-responsive fl-img-wid\">\n");
      out.write("                        <p>Inspiration and innovation<br> for every athlete in the world</p>\n");
      out.write("                        <span class=\"fel-fal-bar2\"></span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-xs-12 shop-grid\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                ");

                    Map<String, SanPham> map = new SanPhamDAO().getTinhTrangSanPham();//tao mot map luu cac san pham co tinh trang la san sang
                    Collection<SanPham> values = map.values();//lay gia tri trong map
                    int i = 0;//khai bao bien i
                    for (SanPham row : values) {//vong lap in cac gia tri trong map ra view
                        i++;//tang i
                        if (i > 6) {//in ra toi da 6 san pham thi dung lai
                            break;//thoat
                        }

                
      out.write("\n");
      out.write("\n");
      out.write("                <!--Start-->\n");
      out.write("                <div class=\"col-md-4 col-sm-4 col-xs-12 grid-stn simpleCart_shelfItem\">\n");
      out.write("                    <!-- normal -->\n");
      out.write("                    <div class=\"ih-item square effect3 bottom_to_top\">\n");
      out.write("                        <div class=\"bottom-2-top\">\n");
      out.write("                            <div class=\"img\"><img src=\"");
      out.print(row.getHinhAnh());
      out.write("\" alt=\"\" class=\"img-responsive gri-wid\"></div> <!--In Hinh anh-->\n");
      out.write("                            <div class=\"info\">\n");
      out.write("                                <div class=\"pull-left styl-hdn\">\n");
      out.write("                                    <h3>");
      out.print(row.getTenSanPham());
      out.write("</h3> <!--In ten san pham-->\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"pull-right styl-price\">\n");
      out.write("                                     <!--Truyen qua ben mua hang de luu san pham vao gio hang-->\n");
      out.write("                                    <p><a  href=\"CartController?idsanpham=");
      out.print(row.getMaSanPham());
      out.write("&BuyQuantity=1\" class=\"item_add\"><span class=\"glyphicon glyphicon-shopping-cart grid-cart\" aria-hidden=\"true\"></span> <span class=\" item_price\">$");
      out.print(row.getGiaTien());
      out.write("</span></a></p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"clearfix\"></div>\n");
      out.write("                            </div>                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- end normal -->\n");
      out.write("                    <div class=\"quick-view\">\n");
      out.write("                         <!--Truyen qua ben show chi tiet san pham-->\n");
      out.write("                        <a href=\"ShowProductController?iddetailproduct=");
      out.print( row.getMaSanPham());
      out.write("\">Quick view</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!--End-->\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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

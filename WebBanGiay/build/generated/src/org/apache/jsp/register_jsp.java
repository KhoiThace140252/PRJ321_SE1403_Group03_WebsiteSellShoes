package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <title>Register</title>\n");
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
      out.write("                        <li><a href=\"register.jsp\">LOGIN</a></li>\n");
      out.write("                        <li class=\"active\">REGISTER</li>\n");
      out.write("                    </ol>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- reg-form -->\n");
      out.write("            <div class=\"reg-form\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"reg\">\n");
      out.write("                        <h3>Register Now</h3>\n");
      out.write("                        <p>Welcome, please enter the following details to continue.</p>\n");
      out.write("                        <p>If you have previously registered with us, <a href=\"signup.jsp\">click here</a></p>\n");
      out.write("                        <form action=\"LoginController?action=Res\" method=\"post\" name=\"register\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li class=\"text-info\">Full Name </li>\n");
      out.write("                                <li><input type=\"text\" name=\"ten\" value=\"\" placeholder=\"Full Name...\"></li>\n");
      out.write("                            </ul>\n");
      out.write("                            <ul>\n");
      out.write("                                <li class=\"text-info\">User Name: </li>\n");
      out.write("                                <li><input type=\"text\" name=\"taiKhoan\" value=\"\" placeholder=\"User Name...\" id=\"username\"></li>\n");
      out.write("                            </ul>\t\t\t\t \n");
      out.write("                            <ul>\n");
      out.write("                                <li class=\"text-info\">Password: </li>\n");
      out.write("                                <li><input type=\"password\" name=\"matKhau\" value=\"\" placeholder=\"Password...\" id=\"password\"></li>\n");
      out.write("                            </ul>      \n");
      out.write("                            <ul>\n");
      out.write("                                <li class=\"text-info\">Gender: </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <select name=\"gioiTinh\" >\n");
      out.write("                                        <option class=\"Sex\" value=\"Nam\">Male</option>\n");
      out.write("                                        <option class=\"Sex\" value=\"Nữ\">Female</option>\n");
      out.write("                                        <option class=\"Sex\" value=\"Khác\">Other</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </li>\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                            <ul>\n");
      out.write("                                <li class=\"text-info\">Email: </li>\n");
      out.write("                                <li><input type=\"text\" name=\"email\" value=\"\" placeholder=\"ex: email@gmail.com\" id=\"email\"></li>\n");
      out.write("                            </ul>\n");
      out.write("                            <ul>\n");
      out.write("                                <li class=\"text-info\">Birthday: </li>\n");
      out.write("                                <li><input type=\"date\" name=\"ngaySinh\" value=\"\"></li>\n");
      out.write("                            </ul>\t\n");
      out.write("                            <ul>\n");
      out.write("                                <li class=\"text-info\">Phone Number:</li>\n");
      out.write("                                <li><input type=\"text\" name=\"soDienThoai\" value=\"\" id=\"phone\" placeholder=\"Phone Number...\"></li>\n");
      out.write("                            </ul>\t\n");
      out.write("                            <ul>\n");
      out.write("                                <li class=\"text-info\">Address:</li>\n");
      out.write("                                <li><input type=\"text\" name=\"diaChi\" value=\"\" placeholder=\"Address...\"id=\"address\"></li>\n");
      out.write("                            </ul>\t          \n");
      out.write("                            <input type=\"submit\" name=\"action\" id=\"submit\" value=\"Register Now\" onclick=\"valid();\">\n");
      out.write("                            <p class=\"click\">By clicking this button, you are agree to my  <a href=\"#\">Policy Terms and Conditions.</a></p> \n");
      out.write("                        </form>\n");
      out.write("                        <script>\n");
      out.write("                            var inputs = document.forms['register'].getElementsByTagName('input');\n");
      out.write("                            var run_onchange = false;\n");
      out.write("                            function valid() {\n");
      out.write("                                var errors = false;\n");
      out.write("                                var reg_mail = /^[A-Za-z0-9]+([_\\.\\-]?[A-Za-z0-9])*@[A-Za-z0-9]+([\\.\\-]?[A-Za-z0-9]+)*(\\.[A-Za-z]+)+$/;\n");
      out.write("                                for (var i = 0; i < inputs.length; i++) {\n");
      out.write("                                    var value = inputs[i].value;\n");
      out.write("                                    var id = inputs[i].getAttribute('id');\n");
      out.write("\n");
      out.write("                                    // Tạo phần tử span lưu thông tin lỗi\n");
      out.write("                                    var span = document.createElement('span');\n");
      out.write("                                    // Nếu span đã tồn tại thì remove\n");
      out.write("                                    var p = inputs[i].parentNode;\n");
      out.write("                                    if (p.lastChild.nodeName == 'SPAN') {\n");
      out.write("                                        p.removeChild(p.lastChild);\n");
      out.write("                                    }\n");
      out.write("\n");
      out.write("                                    // Kiểm tra rỗng\n");
      out.write("                                    if (value == '') {\n");
      out.write("                                        span.innerHTML = 'Please enter your infomation';\n");
      out.write("                                    } else {\n");
      out.write("                                        // Kiểm tra các trường hợp khác\n");
      out.write("                                        if (id == 'email') {\n");
      out.write("                                            if (reg_mail.test(value) == false) {\n");
      out.write("                                                span.innerHTML = 'Invalid email (ex: abc@gmail.com)';\n");
      out.write("                                            }\n");
      out.write("                                            var email = value;\n");
      out.write("                                        }\n");
      out.write("                                        if (id == 'confirm_email' && value != email) {\n");
      out.write("                                            span.innerHTML = 'Email entered is not correct';\n");
      out.write("                                        }\n");
      out.write("                                        // Kiểm tra password\n");
      out.write("                                        if (id == 'password') {\n");
      out.write("                                            if (value.length < 6) {\n");
      out.write("                                                span.innerHTML = 'Password must be from 6 characters';\n");
      out.write("                                            }\n");
      out.write("                                            var pass = value;\n");
      out.write("                                        }\n");
      out.write("                                        // Kiểm tra password nhập lại\n");
      out.write("                                        if (id == 'confirm_pass' && value != pass) {\n");
      out.write("                                            span.innerHTML = 'Password entered incorrectly';\n");
      out.write("                                        }\n");
      out.write("                                        // Kiểm tra số điện thoại\n");
      out.write("                                        if (id == 'phone' && isNaN(value) == true) {\n");
      out.write("                                            span.innerHTML = 'Phone numbers must be numeric';\n");
      out.write("                                        }\n");
      out.write("                                    }\n");
      out.write("\n");
      out.write("                                    // Nếu có lỗi thì chèn span vào hồ sơ, chạy onchange, submit return false, highlight border\n");
      out.write("                                    if (span.innerHTML != '') {\n");
      out.write("                                        inputs[i].parentNode.appendChild(span);\n");
      out.write("                                        errors = true;\n");
      out.write("                                        run_onchange = true;\n");
      out.write("                                        inputs[i].style.border = '1px solid #c6807b';\n");
      out.write("                                        inputs[i].style.background = '#red';\n");
      out.write("                                    }\n");
      out.write("                                }// end for\n");
      out.write("\n");
      out.write("                                if (errors == false) {\n");
      out.write("                                }\n");
      out.write("                                return !errors;\n");
      out.write("                            }// end valid()\n");
      out.write("\n");
      out.write("                            // Chạy hàm kiểm tra valid()\n");
      out.write("                            var register = document.getElementById('submit');\n");
      out.write("                            register.onclick = function () {\n");
      out.write("                                return valid();\n");
      out.write("\n");
      out.write("                            }\n");
      out.write("\n");
      out.write("                            // Kiểm tra lỗi với sự kiện onchange -> gọi lại hàm valid()\n");
      out.write("                            for (var i = 0; i < inputs.length; i++) {\n");
      out.write("                                var id = inputs[i].getAttribute('id');\n");
      out.write("                                inputs[i].onchange = function () {\n");
      out.write("                                    if (run_onchange == true) {\n");
      out.write("                                        this.style.border = '1px solid #999';\n");
      out.write("                                        this.style.background = '#fff';\n");
      out.write("                                        valid();\n");
      out.write("                                    }\n");
      out.write("                                }\n");
      out.write("                            }\n");
      out.write("                            // end for</script>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!--footer!-->\n");
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

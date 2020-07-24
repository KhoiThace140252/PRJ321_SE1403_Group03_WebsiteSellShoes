<%-- 
    Document   : header-top
    Created on : Jul 3, 2020, 6:38:33 PM
    Author     : Admin
--%>

<%@page import="Dao.KhachHangDAO"%>
<%@page import="Model.KhachHang"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name='viewport' content='width=device-width, initial-scale=1'>           
    </head>
    <body>

        <div class="header-top">
            <div class="logo">
                <a href="index.jsp">N-AIR</a>
            </div>
            <div id="topbar">
                <div class="container">
                    <div class="topbar-content row flexAlignCenter rowFlexMargin">                   
                        <div class="search-top-bar hidden-xs hidden-sm col-sm-12" style="padding-top: 10px; height: 30px">
                            <div class="wpo-wrapper-search">
                                <form action="SearchController" class="search-product ultimate-search" method="post">
                                    <input style="height: 30px; width: 500px" required="" id="inputSearchAuto-desktop" name="typeSearch" maxlength="40" autocomplete="off" class="search-product-input" type="text" size="20" placeholder="Search...">                                 
                                </form>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="login-bars">

                <%
                    Cookie[] cookies = request.getCookies();
                    if (cookies.length > 1) {
                        for (Cookie cookie : cookies) {
                            if (cookie.getName().equals("ID")) {
                                KhachHang kh = new KhachHangDAO().getAccountByID(Integer.parseInt(cookie.getValue()));
                                if (new KhachHangDAO().checkRole(kh.getTaiKhoan(), kh.getMatKhau())==false) {
                                    out.print(" <a class='btn btn-default log-bar' href='information.jsp' role='button'>" + "Welcome," + kh.getTen() + "</a>");
                                    out.print("<a class='btn btn-default log-bar' href='LoginController?action=Logout' role='button'>" + "Logout" + "</a>");
                                }else{
                                    response.sendRedirect("indexadmin.jsp");
                                    break;
                                }

                            }
                        }
                    } else {
                        out.print("<a class='btn btn-default log-bar' href='register.jsp' role='button'>" + "Sign up" + "</a>");
                        out.print("<a class='btn btn-default log-bar' href='signup.jsp' role='button'>" + "Login" + "</a>");
                    }
                %>

                <div class="cart box_1">
                    <a href="checkout.jsp">
                        <h3>
                            <div class="total">
                                <span class="glyphicon glyphicon-shopping-cart"></span></div></h3>
                    </a>
                    <p><a href="CartController?removeall=clear" class="simpleCart_empty" action=>Empty Cart</a></p>
                    <div class="clearfix"> </div>
                </div>	
            </div>
            <div class="clearfix"></div>
        </div>

    </body>
</html>

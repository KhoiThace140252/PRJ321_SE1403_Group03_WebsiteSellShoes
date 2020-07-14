<%-- 
    Document   : header-top2
    Created on : Jul 3, 2020, 6:38:42 PM
    Author     : Admin
--%>

<%@page import="Model.KhachHang"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <%
            KhachHang kh = (KhachHang) session.getAttribute("userlogin");
        %>
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
                                <form action="SearchController" class="search-product ultimate-search">
                                    <input type="hidden" name="type" value="product">
                                    <input style="height: 30px; width: 500px" required="Please fill out this field" id="inputSearchAuto-desktop" name="q" maxlength="40" autocomplete="off" class="search-product-input" type="text" size="20" placeholder="Search...">
                                    <input class="glyphicon glyphicon-search">
                                </form>
                                <div id="ajaxSearchResults-mb" class="smart-search-wrapper ajaxSearchResults" style="display: none;">
                                    <div class="resultsContent"></div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="login-bars">
                <a class="btn btn-default log-bar" href="" role="button">Hello,
                    <%                        if (kh != null) {
                            out.print(kh.getTen());
                            if (session.getAttribute("userlogin") != null) {
                                boolean isLogin = true;
                            } else {
                                boolean isLogin = false;
                            }
                        }

                    %>
                </a>

                <c:if test = "${!isLogin}"> 
                    <a class="btn btn-default log-bar" href="register.jsp" role="button">Sign up</a>
                    <a class="btn btn-default log-bar" href="signup.jsp" role="button">Login</a>
                </c:if>
                <c:if test = "${isLogin}"> 
                    <a class="btn btn-default log-bar" href="LoginController?action=Logout" role="button">Logout</a>
                </c:if>
                <div class="cart box_1">
                    <a href="checkout.jsp">
                        <h3>
                            <div class="total">
                                <span class="simpleCart_total"></span>(<span id="simpleCart_quantity" class="simpleCart_quantity"></span>)</div></h3>
                    </a>
                    <p><a href="javascript:;" class="simpleCart_empty">Empty Cart</a></p>
                    <div class="clearfix"> </div>
                </div>	
            </div>
            <div class="clearfix"></div>
        </div>
    </body>
</html>

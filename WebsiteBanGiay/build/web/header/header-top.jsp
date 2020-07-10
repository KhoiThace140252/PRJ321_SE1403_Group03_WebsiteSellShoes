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

<%-- 
    Document   : signup
    Created on : Jul 3, 2020, 6:30:30 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Login</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="N-Air Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() {setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <meta charset utf="8">
        <!--fonts-->
        <link href='//fonts.googleapis.com/css?family=Fredoka+One' rel='stylesheet' type='text/css'>

        <!--fonts-->
        <!--bootstrap-->
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
        <!--coustom css-->
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <!--shop-kart-js-->
        <script src="js/simpleCart.min.js"></script>
        <!--default-js-->
        <script src="js/jquery-2.1.4.min.js"></script>
        <!--bootstrap-js-->
        <script src="js/bootstrap.min.js"></script>
        <!--script-->
        <!-- FlexSlider -->
        <script src="js/imagezoom.js"></script>
        <script defer src="js/jquery.flexslider.js"></script>
        <link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />

        <script>
            // Can also be used with $(document).ready()
            $(window).load(function () {
                $('.flexslider').flexslider({
                    animation: "slide",
                    controlNav: "thumbnails"
                });
            });
        </script>
        <!-- //FlexSlider-->
    </head>
    <body>
        <div class="header">
            <div class="container">
                <!--Header-top!-->
                <jsp:include page="header/header-top.jsp"></jsp:include>
                    <!--Header-top!-->     
                    <!---menu-----bar--->
                    <!--header-bottom-->
                <jsp:include page="header/header-bottom.jsp"></jsp:include>
                    <!--header-bottom-->
                </div>
            </div>
            <div class="head-bread">
                <div class="container">
                    <ol class="breadcrumb">
                        <li><a href="index.jsp">HOME</a></li>
                        <li class="active">LOGIN</li>
                    </ol>
                </div>
            </div>
            <!--signup-->
            <!-- login-page -->
            <div class="login">
                <div class="container">
                    <div class="login-grids">
                        <div class="col-md-6 log">
                            <h3>Login</h3>
                            <div class="strip"></div>
                            <p>Welcome, please enter the following to continue.</p>
                            <p>If you have previously Login with us, <a href="signup.jsp">Click Here</a></p>
                            <form action="LoginController?action=Login" method="post">
                                <h5>User Name:</h5>	
                                <input type="text" name="username" value=""  placeholder="Username">    <%--get input username --%>
                            <h5>Password:</h5>
                            <input type="password" name="password" value="" placeholder="Password"><br><%--get input password --%>
                            <%
                                if (request.getParameter("action") != null) {   //check username and pass if false
                                    out.print("<h4 style='color: red;'>" + "Invalid username or password" + "</h4><br>");
                                }
                            %>

                            <input type="submit" value="Login">
                        </form>                          
                    </div>
                    <div class="col-md-6 login-right">
                        <h3>New Registration</h3>
                        <div class="strip"></div>
                        <p>By creating an account with our store, you will be able to move through the checkout process faster, store multiple shipping addresses, view and track your orders in your account and more.</p>
                        <a href="register.jsp" class="button">Create An Account</a>
                    </div>
                    <div class="clearfix"></div>
                </div>
            </div>
        </div>
        <!--login-page-->
        <!--sign up-->
        <!--footer!-->
        <jsp:include page="footer/footerlevel1.jsp"></jsp:include>
        <!--footer!-->
    </body>
</html>

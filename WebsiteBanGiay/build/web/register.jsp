<%-- 
    Document   : register
    Created on : Jul 3, 2020, 6:29:57 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>N-Air a E-commerce category Flat Bootstrap Responsive Website Template | Checkout :: w3layouts</title>
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
                        <li><a href="index.jsp">Home</a></li>
                        <li><a href="register.jsp">LOGIN</a></li>
                        <li class="active">REGISTER</li>
                    </ol>
                </div>
            </div>
            <!-- reg-form -->
            <div class="reg-form">
                <div class="container">
                    <div class="reg">
                        <h3>Register Now</h3>
                        <p>Welcome, please enter the following details to continue.</p>
                        <p>If you have previously registered with us, <a href="#">click here</a></p>
                        <form action="LoginController?action=Res" method="post">
                            <ul>
                                <li class="text-info">Full Name </li>
                                <li><input type="text" name="ten" value=""></li>
                            </ul>
                            <ul>
                                <li class="text-info">User Name: </li>
                                <li><input type="text" name="taiKhoan" value=""></li>
                            </ul>				 
                            <ul>
                                <li class="text-info">Password: </li>
                                <li><input type="password" name="matKhau" value=""></li>
                            </ul>      
                             <ul>
                                <li class="text-info">Gender: </li>
                                <li><input type="text" name="gioiTinh" value=""></li>
                            </ul>
                            <ul>
                                <li class="text-info">Email: </li>
                                <li><input type="text" name="email" value=""></li>
                            </ul>
                            <ul>
                                <li class="text-info">Birthday: </li>
                                <li><input type="date" name="ngaySinh" value=""></li>
                            </ul>	
                            <ul>
                                <li class="text-info">Phone Number:</li>
                                <li><input type="text" name="soDienThoai" value=""></li>
                            </ul>	
                             <ul>
                                <li class="text-info">Address:</li>
                                <li><input type="text" name="diaChi" value=""></li>
                            </ul>	          
                            <input type="submit" value="Register Now">
                            <p class="click">By clicking this button, you are agree to my  <a href="#">Policy Terms and Conditions.</a></p> 
                        </form>
                    </div>
                </div>
            </div>
            <!--footer!-->
        <jsp:include page="footer/footerlevel1.jsp"></jsp:include>
        <!--footer!-->
    </body>
</html>

<%-- 
    Document   : checkout
    Created on : Jul 3, 2020, 6:28:19 PM
    Author     : Admin
--%>

<%@page import="java.util.HashMap"%>
<%@page import="Dao.SanPhamDAO"%>
<%@page import="Model.SanPham"%>
<%@page import="java.util.Enumeration"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html lang="en">
    <head>

        <title>Cart-Buy</title>
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
                        <li><a href="products.jsp">Products</a></li>
                        <li class="active">CART</li>
                    </ol>
                </div>
            </div>            <!-- check-out -->

            <script>
                // Can also be used with $(document).ready()
                $(window).load(function () {
                    $('.flexslider').flexslider({
                        animation: "slide",
                        controlNav: "thumbnails"
                    });
                });
            </script>
            <div class="container-fluid padding" >
                <div class="row text-center padding">


                <%
                    HashMap<String, Integer> cart = (HashMap<String, Integer>) session.getAttribute("listCart");
                    double total = 0.0;
                    String idremove = request.getParameter("remove");
                    if (idremove != null) {
                        cart.remove(idremove);
                    }
                    if (cart != null) {
                        out.print("<table class='table table-bordered'>");
                        out.print("<tr>");
                        out.print("<th>" + "Image" + "</th>");
                        out.print("<th>" + "Product's Name" + "</th>");
                        out.print("<th>" + "Price" + "</th>");
                        out.print("<th>" + "Discount" + "</th>");
                        out.print("<th>" + "Quantity" + "</th>");
                        out.print("<th></th>");
                        out.print("</tr>");
                        for (String i : cart.keySet()) {
                            int quantity = cart.get(i);
                            SanPham sp = new SanPhamDAO().getProductByID(i);
                            out.print("<tr>");
                            out.print("<td><img src='" + sp.getHinhAnh() + "'/></td>");
                            out.print("<td>" + sp.getTenSanPham() + "</a></td>");
                            out.print("<td>" + "$" + sp.getGiaTien() + "</td>");
                            out.print("<td>" + sp.getGiaGiam() + "</td>");
                            out.print("<td>" + quantity + "</td>");
                            total += (double) quantity * (Integer.parseInt(sp.getGiaTien()) - Integer.parseInt(sp.getGiaGiam()) * Integer.parseInt(sp.getGiaTien()) / 100);
                            out.print("<td><a href='?remove=" + i + "'>Remove</a></td>");
                            out.print("</tr>");
                        }
                        out.print("</table>");
                    }

                %>
                <style>            
                    img{
                        width: 200px;
                        height: 200px;
                    }
                    th{                  
                        text-align: center;
                        font-size: 25px;
                    }
                    table{
                        width: 50%;
                        font-size: 20px;
                    }

                </style>
                <div col-xs-12 col-sm-6>

                </div>       
                <div class="col-xs-12 col-sm-6" style="position: relative; right: -410px;">
                    <a class="continue" href="index.jsp">Continue to basket</a>
                    <ul class="total_price">
                        <li class="last_price"> <h4>TOTAL</h4></li>	
                        <li class="last_price"><span>$<%=total%></span></li>
                        <div class="clearfix"> </div>
                    </ul> 
                    <div class="clearfix"></div>
                    <form action="BuyController" >
                        <input type="hidden" value="<%=total%>" name="total"/>
                        <input class="btn btn-dark btn-block" type="submit" name="PlaceOrder" value="PLACE ORDER" style=" background: #100b0b; color: white; font-size: 20px; text-align: center;  margin-bottom: 2em; font-family: 'Pathway Gothic One';  text-transform: uppercase;padding: 10px 20px;  text-decoration: none; display: block;font-weight: 600;"/>
                    </form>
                </div>
            </div>
        </div>


        <!--footer!-->
        <jsp:include page="footer/footerlevel1.jsp"></jsp:include>
        <!--footer!-->
    </body>
</html>
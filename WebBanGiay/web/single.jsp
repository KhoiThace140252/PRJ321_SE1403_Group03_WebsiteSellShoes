<%-- 
    Document   : single
    Created on : Jul 3, 2020, 6:30:53 PM
    Author     : Admin
--%>

<%@page import="Model.NhaCungCap"%>
<%@page import="Model.SanPham"%>
<%@page import="Dao.ChiTietSanPhamDAO"%>
<%@page import="Model.ChiTietSanPham"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Shop</title>
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
                        <li class="active">Shop</li>
                    </ol>
                </div>
            </div>
            <div class="showcase-grid">
                <form action="CartController">

                <%
                    ChiTietSanPham getctsp = (ChiTietSanPham) request.getAttribute("showfromindex1");
                    if (getctsp != null) {
                        SanPham sp = (SanPham) request.getAttribute("showfromindex2");
                        NhaCungCap ncc = (NhaCungCap) request.getAttribute("showfromindex3");

                %>
                <input type="hidden" name="idsanpham" value="<%=sp.getMaSanPham()%>"/>
                <div class="container " >
                    <div class="col-sm-5 showcase">
                        <div class="flexslider">
                            <ul class="slides">
                                <li data-thumb="<%=getctsp.getHinhAnhChiTiet1()%>">
                                    <div class="thumb-image"><img width="50" height="50" src="<%=getctsp.getHinhAnhChiTiet1()%>" data-imagezoom="true" class="img-responsive"></div>
                                </li>
                                <li data-thumb="<%=getctsp.getHinhAnhChiTiet2()%>">
                                    <div class="thumb-image"> <img  width="50" height="50" src="<%=getctsp.getHinhAnhChiTiet2()%>" data-imagezoom="true" class="img-responsive"> </div>
                                </li>
                                <li data-thumb="<%=getctsp.getHinhAnhChiTiet3()%>">
                                    <div class="thumb-image"> <img  width="50" height="50" src="<%=getctsp.getHinhAnhChiTiet3()%>" data-imagezoom="true" class="img-responsive"> </div>
                                </li>
                                <li data-thumb="<%=getctsp.getHinhAnhChiTiet4()%>">
                                    <div class="thumb-image"> <img  width="50" height="50" src="<%=getctsp.getHinhAnhChiTiet4()%>" data-imagezoom="true" class="img-responsive"> </div>
                                </li>
                            </ul>
                            <div class="clearfix"></div>
                        </div>
                    </div>
                    <div class="col-sm-5 showcase">
                        <div class="showcase-rt-top">
                            <div class="pull-left shoe-name">
                                <h3><%=sp.getTenSanPham()%></h3>                    
                                <h4>&#36;<%=sp.getGiaTien()%></h4>                             
                            </div>          
                            <div class="clearfix"></div>
                        </div>
                        <hr class="featurette-divider">
                        <div class="shocase-rt-bot">
                            <div class="float-qty-chart">
                                <ul>
                                    <li class="qty">
                                        <h4>QUANTITY</h4>
                                        <select name="BuyQuantity" value="" class="form-control qnty-chrt">
                                            <option value="1">1</option>
                                            <option value="2">2</option>
                                            <option value="3">3</option>
                                            <option value="4">4</option>
                                            <option value="5">5</option>
                                            <option value="6">6</option>
                                            <option value="7">7</option>
                                        </select>
                                    </li>
                                </ul>
                                <div class="clearfix"></div>
                            </div>
                            <ul>
                                <li class="ad-2-crt simpleCart_shelfItem">

                                    <input class="btn btn-dark btn-block" style=" background-color: black; color: white;" type="submit" value="Add To Cart">
                                    <input class="btn btn-dark btn-block" style=" background-color: black; color: white;" type="submit" name="BuyNow" value="Buy Now">
                                </li>
                            </ul>
                        </div>
                        </form>
                        <div class="showcase-last">
                            <h3>product details</h3>
                            <ul>
                                <li><%=getctsp.getMoTa1()%></li>

                            </ul>
                        </div>
                    </div>
                    <div class="clearfix"></div>
                </div>

        </div>

        <div class="specifications">
            <div class="container">
                <h3>Item Details</h3> 
                <div class="detai-tabs">
                    <!-- Nav tabs -->
                    <ul class="nav nav-pills tab-nike" role="tablist">

                        <li role="presentation"><a href="#profile" aria-controls="profile" role="tab" data-toggle="tab">Description</a></li>
                        <li role="presentation"><a href="#messages" aria-controls="messages" role="tab" data-toggle="tab">Terms & conditiona</a></li>
                    </ul>

                    <!-- Tab panes -->
                    <div class="tab-content">               
                        <div role="tabpanel" class="tab-pane" id="profile">
                            <p><%=ncc.getMota()%></p>    
                        </div>
                        <div role="tabpanel" class="tab-pane" id="messages">
                            The images represent actual product though color of the image and product may slightly differ.    
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%
            }
        %>
        <!--footer!-->
        <jsp:include page="footer/footerlevel1.jsp"></jsp:include>
        <!--footer!-->
    </body>
</html>

<%-- 
    Document   : products
    Created on : Jul 3, 2020, 6:29:27 PM
    Author     : Admin
--%>

<%@page import="Model.SanPham"%>
<%@page import="java.util.Collection"%>
<%@page import="Dao.SanPhamDAO"%>
<%@page import="java.util.Map"%>
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
        <!--form-css-->
        <link href="css/form.css" rel="stylesheet" type="text/css" media="all" />
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
                        <li class="active">PRODUCTS</li>
                    </ol>
                </div>
            </div>
            <div class="products-gallery">
                <div class="container">
                    <div class="col-xs-12 grid-gallery">

                    <%
                        Map<String, SanPham> map = new SanPhamDAO().getTinhTrangSanPham();;
                        Collection<SanPham> values = map.values();
                        int i = 0;
                        for (SanPham row : values) {
                            i++;
                            if (i > 12) {
                                break;
                            }

                    %>
                    <div class="col-md-4 col-sm-4 col-xs-12  grid-stn simpleCart_shelfItem">
                        <!-- normal -->
                        <div class="ih-item square effect3 bottom_to_top">
                            <div class="bottom-2-top">
                                <div class="img"  ><img src="<%=row.getHinhAnh()%>"  alt="" class="img-responsive gri-wid"></div>
                                <div class="info">
                                    <div class="pull-left styl-hdn">
                                        <h3><%=row.getTenSanPham()%></h3>
                                    </div>
                                    <div class="pull-right styl-price">
                                        <p><a  href="CartController?idsanpham=<%=row.getMaSanPham()%>&BuyQuantity=1" class="item_add"><span class="glyphicon glyphicon-shopping-cart grid-cart" aria-hidden="true"></span> <span class=" item_price">$<%=row.getGiaTien()%></span></a></p>
                                    </div>
                                    <div class="clearfix"></div>
                                </div></div>
                        </div>
                        <!-- end normal -->
                        <div class="quick-view">
                            <a href="ShowProductController?iddetailproduct=<%= row.getMaSanPham()%>">Quick view</a>
                        </div>
                    </div> 

                    <%                              }
                    %>
                    <div class="clearfix"></div>
                </div>

                <div class="clearfix"></div>
            </div> 
        </div>
        <!--footer!-->
        <jsp:include page="footer/footerlevel1.jsp"></jsp:include>
        <!--footer!-->
    </body>
</html>
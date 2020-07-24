<%-- 
    Document   : search
    Created on : Jul 18, 2020, 12:24:24 PM
    Author     : Admin
--%>

<%@page import="java.util.Collection"%>
<%@page import="Model.SanPham"%>
<%@page import="Model.SanPham"%>
<%@page import="java.util.Map"%>
<%@page import="Dao.SanPhamDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Search</title>
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
        <!--custom css-->
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <!--shop-kart-js-->
        <script src="js/simpleCart.min.js"></script>
        <!--default-js-->
        <script src="js/jquery-2.1.4.min.js"></script>
        <!--bootstrap-js-->
        <script src="js/bootstrap.min.js"></script>
        <!--script-->
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
        <%
            String name = (String) request.getAttribute("nameSearch");
        %>
        <div class="head-bread">
            <div class="container">
                <ol class="breadcrumb">                   
                    <li class="active" ><h1 style="color: black">Search results for ' <%=name%>' </h1></li>
                </ol>
            </div>
        </div>

        <div class="shop-grid">
            <div class="container">
                <%
                    Map<String, SanPham> map = (Map<String, SanPham>) request.getAttribute("SearchValue");//tao map get du lieu tu database ve map
                    Collection<SanPham> values = map.values();//mot colleaction get values
                    int i = 0;//khoi tao bien i
                    for (SanPham row : values) {//vong lap in toan bo san pham tim duoc bang tu khoa
                        i++;//tang i
                        if (i > 100) {//toi da 100 san pham
                            break;
                        }

                %>

                <!--Start-->
                <div class="col-md-4 grid-stn simpleCart_shelfItem">
                    <!-- normal -->
                    <div class="ih-item square effect3 bottom_to_top">
                        <div class="bottom-2-top">
                            <div class="img"><img src="<%=row.getHinhAnh()%>" alt="" class="img-responsive gri-wid"></div>
                            <div class="info">
                                <div class="pull-left styl-hdn">
                                    <h3><%=row.getTenSanPham()%></h3>
                                </div>
                                <div class="pull-right styl-price">
                                    <p><a  href="#" class="item_add"><span class=" item_price">$<%=row.getGiaTien()%></span></a></p>
                                </div>
                                <div class="clearfix"></div>
                            </div>                            
                        </div>
                    </div>
                    <!-- end normal -->
                    <div class="quick-view">
                        <a href="ShowProductController?iddetailproduct=<%= row.getMaSanPham()%>">Quick view</a>
                    </div>
                </div>
                <%
                    }
                %>


                <!--End-->
                <div class="clearfix"></div>
            </div>
        </div>

        <!--footer!-->
        <jsp:include page="footer/footerlevel1.jsp"></jsp:include>
        <!--footer!-->
    </body>
</html>

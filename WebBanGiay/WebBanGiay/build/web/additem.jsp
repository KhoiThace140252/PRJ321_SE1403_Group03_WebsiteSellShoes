<%-- 
    Document   : additem
    Created on : Jul 8, 2020, 10:31:43 AM
    Author     : Admin
--%>

<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="Model.SanPham"%>
<%@page import="Dao.SanPhamDAO"%>
<%@page import="Model.KhachHang"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html.>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin</title>
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-2.1.3.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="keywords" content="N-Air Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() {setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <meta charset utf="8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
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
        <style>
            body{
                font-family: 'Time New Roman', cursive;
            }
            .container{
                width: 50%;
            }
        </style>
        <%
            KhachHang kh = (KhachHang) session.getAttribute("userlogin");
        %>
    </head>
    <body>
        <!--Header-top!-->      
        <div class="header-top">
            <div class="logo">
                <a href="#">N-AIR</a>
            </div>
            <div class="login-bars">
                <a class="btn btn-default log-bar" href="" role="button">Hello,
                    <%                        if (kh != null) {
                            out.print(kh.getTen());
                        }
                        SanPhamDAO spDao = new SanPhamDAO();
                        Map<String, SanPham> map = new HashMap<>();
                        map = spDao.layDuLieuTuDatabase();                   
                    %>
                </a>
                <a class="btn btn-default log-bar" href="LoginController?action=Logout" role="button">Logout</a>
            </div>
            <div class="clearfix"></div>
        </div>
        <!--Header-top!-->       
        <div class="container" >
            <form action="InsertProductController" method="post">
                <div class="form-group">
                    <label class="col-sm-3 control-label">Product code</label>
                    <input type="text" class="form-control" name="maSanPham" value="" autofocus/>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label">Product's name</label>
                    <input class="form-control" required=" " name="tenSanPham" value="" autofocus=""/>
                </div>

                <div class="form-group">
                    <label class="col-sm-3 control-label">Price has decreased</label>
                    <input class="form-control" required=" " name="giaDaGiam" value="" autofocus=""/>
                </div>

                <div class="form-group">
                    <label class="col-sm-3 control-label">Price</label>
                    <input class="form-control"  required=" " name="giaBan" value="" autofocus=""/>
                </div>

                <div class="form-group">
                    <label class="col-sm-3 control-label">Amount</label>
                    <input class="form-control" required=" " name="soLuong" value="" autofocus=""/>
                </div>

                <div class="form-group">
                    <label class="col-sm-3 control-label">Supplier</label>
                    <input class="form-control" required=" " name="nhaCungCap" value="" autofocus=""/>
                </div>

                <div class="form-group">
                    <label  class="col-sm-3 control-label">Code type</label>
                    <input class="form-control" required=" " name="maLoai" value="" autofocus=""/>
                </div>

                <div class="form-group">
                    <label class="col-sm-3 control-label">Image</label>
                    <input  type="file"class="form-control" required=" " name="hinhAnh" value="" autofocus=""/>
                </div>

                <div class="form-group">
                    <label  class="col-sm-3 control-label">The number of import</label>
                    <input  type="text"class="form-control" required=" " name="soLuongNhap" value="" autofocus=""/>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label">Sell number</label>
                    <input  type="text"class="form-control" required=" " name="soLuongBan" value="" autofocus=""/>
                </div>
                <input type="submit" name="insert" value="INSERT">
                <input type="submit" value="UPDATE">
               
            </form>
        </div>
    </body>
</html>

<%-- 
    Document   : updateTypeProduct
    Created on : Jul 13, 2020, 11:42:04 PM
    Author     : HAOVNCE140475
--%>

<%@page import="Model.LoaiSanPham"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Update Type Product</title>

        <!-- Bootstrap core CSS-->
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom fonts for this template-->
        <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

        <!-- Custom styles for this template-->
        <link href="css/sb-admin.css" rel="stylesheet">

    </head>

    <body class="bg-dark">

        <div class="container">
            <div class="card card-register mx-auto mt-5">
                <div class="card-header">Update Product</div>
                <div class="card-body">
                    <form action="EditProductTypeController" method="post">
                        <!--Type ID -->
                        <%
                            LoaiSanPham lsp = (LoaiSanPham) request.getAttribute("infoTypeProduct"); //tao mot object lsp get loai san pham
                        %>
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="txtIDTypeUpdate" value="<%=lsp.getMaLoai()%>" class="form-control" >
                                <label>Type ID</label>
                            </div>
                        </div>

                        <!--Type's Name-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="txtNameTypeUpdate" value="<%=lsp.getTenLoai()%>" class="form-control" >
                                <label>Type's Name</label>
                            </div>
                        </div>

                        <!--Supplier ID-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="txtSupplierUpdate" value="<%=lsp.getMaNhaCungCap()%>" class="form-control" >
                                <label>Supplier ID</label>
                            </div>
                        </div>

                        <!--Description -->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="txtDescriptionUpdate" value="<%=lsp.getMoTaLoai()%>" class="form-control" >
                                <label>Description</label>
                            </div>
                        </div>
                        <input class="btn btn-primary btn-block" type="submit" value="Update"/>
                        <a class="btn btn-dark btn-block" href="typesProduct.jsp">Cancel</a>
                    </form>
                </div>
            </div>
        </div>

        <!-- Bootstrap core JavaScript-->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Core plugin JavaScript-->
        <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

    </body>

</html>
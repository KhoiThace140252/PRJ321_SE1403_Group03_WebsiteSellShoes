<%-- 
    Document   : updateProduct
    Created on : Jul 13, 2020, 11:27:57 PM
    Author     : HAOVNCE140475
--%>

<%@page import="Model.SanPham"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Update Product</title>

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
                    <form action="EditProductController" method="post" enctype="multipart/form-data">
                        <%
                            SanPham sp = (SanPham) request.getAttribute("infoProduct");//tao mot object sp lay thong tin san pham
                        %>
                        <!--Product ID -->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="hidden"  name="txtId" value="<%=sp.getMaSanPham()%>" class="form-control" >
                                <label>Product ID</label>
                            </div>
                        </div>

                        <!--Product's Name-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="txtNameProduct" value="<%=sp.getTenSanPham()%>" class="form-control" >
                                <label>Product's Name</label>
                            </div>
                        </div>

                        <!--Discount-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="txtDiscount" value="<%=sp.getGiaGiam()%>" class="form-control" >
                                <label>Discount</label>
                            </div>
                        </div>

                        <!--Price -->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="txtPrice" value="<%=sp.getGiaTien()%>" class="form-control" >
                                <label>Price</label>
                            </div>
                        </div>

                        <!--Quantity-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="hidden"  name="txtQuantity" value="<%=sp.getSoLuong()%>" class="form-control" >
                                <label>Quantity</label>
                            </div>
                        </div>

                        <!--Supplier-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="txtIdSupplier" value="<%=sp.getMaNhaCungCap()%>" class="form-control" >
                                <label>Supplier</label>
                            </div>
                        </div>

                        <!--Type ID -->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="txtIdType" value="<%=sp.getMaLoaiSanPham()%>" class="form-control" >
                                <label>Type ID</label>
                            </div>
                        </div>

                        <!--Logo-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="file"  name="txtLogo" value="<%=sp.getHinhAnh()%>" class="form-control" >
                                <label>Image</label>
                            </div>
                        </div>

                        <!--Quantity imported-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="txtImport" value="<%=sp.getSoLuongNhap()%>" class="form-control" >
                                <label>Quantity Imported</label>
                            </div>
                        </div>

                        <!--Quantity sold-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="hidden"  name="txtExport" value="<%=sp.getSoLuongBan()%>" class="form-control" >
                            </div>
                        </div>
                        <input class="btn btn-primary btn-block" type="submit" value="Update"/>
                        <a class="btn btn-dark btn-block" href="productsadmin.jsp">Cancel</a>
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

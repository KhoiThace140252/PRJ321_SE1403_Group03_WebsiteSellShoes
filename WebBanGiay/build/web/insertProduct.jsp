<%-- 
    Document   : insertProduct
    Created on : Jul 17, 2020, 5:41:52 PM
    Author     : Admin
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Insert Product</title>

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
                <div class="card-header">Insert Product</div>
                <div class="card-body">
                    <form action="InsertProductController" method="post">

                        <!--Product ID -->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="InsertmaSanPham" class="form-control" >
                                <label>Product ID</label>
                            </div>
                        </div>

                        <!--Product's Name-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="InserttenSanPham"  class="form-control" >
                                <label>Product's Name</label>
                            </div>
                        </div>

                        <!--Discount-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="InsertgiaDaGiam" class="form-control" >
                                <label>Discount</label>
                            </div>
                        </div>

                        <!--Price -->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="InsertgiaBan" class="form-control" >
                                <label>Price</label>
                            </div>
                        </div>                  
                        <!--Supplier-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="InsertnhaCungCap"  class="form-control" >
                                <label>Supplier</label>
                            </div>
                        </div>

                        <!--Type ID -->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="InsertmaLoai" class="form-control" >
                                <label>Type ID</label>
                            </div>
                        </div>

                        <!--Logo-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="file"  name="InserthinhAnh"  class="form-control" >
                                <label>Image</label>
                            </div>
                        </div>

                        <!--Quantity imported-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="InsertsoLuongNhap" class="form-control" >
                                <label>Quantity Imported</label>
                            </div>
                        </div>

                        <!--Quantity sold-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="hidden"  name="InsertsoLuongBan" class="form-control" >
                               
                            </div>
                        </div>
                        <input class="btn btn-primary btn-block" type="submit" value="Insert"/>
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


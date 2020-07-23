<%-- 
    Document   : insertTypeProduct
    Created on : Jul 17, 2020, 9:36:02 PM
    Author     : Admin
--%>

<%@page import="Model.LoaiSanPham"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
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
                    <form action="InsertTypeProductController" method="post">
                        <!--Type ID -->
                       
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="txtIDInsert" value="" class="form-control" >
                                <label>Type ID</label>
                            </div>
                        </div>

                        <!--Type's Name-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="txtNameTypeInsert" value="" class="form-control" >
                                <label>Type's Name</label>
                            </div>
                        </div>

                        <!--Supplier ID-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="txtSupplierInsert" value="" class="form-control" >
                                <label>Supplier ID</label>
                            </div>
                        </div>

                        <!--Description -->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="txtDescriptionInsert" value="" class="form-control" >
                                <label>Description</label>
                            </div>
                        </div>
                        <input class="btn btn-primary btn-block" type="submit" value="Insert"/>
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

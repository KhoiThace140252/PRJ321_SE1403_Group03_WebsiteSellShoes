<%-- 
    Document   : updateSupplier
    Created on : Jul 14, 2020, 12:22:57 AM
    Author     : HAOVNCE140475
--%>

<%@page import="Model.NhaCungCap"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Update Supplier</title>

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
                <div class="card-header">Update Supplier</div>
                <div class="card-body">
                    <form action="EditSupplierController" method="post">
                        <%
                            NhaCungCap ncc = (NhaCungCap) request.getAttribute("infoSupplierProduct"); //tao mot object ncc lay thong tin nha cung cap
                        %>
                        <!--Supplier ID-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="UpdateIdSupplier" value="<%=ncc.getMaNhaCungCap()%>" class="form-control" >
                                <label>Supplier ID</label>
                            </div>
                        </div>

                        <!--Supplier's Name-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="UpdateNameSupplier" value="<%=ncc.getTenNhaCungCap()%>" class="form-control" >
                                <label>Supplier's Name</label>
                            </div>
                        </div>

                        <!--Address-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="UpdateAddressSupplier" value="<%=ncc.getDiaChi()%>" class="form-control" >
                                <label>Address</label>
                            </div>
                        </div>

                        <!--Phone Number-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="UpdatePhoneSupplier" value="<%=ncc.getSoDienThoai()%>" class="form-control" >
                                <label>Phone Number</label>
                            </div>
                        </div>

                        <!--Logo-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="file"  name="UpdateLogoSupplier" value="<%=ncc.getLogo()%>" class="form-control" >
                                <label>Logo</label>
                            </div>
                        </div>  
                        <!--Description-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="UpdateDescriptionSupplier" value="<%=ncc.getMota()%>" class="form-control" >
                                <label>Description</label>
                            </div>
                        </div>
                        <input class="btn btn-primary btn-block" type="submit" value="Update"/>
                        <a class="btn btn-dark btn-block" href="suppliers.jsp">Cancel</a>
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

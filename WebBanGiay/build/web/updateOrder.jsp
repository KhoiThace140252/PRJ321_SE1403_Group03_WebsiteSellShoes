<%-- 
    Document   : updateOrder
    Created on : Jul 14, 2020, 12:08:57 AM
    Author     : HAOVNCE140475
--%>

<%@page import="Model.DonHang"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Update Order</title>

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
                <div class="card-header">Update Order</div>
                <div class="card-body">
                    <form id="edit-form-update" action="EditOrderController" method="post">

                        <%
                            DonHang dh = (DonHang) request.getAttribute("infoOrder");//tao mot object dh lay thong tin don hang
                        %>
                        <!--Id-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="hidden"  name="txtId" value="<%=dh.getId()%>" class="form-control"readonly="" >                     
                            </div>
                        </div>
                        <!--Customer's Name-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="txtCustomerName" value="<%=dh.getTenKhachHang()%>" class="form-control" readonly="">
                                <label>Customer's Name</label>
                            </div>
                        </div>

                        <!--List of Products -->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="txtProductName" value="<%=dh.getTenSanPham()%>" class="form-control" readonly="">
                                <label>Products Name</label>
                            </div>
                        </div>
                        <!--Amount-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="txtAmount" value="<%=dh.getTongSoLuong()%>" class="form-control" readonly="" >
                                <label>Quantity</label>
                            </div>
                        </div>        
                        <!--Total Money-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="txtTotal" value="<%=dh.getTongTien()%>" class="form-control"readonly="" >
                                <label>Total Money</label>
                            </div>
                        </div>

                        <!--Date-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="date"  name="txtDate" value="<%=dh.getNgayMua()%>" class="form-control" readonly="">
                                <label>Date</label>
                            </div>
                        </div>

                        <!--Address-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="txtAddress" value="<%=dh.getDiaChi()%>" class="form-control"readonly="" >
                                <label>Address</label>
                            </div>
                        </div>

                        <!--Phone Number-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="txtPhone" value="<%=dh.getSoDienThoai()%>" class="form-control"readonly="" >
                                <label>Phone Number</label>
                            </div>
                        </div>

                        <!--Email-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="email"  name="txtEmail" value="<%=dh.getEmail()%>" class="form-control" readonly="" >
                                <label>Email</label>
                            </div>
                        </div>
                        <!--Status of Product-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="txtStatus" value="<%=dh.getTinhTrangDonHang()%>" class="form-control"/>
                                <label>Status of Product</label>
                            </div>
                        </div>
                        <input class="btn btn-primary btn-block" type="submit" value="Update"/>
                        <a class="btn btn-dark btn-block" href="order.jsp">Cancel</a>
                    </form>
                </div>
            </div>
        </div>
 <script>
            function actionEdit() {
                $("#edit-form-update").submit();
            }
        </script>
        <!-- Bootstrap core JavaScript-->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Core plugin JavaScript-->
        <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

    </body>

</html>

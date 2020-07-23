<%-- 
    Document   : order
    Created on : Jul 13, 2020, 11:55:04 PM
    Author     : HAOVNCE140475
--%>

<%@page import="java.util.Collection"%>
<%@page import="Dao.DonHangDAO"%>
<%@page import="java.util.Map"%>
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

        <title>Admin - Orders</title>

        <!-- Bootstrap core CSS-->
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom fonts for this template-->
        <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

        <!-- Page level plugin CSS-->
        <link href="vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">

        <!-- Custom styles for this template-->
        <link href="css/sb-admin.css" rel="stylesheet">

    </head>

    <body id="page-top">

        <jsp:include page="header-admin/header-top.jsp"></jsp:include>
            <div id="wrapper">

                <!-- Sidebar -->
                <!-- Headerbottom -->
            <jsp:include page="header-admin/header-bottom.jsp"></jsp:include>
                <!-- Header bottom -->
                <div id="content-wrapper">

                    <div class="container-fluid">

                        <!-- Breadcrumbs-->
                        <ol class="breadcrumb">
                            <li class="breadcrumb-item">
                                <a href="indexadmin.jsp">Dashboard</a>
                            </li>
                            <li class="breadcrumb-item active">Orders</li>

                        </ol>

                        <!-- DataTables Example -->
                        <div class="card mb-3">
                            <div class="card-header">
                                <i class="fas fa-user"></i>
                                List Orders</div>
                            <div class="card-body">
                                <div class="table-responsive">
                                    <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                        <thead>
                                            <tr>
                                                <th>Order ID</th>
                                                <th>Customer's Name</th>
                                                <th>Products Name</th>
                                                <th>Quantity</th>                                             
                                                <th>Total of money</th>
                                                <th>Date</th> 
                                                <th>Address</th>       
                                                <th>Phone Number</th>
                                                <th>Email</th>
                                                <th>Status of Product</th>
                                                <th></th>
                                            </tr>
                                        </thead>                                 
                                        <tbody> 
                                        <%
                                            Map<String, DonHang> mapDonHang = new DonHangDAO().layDuLieuTuDatabase();
                                            Collection<DonHang> values = mapDonHang.values();
                                            for (DonHang row : values) {
                                        %>
                                        <tr>
                                            <td><%=row.getId()%></td>
                                            <td><%=row.getTenKhachHang()%></td>
                                            <td><%=row.getTenSanPham()%></td>
                                            <td><%=row.getTongSoLuong()%></td>       
                                            <td><%=row.getTongTien()%></td>
                                            <td><%=row.getNgayMua()%></td>
                                            <td><%=row.getDiaChi()%></td>
                                            <td><%=row.getSoDienThoai()%></td>
                                            <td><%=row.getEmail()%></td>
                                            <td><%=row.getTinhTrangDonHang()%></td>
                                            <td>
                                                <a class="nav-link" href="EditOrderController?id=<%=row.getId()%>" id="submit"><i class="fas fa-fw fa-pen"></i></a>                                                                  
                                                <a class="nav-link" href="DeleteOrderController?id=<%=row.getId()%>"><i class="fas fa-fw fa-trash"></i></a>
                                            </td>
                                        </tr>
                                        <%
                                            }
                                        %>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>
        <!-- /#wrapper -->

        <!-- Scroll to Top Button-->
        <a class="scroll-to-top rounded" href="#page-top">
            <i class="fas fa-angle-up"></i>
        </a>
        <script>
            function actionEdit() {
                $("#edit-form-update-order").submit();
            }
        </script>


        <!-- Bootstrap core JavaScript-->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Core plugin JavaScript-->
        <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

        <!-- Page level plugin JavaScript-->
        <script src="vendor/datatables/jquery.dataTables.js"></script>
        <script src="vendor/datatables/dataTables.bootstrap4.js"></script>

        <!-- Custom scripts for all pages-->
        <script src="js/sb-admin.min.js"></script>

        <!-- Demo scripts for this page-->
        <script src="js/demo/datatables-demo.js"></script>

    </body>

</html>





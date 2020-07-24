<%-- 
    Document   : typesProduct
    Created on : Jul 13, 2020, 11:36:04 PM
    Author     : HAOVNCE140475
--%>

<%@page import="java.util.Collection"%>
<%@page import="Dao.LoaiSanPhamDAO"%>
<%@page import="Model.LoaiSanPham"%>
<%@page import="java.util.Map"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Admin - Types Product</title>

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
                            <li class="breadcrumb-item ">Products</li>
                            <li class="breadcrumb-item active">Types Products</li>
                        </ol>

                        <!-- DataTables Example -->
                        <div class="card mb-3">
                            <div class="card-header">
                                <table>
                                    <tr>
                                        <td><i class="fas"></i>List Type Products</td>
                                        <td style="padding:0px 0px 0px 100px"><a  class="btn btn-primary" href="insertTypeProduct.jsp">+ Add New</a></td>
                                    </tr> 
                                </table>  
                            </div>
                            <div class="card-body">
                                <div class="table-responsive">
                                    <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                        <thead>
                                            <tr>
                                                <th>Type ID</th>
                                                <th>Type's Name</th>
                                                <th>Supplier ID</th>
                                                <th>Description</th>
                                                <th></th>
                                            </tr>
                                        </thead>

                                        <tbody>                  
                                            <tr>
                                            <%
                                                Map<String, LoaiSanPham> mapLoaiSanPham = new LoaiSanPhamDAO().layDuLieuTuDatabase();//tao map mapLoaiSanPham get du lieu tu database ve map
                                                Collection<LoaiSanPham> values = mapLoaiSanPham.values();//mot colleaction get values
                                                for (LoaiSanPham row : values) {//vong lap in cac gia tri trong map
                                            %>
                                            <%
                                                out.print("<td>" + row.getMaLoai() + "</td>");//thong tin ma loai
%>
                                            <td><%=row.getTenLoai()%></td><!--thong tin ten loai-->
                                            <td><%=row.getMaNhaCungCap()%></td><!--thong tin ma nha cung cap-->
                                            <td><%=row.getMoTaLoai()%></td><!--thong tin mo ta loai-->
                                            <td>
                                                <a class="nav-link" href="EditProductTypeController?id=<%=row.getMaLoai()%>"><i class="fas fa-fw fa-pen"></i></a>
                                                <a class="nav-link" href="DeleteProductTypeController?id=<%=row.getMaLoai()%>"><i class="fas fa-fw fa-trash"></i></a>
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




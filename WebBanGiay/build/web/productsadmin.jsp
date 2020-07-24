<%-- 
    Document   : productsadmins
    Created on : Jul 13, 2020, 11:05:03 PM
    Author     : HAOVNCE140475
--%>

<%@page import="java.util.Collection"%>
<%@page import="Dao.SanPhamDAO"%>
<%@page import="Dao.SanPhamDAO"%>
<%@page import="java.util.Map"%>
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

        <title>Admin - Products</title>

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
                            <li class="breadcrumb-item">Products</li>
                            <li class="breadcrumb-item active"> Products</li>
                        </ol>

                        <!-- DataTables Example -->
                        <div class="card mb-3">
                            <div class="card-header">
                                <table>
                                    <tr>
                                        <td><i class="fas"></i>List Products</td>
                                        <td style="padding:0px 0px 0px 100px"><a  class="btn btn-primary" href="insertProduct.jsp">+ Add New</a></td>
                                    </tr> 
                                </table>  
                            </div>
                            <div class="card-body">
                                <div class="table-responsive">
                                    <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                        <thead>
                                            <tr>
                                                <th>Product ID</th>
                                                <th>Product's Name</th>
                                                <th>Discount</th>
                                                <th>Price</th>
                                                <th>Quantity</th>
                                                <th>Supplier</th>
                                                <th>Type ID</th>
                                                <th>Image</th>
                                                <th>Quantity imported</th>
                                                <th>Quantity sold</th>
                                                <th>Status</th>
                                                <th></th>
                                            </tr>
                                        </thead>                   
                                        <tbody>                  
                                            <tr>
                                            <%
                                                Map<String, SanPham> mapSanPham = new SanPhamDAO().layDuLieuTuDatabase();//tao map mapSanPham get du lieu tu database ve map
                                                Collection<SanPham> values = mapSanPham.values();//mot colleaction get values
                                                for (SanPham row : values) {//vong lap in toan bo san pham tim duoc bang tu khoa
                                            %>
                                            <td><%=row.getMaSanPham()%></td>
                                            <td><%=row.getTenSanPham()%></td>
                                            <td><%=row.getGiaGiam()%></td>
                                            <td><%=row.getGiaTien()%></td>
                                            <td><%=row.getSoLuong()%></td>
                                            <td><%=row.getMaNhaCungCap()%></td>
                                            <td><%=row.getMaLoaiSanPham()%></td>
                                            <td><img width="50" height="50" src="<%=row.getHinhAnh()%>"/></td>
                                            <td><%=row.getSoLuongNhap()%></td>
                                            <td><%=row.getSoLuongBan()%></td>
                                            <td><%=row.getTinhtrangsanpham()%></td>
                                            <td>
                                                <a class="nav-link" href="EditProductController?id=<%=row.getMaSanPham()%>" id="submit"><i class="fas fa-fw fa-pen"></i></a>                      
                                                <a class="nav-link" href="DeleteProductController?id=<%=row.getMaSanPham()%>"><i class="fas fa-fw fa-trash"></i></a>
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
                $("#edit-form-product").submit();
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



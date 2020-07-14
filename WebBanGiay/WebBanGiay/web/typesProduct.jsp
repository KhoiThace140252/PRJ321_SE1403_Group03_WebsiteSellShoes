<%-- 
    Document   : typesProduct
    Created on : Jul 13, 2020, 11:36:04 PM
    Author     : HAOVNCE140475
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

        <title>Types Product</title>

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

        <nav class="navbar navbar-expand navbar-dark bg-dark static-top">
            <a class="navbar-brand mr-1 fas" href="indexadmin.jsp"><h3>N-Air</h3></a>

            <button class="btn btn-link btn-sm text-white order-1 order-sm-0" id="sidebarToggle" href="#">
                <i class="fas fa-bars"></i>
            </button>

            <!-- Navbar Search -->
            <form class="d-none d-md-inline-block form-inline ml-auto mr-0 mr-md-3 my-2 my-md-0">

            </form>

            <!-- Navbar -->
            <ul class="navbar-nav ml-auto ml-md-0">
                <li class="nav-item dropdown no-arrow mx-1"></li>
                <li class="nav-item dropdown no-arrow mx-1"></li>

                <!-- LOGOUT-->
                <li class="nav-item dropdown no-arrow  ">
                    <a class="nav-link dropdown-toggle " href="#" id="userDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <h3><i class="fas fa-user-circle fa-fw"></i></h3>
                    </a>
                    <div class="dropdown-menu dropdown-menu-right" aria-labelledby="userDropdown">
                        <a class="dropdown-item" href="#" >Logout</a>
                    </div>
                </li>
            </ul>

        </nav>

        <div id="wrapper">

            <!-- Sidebar -->
            <ul class="sidebar navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="indexadmin.jsp">
                        <i class="fas fa-fw fa-tachometer-alt"></i>
                        <span>Dashboard</span>
                    </a>
                </li>

                <li class="nav-item ">
                    <a class="nav-link" href="account.jsp">
                        <i class="fas fa-fw fa-user"></i>
                        <span>Account</span></a>
                </li>

                <li class="nav-item ">
                    <a class="nav-link" href="order.jsp">
                        <i class="fas fa-fw fa-book"></i>
                        <span>Order</span></a>
                </li>
                <li class="nav-item dropdown active">
                    <a class="nav-link dropdown-toggle " href="#" id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <i class="fas fa-fw fa-box-open"></i>
                        <span>Product</span>
                    </a>
                    <div class="dropdown-menu" aria-labelledby="pagesDropdown">
                        <a class="dropdown-item" href="products.jsp">List Products</a>
                        <a class="dropdown-item" href="productInfo.jsp">List Products Information</a>
                        <a class="dropdown-item active" href="typesProduct.jsp">List Types Product</a>
                    </div>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="suppliers.jsp">
                        <i class="fas fa-fw fa-book"></i>
                        <span>Suppliers</span></a>
                </li>
                
                <li class="nav-item ">
                    <a class="nav-link" href="feedback.jsp">
                        <i class="fas fa-fw fa-book"></i>
                        <span>Feedbacks</span></a>
                </li>


            </ul>

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
                            <i class="fas fa-user"></i>
                            List Types Product</div>
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
                                    <tfoot>
                                        <tr>
                                            <th>Type ID</th>
                                            <th>Type's Name</th>
                                            <th>Supplier ID</th>
                                            <th>Description</th>
                                            <th></th>
                                        </tr>
                                    </tfoot>
                                    <tbody>                  
                                        <tr>
                                            <td>Michael Bruce</td>
                                            <td>Javascript Developer</td>
                                            <td>Singapore</td>
                                            <td>29</td>
                                            
                                            <td>
                                                <a class="nav-link" href="updateTypeProduct.jsp"><i class="fas fa-fw fa-pen"></i></a>
                                                <a class="nav-link" href="#"><i class="fas fa-fw fa-trash"></i></a>
                                            </td>
                                        </tr>
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




<%-- 
    Document   : updateAccount
    Created on : Jul 13, 2020, 9:58:49 PM
    Author     :    HAOVNCE140475
--%>

<%@page import="Model.KhachHang"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Update Account</title>

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
                <div class="card-header">Update Account</div>
                <div class="card-body">
                    <form id="edit-form-update" action="EditAccountController" method="post">        
                        <%
                            KhachHang kh = (KhachHang) request.getAttribute("infoUser");//tao mot object kh lay thong tin khach hang
                        %>
                        <!--Account's ID -->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="hidden"  name="txtId" value="<%=kh.getIdTaikhoan()%>" class="form-control" > 
                            </div>
                        </div>
                        <!--Account's Name -->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="txtUser" value="<%=kh.getTaiKhoan()%>" class="form-control" >
                                <label>Account's Name</label>
                            </div>
                        </div>

                        <!--Password-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="hidden"  name="txtPass" value="<%=kh.getMatKhau()%>" class="form-control" >          
                            </div>
                        </div>
                        <!--Fullname -->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="txtName" value="<%=kh.getTen()%>" class="form-control" >
                                <label>Fullname</label>
                            </div>
                        </div>
                        <!--Gender -->
                        <div class="form-group">

                            <label>Gender</label>
                            <div class="form-label-group">
                                <select name="txtGender" value="<%=kh.getGioiTinh()%>" class="form-control">
                                    <option value="Male">Male</option>
                                    <option value="Female">Female</option>
                                    <option value="Other">Other</option>
                                </select>

                            </div>
                        </div>

                        <!--Phone Number -->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="txtPhone" value="<%=kh.getSoDienThoai()%>" class="form-control" >
                                <label>Phone Number</label>
                            </div>
                        </div>

                        <!--Email -->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="email"  name="txtEmail" value="<%=kh.getEmail()%>" class="form-control" >
                                <label>Email</label>
                            </div>
                        </div>

                        <!--Birthday -->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="date"  name="txtBirth" value="<%=kh.getNgaySinh()%>" class="form-control" >
                                <label>Birthday</label>
                            </div>
                        </div>

                        <!--Address -->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="txtAddress" value="<%=kh.getDiaChi()%>" class="form-control" >
                                <label>Address</label>
                            </div>
                        </div>

                        <!--Customer's Name -->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="hidden"  name="txtNumber" value="<%=kh.getSoLuongMua()%>" class="form-control" >

                            </div>
                        </div>

                        <!--Role -->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="hidden"  name="txtRole" value="<%=kh.getRole()%>" class="form-control" >

                            </div>
                        </div>                      
                        <input class="btn btn-primary btn-block" type="submit" value="Update"/>
                        <a class="btn btn-dark btn-block" href="account.jsp">Cancel</a>
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


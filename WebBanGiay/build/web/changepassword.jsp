<%-- 
    Document   : changepassword
    Created on : Jul 23, 2020, 1:33:14 AM
    Author     : Admin
--%>

<%@page import="Model.KhachHang"%>
<%@page import="Dao.KhachHangDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Information</title>

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
                <div class="card-header">Change Password</div>
                <div class="card-body">
                    <form id="edit-form-update" action="InformationController" method="post">    
                        <%
                            Cookie[] cookies = request.getCookies();
                            if (cookies.length > 1) {
                                for (Cookie cookie : cookies) {
                                    if (cookie.getName().equals("ID")) {
                                        KhachHang kh = new KhachHangDAO().getAccountByID(Integer.parseInt(cookie.getValue()));

                        %>
                        <!--ID User-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="hidden"  name="IdCookieUser" value="<%=kh.getIdTaikhoan()%>"class="form-control" >     
                            </div>
                        </div>
                        <!--Current Password-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="password"  name="Currentpassword" value="" required="" class="form-control" >    
                                <label>Current Password</label>
                            </div>
                        </div>
                        <!--New Password -->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="password"  name="Newpassword" value="" onChange="onChange()" required="" class="form-control" >
                                <label>New Password</label>
                            </div>
                        </div>

                        <!--Confirm Password -->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="password"  name="Confirmpassword" value="" onChange="onChange()" class="form-control" >
                                <label>Confirm New password</label>
                            </div>
                        </div>                                 
                        <input class="btn btn-primary btn-block" type="submit" name="btnChangePassword"value="Change PassWord"/>
                        <a class="btn btn-dark btn-block" href="information.jsp">Cancel</a>
                        <%
                                    }
                                }
                            }

                        %>
                    </form>
                </div>
            </div>
        </div>   
        <script>
            function onChange() {
                const password = document.querySelector('input[name=Newpassword]');
                const confirm = document.querySelector('input[name=Confirmpassword]');
                if (password != null && confirm != null) {
                    if (confirm.value === password.value) {
                        confirm.setCustomValidity('');
                    } else {
                        confirm.setCustomValidity('Passwords do not match');
                    }
                }
                else{
                    confirm.setCustomValidity('Passwords do not null');
                }
            }
        </script>
        <!-- Bootstrap core JavaScript-->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Core plugin JavaScript-->
        <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

    </body>
</html>

<%-- 
    Document   : passwordadmin
    Created on : Jul 23, 2020, 3:36:12 AM
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
                            Cookie[] cookies = request.getCookies();        //get cookies and add to array
                            if (cookies.length > 1) {       //check null cookies
                                for (Cookie cookie : cookies) {     //read cookies
                                    if (cookie.getName().equals("ID")) {    //find cookies
                                        //call method and get account data
                                        KhachHang kh = new KhachHangDAO().getAccountByID(Integer.parseInt(cookie.getValue()));

                        %>
                        <!--ID User-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="hidden"  name="IdCookieUseradmin" value="<%=kh.getIdTaikhoan()%>"class="form-control" >     
                            </div>
                        </div>
                        <!--Current Password-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="password"  name="Currentpasswordadmin" value="" required="" class="form-control" >    
                                <label>Current Password</label>
                            </div>
                        </div>
                        <!--New Password -->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="password"  name="Newpasswordadmin" value="" onChange="onChange()" class="form-control" >
                                <label>New Password</label>
                            </div>
                        </div>

                        <!--Confirm Password -->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="password"  name="Confirmpasswordadmin" value="" onChange="onChange()" class="form-control" >
                                <label>Confirm New password</label>
                            </div>
                        </div>                                 
                        <input class="btn btn-primary btn-block" type="submit" name="btnChangePasswordAdmin"value="Change PassWord"/>
                        <a class="btn btn-dark btn-block" href="indexadmin.jsp">Cancel</a>
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
            function onChange() {       //funtion use to check input password
                const password = document.querySelector('input[name=Newpassword]');
                const confirm = document.querySelector('input[name=Confirmpassword]');
                if (confirm.value === password.value) {     //check confirm password == password
                    confirm.setCustomValidity('');
                } else {
                    confirm.setCustomValidity('Passwords do not match');
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

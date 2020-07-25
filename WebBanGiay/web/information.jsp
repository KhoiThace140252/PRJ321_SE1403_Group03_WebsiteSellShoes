<%-- 
    Document   : information
    Created on : Jul 23, 2020, 12:49:08 AM
    Author     : Admin
--%>

<%@page import="Model.DonHang"%>
<%@page import="Dao.DonHangDAO"%>
<%@page import="Dao.KhachHangDAO"%>
<%@page import="Model.KhachHang"%>
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
                <div class="card-header">Change Information</div>
                <div class="card-body">
                    <form id="edit-form-update" action="InformationController" method="post">        
                        <%
                            Cookie[] cookies = request.getCookies();        //get cookies and add to array
                            if (cookies.length > 1) {   //check cookies not null
                                for (Cookie cookie : cookies) {     //read cookies
                                    if (cookie.getName().equals("ID")) {    //check cookies 
                                        //call method use to get account data
                                        KhachHang kh = new KhachHangDAO().getAccountByID(Integer.parseInt(cookie.getValue()));
                                        //call method get order data
                                        DonHang dh = new DonHangDAO().getDonHangByName(kh.getTen());


                        %>

                        <!--Account's ID -->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="hidden"  name="txtInforId" value="<%=kh.getIdTaikhoan()%>" class="form-control" > 
                            </div>
                        </div>
                        <!--Account's Name -->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="txtInforUser" value="<%=kh.getTaiKhoan()%>" class="form-control" >
                                <label>Account's Name</label>
                            </div>
                        </div>

                        <!--Password-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="hidden"  name="txtInforPass" value="<%=kh.getMatKhau()%>" class="form-control" >          
                            </div>
                        </div>
                        <!--Fullname -->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="txtInforName" value="<%=kh.getTen()%>" class="form-control" readonly >
                                <label>Fullname</label>
                            </div>
                        </div>
                        <!--Gender -->
                        <div class="form-group">

                            <label>Gender</label>
                            <div class="form-label-group">
                                <select name="txtInforGender" value="<%=kh.getGioiTinh()%>" class="form-control">
                                    <option value="Male">Male</option>
                                    <option value="Female">Female</option>
                                    <option value="Other">Other</option>
                                </select>

                            </div>
                        </div>

                        <!--Phone Number -->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="txtInforPhone" value="<%=kh.getSoDienThoai()%>" class="form-control" >
                                <label>Phone Number</label>
                            </div>
                        </div>

                        <!--Email -->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="email"  name="txtInforEmail" value="<%=kh.getEmail()%>" class="form-control" >
                                <label>Email</label>
                            </div>
                        </div>

                        <!--Birthday -->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="date"  name="txtInforBirth" value="<%=kh.getNgaySinh()%>" class="form-control" >
                                <label>Birthday</label>
                            </div>
                        </div>

                        <!--Address -->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="txtInforAddress" value="<%=kh.getDiaChi()%>" class="form-control" >
                                <label>Address</label>
                            </div>
                        </div>

                        <!--Quantity -->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="txtInforNumber" value="<%=kh.getSoLuongMua()%>" class="form-control" readonly>
                                <label>Quantity</label>
                            </div>
                        </div>
                        Total of money 
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text" value="<%=dh.getTongTien()%>" class="form-control" readonly>                
                            </div>
                        </div>
                        <!--Product's Name -->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text" value="<%=dh.getTenSanPham()%>" class="form-control" readonly>
                                <label>Product's Name</label>
                            </div>
                        </div>
                        <!--Role -->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="hidden"  name="txtInforRole" value="<%=kh.getRole()%>" class="form-control" >

                            </div>
                        </div>
                        <%                                    }
                                }
                            }
                        %>
                        <input class="btn btn-primary btn-block" type="submit" name="btnChangeInformation" value="Change"/>
                        <a class="btn btn-dark btn-block" href="changepassword.jsp">Change PassWord</a>
                        <a class="btn btn-dark btn-block" href="index.jsp">Cancel</a>
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

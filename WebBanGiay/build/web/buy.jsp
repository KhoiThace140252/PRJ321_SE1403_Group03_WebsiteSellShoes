<%-- 
    Document   : buy
    Created on : Jul 22, 2020, 1:55:15 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

     

        <!-- Bootstrap core CSS-->
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom fonts for this template-->
        <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

        <!-- Custom styles for this template-->
        <link href="css/sb-admin.css" rel="stylesheet">
        <title>Buy</title>
    </head>
    <body class="bg-dark">
       <div class="container">
            <div class="card card-register mx-auto mt-5">
                <div class="card-header">Information</div>
                <div class="card-body">
                    <form action="BuyController" method="post" >                                        
                        <!--Supplier's Name-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="NameBuy" value="" required="" class="form-control" >
                                <label>Full Name</label>
                            </div>
                        </div>

                        <!--Address-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="AddressBuy" value="" required="" class="form-control" >
                                <label>Address</label>
                            </div>
                        </div>

                        <!--Phone Number-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="text"  name="PhoneBuy" value="" required="" class="form-control" >
                                <label>Phone Number</label>
                            </div>
                        </div>
                        <!--Email-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <input type="email"  name="EmailBuy" value="" required="" class="form-control" >
                                <label>Email</label>
                            </div>
                        </div>       
                        <!--Total-->
                        <div class="form-group">
                            <div class="form-label-group">
                                <%--Get total price--%>
                                <input type="hidden"  name="TotalBuy" value="<%= request.getParameter("total") %>" class="form-control" >
                               
                            </div>
                        </div> 
                        <input class="btn btn-primary btn-block" type="submit" name="btnBuy" value="Buy"/>
                        <a class="btn btn-dark btn-block" href="checkout.jsp">Cancel</a>
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

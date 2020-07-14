<%-- 
    Document   : insertTypeProduct
    Created on : Jul 14, 2020, 12:14:33 PM
    Author     : Dell
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

    <title>Insert Type Product</title>

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
        <div class="card-header">Insert Product</div>
        <div class="card-body">
          <form>
             <!--Type ID -->
              <div class="form-group">
              <div class="form-label-group">
                  <input type="text"  name="#" value="" class="form-control" >
                <label>Type ID</label>
              </div>
            </div>
             
             <!--Type's Name-->
              <div class="form-group">
              <div class="form-label-group">
                  <input type="text"  name="#" value="" class="form-control" >
                <label>Type's Name</label>
              </div>
            </div>
              
             <!--Supplier ID-->
              <div class="form-group">
              <div class="form-label-group">
                  <input type="text"  name="#" value="" class="form-control" >
                <label>Supplier ID</label>
              </div>
            </div>
             
             <!--Description -->
              <div class="form-group">
              <div class="form-label-group">
                  <input type="text"  name="#" value="" class="form-control" >
                <label>Description</label>
              </div>
            </div>
              
             
              
            
            <a class="btn btn-primary btn-block" href="#">Insert</a>
            <a class="btn btn-dark btn-block" href="typesProduct.jsp">Cancel</a>
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

<%-- 
    Document   : header-bottom
    Created on : Jul 15, 2020, 10:21:24 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
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
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <i class="fas fa-fw fa-box-open"></i>
                        <span>Product</span>
                    </a>
                    <div class="dropdown-menu" aria-labelledby="pagesDropdown">
                        <a class="dropdown-item" href="productsadmin.jsp">List Products</a>
                        <a class="dropdown-item" href="productInfo.jsp">List Products Information</a>
                        <a class="dropdown-item" href="typesProduct.jsp">List Types Product</a>
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

    </body>
</html>

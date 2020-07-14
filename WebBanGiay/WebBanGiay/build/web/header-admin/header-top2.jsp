<%-- 
    Document   : header-top2
    Created on : Jul 14, 2020, 9:10:47 AM
    Author     : HAOVNCE140475
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      
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
                <!-- LOGOUT-->
                <li class="nav-item dropdown no-arrow  ">
                    <a class="nav-link dropdown-toggle " href="#" id="userDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <h3><i class="fas fa-user-circle fa-fw"></i></h3>
                    </a>
                    <div class="dropdown-menu dropdown-menu-right" aria-labelledby="userDropdown">
                        <a class="dropdown-item" href="../LoginController?action=Logout" >Logout</a>
                    </div>
                </li>
            </ul>

        </nav>
    </body>
</html>

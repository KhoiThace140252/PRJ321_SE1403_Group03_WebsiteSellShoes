<%-- 
    Document   : header-top
    Created on : Jul 15, 2020, 10:08:15 AM
    Author     : Admin
--%>

<%@page import="Dao.KhachHangDAO"%>
<%@page import="Model.KhachHang"%>
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
                <li class="nav-item dropdown no-arrow mx-1"></li>
                <li class="nav-item dropdown no-arrow mx-1"></li>
                <!-- LOGOUT-->
                <li class="nav-item dropdown no-arrow  ">
                    <a class="nav-link dropdown-toggle " href="#" id="userDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <h3><i class="fas fa-user-circle fa-fw"></i></h3>
                    </a>
                    <ul class="dropdown-menu dropdown-menu-right" aria-labelledby="userDropdown">   
                        <a class="dropdown-item" href="passwordadmin.jsp">Welcome,   
                            <%
                                Cookie[] cookies = request.getCookies();
                                if (cookies.length > 1) {
                                    for (Cookie cookie : cookies) {
                                        if (cookie.getName().equals("ID")) {
                                            KhachHang kh = new KhachHangDAO().getAccountByID(Integer.parseInt(cookie.getValue()));
                                            out.print(kh.getTen());

                                        }
                                    }
                                }
                            %>
                        </a>
                        <a class="dropdown-item" href="LoginController?action=Logout" >Logout</a>                       
                    </ul>     

                </li>
            </ul>

        </nav>
    </body>
</html>

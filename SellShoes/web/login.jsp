<%-- 
    Document   : login
    Created on : Jun 23, 2020, 1:10:59 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            h1{
                color: yellowgreen;
                font-style: italic;
            }
            div{
                padding-top: 200px;
                margin-left: auto;
                margin-right: auto;
                width: 300px;
            }
            input[type=text]{
                width: 150px;
                text-align: left;
                border: thin solid gray;
                padding: 2px 5px 2px 5px;
                border-radius: 3px 3px 3px 3px;
            }
             input[type=submit]{
                width: 75px;
                text-align: center;
                border: thin solid gray;
                padding: 3px 5px 3px 5px;
                border-radius: 3px 3px 3px 3px;
                background-color: orange;
            }
             input[type=submit]:hover{
                width: 75px;
                text-align: center;
                border: thin solid gray;
                padding: 3px 5px 3px 5px;
                border-radius: 3px 3px 3px 3px;
                background-color: yellowgreen;
            }
        </style>
        <title>Login</title>
    </head>
    <body>
        <div>
           
            <form method="post">
                <table>   
                    <h1>Đăng Nhập</h1>
                    <tr>
                        <td>
                            Tên tài khoản
                        </td>
                        <td>
                            <input type="text" placeholder="Email/Số điện thoại/Tên đăng nhập" name="txtUsername"/>
                        </td>
                    </tr>  
                    <tr>
                        <td>
                            Mật khẩu
                        </td>
                        <td>
                            <input type="text"placeholder="Mật khẩu" name="txtPassword"/>
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <input type="submit" value="OK" name="btnOK"/>
                        </td>
                    </tr>

                </table>
            </form>
        </div>
    </body>
</html>

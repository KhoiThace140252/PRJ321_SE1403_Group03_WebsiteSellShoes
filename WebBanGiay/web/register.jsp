<%-- 
    Document   : register
    Created on : Jul 3, 2020, 6:29:57 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Register</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="N-Air Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() {setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <meta charset utf="8">
        <!--fonts-->
        <link href='//fonts.googleapis.com/css?family=Fredoka+One' rel='stylesheet' type='text/css'>

        <!--fonts-->
        <!--bootstrap-->
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
        <!--coustom css-->
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <!--shop-kart-js-->
        <script src="js/simpleCart.min.js"></script>
        <!--default-js-->
        <script src="js/jquery-2.1.4.min.js"></script>
        <!--bootstrap-js-->
        <script src="js/bootstrap.min.js"></script>
        <!--script-->
        <!-- FlexSlider -->
        <script src="js/imagezoom.js"></script>
        <script defer src="js/jquery.flexslider.js"></script>
        <link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />

        <script>
            // Can also be used with $(document).ready()
            $(window).load(function () {
                $('.flexslider').flexslider({
                    animation: "slide",
                    controlNav: "thumbnails"
                });
            });
        </script>
        <!-- //FlexSlider-->
    </head>
    <body>
        <div class="header">
            <div class="container">
                <!--Header-top!-->
                <jsp:include page="header/header-top.jsp"></jsp:include>
                    <!--Header-top!-->     
                    <!---menu-----bar--->
                    <!--header-bottom-->
                <jsp:include page="header/header-bottom.jsp"></jsp:include>
                    <!--header-bottom-->
                </div>
            </div>
            <div class="head-bread">
                <div class="container">
                    <ol class="breadcrumb">
                        <li><a href="index.jsp">Home</a></li>
                        <li><a href="signup.jsp">LOGIN</a></li>
                        <li class="active">REGISTER</li>
                    </ol>
                </div>
            </div>
            <!-- reg-form -->
            <div class="reg-form">
                <div class="container">
                    <div class="reg">
                        <h3>Register Now</h3>
                        <p>Welcome, please enter the following details to continue.</p>
                        <p>If you have previously registered with us, <a href="signup.jsp">click here</a></p>
                        <form action="LoginController?action=Res" method="post" name="register">
                            <ul>
                                <li class="text-info">Full Name </li>
                                <li><input type="text" name="ten" value="" placeholder="Full Name..."></li>
                            </ul>
                            <ul>
                                <li class="text-info">User Name: </li>
                                <li><input type="text" name="taiKhoan" value="" placeholder="User Name..." id="username"></li>
                            </ul>				 
                            <ul>
                                <li class="text-info">Password: </li>
                                <li><input type="password" name="matKhau" value="" placeholder="Password..." id="password"></li>
                            </ul>      
                            <ul>
                                <li class="text-info">Gender: </li>
                                <li>
                                    <select name="gioiTinh" >
                                        <option class="Sex" value="Nam">Male</option>
                                        <option class="Sex" value="Nữ">Female</option>
                                        <option class="Sex" value="Khác">Other</option>
                                    </select>
                                </li>

                            </ul>
                            <ul>
                                <li class="text-info">Email: </li>
                                <li><input type="text" name="email" value="" placeholder="ex: email@gmail.com" id="email"></li>
                            </ul>
                            <ul>
                                <li class="text-info">Birthday: </li>
                                <li><input type="date" name="ngaySinh" value=""></li>
                            </ul>	
                            <ul>
                                <li class="text-info">Phone Number:</li>
                                <li><input type="text" name="soDienThoai" value="" id="phone" placeholder="Phone Number..."></li>
                            </ul>	
                            <ul>
                                <li class="text-info">Address:</li>
                                <li><input type="text" name="diaChi" value="" placeholder="Address..."id="address"></li>
                            </ul>	          
                            <input type="submit" name="action" id="submit" value="Register Now" onclick="valid();">
                            <p class="click">By clicking this button, you are agree to my  <a href="#">Policy Terms and Conditions.</a></p> 
                        </form>
                        <script>
                            var inputs = document.forms['register'].getElementsByTagName('input'); // tao mot bien kiem lay gia tri tu input voi form la register
                            var run_onchange = false;//tao bien kiem tra
                            function valid() { //ham check du lieu
                                var errors = false;//bien error kiem tra du lieu
                                var reg_mail = /^[A-Za-z0-9]+([_\.\-]?[A-Za-z0-9])*@[A-Za-z0-9]+([\.\-]?[A-Za-z0-9]+)*(\.[A-Za-z]+)+$/;//bieu thuc chinh quy doi voi email
                                for (var i = 0; i < inputs.length; i++) {//vong lap kiem tra cac gia tri lay duoc phu hop hay khong
                                    var value = inputs[i].value;//bien value lay cac chi so trong mang
                                    var id = inputs[i].getAttribute('id');

                                    // Tạo phần tử span lưu thông tin lỗi
                                    var span = document.createElement('span');
                                    // Nếu span đã tồn tại thì remove
                                    var p = inputs[i].parentNode;
                                    if (p.lastChild.nodeName == 'SPAN') {
                                        p.removeChild(p.lastChild);
                                    }

                                    // Kiểm tra rỗng
                                    if (value == '') {
                                        span.innerHTML = 'Please enter your infomation';
                                    } else {
                                        // Kiểm tra các trường hợp khác
                                        if (id == 'email') {
                                            if (reg_mail.test(value) == false) {
                                                span.innerHTML = 'Invalid email (ex: abc@gmail.com)';
                                            }
                                            var email = value;
                                        }
                                        if (id == 'confirm_email' && value != email) {
                                            span.innerHTML = 'Email entered is not correct';
                                        }
                                        // Kiểm tra password
                                        if (id == 'password') {
                                            if (value.length < 6) {
                                                span.innerHTML = 'Password must be from 6 characters';
                                            }
                                            var pass = value;
                                        }
                                        // Kiểm tra password nhập lại
                                        if (id == 'confirm_pass' && value != pass) {
                                            span.innerHTML = 'Password entered incorrectly';
                                        }
                                        // Kiểm tra số điện thoại
                                        if (id == 'phone' && isNaN(value) == true) {
                                            span.innerHTML = 'Phone numbers must be numeric';
                                        }
                                    }

                                    // Nếu có lỗi thì chèn span vào hồ sơ, chạy onchange, submit return false, highlight border
                                    if (span.innerHTML != '') {
                                        inputs[i].parentNode.appendChild(span);
                                        errors = true;
                                        run_onchange = true;
                                        inputs[i].style.border = '1px solid #c6807b';
                                        inputs[i].style.background = '#red';
                                    }
                                }// end for

                                if (errors == false) {
                                }
                                return !errors;
                            }// end valid()

                            // Chạy hàm kiểm tra valid()
                            var register = document.getElementById('submit');
                            register.onclick = function () {
                                return valid();

                            }

                            // Kiểm tra lỗi với sự kiện onchange -> gọi lại hàm valid()
                            for (var i = 0; i < inputs.length; i++) {
                                var id = inputs[i].getAttribute('id');
                                inputs[i].onchange = function () {
                                    if (run_onchange == true) {
                                        this.style.border = '1px solid #999';
                                        this.style.background = '#fff';
                                        valid();
                                    }
                                }
                            }
                            // end for</script>
                    </div>
                </div>
            </div>

            <!--footer!-->
        <jsp:include page="footer/footerlevel1.jsp"></jsp:include>
        <!--footer!-->
    </body>
</html>

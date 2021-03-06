<%-- 
    Document   : contact
    Created on : Jul 3, 2020, 6:28:45 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Contact</title>
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
                        <li class="active">Contact</li>
                    </ol>
                </div>
            </div>
            <!-- contact -->
            <div class="contact">
                <div class="container">
                    <h3>Catch us</h3>
                    <div class="contact-content">
                        <form action="ContactController" method="post">
                        <%-- input title--%>
                        <input type="text" class="textbox" name="title" value=" Your Title" onfocus="this.value = '';" onblur="if (this.value == '') {
                                    this.value = 'Your Title';
                                }"><br>
                        <%-- input name--%>
                        <input type="text" class="textbox" name="name" value=" Your Name" onfocus="this.value = '';" onblur="if (this.value == '') {
                                    this.value = 'Your Name';
                                }"><br>
                        <%-- input email--%>
                        <input type="text" class="textbox" name="email" value="Your E-Mail" onfocus="this.value = '';" onblur="if (this.value == '') {
                                    this.value = 'Your E-Mail';
                                }"><br>
                        <div class="clear"> </div>
                        <div>
                            <%-- input message--%>
                            <textarea value="Message:" name="message" onfocus="this.value = '';" onblur="if (this.value == '') {
                                        this.value = 'Your Message ';
                                    }">Your Message</textarea><br>
                        </div>	
                        <div class="submit"> 
                            <input class="btn btn-default cont-btn" type="submit" value="SEND " />
                        </div>
                    </form>
                    <div class="map">
                        <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3928.8838496075136!2d105.7552704146158!3d10.026442692833065!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x31a08830e54e5f25%3A0xd7d159025caa8609!2zxJDGsOG7nW5nIE5ndXnhu4VuIFbEg24gTGluaCwgS2h1IGTDom4gY8awIDkxQiwgQW4gS2jDoW5oLCBOaW5oIEtp4buBdSwgQ-G6p24gVGjGoSwgVmnhu4d0IE5hbQ!5e0!3m2!1svi!2s!4v1594110289327!5m2!1svi!2s" width="600" height="450" frameborder="0" style="border:0;" allowfullscreen="" aria-hidden="false" tabindex="0"></iframe>
                    </div>
                </div>
            </div>
        </div>
        <!--footer!-->
        <jsp:include page="footer/footerlevel1.jsp"></jsp:include>
        <!--footer!-->
    </body>
</html>

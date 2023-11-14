<%-- 
    Document   : header
    Created on : 15-Aug-2023, 21:48:00
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>BraveByte</title>
        <link rel="stylesheet" href="Style/HomeStyle.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        
        <link
            href="https://fonts.googleapis.com/css2?family=Dongle&family=Montserrat&family=Raleway:wght@600;700&display=swap"
            rel="stylesheet">
    </head>
    <body>
        <div class="head-page">
            <img src="img/white.jpg" alt="">
            <div class="head-page_logo">BRAVE<ion-icon id='logo' name="shield-outline"></ion-icon>BYTE</div>
            <div class="head-page_select">
                <a href="home.jsp" class="selection">HOME</a>
                <a href="games.jsp" class="selection">GAMES</a>
                <a href="cart" class="selection">CART</a>
                <a href="bill" class="selection">TRANSACTION</a>
                <a href="library" class="selection">LIBRARY</a>
                 <a href="Profile.jsp" class="selection">PROFILE</a>
                  <a href="LogoutServlet" class="selection">Logout</a>
            </div>
            <div class="head-page_user"></div>
        </div>
    </body>
</html>

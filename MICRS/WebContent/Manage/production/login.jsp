<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en" class="no-js">

    <head>

        <meta charset="utf-8">
        <title>登录医疗保险中心账户</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- CSS -->
        <link rel="stylesheet" href="/MICRS/Manage/production/assets/css/http.css">
        <link rel="stylesheet" href="/MICRS/Manage/production/assets/css/reset.css">
        <link rel="stylesheet" href="/MICRS/Manage/production/assets/css/supersized.css">
        <link rel="stylesheet" href="/MICRS/Manage/production/assets/css/style.css">

        <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
        <!--[if lt IE 9]>
            <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->
        <script>
           function check() {
               var uname = docment.getElementById("username");
               var unamevalue = uname.value;
               var upass = document.getElementById("pass1");
               var upassvalue = upass.value;
               if(unamevalue == "admin" && upassvalue == "8888"){
                   return true;
               }else{
                   return false;
               }
           }
        </script>
    </head>

    <body>
        <div class="page-container">
            <h1 style="color:#003ada">Login</h1>
            <form action="/MICRS/LogIn" method="post" onsubmit="return check()">
                <input type="text" name="username" class="username" placeholder="用户名" id="username" />
                <span id="usernameS"></span>
                <input type="password" name="password" class="password" placeholder="密码" id="pass1" />
                <span id="pass1S">
                </span>
                <p style="color:red">${requestScope.message }</p>
                <button type="submit">登录</button>
                <div class="error"><span>不能为空</span></div>
            </form>
            <div>
                <br>
                <a href="/MICRS/Manage/production/signUp.jsp" title="signUp" style="color: #404ada;">还没有账户，去注册></a>
            </div>
        </div>
        <br>
        <br>
        <div align="center">Made for <a href="http://www.who.int/zh/" target="_blank" title="医疗保险中心" style="color: #da9000;">医疗保险中心</a></div>

        <!-- Javascript -->
        <script src="/MICRS/Manage/production/assets/js/jquery-1.8.2.min.js"></script>
        <script src="/MICRS/Manage/production/assets/js/supersized.3.2.7.min.js"></script>
        <script src="/MICRS/Manage/production/assets/js/supersized-init.js"></script>
        <script src="/MICRS/Manage/production/assets/js/scripts.js"></script>
    </body>

</html>


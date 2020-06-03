<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <%--<meta http-equiv="pragma" content="no-cache">--%>
    <%--<meta http-equiv="cache-control" content="no-cache">--%>
    <%--<meta http-equiv="expires" content="0">--%>
    <title>外星人登录系统</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/login-style.css">

    <!--<link href='//fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>
-->
    <!-- For-Mobile-Apps-and-Meta-Tags -->
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="keywords"
          content="Simple Login Form Widget Responsive, Login Form Web Template, Flat Pricing Tables, Flat Drop-Downs, Sign-Up Web Templates, Flat Web Templates, Login Sign-up Responsive Web Template, Smartphone Compatible Web Template, Free Web Designs for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design"/>
    <script type="application/x-javascript">
        addEventListener("load", function () {
        setTimeout(hideURLbar, 0);
    }, false);

    function hideURLbar() {
        window.scrollTo(0, 1);
    } </script>
    <!-- //For-Mobile-Apps-and-Meta-Tags -->
    <script type="text/javascript">
        //在iframe中超时跳转到主窗口
        if (window != top) {
            top.location.href = location.href;
        }
        //在子窗口中超时，跳转到主窗口
        if (typeof window.opener != "undefined") {
            window.opener.location.reload();
            window.close();
        }
    </script>

</head>

<body>
<h1>外星人登录系统</h1>
<div class="container w3">
    <h2>现在登录</h2>
    <form method="post" action="/index.action">
        <div class="username">
            <span class="username" style="height:19px">用户:</span>
            <input type="text" name="username" class="name" placeholder="" required="">
            <div class="clear"></div>
        </div>
        <div class="password-agileits">
            <span class="username" style="height:19px">密码:</span>
            <input type="password" name="password" class="password" placeholder="" required="">
            <div class="clear"></div>
        </div>
        <div class="rem-for-agile">
            <input type="checkbox" name="remember" class="remember">记得我
            <br>
            <a href="#">忘记了密码</a><br>
        </div>
        <div class="login-w3">
            <input type="submit" class="login" value="Login">
        </div>
        <div class="clear"></div>
    </form>
</div>
</body>
</html>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>登录</title>
    <meta name="keywords" content=""/>
    <meta name="description" content=""/>

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/font-awesome/css/font-awesome.css">
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/css/material-design-iconic-font.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/util.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/main.css">
    <style type="text/css">
        .myRota{
            transform:rotateY(130deg);
            -webkit-transform:rotateY(130deg); /* Safari and Chrome */
        }
    </style>
</head>
<body>

<div class="limiter">
    <div class="container-login100"
         style="background-image: url('${pageContext.request.contextPath}/images/bg-01.jpg');">
        <div class="wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54">
            <form id="loginForm" class="login100-form validate-form" action="/index.action" method="post">
                <span class="login100-form-title p-b-49">登录</span>
                <div class="wrap-input100 validate-input m-b-23 username" data-validate="请输入用户名">
                    <span class="label-input100">用户名</span>
                    <input class="input100" type="text" id="username" name="username" placeholder="请输入用户名"
                           autocomplete="off">
                    <span class="focus-input100" data-symbol="&#xf206;"></span>
                </div>
                <div class="wrap-input100 validate-input password" data-validate="请输入密码">
                    <span class="label-input100">密码</span>
                    <input class="input100" type="password" id="password" name="password" placeholder="请输入密码"
                           autocomplete="off">
                    <span class="focus-input100" data-symbol="&#xf190;"></span>
                </div>
                <div>
                    <div class="text-right p-t-8 p-b-31 pull-left" style="float: left;">
                        <input type="checkbox" name="rememberMe" id="rememberMe"><a href="javascript:">记住密码</a></input>
                    </div>
                    <div class="text-right p-t-8 p-b-31">
                        <a href="javascript:" onclick="gorget()">忘记密码？</a>
                    </div>
                </div>

                <div class="container-login100-form-btn">
                    <div class="wrap-login100-form-btn">
                        <div class="login100-form-bgbtn"></div>
                        <button class="login100-form-btn" onclick="login()">登 录</button>
                    </div>
                </div>

                <%--   <div class="txt1 text-center p-t-54 p-b-20">
                       <span>第三方登录</span>
                   </div>

                   <div class="flex-c-m">
                       <a href="#" class="login100-social-item bg1">
                           <i class="fa fa-wechat"></i>
                       </a>

                       <a href="#" class="login100-social-item bg2">
                           <i class="fa fa-qq"></i>
                       </a>

                       <a href="#" class="login100-social-item bg3">
                           <i class="fa fa-weibo"></i>
                       </a>
                   </div>

                   <div class="flex-col-c p-t-25">
                       <a href="javascript:" class="txt2">立即注册</a>
                   </div>--%>
            </form>
        </div>
    </div>
</div>

<script src="${pageContext.request.contextPath}/js/jquery-3.4.1.js"></script>
<script src="${pageContext.request.contextPath}/js/main.js"></script>
<script type="text/javascript">

    $(function () {
        //页面初始化时，如果帐号密码cookie存在则填充
        if(getCookie('user') && getCookie('pswd')){
            $('#username').val(getCookie('user'));
            $('#password').val(getCookie('pswd'));
            $('#rememberMe')[0].checked = true;
        }
        //复选框勾选状态发生改变时，如果未勾选则清除cookie
        $("#rememberMe")[0].onchange = function(){
            if(!this.checked){
                delCookie('user');
                delCookie('pswd');
            }
        };
        // $(".username").attr("data-validate","用户名不正确");
        // $(".password").attr("data-validate","密码不正确");
    });

    function login() {
        var username = $('#username').val();
        var password = $('#password').val();
        if (username == '' || password == '') return;
        var remember = $('#rememberMe')[0].checked;
        if(remember){
            //保存帐号到cookie，有效期10天
            setCookie('user',username,10);
            setCookie('pswd',password,10);
        }
        $("#loginForm").submit();
        // $.ajax({
        //     url:'index.action',
        //     data:{username:username,password:password},
        //     type:'post',
        //     success:function (data) {
        //         console.log(data)
        //     },
        //     error:function (data) {
        //         console.log(data)
        //     }
        // })
    }

    //设置cookie
    function setCookie(name,value,day){
        var date = new Date();
        date.setDate(date.getDate() + day);
        document.cookie = name + '=' + value + ';expires='+ date;
    };
    //获取cookie
    function getCookie(name){
        var reg = RegExp(name+'=([^;]+)');
        var arr = document.cookie.match(reg);
        if(arr){
            return arr[1];
        }else{
            return '';
        }
    };
    //删除cookie
    function delCookie(name){
        setCookie(name,null,-1);
    };
</script>
</body>
</html>

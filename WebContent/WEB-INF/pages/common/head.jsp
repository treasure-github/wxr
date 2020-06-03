<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/inc.jsp" %>
<!-- 修改密码模态框 -->
<div id="myModal3" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModal3" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h3 class="modal-title">修改密码</h3>
            </div>
            <div class="modal-body">
                <form id="passwordForm" class="form">
                    <div class="form-group row">
                        <label for="oldPassWord" class="col-sm-2 col-form-label">原始密码</label>
                        <div class="col-sm-10">
                            <input type="password" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="oldPassWord" id="oldPassWord">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="newPassword" class="col-sm-2 col-form-label">新密码</label>
                        <div class="col-sm-10">
                            <input type="password" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="newPassword" id="newPassword">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="confirmPassword" class="col-sm-2 col-form-label">确认密码</label>
                        <div class="col-sm-10">
                            <input type="password" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="confirmPassword" id="confirmPassword">
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button id="changePassword" type="button" class="btn btn-primary" onclick="changePassword()">确认
                </button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>

<!-- 个人信息模态框 -->
<div id="myModal2" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h4 class="modal-title"> 个人信息 </h4>
            </div>
            <div class="modal-body">
                工号<input id="GH" readonly type="text" class="form-control">
                姓名<input id="XM" readonly type="text" class="form-control">
                性别<input id="XB" readonly type="text" class="form-control">
                手机号<input id="SJH" readonly type="text" class="form-control">
                公司号码<input id="GSHM" readonly type="text" class="form-control">
                职位<input id="ZW" type="text" readonly class="form-control">
                紧急联系人<input id="LXR" type="text" readonly class="form-control">
                紧急联系人电话<input id="LXRDH" readonly type="text" class="form-control">
                入职时间<input id="RZSJ" type="text" readonly class="form-control">
                家庭住址<input id="JTZZ" type="text" readonly class="form-control">
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary" data-dismiss="modal">关闭
                </button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>

<!-- 退出模态框 -->
<div id="myModal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h3 class="modal-title">系统提示</h3>
            </div>
            <div class="modal-body">
                <h4>是否退出本次登录？</h4>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                </button>
                <button type="button" class="btn btn-primary" onclick="logoutFun()">
                    退出
                </button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>

<%--
<div id="loading">
    <img src="/images/loading3.gif"/>
</div>
--%>

<!-- Header-->
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="navbar-header">
        <a class="navbar-brand" href="/home.action" style="margin-top: -3%"><img
                src="${pageContext.request.contextPath}/images/logo3.png"
                alt="Logo"></a>
    </div>
    <div class="collapse navbar-collapse navbar-ex1-collapse">
        <ul class="nav navbar-nav navbar-right navbar-user" style="margin-right: 3px; ">
            <li class="dropdown user-dropdown">
                <a href="JavaScrip:;" class="dropdown-toggle" data-toggle="dropdown">
                    <i class="fa fa-user-circle-o" aria-hidden="true"></i>   ${sessionScope.get("userName")}<b
                        class="caret"></b></a>
                <ul class="dropdown-menu">
                    <li>
                        <a class="nav-link" href="#" onclick="showEditPassWord()"><i
                                class="fa fa-cog"></i> 修改密码</a>
                    </li>
                    <li>
                        <a class="nav-link" href="" data-toggle="modal" data-target="#myModal2"><i
                                class="fa fa-address-card " aria-hidden="true"></i> 个人信息</a>
                    </li>
                    <li class="divider"></li>
                    <li>
                        <a class="nav-link" href="" data-toggle="modal" data-target="#myModal"><i
                                class="fa fa-power-off"></i>退出</a>
                    </li>
                </ul>
            </li>
        </ul>
    </div>
</nav>
<!-- Header-->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.4.1.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrapValidator.js"></script>
<script src="${pageContext.request.contextPath}/js/zh_CN.js"></script>
<script type="text/javascript">

    $(function () {
        validateForm();
        $("#myModal3").on("hide.bs.modal", function () {
            $('#passwordForm input').val('');
            $("#passwordForm").data('bootstrapValidator').destroy();
            $('#passwordForm').data('bootstrapValidator', null);
            validateForm();
        })
        $("#myModal3").on("show.bs.modal", function () {
            validateForm();
        })

        // 初始化表单验证
        function validateForm() {
            $('#passwordForm').bootstrapValidator({
                message: 'This value is not valid',
                container: 'tooltip',
                feedbackIcons: {
                    valid: 'glyphicon glyphicon-ok',
                    invalid: 'glyphicon glyphicon-remove',
                    validating: 'glyphicon glyphicon-refresh'
                },
                fields: {
                    oldPassWord: {
                        validators: {
                            notEmpty: {
                                message: '旧密码不能为空'
                            }
                        }
                    },
                    newPassword: {
                        validators: {
                            notEmpty: {
                                message: '新密码不能为空'
                            }
                        }
                    },
                    confirmPassword: {
                        validators: {
                            notEmpty: {
                                message: '确认密码不能为空'
                            }
                        }
                    }
                }
            });
        }
    });

    // 个人信息
    function getUserInfo() {
        jQuery.ajax({
            type: "GET",
            url: "/staffSelfInfo.action",
            dataType: "json",
            success: function (data) {
                $("#GH").val(data.id);
                $("#XM").val(data.username);
                $("#XB").val(data.gender);
                $("#SJH").val(data.phone);
                $("#GSHM").val(data.companyphone);
                $("#ZW").val(data.job);
                $("#LXR").val(data.urgentman);
                $("#LXRDH").val(data.urgentmanphone);
                $("#RZSJ").val(formatDatebox(data.beginjobtime));
                $("#JTZZ").val(data.homeaddress);
            }
        });
    }


    // 修改密码
    //为确定按钮绑定事件
    function changePassword() {
        //进行表单校验
        $('#passwordForm').data('bootstrapValidator').validate();
        if (!$('#passwordForm').data('bootstrapValidator').isValid()) {
            return;
        }
        var v1 = jQuery("#newPassword").val();
        var v2 = jQuery("#confirmPassword").val();
        if (v1 == v2) {
            //两次输入一致，发送ajax请求
            var oldv = jQuery("#oldPassWord").val();
            jQuery.ajax({
                type: "post",
                url: "/staff_updateStaffPassword.action",
                dataType: "json",
                data: {"password": v1, "oldPassword": oldv},
                success: function (data) {
                    if (data == '1') {
                        //修改成功，关闭修改密码窗口
                        modle.alert("修改成功!","success");
                    } else if (data == '-1') {
                        modle.alert("原密码错误!","tip");
                    } else {
                        //修改密码失败，弹出提示
                        modle.alert("密码修改失败!",'warn');
                    }
                }
            });
        } else {
            //两次输入不一致，弹出错误提示
            modle.alert("两次密码不一致!","tip");
        }
    }

    Date.prototype.format = function (format) {
        var o = {
            "M+": this.getMonth() + 1, // month
            "d+": this.getDate(), // day
            "h+": this.getHours(), // hour
            "m+": this.getMinutes(), // minute
            "s+": this.getSeconds(), // second
            "q+": Math.floor((this.getMonth() + 3) / 3), // quarter
            "S": this.getMilliseconds()
            // millisecond
        }
        if (/(y+)/.test(format))
            format = format.replace(RegExp.$1, (this.getFullYear() + "")
                .substr(4 - RegExp.$1.length));
        for (var k in o)
            if (new RegExp("(" + k + ")").test(format))
                format = format.replace(RegExp.$1, RegExp.$1.length == 1 ? o[k] : ("00" + o[k]).substr(("" + o[k]).length));
        return format;
    }

    function formatDatebox(value) {

        if (value == null || value == '') {
            return '';
        }
        var dt;
        if (value instanceof Date) {
            dt = value;
        } else {
            dt = new Date(value);
        }

        return dt.format("yyyy-MM-dd");
    }

    function showEditPassWord() {
        $("#myModal3").modal('show');
    }


    // 退出登录
    function logoutFun() {
        location.href = '/admin_logout.action';
    };
</script>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>角色设置</title>
    <%@include file="/common/inc.jsp" %>
    <link href="${pageContext.request.contextPath}/ztre/zTreeStyle.css" rel="stylesheet">
</head>
<style>
    label {
        text-align: right;
    }
</style>
<body>
<!-- 添加角色模态框 -->
<div id="addRole" class="modal fade " tabindex="-1" role="dialog" aria-labelledby="addRole"
     aria-hidden="true">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h3 class="modal-title" id="customer">
                    角色信息
                </h3>
            </div>
            <div class="modal-body">
                <form class="myForm form">
                    <input type="hidden" name="functionIds">
                    <div class="form-group row">
                        <label for="name" class="col-sm-2 col-form-label">名称</label>
                        <div class="col-sm-6">
                            <input type="text"
                                   class="form-control" name="name" id="name">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="description" class="col-sm-2 col-form-label">描述</label>
                        <div class="col-sm-6">
                            <textarea type="text"
                                      class="form-control" name="description" id="description"></textarea>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">角色权限</label>
                        <div id="roleTree" class="ztree col-sm-6" name="roleTree">

                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                        </button>
                        <button type="button" name="submit" class="btn btn-primary" onclick="addRole()">提交</button>
                    </div>
                </form>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
<div>
    <div class="row">
        <div class="col-lg-12">
            <%--工具栏--%>
            <div id="toolbar" class="btn-group">
                <button id="btn_add" type="button" class="btn btn-primary" onclick="addWin()">
                    <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增角色
                </button>
                <button id="btn_delete" type="button" class="btn btn-danger" onclick="doDelete()">
                    <span class="glyphicon glyphicon-minus" aria-hidden="true"></span>删除角色
                </button>
            </div>
            <%--表格--%>
            <div id="tbody" class="table-responsive">
                <table id="myTable" class="table table-bordered text-nowrap"></table>
            </div>
        </div>
    </div>
</div>
</body>

<%--引入script--%>
<%@include file="/common/incfooter.jsp" %>
<script src="${pageContext.request.contextPath }/ztre/jquery.ztree.all-3.5.js" type="text/javascript"></script>
<script type="text/javascript">
    $(document).ready(function () {
        createTable();
    });

    function addRole() {
        $('form').data('bootstrapValidator').validate();
        if (!$('form').data('bootstrapValidator').isValid()) {
            return;
        }
        //根据ztree的id获取ztree对象
        var treeObj = $.fn.zTree.getZTreeObj("roleTree");
        //获取ztree上选中的节点，返回数组对象
        var nodes = treeObj.getCheckedNodes(true);
        var name = $("#name").val();
        if (nodes.length <= 0) {
            modle.alert("请选择相对应的信息", "tip");
        } else {
            var array = new Array();
            for (var i = 0; i < nodes.length; i++) {
                var id = nodes[i].id;
                array.push(id);
            }
            var functionIds = array.join(",");
            //给隐藏域进行赋值
            $("input[name=functionIds]").val(functionIds);
            //获得表单数据，将其转成json格式，进行异步提交
            var p = $(".myForm").serializeJson();

            $.post(
                "${pageContext.request.contextPath}/admin_addRole.action",
                {"p": JSON.stringify(p)},
                function (data) {
                    if (data == 1) {
                        modle.alert("添加成功！", "success");
                        // window.location.href = "/adm_role_rolemanager.action";
                    } else {
                        modle.alert("添加失败", "warn");
                    }
                }, "json");
        }
    }

    $("#addRole").on('hidden.bs.modal', function () {
        $(".myForm input").val('');
        $(".myForm").data('bootstrapValidator').destroy();
        $('.myForm').data('bootstrapValidator', null);
        // validateForm();
    });

    function addWin() {
        // 对权限树进行初始化。
        var setting = {
            view: {
                showIcon: true
            },
            data: {
                key: {
                    title: "t",
                    children: "menuList"
                },
                simpleData: {
                    enable: true
                }
            },
            check: {
                enable: true
            }
        };
        //异步请求，获得相对应的树形结构
        $.ajax({
            url: '${pageContext.request.contextPath}/getMenu.action',
            type: 'POST',
            dataType: 'json',
            success: function (data) {
                $.fn.zTree.init($("#roleTree"), setting, data);
            },
            error: function (msg) {
                alert('树加载异常!', "warn");
            }
        });
        $('#addRole').modal('show');
        validateForm();
    }

    function doDelete() {
        //获取数据表格中所有选中的行，返回数组对象
        var rows = $("#myTable").bootstrapTable('getSelections');
        if (rows.length == 0) {
            //没有选中记录，弹出提示
            modle.alert("请选择需要删除的数据!", "tip");
        } else {
            //选中了取派员,弹出确认框
            modle.confirm({message: "确认删除选中数据？"}).on(function (r) {
                if (r) {
                    var array = new Array();
                    //确定,发送请求
                    //获取所有选中的取派员的id
                    for (var i = 0; i < rows.length; i++) {
                        var staff = rows[i];//json对象
                        var id = staff.roleid;
                        array.push(id);
                    }
                    var ids = array.join(",");//1,2,3,4,5
                    $.ajax({
                        type: "post",
                        url: "${pageContext.request.contextPath}/admin_deleteRole.action",
                        dataType: "json",
                        data: {"ids": ids},
                        complete: function (data) {
                            // modle.alert(data.message);
                            if (data == 0) {
                                modle.alert("删除失败！", "warn");
                            } else {
                                $("#myTable").bootstrapTable("refresh");
                            }
                        }
                    });
                }
            });
        }
    }


    // 初始化表格
    function createTable() {
        $('#myTable').bootstrapTable({
            url: '/adminController_rolelist.action',
            toolbar: '#toolbar',
            pagination: true,
            classes: 'table table-hover table-sm table-bordered',
            // height: 800,
            search: true,
            showRefresh: true,
            theadClasses: 'thead-dark',
            clickToSelect: true,
            pageSize: 20,
            pageList: [10, 20, 50, 100, 200, 500],
            uniqueId: 'roleid',
            columns: [
                {
                    checkbox: true
                },
                {
                    field: 'rolename',
                    title: '名称',
                    width: 200
                },
                {
                    field: 'description',
                    title: '描述',
                    width: 600
                }
            ]

        })
    }

    function validateForm() {
        $('.myForm').bootstrapValidator({
            message: 'This value is not valid',
            container: 'tooltip',
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
                name: {
                    validators: {
                        notEmpty: {
                            message: '不能为空'
                        }
                    }
                }
            }
        });
    }
</script>
</html>

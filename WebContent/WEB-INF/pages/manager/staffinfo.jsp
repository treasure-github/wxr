<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工信息</title>
    <%@include file="/common/inc.jsp" %>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/jquery.treegrid.css">
    <link href="<%=request.getContextPath() %>/css/jquery-editable-select.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/bootstrap-select/css/bootstrap-select.css" rel="stylesheet">
</head>
<style>
    label {
        text-align: right;
    }
</style>
<body>
<%--修改权限模态框--%>
<div id="guntRoot" class="modal fade " tabindex="-1" role="dialog" aria-labelledby="guntRoot"
     aria-hidden="true">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h3 class="modal-title">
                    菜单授权
                </h3>
            </div>
            <div class="modal-body" style="height: 550px;">
                <%--菜单表格--%>
                <div id="toolbar2" class="btn-group">
                    <%--<button type="button" class="btn btn-danger" onclick="resetCheckBox()">重置</button>--%>
                    <%--<select class="role form-control selectpicker" data-style="btn-primary" data-live-search="true"--%>
                    <%--name="role" id="role" style="width: 200px;" title="请选择授权角色" data-size="8">--%>
                    <%--</select>--%>
                </div>
                <div>
                    <form id="menuTableForm" class="form">
                        <input type="hidden" id="userID" name="userID">
                        <table id="menuTable" class="table-responsive">
                        </table>
                    </form>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" name="submit" class="btn btn-primary" onclick="doRoot()">授权</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
<!-- 新增模态框 -->
<div id="addMStaff" class="modal fade " id="myModal" tabindex="-1" role="dialog" aria-labelledby="addMStaff"
     aria-hidden="true">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h3 class="modal-title" id="customer">
                    新增员工
                </h3>
            </div>
            <div class="modal-body">
                <form class="staffForm form">
                    <div class="form-group row">
                        <label for="id" class="col-sm-2 col-form-label">工号</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="id" id="id">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">姓名</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="username" id="username">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">性别</label>
                        <div class="col-sm-6">
                            <select class="form-control" id="gender" name="gender">
                                <option value="男">男</option>
                                <option value="女">女</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="phone" class="col-sm-2 col-form-label">入职时间</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="datepicker form-control" name="beginjobtime" id="beginjobtime">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="phone" class="col-sm-2 col-form-label">联系电话</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="phone" id="phone">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="companyphone" class="col-sm-2 col-form-label">公司号码</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="companyphone" id="companyphone">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="urgentman" class="col-sm-2 col-form-label">紧急联系人</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="urgentman" id="urgentman">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="urgentmanphone" class="col-sm-2 col-form-label">紧急联系人电话</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="urgentmanphone" id="urgentmanphone">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="job" class="col-sm-2 col-form-label">职位</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="job" id="job">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="homeaddres" class="col-sm-2 col-form-label">家庭住址</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="homeaddres" id="homeaddres">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="roleTD" class="col-sm-2 col-form-label">角色选择</label>
                        <div id="roleTD"></div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                        </button>
                        <button type="button" name="submit" class="btn btn-primary" onclick="doSave()">提交</button>
                    </div>
                </form>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
<div class="row">
    <div class="col-lg-12">
        <%--工具栏--%>
        <div id="toolbar" class="btn-group">
            <button type="button" class="btn btn-primary" onclick="addEmployee()"><i
                    class="glyphicon glyphicon-plus"></i>新增
            </button>
            <%--<button type="button" class="btn btn-primary" onclick="EditViewById()"><i--%>
            <%--class="glyphicon glyphicon-eye-open"></i>角色授权--%>
            <%--</button>--%>
            <button type="button" class="btn btn-danger" onclick="deleteByCheckBox()"><i
                    class="glyphicon glyphicon-minus"></i>删除
            </button>
            <button type="button" class="btn btn-danger" onclick="resetPassword()"><i
                    class="glyphicon glyphicon-refresh"></i>重置密码
            </button>
        </div>
        <%--表格--%>
        <div id="tbody" class="table-responsive">
            <table id="myTable" class="table table-bordered text-nowrap"></table>
        </div>
    </div>
</div>
</body>

<%--引入script--%>
<%@include file="/common/incfooter.jsp" %>
<script src="${pageContext.request.contextPath}/bootstrap-select/js/bootstrap-select.js"></script>
<script src="${pageContext.request.contextPath}/bootstrap-select/js/i18n/defaults-zh_CN.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.treegrid.js"></script>
<script src="${pageContext.request.contextPath}/bootstraptable/extensions/treegrid/bootstrap-table-treegrid.js"></script>
<script type="text/javascript">
    $(document).ready(function () {
        creteTable();
        validateStaff();
        //页面加载完成后，发送ajax请求，获取所有的角色数据
        $.ajax({
            url: "/adminController_rolelist.action",
            type: 'post',
            success: function (data) {
                data = JSON.parse(data);
                var html = "";
                //在ajax回调函数中，解析json数据，展示为checkbox
                data.forEach(function (rowData) {
                    html += "<label class=\"checkbox-inline\">\n" +
                        "<input type=\"checkbox\" id=\"roleids\" name=\"roleids\" value='" + rowData.roleid + "'>" + rowData.rolename
                        + "</label>";
                })
                $("#roleTD").html(html);
            }
        });
    });

    // 授权
    function doRoot() {
        var userID = $("#userID").val();
        var rows = $("#menuTable").bootstrapTable("getSelections");
        $.ajax({
            url: "/rootManagement.action",
            type: 'post',
            data: {rowData: JSON.stringify(rows), "userID": userID},
            dataType: 'json',
            success: function (data) {
                if (data == 200) {
                    modle.alert("授权成功！", "success");
                } else {
                    modle.alert("操作失败！", "warn");
                }
            }
        });
        return;
    }

    //赋值窗口
    $("#guntRoot").on("show.bs.modal", function () {
        $("#menuTable").bootstrapTable("destroy").bootstrapTable({
            url: "/getAllMenu.action",
            dataType: 'json',
            search: false,
            clickToSelect: false,
            saveState: true,
            // height:600,
            toolbar: '#toolbar2',
            treeShowField: 'name',//在哪一列展开树形
            parentIdField: 'pid', //指定父id列
            rootParentId: '0',
            idField: 'id',
            columns: [
                {
                    checkbox: true,
                    width: 50,
                    formatter: function (value, row, index) {
                        if (row.check == true) {
                            return {checked: true};
                        }
                    }
                },
                {field: 'name', title: '名称'},
                {field: 'description', title: '描述'},
                {field: 'page', title: '路径'}
            ],
            onResetView: function (data) {
                $("#menuTable").treegrid({
                    initialState: 'expanded',//expand
                    treeColumn: 1,
                });
            },
            onCheck: function (row, $element) {
                var checkDatas = $("#menuTable").bootstrapTable('getData');
                // 子节点选中,级联父节点选中
                selectParentChecked(checkDatas, row, "id", "pid");
                // 父节点选中，级联子节点选中
                row.check = true;
                $("#menuTable").bootstrapTable('updateRow', {id: row.id, row: row});
                var checkList = [];
                if (row.pid == '' || row.pid == undefined) {
                    checkList = unSelectChilds(checkDatas, row);
                }
                $("#menuTable").bootstrapTable('checkBy', {field: 'id', values: checkList});
            },
            onUncheck: function (row) {
                var unCheckDatas = $("#menuTable").bootstrapTable('getData');
                // 父节点取消选中，级联取消子节点选中
                row.check = false;
                $("#menuTable").bootstrapTable('updateByUniqueId', {id: row.id, row: row});
                var unCheckList = [];
                if (row.pid == '' || row.pid == undefined) {
                    unCheckList = unSelectChilds(unCheckDatas, row);
                }
                //取消选中最后一个子元素时查找对应父元素取消
                var parentNode = selectParentUnchecked(unCheckDatas, row);
                if (parentNode != undefined) {
                    unCheckList.push(parentNode);
                }
                $("#menuTable").bootstrapTable('uncheckBy', {field: 'id', values: unCheckList});
            },
            onLoadSuccess: function () {
                // 查询用户已有权限
                var userID = $("#userID").val();
                $.ajax({
                    url: '/getUserFunctionId.action',
                    type: "get",
                    data: {userID: userID},
                    dataType: 'JSON',
                    success: function (functionData) {
                        $("#menuTable").bootstrapTable('uncheckAll');
                        var initDatas = $("#menuTable").bootstrapTable('getData');
                        // 勾选
                        for (var i in initDatas) {
                            initDatas[i].check = undefined;
                            for (var j in functionData) {
                                if (initDatas[i].id == functionData[j].auth_function_id) {
                                    initDatas[i].check = true;
                                }
                            }
                        }
                        $("#menuTable").bootstrapTable('load', initDatas);
                    }
                });
            }
        });
    });

    function unSelectChilds(datas, row) {
        var unCheckList = [];
        for (var i in datas) {
            if (datas[i].pid == row.id) {
                unCheckList.push(datas[i].id);
            }
        }
        return unCheckList;
    }

    function selectParentUnchecked(datas, row) {
        var key = 0;
        for (var i in datas) {
            if (datas[i].pid == row.pid && datas[i].check == true) {
                key++
            }
        }
        if (key == 0) {
            for (var i in datas) {
                if (datas[i].id == row.pid) {
                    return datas[i].id;
                }
            }
        }
    }

    function selectParentChecked(datas, row, id, pid) {
        for (var i in datas) {
            if (datas[i][id] == row[pid]) {
                datas[i].check = true;
                // selectParentChecked(datas, datas[i], id, pid);
            }
        }
    }

    // 打开授权窗口
    function EditViewById(userId) {
        $("#guntRoot").modal("show");
        $("#userID").val(userId);
    }

    function actionFormatter(value, row, index) {
        return "<a href='javascript:;' type='button' class='btn btn-danger' onclick=\"EditViewById('" + row.id + "')\" title='设置权限'>设置权限</span></a>";
    }

    function creteTable() {
        jQuery("#myTable").bootstrapTable({
            url: "/mgr_base_findstaffinfo.action",
            method: 'get',
            toolbar: '#toolbar',
            pagination: true,
            classes: 'table table-hover table-sm table-bordered',
            // height: 800,
            search: true,
            showRefresh: true,
            theadClasses: 'thead-dark',
            clickToSelect: false,
            pageSize: 20,
            pageList: [10, 20, 50, 100, 200],
            uniqueId: 'id',
            columns: [{
                // field: 'ids',
                checkbox: true,
            },
                {
                    field: 'power',
                    title: '权限设置',
                    width: 120,
                    align: 'center',
                    formatter: actionFormatter
                },
                {
                    field: 'id',
                    title: '工号',
                    width: 60,
                    align: 'center',

                }, {
                    field: 'username',
                    title: '姓名',
                    width: 120,
                    align: 'center',

                }, {
                    field: 'gender',
                    title: '性别',
                    width: 50,
                    align: 'center',

                }, {
                    field: 'phone',
                    title: '手机号码',
                    width: 120,
                    align: 'center',

                }, {
                    field: 'companyphone',
                    title: '公司号码',
                    width: 120,
                    align: 'center',

                }, {
                    field: 'beginjobtime',
                    title: '入职时间',
                    width: 120,
                    align: 'center',
                    formatter: changeDateFormat,

                }, {
                    field: 'rolename',
                    title: '角色',
                    width: 120,
                    align: 'center',

                }, {
                    field: 'job',
                    title: '职位',
                    width: 120,
                    align: 'center',

                }, {
                    field: 'urgentman',
                    title: '紧急联系人',
                    width: 120,
                    align: 'center',

                }, {
                    field: 'urgentmanphone',
                    title: '紧急联系人电话',
                    width: 120,
                    align: 'center',

                }, {
                    field: 'homeaddres',
                    title: '家庭住址',
                    width: 320,
                    align: 'center',

                }]
        });
    }

    // 添加窗口
    function addEmployee() {
        $('#addMStaff').modal('show');
        validateStaff();
    }

    function doSave() {
        // 添加员工前表单验证
        $('.staffForm').data('bootstrapValidator').validate();
        if (!$('.staffForm').data('bootstrapValidator').isValid()) {
            return;
        }
        var json = $('.staffForm').serializeJson();
        $.ajax({
            url: "/admin_updatestaff.action",
            type: 'post',
            data: {data: JSON.stringify(json)},
            success: function (data) {
                modle.alert("新增成功！", "success");
                $('#addMStaff').modal('hide');
            }
        })
    }

    $('#addMStaff').on('hidden.bs.modal', function () {
        $('.staffForm input').val('');
        $(".staffForm").data('bootstrapValidator').destroy();
        $('.staffForm').data('bootstrapValidator', null);
        validateStaff();
    });


    // 重置密码
    function resetPassword() {
        //获取数据表格中所有选中的行，返回数组对象
        var rows = $("#myTable").bootstrapTable("getSelections");
        if (rows.length == 0) {
            //没有选中记录，弹出提示
            modle.alert('请选择需要的信息!', "tip");
        } else {
            //选中了取派员,弹出确认框
            modle.confirm({message: "你确定要重置该用户密码？"}).on(function (r) {
                if (r) {
                    var array = new Array();
                    //确定,发送请求
                    //获取所有选中的取派员的id
                    for (var i = 0; i < rows.length; i++) {
                        var staff = rows[i];//json对象
                        var id = staff.id;
                        array.push(id);
                    }
                    var ids = array.join(",");//1,2,3,4,5
                    // location.href = "/admin_base_restpassword.action?ids=" + ids;
                    $.ajax({
                        url: "/admin_base_restpassword.action",
                        type: 'post',
                        data: {"ids": ids},
                        success: function (data) {
                            $("#myTable").bootstrapTable('refresh');
                        }
                    })
                }
            });
        }
    }

    // 复选框删除
    function deleteByCheckBox() {
        var $rowData = $("#myTable").bootstrapTable('getSelections');
        if ($rowData.length <= 0) {
            modle.alert("请选择需要删除的数据!", "tip")
        } else {
            modle.confirm({message: "确认删除？"}).on(function (r) {
                if (r) {
                    var array = new Array();
                    //确定,发送请求
                    //获取所有选中的取派员的id
                    for (var i = 0; i < $rowData.length; i++) {
                        var staff = $rowData[i];//json对象
                        var id = staff.id;
                        array.push(id);
                    }
                    var ids = array.join(",");//1,2,3,4,5
                    $.ajax({
                        url: "/admin_base_deletestaff.action",
                        type: 'post',
                        data: {"ids": ids},
                        success: function (data) {
                            $("#myTable").bootstrapTable('refresh');
                        }
                    })
                }
            });
        }
    }


    //转换日期格式(时间戳转换为datetime格式)
    function changeDateFormat(cellval) {
        var dateVal = cellval + "";
        if (cellval != null) {
            var date = new Date(parseInt(dateVal.replace("/Date(", "").replace(")/", ""), 10));
            var month = date.getMonth() + 1 < 10 ? "0" + (date.getMonth() + 1) : date.getMonth() + 1;
            var currentDate = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();

            var hours = date.getHours() < 10 ? "0" + date.getHours() : date.getHours();
            var minutes = date.getMinutes() < 10 ? "0" + date.getMinutes() : date.getMinutes();
            var seconds = date.getSeconds() < 10 ? "0" + date.getSeconds() : date.getSeconds();

            return date.getFullYear() + "-" + month + "-" + currentDate + " " + hours + ":" + minutes + ":" + seconds;
        }
    }

    // 初始化表单验证
    function validateStaff() {
        $('.staffForm').bootstrapValidator({
            message: 'This value is not valid',
            container: 'tooltip',
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
                id: {
                    validators: {
                        notEmpty: {
                            message: '工号不能为空'
                        }
                    }
                },
                username: {
                    validators: {
                        notEmpty: {
                            message: '姓名不能为空'
                        }
                    }
                },
                job: {
                    validators: {
                        notEmpty: {
                            message: '职位不能为空'
                        }
                    }
                }
            }
        });
    }


</script>
</html>

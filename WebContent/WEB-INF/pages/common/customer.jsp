<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>我的客户</title>
    <%@include file="/common/inc.jsp" %>
</head>
<style>
    label {
        text-align: right;
    }
</style>
<body>
<!-- 修改模态框 -->
<div id="updateStaff" class="modal fade " tabindex="-1" role="dialog" aria-labelledby="updateStaff"
     aria-hidden="true">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h3 class="modal-title">
                    修改员工
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
                                   class="form-control" name="phone" id="uphone">
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
<!-- 新增模态框 -->
<div id="myModalLabel" class="modal fade " id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
     aria-hidden="true">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h3 class="modal-title" id="customer">
                    新增客户
                </h3>
            </div>
            <div class="modal-body">
                <form class="myForm form">
                    <div class="form-group row">
                        <label for="customerName" class="col-sm-2 col-form-label">客户姓名</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="customername" id="customerName">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">性别</label>
                        <div class="col-sm-6">
                            <select class="form-control" name="gender">
                                <option value="男">男</option>
                                <option value="女">女</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="phone" class="col-sm-2 col-form-label">用户电话</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="customerphone" id="phone">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="expressName" class="col-sm-2 col-form-label">物流名称</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="wuliuname" id="expressName">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="expressPhone" class="col-sm-2 col-form-label">物流电话</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="wuliuphone" id="expressPhone">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="expressAddress" class="col-sm-2 col-form-label">物流地址</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="wuliuaddress" id="expressAddress">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="customerAddress" class="col-sm-2 col-form-label">客户地址</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="customeraddress" id="customerAddress">
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                        </button>
                        <button type="button" name="submit" class="btn btn-primary" onclick="addCustomer()">提交</button>
                    </div>
                </form>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
<div style="height: 100%;">
    <div id="toolbar" class="btn-group">
        <button id="btn_add" type="button" class="btn btn-primary" onclick="addWin()">
            <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
        </button>
        <button id="btn_update" type="button" class="btn btn-primary" onclick="editEnable()">
            <span class="glyphicon glyphicon-edit" aria-hidden="true"></span>修改
        </button>
        <button id="btn_delete" type="button" class="btn btn-danger" onclick="deleteByCheckBox()">
            <span class="glyphicon glyphicon-minus" aria-hidden="true"></span>删除
        </button>
    </div>
    <%--表格--%>
    <div id="tbody" class="table-responsive">
        <table id="myTable" class="table table-bordered text-nowrap"></table>
    </div>
</div>

</body>

<%--引入script--%>
<%@include file="/common/incfooter.jsp" %>
<script type="text/javascript">
    $(document).ready(function () {
        createTable();
        validateForm();
        $.fn.editable.defaults.mode = 'popup';//popup
        // $.fn.editable.defaults.disabled = 'false';
    });

    // 初始化表格
    function createTable() {
        $('#myTable').bootstrapTable({
            url: '/common_findCustomerInfo.action',
            toolbar: '#toolbar',
            pagination: true,
            classes: 'table table-hover table-sm table-bordered',
            // height: tableHeight,
            search: true,
            searchOnEnterKey: false,
            showRefresh: true,
            theadClasses: 'thead-dark',
            clickToSelect: false,
            pageSize: 20,
            pageList: [10, 20, 50, 100, 200, 500],
            uniqueId: 'id',
            columns: [
                {
                    checkbox: true
                }, {
                    field: 'customername',
                    title: '客户姓名',
                    width: 100,
                    align: 'left'
                }, {
                    field: 'gender',
                    title: '性别',
                    width: 40,
                    align: 'center',
                    editable: {
                        type: 'select',
                        title: '性别',
                        source: [{value: "男", text: "男"}, {value: "女", text: "女"}]
                    }
                }, {
                    field: 'customerphone',
                    title: '用户电话',
                    width: 150,
                    align: 'left'
                }, {
                    field: 'lasttime',
                    title: '距离上次下单时间',
                    width: 160,
                    align: 'center'
                }, {
                    field: 'wuliuname',
                    title: '物流名称',
                    width: 120,
                    align: 'center',
                    editable: {
                        type: 'text',
                        title: '物流名称',
                        validate: function (v) {
                            if (v == '') return '不能为空';
                        }
                    }
                }, {
                    field: 'wuliuphone',
                    title:
                        '物流电话',
                    width:
                        120,
                    align:
                        'center',
                    editable: {
                        type: 'text',
                        title: '物流电话'
                    }
                }, {
                    field: 'wuliuaddress',
                    title:
                        '物流地址',
                    width:
                        400,
                    align:
                        'center',
                    editable: {
                        type: 'text',
                        title: '物流地址'
                    }
                }, {
                    field: 'customeraddress',
                    title:
                        '客户地址',
                    width:
                        400,
                    align:
                        'center',
                    editable: {
                        type: 'text',
                        title: '客户地址'
                    }
                }, {
                    field: 'username',
                    title:
                        '业务员',
                    width:
                        100,
                    align:
                        'center'
                }
            ],
            onEditableSave: function (field, row, oldValue, $el) {
                $.ajax({
                    type: "post",
                    url: "/index_updateCustomer.action",
                    data: {
                        "id": row.id, "gender": row.gender, "wuliuname": row.wuliuname, "wuliuphone": row.wuliuphone,
                        "wuliuaddress": row.wuliuaddress, "customeraddress": row.customeraddress
                    },
                    dataType: 'JSON',
                    success: function (data, status) {
                        // if (status == "success") {
                        //     setMsg('tip', '修改成功!');
                        // }
                    },
                    error: function () {
                        modle.alert('修改失败!', "warn");
                    }
                });
            },
            onLoadSuccess: function () {
                $('.editable').editable('disable', 'true');
            },
            onDblClickRow: function (row, $element, field) {
                //TODO 修改框
                // $('#updateStaff').modal('show');
                // $.ajax({
                //     url: "/adminController_rolelist.action",
                //     type: 'post',
                //     success: function (data) {
                //         data = JSON.parse(data);
                //         var html = "";
                //         //在ajax回调函数中，解析json数据，展示为checkbox
                //         data.forEach(function (rowData) {
                //             html += "<label class=\"checkbox-inline\">\n" +
                //                 "<input type=\"checkbox\" id=\"roleids\" name=\"roleids\" value='" + rowData.roleid + "'>" + rowData.rolename
                //                 + "</label>";
                //         })
                //         $("#roleTD").html(html);
                //     }
                // });
            }
        })
    }

    // 复选框删除
    function deleteByCheckBox() {
        var $row = jQuery("#myTable").bootstrapTable('getSelections');
        if ($row.length <= 0) {
            modle.alert("请选择需要删除的数据!", "tip");
        } else {
            modle.confirm({message: "确认删除？"}).on(function (r) {
                if (r) {
                    var array = new Array();
                    $row.forEach(function (row) {
                        array.push(row.id);
                    })
                    var ids = array.join(",");
                    jQuery.ajax({
                        type: "GET",
                        url: "${pageContext.request.contextPath}/index_deleteCustomer.action",
                        dataType: "json",
                        data: {"ids": ids},
                        success: function (data) {
                            modle.alert(data.message, "tip");
                            jQuery("#myTable").bootstrapTable("refresh", {
                                silent: true, //静态刷新
                                url: '/common_findCustomerInfo.action'
                            });
                        }
                    });
                }
            });
        }
    }

    // 删除单行 弃用
    function deleteById(value) {
        jQuery.ajax({
            type: "GET",
            url: "${pageContext.request.contextPath}/index_deleteCustomer.action",
            dataType: "json",
            data: {"ids": value},
            success: function (data) {
                alert();
            }
        });
    }

    function addWin() {
        $('#myModalLabel').modal('show');
    }

    // 添加客户
    function addCustomer() {
        $('.myForm').data('bootstrapValidator').validate();
        if (!$('.myForm').data('bootstrapValidator').isValid()) {
            return;
        }
        debugger
        var p = $('.myForm').serializeJson();
        $.ajax({
            url: "/index_addCustomerInfo.action",
            type: "post",
            data: {"p": JSON.stringify(p)},
            success: function (data) {
                var msg = JSON.parse(data);
                if (msg.status == 200) {
                    modle.alert(msg.message, "success");
                    $("#myModalLabel").modal('hide');
                    $('#myTable').bootstrapTable('refresh');
                } else {
                    modle.alert(msg.message, "warn");
                }
            }
        });
    }

    // 启用/禁用 修改
    var check = 1;

    function editEnable() {
        // $('.editable').editable('toggleDisabled');
        if (0 == check) {
            $('.editable').editable('disable', 'true');
            check = 1;
        } else {
            $('.editable').editable('enable', 'true');
            check = 0;
        }
    }

    // 清除表单数据
    $('#myModalLabel').on('hidden.bs.modal', function () {
        // 表单重置
        $('#myModalLabel input').val('');
        $(".myForm").data('bootstrapValidator').destroy();
        $('.myForm').data('bootstrapValidator', null);
        validateForm();
    });

    // 初始化表单验证
    function validateForm() {
        $('form').bootstrapValidator({
            message: 'This value is not valid',
            // container: 'tooltip',
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
                customername: {
                    // message: '客户姓名不能为空',
                    validators: {
                        notEmpty: {
                            message: '用户名不能为空'
                        }
                    }
                }, customerphone: {
                    validators: {
                        notEmpty: {
                            message: '号码不能为空'
                        },
                        phone: {
                            country: 'CN',
                            message: '号码不正确'
                        }
                    }
                }, wuliuname: {
                    validators: {
                        notEmpty: {
                            message: '物流名称不能为空'
                        }
                    }
                }, wuliuphone: {
                    validators: {
                        notEmpty: {
                            message: '物流电话不能为空'
                        }, phone: {
                            country: 'CN',
                            message: '号码不正确'
                        }
                    }
                }, wuliuaddress: {
                    validators: {
                        notEmpty: {
                            message: '物流地址不能为空'
                        }
                    }
                }, customeraddress: {
                    validators: {
                        notEmpty: {
                            message: '客户地址不能为空'
                        }
                    }
                }
            }
        });
    }

</script>
</html>

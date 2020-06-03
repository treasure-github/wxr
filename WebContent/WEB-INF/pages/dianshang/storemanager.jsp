<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>店铺管理</title>
    <%@include file="/common/inc.jsp" %>
</head>
<style>
    label {
        text-align: right;
    }
</style>
<body>
<div id="addWin" class="modal fade " tabindex="-1" role="dialog" aria-labelledby="addWin"
     aria-hidden="true">
    <div class="modal-dialog modal-sm" style="width: 600px;">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h3 class="modal-title">
                    新增店铺信息
                </h3>
            </div>
            <div class="modal-body">
                <form id="addStore" class="addStore form">
                    <div class="form-group row">
                        <label for="storetype" class="col-sm-2 col-form-label">平台类别</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="storetype" id="storetype">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="storename" class="col-sm-2 col-form-label">管理员</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="storename" id="storename">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="username" class="col-sm-2 col-form-label">店铺名称</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="username" id="username">
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                </button>
                <button type="button" name="submit" class="btn btn-primary" onclick="doAdd()">提交</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
<%--工具栏--%>
<div id="toolbar" class="btn-group form-inline">
    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#addWin"><i
            class="glyphicon glyphicon-plus"></i>添加
    </button>
    <button type="button" class="btn btn-primary" onclick="editEnable()"><i
            class="glyphicon glyphicon-edit"></i>修改
    </button>
    <button type="button" class="btn btn-danger" onclick="deleteBySelect()"><i
            class="glyphicon glyphicon-minus"></i>删除
    </button>
</div>
<%--表格--%>
<div id="tbody" class="table-responsive">
    <table id="myTable" class="table table-bordered text-nowrap"></table>
</div>
</body>

<%--引入script--%>
<%@include file="/common/incfooter.jsp" %>
<script type="text/javascript">
    $(document).ready(function () {
        createTable();
        $.fn.editable.defaults.mode = 'inline';//popu
        // $.fn.editable.defaults.disabled = 'false';
        validateForm();
    });


    // 添加
    function doAdd() {
        $('#addStore').data('bootstrapValidator').validate();
        if (!$('#addStore').data('bootstrapValidator').isValid()) {
            return;
        }
        var serializeJson = $("#addStore").serializeJson();
        if (isExistTypename(serializeJson)) {
            modle.alert("该类别已经存在！", "tip");
            return;
        }
        $.ajax({
            url: "${pageContext.request.contextPath}/dianShang_addStoreInfo.action",
            data: {
                "storeid": serializeJson.storeid,
                "storetype": serializeJson.storetype,
                "storename": serializeJson.storename,
                "username": serializeJson.username
            },
            complete: function (data) {
                if (data == 0) {
                    modle.alert("添加失败", "tip")
                } else {
                    $("#addWin").modal("hide");
                    modle.alert("添加成功", "success");
                    $('#myTable').bootstrapTable('refresh');
                }
            }
        });
    }

    // 删除
    function deleteBySelect() {
        // 复选框删除
        var $row = jQuery("#myTable").bootstrapTable('getSelections');
        if ($row.length <= 0) {
            modle.alert("请选择需要删除的数据!", "tip");
        } else {
            modle.confirm({message: "你确定要删除该店铺信息？"}).on(function (r) {
                if (r) {
                    var array = new Array();
                    $row.forEach(function (row) {
                        array.push(row.storeid);
                    })
                    var ids = array.join(",");
                    $.ajax({
                        type: "GET",
                        url: "${pageContext.request.contextPath}/dianShang_deleteStore.action",
                        dataType: "json",
                        data: {"ids": ids},
                        complete: function () {
                            $("#myTable").bootstrapTable("refresh");
                        }
                    });
                }
            });
        }
    }

    // 初始化表格
    function createTable() {
        $('#myTable').bootstrapTable({
            url: '/dianShang_findAllStore.action',
            toolbar: '#toolbar',
            pagination: true,
            classes: 'table table-hover table-sm table-bordered',
            // height: 750,
            search: true,
            showRefresh: true,
            theadClasses: 'thead-dark',
            clickToSelect: false,
            sidePagination: 'client',
            pageSize: 20,
            pageList: [10, 20, 50, 100, 200, 500],
            uniqueId: 'storeid',
            columns: [{
                checkbox: true
            }, {
                field: 'storetype',
                title: '平台类别',
                width: 120,
                align: 'center',
                editable: {
                    type: 'text',
                    title: '平台类别',
                    validate: function (v) {
                        if (v == "") return '不能为空'
                    }
                }
            }, {
                field: 'username',
                title: '管理员',
                width: 160,
                align: 'center',
                editable: {
                    type: 'text',
                    title: '管理员',
                    validate: function (v) {
                        if (v == "") return '不能为空'
                    }
                }
            }, {
                field: 'storename',
                title: '店铺名字',
                width: 300,
                align: 'center',
                editable: {
                    type: 'text',
                    title: '店铺名字',
                    validate: function (v) {
                        if (v == "") return '不能为空'
                    }
                }
            }],
            onEditableSave: function (field, row, oldValue, $el) {
                $.ajax({
                    type: "get",
                    url: "/dianShang_updateStore.action",
                    data: {
                        "storeid": row.storeid,
                        "storetype": row.storetype,
                        "storename": row.storename,
                        "username": row.username
                    },
                    dataType: 'JSON',
                    success: function (result) {
                        if (result == 1) {
                            // modle.alert("修改成功！");
                            // $("#myTable").bootstrapTable('refresh');
                        } else {
                            modle.alert("修改失败！", "wanr");
                        }
                        // $('#myTable').bootstrapTable('refresh');
                    },
                    error: function () {
                        modle.alert('修改失败!', "wanr");
                    }
                });
            },
            onLoadSuccess: function () {
                $('.editable').editable('disable', 'true');
            }
        });
    }

    function isExistTypename(formData) {
        //获得整个表格所有行的数据
        var rows = $("#myTable").bootstrapTable("getData");
        for (var i = 0; i < rows.length; i++) {
            if (formData.storename == rows[i].storename && formData.storetype == rows[i].storetype) {
                //表示录入当前类别已经存在，不允许录入。
                return true;
            }
        }
        return false;
    }

    // 清除表单数据
    $('#addWin').on('hidden.bs.modal', function () {
        // 表单重置
        $('#addStore input').val('');
        $("#addStore").data('bootstrapValidator').destroy();
        $('#addStore').data('bootstrapValidator', null);
        validateForm();
    });

    // 初始化表单验证
    function validateForm() {
        $('#addStore').bootstrapValidator({
            message: 'This value is not valid',
            container: 'tooltip',
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
                storetype: {
                    validators: {
                        notEmpty: {
                            message: '平台类别不能为空'
                        }
                    }
                },
                storename: {
                    validators: {
                        notEmpty: {
                            message: '管理员不能为空'
                        }
                    }
                },
                username: {
                    validators: {
                        notEmpty: {
                            message: '店铺名称不能为空'
                        }
                    }
                }
            }
        });
    }

    // 启用/禁用 修改
    var check = 1;

    function editEnable() {
        if (0 == check) {
            $('.editable').editable('disable', 'true');
            check = 1;
        } else {
            $('.editable').editable('enable', 'true');
            check = 0;
        }
    }
</script>
</html>
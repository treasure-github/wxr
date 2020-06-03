<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>快递信息</title>
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
                    新增快递信息
                </h3>
            </div>
            <div class="modal-body">
                <form id="addPresses" class="addPresses  form">
                    <div class="form-group row">
                        <label for="province" class="col-sm-2 col-form-label">省份</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="province" id="province">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="expressname" class="col-sm-2 col-form-label">快递</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="expressname" id="expressname">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="expresscost" class="col-sm-2 col-form-label">快递成本</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="expresscost" id="expresscost">
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
<div id="importData" class="modal fade " tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
     aria-hidden="true">
    <div class="modal-dialog modal-sm">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h3 class="modal-title" id="customer">
                    导入数据
                </h3>
            </div>
            <div class="modal-body">
                <form class="importForm form" method="post" enctype="multipart/form-data">
                    <div class="form-group row">
                        <input id="myFile" name="file" type="file" style="width:60%;margin-left:20%"><br>
                        <input type="hidden" name="storeId" id="formStoreId" value="">
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                        </button>
                        <button type="submit" name="submit" class="btn btn-primary" onclick="importData()">导入</button>
                    </div>
                </form>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
<%--工具栏--%>
<div id="toolbar" class="btn-group form-inline">
    <button type="button" class="btn btn-primary" onclick="importData()"><i
            class="glyphicon glyphicon-import"></i>导入
    </button>
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
        $.fn.editable.defaults.disabled = 'false';
        validateForm();
    });

    //TODO 导入 原系统功能未实现
    function importData() {
        modle.alert("功能未实现", "tip")
    }

    // 添加
    function doAdd() {
        $('#addPresses').data('bootstrapValidator').validate();
        if (!$('#addPresses').data('bootstrapValidator').isValid()) {
            return;
        }
        var serializeJson = $("#addPresses").serializeJson();
        if (isExistTypename(serializeJson)) {
            modle.alert("该快递已经存在！", "tip");
            return;
        }
        $.ajax({
            url: "${pageContext.request.contextPath}/dianShang_addKuaidi.action",
            data: serializeJson,
            complete: function (data) {
                if (data == 0) {
                    modle.alert("添加失败", "tip")
                } else {
                    $("#addWin").modal("hide");
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
            modle.confirm({message: "你确定要删除选中信息？"}).on(function (r) {
                if (r) {
                    var array = new Array();
                    $row.forEach(function (row) {
                        array.push(row.expressid);
                    })
                    var ids = array.join(",");
                    $.ajax({
                        type: "GET",
                        url: "${pageContext.request.contextPath}/dianShang_deleteKuaidi.action",
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
            url: '/dianShang_findAllKuaidi.action',
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
            fixedColumns: true,
            fixedNumber: 2,//6
            // editable:false,
            uniqueId: 'expressid',
            columns: [{
                checkbox: true
            }, {
                field: 'province',
                title: '省份',
                width: 120,
                align: 'center',
                editable: {
                    type: 'text',
                    title: '省份',
                    validate: function (v) {
                        if (v == '') return '不能为空';
                    }
                }
            }, {
                field: 'expressname',
                title: '快递',
                width: 120,
                align: 'center',
                editable: {
                    type: 'text',
                    title: '快递',
                    validate: function (v) {
                        if (v == '') return '不能为空';
                    }
                }
            }, {
                field: 'expresscost',
                title: '快递成本',
                width: 120,
                align: 'center',
                editable: {
                    type: 'text',
                    title: "快递成本",
                    validate: function (v) {
                        if (v == '') return '不能为空';
                    }
                }
            }],
            onEditableSave: function (field, row, oldValue, $el) {
                $.ajax({
                    type: "post",
                    url: "/dianShang_updateKuaidiInfo.action",
                    data: {
                        "expressid": row.expressid,
                        "province": row.province,
                        "expressname": row.expressname,
                        "expresscost": row.expresscost
                    },
                    dataType: 'JSON',
                    success: function (result) {
                        if (result == 1) {
                            // modle.alert("修改成功！");
                            // $("#myTable").bootstrapTable('refresh');
                        } else {
                            modle.alert("修改失败！", "warn");
                        }
                        $('#myTable').bootstrapTable('refresh');
                    },
                    error: function () {
                        modle.alert('修改失败!', "warn");
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
        for (var i = 1; i < rows.length; i++) {
            if (formData.province == rows[i].province && formData.expressname == rows[i].expressname) {
                //表示录入当前类别已经存在，不允许录入。
                return true;
            }
        }
        return false;
    }

    // 清除表单数据
    $('#addWin').on('hidden.bs.modal', function () {
        // 表单重置
        $('#addPresses input').val('');
        $("#addPresses").data('bootstrapValidator').destroy();
        $('#addPresses').data('bootstrapValidator', null);
        validateForm();
    });

    // 初始化表单验证
    function validateForm() {
        $('#addPresses').bootstrapValidator({
            message: 'This value is not valid',
            container: 'tooltip',
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
                province: {
                    validators: {
                        notEmpty: {
                            message: '省份不能为空'
                        }
                    }
                },
                expressname: {
                    validators: {
                        notEmpty: {
                            message: '快递不能为空'
                        }
                    }
                },
                expresscost: {
                    validators: {
                        notEmpty: {
                            message: '快递成本不能为空'
                        },
                        numeric: {
                            message: '只能为数字'
                        }
                    }
                }
            }
        });
    }

    // 启用/禁用 修改
    function editEnable() {
        $('.editable').editable('toggleDisabled');
    }
</script>
</html>
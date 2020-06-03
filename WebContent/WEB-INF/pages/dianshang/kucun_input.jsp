<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>库存录入</title>
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
                <h3 class="modal-title" id="customer">
                    新增库存
                </h3>
            </div>
            <div class="modal-body">
                <form id="addKC" class="form">
                    <div class="form-group row">
                        <label for="typename" class="col-sm-2 col-form-label">类别</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="typename" id="typename">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="typeno" class="col-sm-2 col-form-label">型号</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="typeno" id="typeno">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="brand" class="col-sm-2 col-form-label">品牌</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="brand" id="brand">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="num" class="col-sm-2 col-form-label">数量</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="num" id="num">
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
<div class="row">
    <div class="col-lg-12">
        <%--工具栏--%>
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
</div>
</body>

<%--引入script--%>
<%@include file="/common/incfooter.jsp" %>
<script type="text/javascript">
    $(document).ready(function () {
        createTable();
        validateForm();

    });

    // 复选框删除
    function deleteByCheckBox() {
        var $row = $("#myTable").bootstrapTable('getSelections');
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
                    $.ajax({
                        type: "GET",
                        url: "${pageContext.request.contextPath}/dianShang_deleteDsKucun.action",
                        dataType: "json",
                        data: {"ids": ids},
                        complete: function (data) {
                            $("#myTable").bootstrapTable('refresh');
                        }
                    });
                }
            });
        }
    }


    // 新增
    function doAdd() {
        $('#addKC').data('bootstrapValidator').validate();
        if (!$('#addKC').data('bootstrapValidator').isValid()) {
            return;
        }
        var serializeJson = $("#addKC").serializeJson();
        if (isExistTypename(serializeJson)) {
            modle.alert("该类别已经存在！", "tip");
            return;
        }
        $.ajax({
            url: "${pageContext.request.contextPath}/dianShang_addStock.action",
            type: "post",
            dataType: "json",
            async: false,
            data: serializeJson,
            success: function (data) {
                if (data == '0') {
                    modle.alert("添加失败", "warn")
                } else {
                    modle.alert("添加成功", "success")
                }
                $('#myTable').bootstrapTable('refresh');
            },
            error: function () {
                modle.alert("添加失败", "error")
            }
        });
    }

    function addWin() {
        $('#addWin').modal('show');
    }

    // 清除表单数据
    $('#addWin').on('hidden.bs.modal', function () {
        // 表单重置
        $('#addKC input').val('');
        $("#addKC").data('bootstrapValidator').destroy();
        $('#addKC').data('bootstrapValidator', null);
        validateForm();
    });

    // 初始化表格
    function createTable() {
        $('#myTable').bootstrapTable({
            url: '/dianShang_findAllDsStock.action',
            toolbar: '#toolbar',
            pagination: true,
            classes: 'table table-hover table-sm table-bordered',
            // height: 800,
            search: true,
            showRefresh: true,
            theadClasses: 'thead-dark',
            clickToSelect: false,
            pageSize: 20,
            pageList: [10, 20, 50, 100, 200, 500],
            uniqueId: 'id',
            columns: [{
                checkbox: true
            }, {
                field: 'typename',
                title: '类别',
                width: 120,
                align: 'center',
                editable: {
                    type: "text",
                    title: '类别',
                    validate: function (v) {
                        if (v == '') return '不能为空';
                    }
                }
            }, {
                field: 'typeno',
                title: '型号',
                width: 120,
                align: 'center',
                editable: {
                    type: "text",
                    title: '型号',
                    validate: function (v) {
                        if (v == '') return '不能为空';
                    }
                }
            }, {
                field: 'brand',
                title: '品牌',
                width: 120,
                align: 'center',
                editable: {
                    type: "text",
                    title: '品牌',
                    validate: function (v) {
                        if (v == '') return '不能为空';
                    }
                }
            }, {
                field: 'num',
                title: '数量',
                width: 120,
                align: 'center',
                editable: {
                    type: "text",
                    title: '数量',
                    validate: function (v) {
                        if (v == '') return '不能为空';
                        if (v == 0) return '下单数量不能为 0';
                    }
                }
            }],
            onEditableSave: function (field, rows, oldValue, $el) {
                $.ajax({
                    type: "post",
                    url: "/dianShang_updateStockInfo.action",
                    data: {
                        "id": rows.id,
                        "typename": rows.typename,
                        "typeno": rows.typeno,
                        "brand": rows.brand,
                        "num": rows.num
                    },
                    dataType: 'JSON',
                    success: function (result) {
                        if (result == 1) {
                            // modle.alert("修改成功");
                        } else {
                            modle.alert("修改失败", "tip");
                        }
                    },
                    error: function (result) {
                        modle.alert("系统出错", "error");
                    }
                });
            },
            onLoadSuccess: function () {
                $('.editable').editable('disable', 'true');
            }
        });
    }


    // 启用/禁用 修改
    var check = 1;

    function editEnable() {
        $('.editable').editable('toggleDisabled');
        // if (0 == check) {
        //     $('.editable').editable('disable', 'true');
        //     check = 1;
        // } else {
        //     $('.editable').editable('enable', 'true');
        //     check = 0;
        // }
    }

    function isExistTypename(formData) {
        //获得整个表格所有行的数据
        var rows = $("#myTable").bootstrapTable("getData");
        for (var i = 0; i < rows.length; i++) {
            if (formData.typename == rows[i].typename && formData.typeno == rows[i].typeno && formData.brand == rows[i].brand) {
                //表示录入当前类别已经存在，不允许录入。
                return true;
            }
        }
        return false;
    }

    // 初始化表单验证
    function validateForm() {
        $('#addKC').bootstrapValidator({
            message: 'This value is not valid',
            container: 'tooltip',
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
                typename: {
                    validators: {
                        notEmpty: {
                            message: '类别不能为空'
                        }
                    }
                },
                typeno: {
                    validators: {
                        notEmpty: {
                            message: '型号不能为空'
                        }
                    }
                },
                brand: {
                    validators: {
                        notEmpty: {
                            message: '品牌不能为空'
                        }
                    }
                },
                num: {
                    validators: {
                        notEmpty: {
                            message: '数量不能为空'
                        }
                    }
                }
            }
        });
    }

</script>
</html>
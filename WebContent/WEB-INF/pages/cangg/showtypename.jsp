<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>类别录入</title>
    <%@include file="/common/inc.jsp" %>
</head>
<style>
    label {
        text-align: right;
    }
</style>
<body>
<%--添加类别--%>
<div id="addType" class="modal fade " tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
     aria-hidden="true">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h3 class="modal-title">
                    新增类别
                </h3>
            </div>
            <div class="modal-body">
                <form class="addTypeForm form">
                    <div class="form-group row">
                        <label for="typename" class="col-sm-2 col-form-label">类别名称</label>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" name="typename" id="typename">
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                        </button>
                        <button type="submit" name="submit" class="btn btn-primary" onclick="addType()">提交</button>
                    </div>
                </form>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
<%--添加品牌--%>
<div id="addBrandWin" class="modal fade " tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
     aria-hidden="true">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h3 class="modal-title">
                    新增品牌
                </h3>
            </div>
            <div class="modal-body">
                <form class="addBrand form">
                    <div class="form-group row">
                        <label for="brandName" class="col-sm-2 col-form-label">品牌名称</label>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" name="brandName" id="brandName">
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                        </button>
                        <button type="submit" name="submit" class="btn btn-primary" onclick="addBrand()">提交</button>
                    </div>
                </form>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
<%--添加型号--%>
<div id="addTypenoWin" class="modal fade " tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
     aria-hidden="true">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h3 class="modal-title">
                    新增型号
                </h3>
            </div>
            <div class="modal-body">
                <form class="addTypeNO form">
                    <div class="form-group row">
                        <label for="typeno" class="col-sm-2 col-form-label">型号名称</label>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" name="typeno" id="typeno">
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                        </button>
                        <button type="submit" name="submit" class="btn btn-primary" onclick="addTypeNo()">提交</button>
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
            <button id="btn_add" type="button" class="btn btn-primary" data-toggle="modal"
                    data-target="#addType">
                <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
            </button>
            <button id="add_type" type="button" class="btn btn-primary" onclick="showAddBrandWin()">
                <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>添加品牌
            </button>
            <button id="add_type_no" type="button" class="btn btn-primary" onclick="showAddTypeNoWin()">
                <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>添加型号
            </button>
            <button id="btn_delete" type="button" class="btn btn-danger" onclick="deleteByCheckBox()">
                <span class="glyphicon glyphicon-minus" aria-hidden="true"></span>删除
            </button>
        </div>
        <%--表格--%>
        <div id="tbody" class="table-responsive">
            <table id="myTable" class="table table-bordered text-nowrap"
                   style="table-layout: fixed;"></table>
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
        validateForm2();
        validateForm3();
    });

    // 删除
    function deleteByCheckBox() {
        var $rows = $('#myTable').bootstrapTable('getSelections');
        if ($rows.length <= 0) {
            modle.alert("请选择需要删除的数据", "tip");
        } else {
            modle.confirm({message: "确认删除？"}).on(function (r) {
                if (r) {
                    var array = new Array();
                    for (var i = 0; i < $rows.length; i++) {
                        var staff = $rows[i];
                        var id = staff.id;
                        array.push(id);
                    }
                    var ids = array.join(",");
                    $.ajax({
                        url: "/dateType_deleteTypename.action",
                        type: 'post',
                        data: {"ids": ids},
                        dataType: 'JSON',
                        complete: function () {
                            $("#myTable").bootstrapTable('refresh');
                        }
                    })
                }
            });
        }
    }

    //添加型号
    function addTypeNo() {
        $('.addTypeNO').data('bootstrapValidator').validate();
        if (!$('.addTypeNO').data('bootstrapValidator').isValid()) {
            return;
        }
        var typeid = $('#myTable').bootstrapTable('getSelections');
        var id = typeid[0].id;
        var typeNo = $('#typeno').val();
        //通过类别id判断型号是否已经存在
        if (isExistTypeNo(id, typeNo)) {
            modle.alert("该型号已经存在", "tip");
        } else {
            $.ajax({
                url: '/dataType_saveTypeno.action',
                type: 'get',
                data: {id: id, typenoname: typeNo},
                dataType: "JSON",
                success: function (data) {
                    if (data == 0) {
                        modle.alert("添加失败！", "warn");
                    } else {
                        modle.alert("添加成功！", "success");
                    }
                }
            })
        }
    }

    // 添加型号窗口
    function showAddTypeNoWin() {
        var typeRow = $('#myTable').bootstrapTable('getSelections');
        if (typeRow.length <= 0) {
            modle.alert("请选择类别！", "tip");
            return;
        }
        $('#addTypenoWin').modal('show');
    }

    // 添加品牌
    function addBrand() {
        $('.addBrand').data('bootstrapValidator').validate();
        if (!$('.addBrand').data('bootstrapValidator').isValid()) {
            return;
        }
        var typeid = $('#myTable').bootstrapTable('getSelections');
        var id = typeid[0].id;
        var brandname = $("#brandName").val();
        $.ajax({
            url: "${pageContext.request.contextPath}/dataType_checkIsExistBrandnameByTypenameid.action",
            data: {"id": id, "brandname": brandname},
            dataType: 'JSON',
            success: function (data) {
                if (data == 1) {
                    modle.alert("该品牌已经存在", "tip");
                } else {
                    <%--window.location.href="${pageContext.request.contextPath}/dataType_saveBrand.action?id="+${typenameid}+"&brandname="+rowData.brandname;--%>
                    $.ajax({
                        url: '/dataType_saveBrand.action',
                        type: 'get',
                        data: {id: id, brandname: brandname},
                        dataType: "JSON",
                        success: function (data) {
                            if (data == 1) {
                                modle.alert("添加成功！", "success");
                            } else {
                                modle.alert("添加失败！", "warn");
                            }
                        }
                    })
                }
            }
        });
    }

    // 添加品牌窗口
    function showAddBrandWin() {
        var typeRow = $('#myTable').bootstrapTable('getSelections');
        if (typeRow.length <= 0) {
            modle.alert("请选择类别！", "tip");
            return;
        }
        $('#addBrandWin').modal('show')
    }

    // 类别添加
    function addType() {
        $('.addTypeForm').data('bootstrapValidator').validate();
        if (!$('.addTypeForm').data('bootstrapValidator').isValid()) {
            return;
        }
        var typename = $("#typename").val();
        if (!isExistTypename(typename)) {
            //转成json格式，发送数据
            $.ajax({
                url: '/dateType_saveTypename.action',
                type: 'get',
                data: {typename: typename},
                dataType: "JSON",
                success: function (data) {
                    if (data == 1) {
                        modle.alert("添加成功！", "success");
                    } else {
                        modle.alert("添加失败！", "warn");
                    }
                }
            })
        } else {
            modle.alert("该类别已经存在！");
        }
    }

    function isExistTypeNo(id, typeNo) {
        var bool = false;
        $.ajax({
            url: '/dataType_checkIsExistTypenonameByTypenameid.action',
            type: 'get',
            async: false,
            data: {id: id, typenoname: typeNo},
            dataType: "JSON",
            success: function (data) {
                if (data != 0) {
                    bool = true;
                }
            }
        });
        return bool;
    }


    function isExistTypename(typename) {
        //获得整个表格所有行的数据
        var rows = $('#myTable').bootstrapTable('getData');
        for (var i = 1; i < rows.length; i++) {
            if (typename == rows[i].typename) {
                //表示录入当前类别已经存在，不允许录入。
                return true;
            }
        }
        return false;
    }

    // 初始化表格
    function createTable() {
        $('#myTable').bootstrapTable({
            url: '/dataTyep_findAllTypename.action',
            toolbar: '#toolbar',
            pagination: true,
            classes: 'table table-hover table-sm table-bordered',
            // height: 800,
            search: true,
            searchOnEnterKey: true,
            showRefresh: true,
            theadClasses: 'thead-dark',
            clickToSelect: false,
            pageSize: 20,
            pageList: [10, 20, 50, 100, 200, 500],
            uniqueId: 'id',
            columns: [{
                width: 5,
                radio: true
            }, {
                field: 'typename',
                title: '类别名称',
                width: 120,
                align: 'left',
                colspan: 1,
                editor: {
                    type: 'validatebox',
                    options: {
                        required: true
                    }
                }
            }

            ],
        });
    };

    // 重置表单
    $('#addType').on('hide.bs.modal', function () {
        $(".addTypeForm input").val('');
        $(".addTypeForm").data('bootstrapValidator').destroy();
        $('.addTypeForm').data('bootstrapValidator', null);
        validateForm();
    })
    $('#addBrandWin').on('hide.bs.modal', function () {
        $(".addBrand input").val('');
        $(".addBrand").data('bootstrapValidator').destroy();
        $('.addBrand').data('bootstrapValidator', null);
        validateForm2();
    })
    $('#addTypenoWin').on('hide.bs.modal', function () {
        $(".addTypeNO input").val('');
        $(".addTypeNO").data('bootstrapValidator').destroy();
        $('.addTypeNO').data('bootstrapValidator', null);
        validateForm3();
    })

    // 初始化表单验证
    function validateForm() {
        $('.addTypeForm').bootstrapValidator({
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
                            message: '不能为空'
                        }
                    }
                }
            }
        });
    }

    // 初始化表单验证
    function validateForm2() {
        $('.addBrand').bootstrapValidator({
            message: 'This value is not valid',
            container: 'tooltip',
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
                brandName: {
                    validators: {
                        notEmpty: {
                            message: '不能为空'
                        }
                    }
                }
            }
        });
    }

    // 初始化表单验证
    function validateForm3() {
        $('.addTypeNO').bootstrapValidator({
            message: 'This value is not valid',
            container: 'tooltip',
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
                typeno: {
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
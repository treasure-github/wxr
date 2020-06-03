<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>仓库地址</title>
    <%@include file="/common/inc.jsp" %>
</head>
<style>
    label {
        text-align: right;
    }
</style>
<body>
<%--添加仓库地址--%>
<div id="addAddress" class="modal fade " tabindex="-1" role="dialog" aria-labelledby="addAddress"
     aria-hidden="true">
    <div class="modal-dialog modal-lg">
        <div class=" modal-lg" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                            aria-hidden="true"> &times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">新增仓库地址</h4>
                </div>
                <div class="modal-body">
                    <form class="addAddressForm form">
                        <div class="form-group row">
                            <label for="addressName" class="col-sm-2 col-form-label">地址</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" name="addressName" id="addressName">
                            </div>
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary" onclick="addAddress()">提交</button>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="row">
    <div class="col-lg-12">
        <%--工具栏--%>
        <div id="toolbar" class="btn-group">
            <button id="btn_add" type="button" class="btn btn-primary" data-toggle="modal"
                    data-target="#addAddress">
                <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
            </button>
            <button id="btn_delete" type="button" class="btn btn-danger" onclick="deleteByCheckBox()">
                <span class="glyphicon glyphicon-minus" aria-hidden="true"></span>删除
            </button>
        </div>
        <%--表格--%>
        <div id="tbody" class="table-responsive">
            <table id="myTable" class="table table-bordered text-nowrap"
                   style="table-layout: fixed"></table>
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

    function addAddress() {
        $('.addAddressForm').data('bootstrapValidator').validate();
        if (!$('.addAddressForm').data('bootstrapValidator').isValid()) {
            return;
        }
        var addressName = $('#addressName').val();
        if (isExistTypename(addressName)) {
            modle.alert("该品牌已经存在", "tip");
        } else {
            $.ajax({
                url: '/dataType_saveStockAddress.action',
                type: 'get',
                data: {"stockAddress": addressName},
                dataType: "JSON",
                success: function (data) {
                    if (data == '0') {
                        modle.alert("添加失败！", "warn");
                    } else {
                        modle.alert("添加成功！", "success");
                    }
                }
            })
        }
    }

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
                        var id = $rows[i].saId;
                        array.push(id);
                    }
                    var ids = array.join(",");
                    $.ajax({
                        url: "/dataType_deleteStockAddress.action",
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


    // 初始化表格
    function createTable() {
        $('#myTable').bootstrapTable({
            url: '/dataType_findStockAddress.action',
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
            uniqueId: 'saId',
            columns: [{
                checkbox: true,
                width: 5
            }, {
                field: 'address',
                title: '地址',
                width: 120,
                align: 'left',
                editor: {
                    type: 'validatebox',
                    options: {
                        required: true
                    }
                }
            }
            ],
        });
    }

    function isExistTypename(addressName) {
        //获得整个表格所有行的数据
        var allRows = $("#myTable").bootstrapTable('getData');
        for (var i = 0; i < allRows.length; i++) {
            if (addressName == allRows[i].address) {
                //表示录入当前类别已经存在，不允许录入。
                return true;
            }
        }
        return false;
    }


    // 重置表单
    $('#addAddress').on('hide.bs.modal', function () {
        $(".addAddressForm input").val('');
        $(".addAddressForm").data('bootstrapValidator').destroy();
        $('.addAddressForm').data('bootstrapValidator', null);
        validateForm();
        $('#myTable').bootstrapTable('refresh');
    })

    // 初始化表单验证
    function validateForm() {
        $('.addAddressForm').bootstrapValidator({
            message: 'This value is not valid',
            container: 'tooltip',
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
                addressName: {
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
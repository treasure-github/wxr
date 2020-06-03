<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订单来货录入</title>
    <%@include file="/common/inc.jsp" %>
</head>
<style>
    label {
        text-align: right;
    }
</style>
<body>
<!-- 编辑模态框 -->
<div id="editGoose" class="modal fade " tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
     aria-hidden="true">
    <div class="modal-dialog modal-lg" style="width:1100px;">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h3 class="modal-title" id="customer">
                    添加货物
                </h3>
            </div>
            <div class="modal-body">
                <div id="toolbar2" class="btn-group">
                    <button id="btn_add2" type="button" class="btn btn-primary" onclick="doAddProduct()">
                        <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>添加
                    </button>
                    <button id="btn_save2" type="button" class="btn btn-primary" onclick="doUpdate()">
                        <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>修改
                    </button>
                </div>
                <div id="tbody2" style="height: 700px;">
                    <table id="myTable2" class="table text-nowrap"></table>
                </div>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
<div class="row">
    <div class="col-lg-12">
        <%--工具栏--%>
        <div id="toolbar" class="btn-group">
            <button id="btn_add" type="button" class="btn btn-primary" onclick="showEdit()">
                <span class="glyphicon glyphicon-edit" aria-hidden="true"></span>编辑货物单
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
    });


    function doAddProduct() {
        //获得当前选项行，获得订单id，传到页面
        var row = $("#myTable2").bootstrapTable('getSelections');
        //创建一个数据，存放数据，用于过滤数据
        var array = new Array();
        var flag = 1;//用于判断是否请求保存数据，1保存，0不保存
        if (row.length <= 0) {
            modle.alert("请选择相对应的商品", "tip");
        } else {
            for (var i = 0; i < row.length; i++) {
                if ((row[i].num - row[i].sdnum < 0) || row[i].sdnum < 0) {
                    modle.alert("信息录入错误,请检查！", "tip");
                    flag = 0;
                    break;
                } else {
                    if (row[i].wczt != 0) {
                        if (row[i].wczt != 1) {
                            if (row[i].wczt != 2) {
                                if (row[i].wczt != 3) {
                                    if (row[i].wczt != 4) {
                                        modle.alert("信息录入错误,请检查！", "tip");
                                        flag = 0;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    array.push(row);
                }
            }
        }
        if (flag == 1 && row.length > 0) {
            $.post(
                "${pageContext.request.contextPath}/cangKu_updateOrderProduct.action",
                {"row": JSON.stringify(row)},
                function (data) {
                    console.log(data)
                    if (data == 1) {
                        modle.alert("操作成功！", "success");
                        $("#editGoose").modal('hide');
                        $("#myTable").bootstrapTable("refresh");
                    } else {
                        modle.alert("操作失败！", "warn");
                    }
                }
            );
        }

    }

    // 启用/禁用 修改
    var check = 1;

    function doUpdate() {
        // $('.editable').editable('toggleDisabled');
        if (0 == check) {
            $('.editable').editable('disable', 'true');
            check = 1;
        } else {
            $('.editable').editable('enable', 'true');
            check = 0;
        }
    }

    function showEdit() {
        var row = $("#myTable").bootstrapTable('getSelections');
        if (row.length <= 0) {
            modle.alert("请选择一行数据", "tip");
            return;
        }
        $('#editGoose').modal('show');
    }

    $("#editGoose").on('show.bs.modal', function () {
        $('.editable').editable('disable', 'true');
        var row = $("#myTable").bootstrapTable('getSelections');
        $('#myTable2').bootstrapTable("destroy").bootstrapTable({
            method: 'get',
            url: '/cangKu_showOrderProductById.action',
            toolbar: '#toolbar2',
            pagination: true,
            classes: 'table table-hover table-sm table-bordered',
            // height: 500,
            search: true,
            showRefresh: true,
            theadClasses: 'thead-dark',
            clickToSelect: true,
            pageSize: 10,
            queryParams: {"id": row[0].id},
            pageList: [10, 20, 50, 100, 200, 500],
            uniqueId: 'ids2',
            columns: [{
                checkbox: true
            }, {
                field: 'producttype',
                title: '类别',
                width: 120,
                align: 'center'
            }, {
                field: 'typenoname',
                title: '型号',
                width: 260,
                align: 'center'
            }, {
                field: 'brand',
                title: '品牌',
                width: 100,
                align: 'center'

            }, {
                field: 'conf',
                title: '特殊备注',
                width: 220,
                align: 'center'
            }, {
                field: 'num',
                title: '需求量',
                width: 100,
                align: 'center'
            }, {
                field: 'sdnum',
                title: '实到量',
                width: 100,
                align: 'center',
                editable: {
                    type: 'text',
                    title: '实到量',
                },
            }, {
                field: 'wczt',
                title: '完成状态',
                width: 120,
                align: 'center',
                editable: {
                    type: 'select',
                    title: '完成状态',
                    source: [{value: "0", text: "未入库"}, {value: "1", text: "入库未丝印"}, {value: "2", text: "入库完成"}]
                },
                validate: function (v) {
                    if (v == '') return '不能为空';
                }
            }, {
                field: 'stockaddress',
                title: '库存地址',
                width: 100,
                align: 'center',
                editable: {
                    type: 'select',
                    title: '库存地址',
                    source: function () {
                        var result = [];
                        $.ajax({
                            url: '/dataType_findStockAddress.action',
                            async: false,
                            type: "get",
                            data: {},
                            dataType: 'json',
                            success: function (data, status) {
                                $.each(data, function (key, value) {
                                    result.push({value: value.saId, text: value.address});
                                });
                            }
                        });
                        return result;
                    }
                }
            }, {
                field: 'remark',
                title: '备注',
                width: 120,
                align: 'center',
                editable: {
                    type: 'text',
                    title: '备注'
                }
            }],
            // 保存
            onEditableSave: function (field, row, oldValue, $el) {
            },
            onLoadSuccess: function () {
                $('.editable').editable('disable', 'true');
            }
        });
    });

    // 初始化表格
    function createTable() {
        $('#myTable').bootstrapTable({
            url: '/cangg_showYWYHWD.action',
            toolbar: '#toolbar',
            pagination: true,
            classes: 'table table-hover table-sm table-bordered',
            // height: 800,
            search: true,
            theadClasses: 'thead-dark',
            clickToSelect: true,
            pageSize: 20,
            pageList: [10, 20, 50, 100, 200, 500],
            uniqueId: 'ids',
            columns: [{
                radio: true
            }, {
                field: 'id',
                title: '订单编号',
                width: 50,
                align: 'center'
            }, {
                field: 'orderdate',
                title: '日期',
                width: 120,
                align: 'center',
                formatter: changeDateFormat
            }, {
                field: 'customername',
                title: '客户',
                width: 120,
                align: 'center'

            }, {
                field: 'username',
                title: '业务员',
                width: 120,
                align: 'center'
            }]
        });
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

    function validateForm() {
    }
</script>
</html>

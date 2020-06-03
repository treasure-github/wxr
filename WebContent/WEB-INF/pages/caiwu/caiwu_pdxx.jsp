<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>排单信息</title>
    <%@include file="/common/inc.jsp" %>
</head>
<style>
    label {
        text-align: right;
    }
</style>
<body>
<div class="row">
    <div class="col-lg-12">
        <form class="searchForm form-inline">
            <div class="form-group date">
                <label for="bdate">开始日期</label>
                <input type="text" class="datetimepicker form-control" name="begintime" id="bdate">
            </div>
            <div class="form-group date">
                <label for="edate">结束日期</label>
                <input type="text" class="datetimepicker form-control" name="endtime" id="edate">
            </div>
            <div class="form-group">
                <label for="wczt">完成状态</label>
                <select class="form-control" name="wczt" id="wczt">
                    <option value="">--请选择--</option>
                    <option value="0">未入库</option>
                    <option value="1">入库未丝印</option>
                    <option value="2">入库完成</option>
                    <option value="3">已打单</option>
                    <option value="4">已发货</option>
                </select>
            </div>
            <div class="form-group">
                <label for="username1">业、客、单、型号</label>
                <input type="email" class="form-control" name="username" id="username1">
            </div>
            <button type="button" class="btn btn-primary" onclick="search()"><i
                    class="fa fa-search"></i>查询
            </button>
        </form>
        <%--工具栏--%>
        <div id="toolbar" class="form-inline">
            <button type="button" class="btn btn-primary" onclick="updateOrder()"><i
                    class="glyphicon glyphicon-edit"></i>修改
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
        creteTable();
        // $.fn.editable.defaults.disabled = 'false';
    });

    function search() {
        var p = $('.searchForm').serializeJson();
        $.ajax({
            url: '/caiwu_findAllOrder.action',
            type: 'post',
            data: p,
            dataType: 'json',
            success: function (data) {
                $("#myTable").bootstrapTable("load", data);
                $('.editable').editable('disable', 'true');
            }
        })
    }

    //TODO 加载慢，后台没分页
    function creteTable() {
        $("#myTable").bootstrapTable({
            url: '/caiwu_findAllOrder.action',
            toolbar: '#toolbar',
            pagination: true,
            classes: 'table table-hover table-sm table-bordered',
            // height: 750,
            clickToSelect: false,
            pageSize: 20,
            pageList: [10, 20, 50, 100, 200, 500],
            fixedColumns: true,
            fixedNumber: 5,
            uniqueId: 'id',
            columns: [
                {checkbox: true},
                {field: 'ordersid', title: '订单编号', width: 140, align: 'center'},
                {field: 'orderdate', title: '日期', width: 120, align: 'center', formatter: changeDateFormat},
                {field: 'customername', title: '客户', width: 80, align: 'center'},
                {field: 'username', title: '业务员', width: 80, align: 'center'},
                {
                    field: 'producttype',
                    title: '类别',
                    width: 100,
                    align: 'center'
                }, {
                    field: 'typenoname',
                    title: '型号',
                    width: 260,
                    align: 'center'
                }, {
                    field: 'conf',
                    title: '特殊备注',
                    width: 260,
                    align: 'center'
                }, {
                    field: 'num',
                    title: '数量',
                    width: 70,
                    align: 'center'
                }, {
                    field: 'brand',
                    title: '品牌',
                    width: 80,
                    align: 'center'
                }, {
                    field: 'sdnum',
                    title: '实到数',
                    width: 70,
                    align: 'center'
                }, {
                    field: 'sendnum',
                    title: '已发量',
                    width: 70,
                    align: 'center'
                }, {
                    field: 'price',
                    title: '单价',
                    width: 70,
                    align: 'center'
                }, {
                    field: 'lessprice',
                    title: '小计',
                    width: 80,
                    align: 'center'
                }, {
                    field: 'sumprice',
                    title: '总金额',
                    width: 80,
                    align: 'center'
                }, {
                    field: 'dingjin',
                    title: '定金',
                    width: 80,
                    align: 'center',
                    editable: {
                        type: 'text'
                    }
                }, {
                    field: 'collectionmoney',
                    title: '尾款',
                    width: 80,
                    align: 'center',
                    editable: {
                        type: 'text'
                    }
                }, {
                    field: 'collectionway',
                    title: '收款方式',
                    width: 80,
                    align: 'center',
                    editable: {
                        type: 'text'
                    }
                }, {
                    field: 'wczt',
                    title: '完成状态',
                    width: 100,
                    align: 'center',
                    formatter: function (value) {
                        if (value == 0) {
                            return '未入库'
                        } else if (value == 1) {
                            return '入库未丝印';
                        } else if (value == 2) {
                            return '入库完成';
                        } else if (value == 3) {
                            return '已打单';
                        } else {
                            return '已发货';
                        }
                    }
                }
            ],
            onEditableSave: function (field, row, oldValue, $el) {
                //TODO 保存不成功也报成功，后台sql问题 修改完成后同一订单编号数据都修改了
                $.ajax({
                    type: "post",
                    url: "/caiwu_updateOderInfo.action",
                    async: false,
                    data: {
                        "ordersid": row.ordersid,
                        "dingjin": row.dingjin,
                        "collectionmoney": row.collectionmoney,
                        "collectionway": row.collectionway
                    },
                    dataType: 'JSON',
                    success: function (data) {
                        modle.alert(data.message, "success");
                        $("#myTable").bootstrapTable('refresh');
                    }
                });
            }, onLoadSuccess: function () {
                $('.editable').editable('disable', 'true');
            }
        });
    }

    // 启用/禁用 修改
    var check = 1;

    function updateOrder() {
        // $('.editable').editable('toggleDisabled');
        if (0 == check) {
            $('.editable').editable('disable', 'true');
            check = 1;
        } else {
            $('.editable').editable('enable', 'true');
            check = 0;
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


</script>
</html>

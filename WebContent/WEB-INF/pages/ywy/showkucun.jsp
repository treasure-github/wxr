<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>库存查询</title>
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
        <%--工具栏--%>
        <div id="toolbar" class="btn-group">

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
    });

    function creteTable() {
        jQuery("#myTable").bootstrapTable({
            url: "/cangKu_findStrock.action",
            method: 'get',
            toolbar: '#toolbar',
            pagination: true,
            classes: 'table table-hover table-sm table-bordered',
            // height: 750,
            search: true,
            sortable: true, //是否启用排序
            sortName: 'stockdate,productname,productno,productpp,username',
            sortOrder: 'asc',
            theadClasses: 'thead-dark',
            clickToSelect: false,
            pageSize: 20,
            pageList: [10, 20, 50, 100, 200, 500],
            uniqueId: 'id',
            columns: [{
                // field: 'id',
                checkbox: true
            }, {
                field: 'productname',
                title: '类别',
                width: 120,
                sortable: true,
                align: 'center'
            }, {
                field: 'productno',
                title: '型号',
                width: 120,
                sortable: true,
                align: 'center'
            }, {
                field: 'productpp',
                title: '品牌',
                width: 120,
                sortable: true,
                align: 'center'
            }, {
                field: 'num',
                title: '数量',
                width: 120,
                align: 'center'
            }, {
                field: 'conf',
                title: '配置',
                width: 260,
                align: 'center'
            }, {
                field: 'remark',
                title: '备注',
                width: 260,
                align: 'center'
            }, {
                field: 'stockaddress',
                title: '库存地址',
                width: 80,
                sortable: true,
                align: 'center'
            }, {
                field: 'username',
                title: '业务员',
                width: 100,
                sortable: true,
                align: 'center'
            }, {
                field: 'stockdate',
                title: '入库日期',
                width: 120,
                sortable: true,
                align: 'center',
                formatter: function (value, row, index) {
                    return changeDateFormat(value)
                }
            }],
            onDblClickRow: function (row) {
                //TODO 双击后。。。
            }
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

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>库存转订单记录</title>
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
            <button id="btn_update" type="button" class="btn btn-primary" onclick="editEnable()">
                <span class="glyphicon glyphicon-minus" aria-hidden="true"></span>修改
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
        // $.fn.editable.defaults.mode = 'popup';//popup
        $.fn.editable.defaults.disabled = 'false';
    });

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

    // 初始化表格
    function createTable() {
        $('#myTable').bootstrapTable({
            url: '/cangKu_findStock2OrderRecord.action',
            toolbar: '#toolbar',
            pagination: true,
            classes: 'table table-hover table-sm table-bordered',
            height: tableHeight,
            search: true,
            showRefresh: true,
            theadClasses: 'thead-dark',
            clickToSelect: false,
            sidePagination: 'server',//指定服务器端分,不然获取不到分页值
            queryParams: function (params) {
                var temp = {
                    rows: params.limit,
                    // offset : params.offset, // SQL语句起始索引
                    page: (params.offset / params.limit) + 1,//当前页索引
                    q: params.search
                }
                return temp;
            },
            paginationShowPageGo: true,
            showJumpTo: true,
            pageNumber: 1,
            pageSize: 20,
            pageList: [10, 20, 50, 100, 200, 500],
            fixedColumns: true,
            fixedNumber: 4,
            uniqueId: 'id',
            columns: [
                {
                    checkbox: true
                },
                {
                    field: 'ordersid',
                    title: '订单号',
                    width: 150,
                    align: 'center'
                }, {
                    field: 'customername',
                    title: '客户',
                    width: 80,
                    align: 'center'
                }, {
                    field: 'username',
                    title: '业务员',
                    width: 80,
                    align: 'center'
                }, {
                    field: 'oldtypename',
                    title: '原类别',
                    width: 90,
                    align: 'center'
                }, {
                    field: 'oldtypenoname',
                    title: '原型号',
                    width: 260,
                    align: 'center'
                }, {
                    field: 'olrbrand',
                    title: '原品牌',
                    width: 90,
                    align: 'center'
                }, {
                    field: 'changnum',
                    title: '转换数量',
                    width: 65,
                    align: 'center'
                }, {
                    field: 'stockaddress',
                    title: '存放地址',
                    width: 65,
                    align: 'center'
                }, {
                    field: 'newtypename',
                    title: '新类别',
                    width: 90,
                    align: 'center'
                }, {
                    field: 'newtypenoname',
                    title: '新型号',
                    width: 260,
                    align: 'center'
                }, {
                    field: 'newbrand',
                    title: '新品牌',
                    width: 90,
                    align: 'center'
                }, {
                    field: 'newconf',
                    title: '新配置',
                    width: 160,
                    align: 'center'
                }, {
                    field: 'wcqk',
                    title: '处理情况',
                    width: 160,
                    align: 'center',
                    editable: {
                        type: 'select',
                        title: '处理情况',
                        source: [{value: "0", text: "未处理"}, {value: "1", text: "已处理"}]
                    }
                }, {
                    field: 'changetime',
                    title: '日期',
                    width: 120,
                    align: 'center',
                    formatter: changeDateFormat
                }
            ], onEditableSave: function (field, row, oldValue, $el) {
                $.ajax({
                    type: "post",
                    url: "/cangKu_changeStock2OrderrecordWCQK.action",
                    data: {
                        "id": row.id,
                        "wcqk": row.wcqk
                    },
                    dataType: 'JSON',
                    success: function (data) {
                        if (data == '0') {
                            modle.alert("更改信息失败！", "warn");
                        }
                    }
                });
            },
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

</script>
</html>
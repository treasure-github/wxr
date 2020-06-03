<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>排单管理</title>
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
            <button type="button" class="btn btn-primary" onclick="exportData()"><i
                    class="glyphicon glyphicon-export"></i>导出数据
            </button>
        </form>
        <%--工具栏--%>
        <%--<div id="toolbar" class="form-inline">
            <button type="button" class="btn btn-primary" onclick="exportData()"><i
                    class="glyphicon glyphicon-export"></i>导出数据
            </button>
        </div>--%>
        <%--表格--%>
        <div id="tbody" class="table-responsive" style="padding-right:50px">
            <table id="myTable" class="table table-bordered text-nowrap"></table>
        </div>
        <form action="${pageContext.request.contextPath}/manager_exportAllOrder.action" method="post"
              id="exportAllOrder">
            <input type="hidden" name="allOrderIds" id="allOrderIds" vaule="">
            <input type="hidden" name="allOrderFlagstatus" id="allOrderFlagstatus" vaule="${status}">
        </form>
    </div>
</div>
</body>

<%--引入script--%>
<%@include file="/common/incfooter.jsp" %>
<script type="text/javascript">
    $(document).ready(function () {
        creteTable();
    });

    function exportData() {
        //获取Datagride的列
        var $rows = $('#myTable').bootstrapTable('getSelections');
        if ($rows.length == 0) {
            $rows = $("#myTable").bootstrapTable('getData');
        }
        $rows = JSON.stringify($rows);
        $("#allOrderIds").val($rows);
        $("#exportAllOrder").submit();
    }


    // 查询
    function search() {
        var param = $('.searchForm').serializeJson();
        $.ajax({
            url: "/manager_findAllOrder.action",
            type: "post",
            data: param,
            success: function (data) {
                data = JSON.parse(data);
                $("#myTable").bootstrapTable("load", data);
                $('.editable').editable('disable', 'true');
            }
        })
    }

    function creteTable() {
        jQuery("#myTable").bootstrapTable({
            url: '/manager_findAllOrder.action',
            method: 'get',
            toolbar: '#toolbar',
            pagination: true,
            classes: 'table table-hover table-sm table-bordered',
            // height: tableHeight,
            // showExport: true,//工具栏上显示导出按钮
            // buttonsAlign:"left",
            // Icons:'glyphicon-export',
            // exportDataType:'basic',
            // exportTypes:['xlsx'],
            theadClasses: 'thead-dark',
            clickToSelect: false,
            pageSize: 20,
            pageList: [10, 20, 50, 100, 200, 500],
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
                    title: '总价',
                    width: 80,
                    align: 'center'
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
                }, {
                    field: 'kunum',
                    title: '库存',
                    width: 200,
                    align: 'center'
                }, {
                    field: 'stockaddress',
                    title: '存放地址',
                    width: 100,
                    align: 'center'

                }, {
                    field: 'skqk',
                    title: '收款情况',
                    width: 110,
                    align: 'center',
                    formatter: function (value) {
                        if (value == 0) {
                            return '未收款'
                        } else if (value == 1) {
                            return '已收款';
                        }
                    }
                }, {
                    field: 'clqk',
                    title: '处理情况',
                    width: 110,
                    align: 'center',
                    formatter: function (value) {
                        if (value == 0) {
                            return '未处理'
                        } else if (value == 1) {
                            return '已处理';
                        }
                    }
                }]
        });
    }

    $("#convert2").on('show.bs.modal', function () {
        creteTable2();
        // 赋值
    })
    $('#convert2').on('hide.bs.modal', function () {
        $('#showCount p').val('');
    });

    function creteTable2() {
        jQuery("#myTable2").bootstrapTable({
            url: '/cangKu_findStrock.action',
            method: 'get',
            toolbar: '#toolbar2',
            pagination: true,
            classes: 'table table-hover table-sm table-bordered',
            height: 550,
            search: true,
            clickToSelect: true,
            pageSize: 20,
            pageList: [10, 20, 50, 100, 200, 500],
            uniqueId: 'id',
            columns: [{
                radio: true
            }, {
                field: 'productname',
                title: '类别',
                width: 120,
                align: 'center'
            }, {
                field: 'productno',
                title: '型号',
                width: 120,
                align: 'center'
            }, {
                field: 'productpp',
                title: '品牌',
                width: 120,
                align: 'center'
            }, {
                field: 'num',
                title: '数量',
                width: 120,
                align: 'center'
            }, {
                field: 'stockaddress',
                title: '存放地址',
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


</script>
</html>

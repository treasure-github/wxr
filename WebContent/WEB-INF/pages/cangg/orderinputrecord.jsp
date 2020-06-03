<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订单来货记录</title>
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
        <div id="toolbar" class="form-inline" style="margin-right: 10px;">
            <button id="btn_add" type="button" class="btn btn-primary pull-right" onclick="exportTable()">
                <span class="glyphicon glyphicon-export" aria-hidden="true"></span>导出
            </button>
            <%--<select id="sel_exportoption" class="form-control">--%>
            <%--<option value="basic">导出当前页</option>--%>
            <%--<option value="all">导出全部</option>--%>
            <%--&lt;%&ndash;<option value="selected">导出选中数据</option>&ndash;%&gt;--%>
            <%--</select>--%>
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
        $('.page-size').change(function () {
            function ajaxUserRequest(params) {
                if ("All" == $(".page-size").text()) {
                    params.data.limit = 2147483647;
                }
            }
        })
    });

    // 设置导出当前、全部
    $("#sel_exportoption").change(function () {
        //刷新参数设置
        $('#myTable').bootstrapTable('refreshOptions', {
            exportDataType: $(this).val()
        });
    });


    function exportTable() {
        $('#myTable').tableExport({
            type: 'xlsx',
            exportDataType: "all",
            escape: 'false',
            fileName: "来货记录",
        });

    }


    // 初始化表格
    function createTable() {
        $('#myTable').bootstrapTable({
            url: '/cangKu_findOrderInputRecord.action',
            toolbar: '#toolbar',
            pagination: true,
            classes: 'table table-hover table-sm table-bordered',
            // height: 800,
            search: true,
            exportDataType: 'basic',
            // searchOnEnterKey: true,
            showRefresh: true,
            sidePagination: 'server',//指定服务器端分,不然获取不到分页值
            queryParams: function (params) {
                var temp = {
                    rows: params.limit,
                    page: (params.offset / params.limit) + 1,//当前页索引
                    q: params.search
                }
                return temp;
            },
            paginationShowPageGo: true,
            showJumpTo: true,
            pageNumber: 1,
            pageSize: 20,
            pageList: [10, 20, 50, 100, 200, 500, 'All'],
            theadClasses: 'thead-dark',
            clickToSelect: false,
            uniqueId: 'id',
            columns: [
                {
                    field: 'rksj',
                    title: '日期',
                    width: 120,
                    align: 'center',
                    formatter: changeDateFormat
                },
                {
                    field: 'ordersid',
                    title: '订单号',
                    width: 120,
                    align: 'center'
                }, {
                    field: 'customername',
                    title: '客户',
                    width: 100,
                    align: 'center'
                }, {
                    field: 'username',
                    title: '业务员',
                    width: 100,
                    align: 'center'
                }, {
                    field: 'typename',
                    title: '类别',
                    width: 100,
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
                    title: '配置',
                    width: 100,
                    align: 'center'
                }, {
                    field: 'num',
                    title: '数量',
                    width: 80,
                    align: 'center'
                }, {
                    field: 'stockaddress',
                    title: '存放地址',
                    width: 80,
                    align: 'center'
                }
            ],
        });
    };

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

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>电商日志</title>
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
                <label for="beginTime">开始时间</label>
                <input type="text" class="datepicker form-control" name="beginTime" id="beginTime">
            </div>
            <div class="form-group date">
                <label for="endTime">结束时间</label>
                <input type="text" class="datepicker form-control" name="endTime" id="endTime">
            </div>
            <div class="form-group">
                <label for="zt">事件类型</label>
                <select id="zt" class="form-control" style="width: 100px;" name="zt">
                    <option value="" selected="selected">全部</option>
                    <option value="添加">添加</option>
                    <option value="删除">删除</option>
                    <option value="修改">修改</option>
                </select>
            </div>
            <div class="form-group date">
                <label for="username">操作员</label>
                <input type="text" class="datepicker form-control" name="username" id="username">
            </div>
            <button type="button" class="btn btn-primary" onclick="search()"><i
                    class="fa fa-search"></i>查询
            </button>
        </form>
    </div>
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
    });

    function search() {
        $('#myTable').bootstrapTable("refresh");
    }

    // 初始化表格
    function createTable() {
        $('#myTable').bootstrapTable({
            url: '/dianShang_findAllMessage.action',
            toolbar: '#toolbar',
            pagination: true,
            classes: 'table table-hover table-sm table-bordered',
            // height: 750,
            theadClasses: 'thead-dark',
            clickToSelect: false,
            sidePagination: 'server',
            queryParams: function (params) {
                return {
                    rows: params.limit,
                    page: (params.offset / params.limit) + 1,//当前页索引
                    "begintime": $("#beginTime").val(),
                    "endtime": $("#endTime").val(),
                    "zt": $("#zt").val(),
                    "username": $("#username").val()
                }
            },
            pageSize: 20,
            pageList: [10, 20, 50, 100, 200, 500],
            uniqueId: 'storeid',
            columns: [{
                field: 'username',
                title: '操作人',
                width: 80,
                align: 'center',
                editor: {
                    type: 'combobox',
                    options: {
                        required: true
                    }
                }
            }, {
                field: 'messager',
                title: '事件',
                width: 280,
                align: 'left',
                editor: {
                    type: 'combobox',
                    options: {
                        required: true
                    }
                }
            }, {
                field: 'type',
                title: '类型',
                width: 60,
                align: 'center',
                editor: {
                    type: 'combobox',
                    options: {
                        required: true
                    }
                }
            }, {
                field: 'messagetime',
                title: '操作时间',
                width: 60,
                align: 'center',
                formatter: changeDateFormat,
                editor: {
                    type: 'numberbox',
                    options: {
                        required: true
                    }
                }
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
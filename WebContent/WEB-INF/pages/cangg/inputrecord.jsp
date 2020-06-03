<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>库存来货记录</title>
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
        <div id="toolbar">
            <div class="btn-group">
                <button id="btn_delete" type="button" class="btn btn-danger"
                        onclick="deleteInputRecord()">
                    <span class="glyphicon glyphicon-minus" aria-hidden="true"></span>删除
                </button>
            </div>
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


    // 复选框删除
    function deleteInputRecord() {
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
                    jQuery.ajax({
                        type: "post",
                        url: "${pageContext.request.contextPath}/cangg_deleteInputRecord.action",
                        dataType: "json",
                        data: {"ids": ids},
                        complete: function () {
                            $("#myTable").bootstrapTable("refresh");
                        }
                    });
                }
            });
        }
    }

    // 初始化表格
    function createTable() {
        $('#myTable').bootstrapTable({
            url: '/lhjl_findInputRecord.action',
            toolbar: '#toolbar',
            pagination: true,
            cache: false,
            classes: 'table table-hover table-sm table-bordered',
            // height: 800,
            search: true,
            sidePagination: 'server',//指定服务器端分,不然获取不到分页值
            showRefresh: true,
            theadClasses: 'thead-dark',
            clickToSelect: false,
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
            pageList: [10, 20, 50, 100, 200, 500],
            uniqueId: 'id',
            columns: [
                {
                    checkbox: true
                }, {
                    field: 'inputdate',
                    title: '日期',
                    width: 120,
                    align: 'center',
                    formatter: changeDateFormat
                }, {
                    field: 'typename',
                    title: '类别',
                    width: 120,
                    align: 'center'
                }, {
                    field: 'typenoname',
                    title: '型号',
                    width: 300,
                    align: 'center'
                }, {
                    field: 'brand',
                    title: '品牌',
                    width: 120,
                    align: 'center'
                }, {
                    field: 'conf',
                    title: '配置',
                    width: 120,
                    align: 'center'
                }, {
                    field: 'num',
                    title: '数量',
                    width: 120,
                    align: 'center'
                }, {
                    field: 'stockaddress',
                    title: '存放区域',
                    width: 120,
                    align: 'center'
                }
            ],
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

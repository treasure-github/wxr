<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>出单信息</title>
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
        <div id="toolbar" class="form-inline">
            <button id="btn_delete" type="button" class="btn btn-danger" style="position: relative"
                    onclick="deleteByCheckBox()">
                <span class="glyphicon glyphicon-minus" aria-hidden="true"></span>作废
            </button>
            <button id="btn_export" type="button" class="btn btn-primary" style="position: relative"
                    onclick="exportTable()">
                <span class="glyphicon glyphicon-export" aria-hidden="true"></span>导出
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

    function exportTable() {
        $('#myTable').tableExport({
            type: 'xlsx',
            exportDataType: "all",
            escape: 'false',
            fileName: "出单信息",
        });
    }


    function deleteByCheckBox() {
        var $rowData = $("#myTable").bootstrapTable('getSelections');
        if ($rowData.length <= 0) {
            modle.alert("请选择需要作废的数据!")
        } else {
            modle.confirm({message: "确认作废选中数据？"}).on(function (r) {
                if (r) {
                    var array = new Array();
                    //确定,发送请求
                    //获取所有选中的取派员的id
                    for (var i = 0; i < $rowData.length; i++) {
                        var staff = $rowData[i];//json对象
                        var id = staff.printorderno;
                        array.push(id);
                    }
                    var ids = array.join(",");//1,2,3,4,5
                    $.ajax({
                        url: "/caiwu_isDeletePrintNO.action",
                        type: 'post',
                        data: {"ids": ids},
                        dataType: 'JSON',
                        success: function (data) {
                            if (data.status == 200) {
                                modle.alert(data.message)
                                $("#myTable").bootstrapTable('refresh');
                            } else {
                                modle.alert("网络出现问题！", "error")
                            }
                        }
                    })
                }
            });
        }
    }


    function createTable() {
        $('#myTable').bootstrapTable({
            url: '/caiwu_findPrintInfo.action',
            toolbar: '#toolbar',
            pagination: true,
            // classes: 'table table-hover table-sm table-bordered',
            height: tableHeight,
            search: true,
            showRefresh: true,
            theadClasses: 'thead-dark',
            showColumns: false,
            clickToSelect: false,
            showExport: false,
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
            uniqueId: 'printorderno',
            columns: [
                {
                    checkbox: true
                },
                {
                    field: 'printorderno',
                    title: '出货单号',
                    width: 120,
                    align: 'center',

                },
                {
                    field: 'isdelete',
                    title: '状态',
                    width: 120,
                    align: 'center'
                },
                {
                    field: 'username',
                    title: '打单人',
                    width: 120,
                    align: 'center'
                }, {
                    field: 'printdate',
                    title: '日期',
                    width: 120,
                    align: 'center',
                    formatter: changeDateFormat
                }
            ]
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

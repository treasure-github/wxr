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
        <div id="toolbar" class="form-inline btn-group">
            <button id="btn_delete" class="btn btn-danger"
                    onclick="deleteByCheckBox()">
                <i class="glyphicon glyphicon-minus"></i>删除
            </button>
            <select id="sel_exportoption" class="form-control">
                <option value="basic">导出当前页</option>
                <option value="all">导出全部</option>
                <option value="selected">导出选中数据</option>
            </select>
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

    // 设置导出当前、全部
    $("#sel_exportoption").change(function () {
        //刷新参数设置
        $('#myTable').bootstrapTable('refreshOptions', {
            exportDataType: $(this).val()
        });
    });

    function exportTable() {
        //获得所有选中的行。
        var rows = $("#grid").datagrid("getSelections");
        if (rows.length <= 0) {
            rows = $("#grid").datagrid("getRows");
        }
        for (var i = 0; i < rows.length; i++) {
            var time = formatDatebox(rows[i].stockdate);
            rows[i].stockdate = time;
            rows[i].id = i + 1;
            if (rows[i].conf == null) {
                rows[i].conf = "";
            }
            if (rows[i].remark == null) {
                rows[i].remark = "";
            }
            if (rows[i].factory == null) {
                rows[i].factory = "";
            }
            if (rows[i].username == null) {
                rows[i].username = "";
            }
        }
        $('#grid').datagrid('toExcel', {
            filename: 'dg_kucun.xls',
            rows: rows,
            worksheet: 'Worksheet'
        });
    }

    function deleteByCheckBox() {
        var $rowData = $("#myTable").bootstrapTable('getSelections');
        if ($rowData.length <= 0) {
            modle.alert("请选择需要删除的数据!", "tip")
        } else {
            modle.confirm({message: "确认删除？"}).on(function (r) {
                if (r) {
                    var array = new Array();
                    //确定,发送请求
                    //获取所有选中的取派员的id
                    for (var i = 0; i < $rowData.length; i++) {
                        var staff = $rowData[i];//json对象
                        var id = staff.id;
                        array.push(id);
                    }
                    var ids = array.join(",");//1,2,3,4,5
                    $.ajax({
                        url: "/cangg_deleteShowKucun.action",
                        type: 'post',
                        data: {"ids": ids},
                        success: function (data) {
                            $("#myTable").bootstrapTable('refresh');
                        }
                    })
                }
            });
        }
    }


    function createTable() {
        $('#myTable').bootstrapTable({
            url: '/cangKu_findStrock.action',
            toolbar: '#toolbar',
            pagination: true,
            // classes: 'table table-hover table-sm table-bordered',
            // height: 800,
            search: true,
            searchOnEnterKey: true,
            showRefresh: true,
            // theadClasses: 'thead-dark',
            showColumns: true,
            clickToSelect: false,
            showExport: true,
            exportDataType: 'basic',
            exportTypes: ['xlsx'],
            exportOptions: {
                fileName: function () {
                    return '库存查询记录'
                },
                ignoreColumn: [0],
                excelstyles: ['', '', 'font-size', 'font-weight']
            },
            Icons: 'glyphicon-export icon-share',
            pageSize: 20,
            pageList: [10, 20, 50, 100, 200, 500],
            uniqueId: 'id',
            columns: [{
                checkbox: true
            }, {
                field: 'productname',
                title: '类别',
                width: 100,
                align: 'center'
            }, {
                field: 'productno',
                title: '型号',
                width: 260,
                align: 'center'
            }, {
                field: 'productpp',
                title: '品牌',
                width: 120,
                align: 'center'
            }, {
                field: 'num',
                title: '数量',
                width: 80,
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
                title: '存放地址',
                width: 80,
                align: 'center'
            }, {
                field: 'stockdate',
                title: '入库日期',
                width: 180,
                sortable: true,
                align: 'center',
                formatter: changeDateFormat
            }, {
                field: 'factory',
                title: '厂商',
                width: 200,
                sortable: true,
                align: 'center'
            }, {
                field: 'username',
                title: '业务员',
                width: 80,
                align: 'center'
            }]
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

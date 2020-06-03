<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订单记录</title>
    <%@include file="/common/inc.jsp" %>
</head>
<style>
    label {
        text-align: right;
    }
</style>
<body>
<div class="modal fade" id="showCount" tabindex="-1" role="dialog" aria-labelledby="showCount">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title">简单统计</h4>
            </div>
            <div class="modal-body">
                <p id="saleMoney"></p>
                <p id="sendMoney"></p>
                <p id="maxcustomer"></p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
            </div>
        </div>
    </div>
</div>
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
                <label for="customer">客户</label>
                <input type="email" class="form-control" name="customername" id="customer"
                       placeholder="">
            </div>
            <select class="form-control" name="wczt">
                <option value="">--请选择--</option>
                <option value="0">未入库</option>
                <option value="1">入库未丝印</option>
                <option value="2">入库完成</option>
                <option value="3">已打单</option>
                <option value="4">已发货</option>
            </select>
            <button type="button" class="btn btn-primary" onclick="search()"><i
                    class="fa fa-search"></i>查询
            </button>
        </form>
        <%--工具栏--%>
        <div id="toolbar" class="form-inline">
            <button type="button" class="btn btn-primary" onclick="countMoney()"><i
                    class="glyphicon glyphicon-copy"></i>统计
            </button>
            <select id="sel_exportoption" class="form-control">
                <option value="">导出当前页</option>
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
        creteTable();
        $.fn.editable.defaults.disabled = 'false';
    });

    // 设置导出当前、全部
    $("#sel_exportoption").change(function () {
        //刷新参数设置
        $('#myTable').bootstrapTable('refreshOptions', {
            exportDataType: $(this).val()
        });
    });


    function search() {
        var p = $('.searchForm').serializeJson();
        $.ajax({
            url: '/salesMan_findOrderFollow.action',
            type: 'post',
            data: p,
            dataType: 'json',
            success: function (data) {
                // {total:200,rows:[{'XXXXX': 'XXXXX'}]} 格式
                $("#myTable").bootstrapTable("load", data)
            }
        })
    }

    function creteTable() {
        jQuery("#myTable").bootstrapTable({
            url: '/salesMan_findOrderFollow.action',
            method: 'get',
            toolbar: '#toolbar',
            pagination: true,
            classes: 'table table-hover table-sm table-bordered',
            // height: 750,
            // sortable: true, //是否启用排序
            // sortOrder: "asc", //排序方式
            // sortName: 'customername', // 要排序的字段
            showExport: true,//工具栏上显示导出按钮
            exportDataType: '',
            exportTypes: ['excel', 'xlsx'],
            // exportButton: $('#export'), //为按钮btn_export 绑定导出事件
            exportOptions: {
                fileName: function () {
                    return '订单记录'
                },
                // 导出数据去除第一列出现"on"
                ignoreColumn: [0]
            },
            worksheetName: '订单记录',  //表格工作区名称
            tableName: '订单记录',
            Icons: 'glyphicon-export icon-share',
            theadClasses: 'thead-dark',
            clickToSelect: false,
            pageSize: 20,
            pageList: [10, 20, 50, 100, 200, 500],
            uniqueId: 'ordersid',
            columns: [
                {
                    checkbox: true
                }, {
                    field: 'ordersid',
                    title: '单号',
                    align: 'center',
                    valign: 'middle',
                    width: 250
                },
                {
                    field: 'orderdate',
                    title: '日期',
                    align: 'center',
                    valign: 'middle',
                    width: 138,
                    formatter: function (value, row, index) {
                        return changeDateFormat(value)
                    }
                },
                {
                    field: 'customername',
                    title: '客户',
                    align: 'center',
                    valign: 'middle',
                    widht: 150
                },
                {
                    field: 'wczt',
                    title: '完成类型',
                    width: 120,
                    align: 'center',
                    valign: 'middle',
                    formatter: function (value, row, index) {
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
                },
                {
                    field: 'producttype',
                    title: '类别',
                    align: 'center',
                    valign: 'middle'
                },
                {
                    field: 'typenoname',
                    title: '型号',
                    align: 'center',
                    valign: 'middle',
                    width: '200px'
                },
                {
                    field: 'conf',
                    title: '配置',
                    align: 'center',
                    valign: 'middle'
                },
                {
                    field: 'brand',
                    title: '品牌',
                    align: 'center',
                    valign: 'middle'
                },
                {
                    field: 'num',
                    title: '数量',
                    align: 'center',
                    valign: 'middle'
                },
                {
                    field: 'sdnum',
                    title: '已到数量',
                    align: 'center',
                    valign: 'middle'
                },
                {
                    field: 'sendnum',
                    title: '已发数量',
                    align: 'center',
                    valign: 'middle'
                },
                {
                    field: 'price',
                    title: '单价',
                    align: 'center',
                    valign: 'middle'
                },
                {
                    field: 'lessprice',
                    title: '小计',
                    align: 'center',
                    valign: 'middle'
                },
                {
                    field: 'stockaddress',
                    title: '存放地址',
                    align: 'center',
                    valign: 'middle'
                }
            ],
            onDblClickRow: function (row) {
                //TODO 修改框
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


    function countMoney() {
        //获得选中的行，
        var rows = $("#myTable").bootstrapTable('getSelections');
        var saleMoney = 0;
        var sendMoney = 0;
        var customermoney = 0;
        var customer = '';
        var arr = new Array()
        //计算哪个客户下单金额最大
        var max = 0;
        if (rows.length <= 0) {
            var rowsum = $("#myTable").bootstrapTable("getData");
            for (var i = 0; i < rowsum.length; i++) {
                if (rowsum[i].wczt == 4) {
                    sendMoney += rowsum[i].lessprice;
                }
                saleMoney += rowsum[i].lessprice;
                //去重
                var flag = 1;
                for (var j = 0; j < arr.length; j++) {
                    if (arr[j] == rowsum[i].customername) {
                        flag = 0;
                        break;
                    }
                }
                if (flag == 1) {
                    arr.push(rowsum[i].customername)
                }
            }
            //计算哪个客户下单金额最大
            for (var i = 0; i < arr.length; i++) {
                customermoney = 0;
                for (var j = 0; j < rowsum.length; j++) {
                    if (arr[i] == rowsum[j].customername) {
                        customermoney += rowsum[j].lessprice;
                    }
                }
                if (customermoney >= max) {
                    customer = arr[i];
                    max = customermoney;
                }

            }

        } else {
            for (var i = 0; i < rows.length; i++) {
                if (rows[i].wczt == 4) {
                    sendMoney += rows[i].lessprice;
                }
                saleMoney += rows[i].lessprice;
                //去重
                var flag = 1;
                for (var j = 0; j < arr.length; j++) {
                    if (arr[j] == rows[i].customername) {
                        flag = 0;
                        break;
                    }
                }
                if (flag == 1) {
                    arr.push(rows[i].customername)
                }
            }
            //计算哪个客户下单金额最大
            for (var i = 0; i < arr.length; i++) {
                customermoney = 0;
                for (var j = 0; j < rows.length; j++) {
                    if (arr[i] == rows[j].customername) {

                        customermoney += rows[j].lessprice;
                    }
                }
                if (customermoney > max) {
                    customer = arr[i];
                    max = customermoney;
                }

            }

        }
        $("#sendMoney").html('已发货总金额: ' + sendMoney + "元")
        $("#saleMoney").html('销售额: ' + saleMoney + "元")
        $("#maxcustomer").html('最大客户-' + customer + ": " + max + "元")
        $('#showCount').modal('show');
    }

    $('#showCount').on('hidden.bs.modal', function () {
        $('#showCount p').val('');
    });

    function validateForm() {
    }
</script>
</html>

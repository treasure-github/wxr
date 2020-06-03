<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>拼多多刷单信息</title>
    <%@include file="/common/inc.jsp" %>
    <%--可输入下拉框--%>
    <link href="<%=request.getContextPath() %>/css/jquery-editable-select.css" rel="stylesheet">
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
            <div class="form-group">
                <%--TODO 可输入下拉框--%>
                <label for="cc1">店铺</label>
                <select id="cc1" class="form-control" name="storeId">
                </select>
            </div>
            <div class="form-group date">
                <label for="beginTime"></label>
                <input type="text" class="datepicker form-control" name="beginTime" id="beginTime">
            </div>
            <div class="form-group date">
                <label for="endTime"></label>
                <input type="text" class="datepicker form-control" name="endTime" id="endTime">
            </div>
            <button type="button" class="btn btn-primary" onclick="search()"><i
                    class="fa fa-search"></i>查询
            </button>
            <div class="col-ms-3 pull-right">
                <div class="form-group">
                    <label for="ztcNum">刷单费用</label>
                    <input type="text" class="form-control" readonly style="width: 100px;" name="zacost"
                           id="zacost" value="0">
                </div>
                <div class="form-group">
                    <label for="ztcNum">刷单商品总费用</label>
                    <input type="text" class="form-control" readonly style="width: 100px;" name="ztcNum"
                           id="ztcNum" value="0">
                </div>
            </div>
        </form>
        <%--工具栏--%>
        <div id="toolbar" class="form-inline">
            <button type="button" class="btn btn-primary" onclick="editEnable()"><i
                    class="glyphicon glyphicon-edit"></i>修改
            </button>
            <button type="button" class="btn btn-danger" onclick="deleteBySelect()"><i
                    class="glyphicon glyphicon-minus"></i>删除
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
<script src="${pageContext.request.contextPath}/js/jquery-editable-select.js"></script>
<script type="text/javascript">
    $(document).ready(function () {
        createTable();
        //TODO 可输入下拉框
        $.ajax({
            url: '/dianShang_findStoreNameByTypeId.action?id=1',
            type: "get",
            async: false,
            dataType: 'JSON',
            success: function (data) {
                var htm = "";
                for (var i = 0; i < data.length; i++) {
                    htm += "<option value='" + data[i].storeid + "'>" + data[i].storename + "</option>";
                }
                $('#cc1').html(htm);
            }
        });

    });

    // 删除
    function deleteBySelect() {
        // 复选框删除
        var $row = jQuery("#myTable").bootstrapTable('getSelections');
        if ($row.length <= 0) {
            modle.alert("请选择需要删除的数据!", "tip");
        } else {
            modle.confirm({message: "你确定要删除该库存？"}).on(function (r) {
                if (r) {
                    var array = new Array();
                    $row.forEach(function (row) {
                        array.push(row.pddorderid);
                    })
                    var ids = array.join(",");
                    $.ajax({
                        type: "GET",
                        url: "${pageContext.request.contextPath}/dianShang_deleteShuadanPddOrder.action",
                        dataType: "json",
                        data: {"ids": ids},
                        complete: function (data) {
                            $("#myTable").bootstrapTable("refresh");
                        }
                    });
                }
            });
        }
    }

    // 查询按钮
    function search() {
        var storeId = $("#cc1").val();
        var beginTime = $("#beginTime").val();
        var endTime = $("#endTime").val();
        if (storeId == "" || beginTime.trim() == "" || endTime.trim() == "") {
            modle.alert("请选择日期或者店铺！", "tip")
            return;
        }
        $("#myTable").bootstrapTable("refresh");
    }

    // 初始化表格
    function createTable() {
        $('#myTable').bootstrapTable({
            url: '/dianShang_findAllShuaDanPddorder.action',
            toolbar: '#toolbar',
            pagination: true,
            classes: 'table table-hover table-sm table-bordered',
            height: tableHeight,
            search: false,
            showRefresh: true,
            theadClasses: 'thead-dark',
            clickToSelect: false,
            sidePagination: 'client',
            queryParams: function (params) {
                return {
                    beginTime: $("#beginTime").val(),
                    endTime: $("#endTime").val(),
                    storeId: $("#cc1").val()
                }
            },
            pageSize: 20,
            pageList: [10, 20, 50, 100, 200, 500],
            fixedColumns: true,
            fixedNumber: 2,//6
            uniqueId: 'pddorderid',
            columns: [
                {checkbox: true},
                {field: 'orderid', title: '订单编号', width: 140, align: 'center'},
                {
                    field: 'zacost',
                    title: '杂费',
                    width: 130,
                    align: 'center',
                    editable: {
                        type: 'text',
                        title: '杂费'
                    }
                }, {
                    field: 'installcost',
                    title: '安装费',
                    width: 80,
                    align: 'center',
                    editable: {
                        type: 'text',
                        title: '安装费'
                    }
                }, {
                    field: 'fixcost',
                    title: '维修费',
                    width: 80,
                    align: 'center',
                    editable: {
                        type: 'text',
                        title: '维修费'
                    }
                },
                {
                    field: 'productsumprice',
                    title: '商品总价(元)',
                    width: 100,
                    align: 'center'
                }, {
                    field: 'storediscount',
                    title: '店铺优惠折扣(元)',
                    width: 100,
                    align: 'center'
                }, {
                    field: 'platformdiscount',
                    title: '平台优惠折扣(元)',
                    width: 120,
                    align: 'center'
                }, {
                    field: 'storeincome',
                    title: '商家实收金额(元)',
                    width: 70,
                    align: 'center'
                }, {
                    field: 'productnum',
                    title: '商品数量(件)',
                    width: 80,
                    align: 'center'
                }, {
                    field: 'receivername',
                    title: '收货人',
                    width: 120,
                    align: 'center'
                }, {
                    field: 'phone',
                    title: '手机',
                    width: 120,
                    align: 'center'
                }, {
                    field: 'province',
                    title: '省',
                    width: 200,
                    align: 'center'
                }, {
                    field: 'sureordertime',
                    title: '订单确认时间',
                    width: 120,
                    formatter: changeDateFormat,
                    align: 'center'
                }, {
                    field: 'custmoerphone',
                    title: '商品规格',
                    width: 260,
                    align: 'center'
                },
                {
                    field: 'expressname',
                    title: '快递',
                    width: 140,
                    align: 'center'
                },
                <%--<shiro:hasPermission name="show-cost">--%>
                {
                    field: 'cost',
                    title: '成本',
                    width: 100,
                    align: 'center'
                },
                <%--</shiro:hasPermission>--%>
                {
                    field: 'expresscost',
                    title: '快递费',
                    width: 100,
                    align: 'center'
                }
            ],
            onEditableSave: function (field, row, oldValue, $el) {
                $.ajax({
                    type: "post",
                    url: "/dianShang_updateInputPddOrder.action",
                    data: {
                        "row": JSON.stringify(row),
                    },
                    dataType: 'JSON',
                    success: function (result) {
                        if (result == 1) {
                            // modle.alert("修改成功！");
                            // $("#myTable").bootstrapTable('refresh');
                        } else {
                            modle.alert("修改失败！", "warn");
                        }
                        $('#myTable').bootstrapTable('refresh');
                    },
                    error: function () {
                        modle.alert('修改失败!', "warn");
                    }
                });
            },
            onLoadSuccess: function () {
                $('.editable').editable('toggleDisabled');
                //加载结束，统计商品金额,杂费金额
                //获得所有的行
                var row = $("#myTable").bootstrapTable("getData");
                var ztcNum = 0;
                var zacost = 0;
                for (var i = 0; i < row.length; i++) {
                    zacost += row[i].zacost;
                    ztcNum += row[i].productsumprice;
                }
                $("#ztcNum").val(Math.floor(ztcNum * 100) / 100);
                $("#zacost").val(Math.floor(zacost * 100) / 100);
            }
        });
    }


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
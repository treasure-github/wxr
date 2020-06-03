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
<%--统计模态框--%>
<div class="modal fade" id="showCount" tabindex="-1" role="dialog" aria-labelledby="showCount">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title">简单统计</h4>
            </div>
            <div class="modal-body">
                <p id="sendMoney"></p>
                <p id="saleMoney"></p>
                <p id="maxcustomer"></p>
                <p id="betterman"></p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
            </div>
        </div>
    </div>
</div>
<!-- 库存转订单 -->
<div id="convert2" class="modal fade" tabindex="1" role="dialog" aria-labelledby="convert2"
     aria-hidden="true">
    <div class="modal-dialog modal-lg" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h3 class="modal-title" id="customer2">
                    库存转订单
                </h3>
            </div>
            <div class="modal-body">
                <form class="convertForm form pull-left" style="width: 30%;">
                    <div class="form-group row">
                        <input readonly type="hidden" class="form-control" name="id" id="id">
                        <label for="customerName" class="col-sm-3 col-form-label">订单号</label>
                        <div class="col-sm-8">
                            <input type="text" readonly class="form-control" name="ordersid" id="ordersid">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="customerName" class="col-sm-3 col-form-label">客户</label>
                        <div class="col-sm-8">
                            <input type="text" readonly class="form-control" name="customername" id="customername">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="username" class="col-sm-3 col-form-label">业务员</label>
                        <div class="col-sm-8">
                            <input type="text" readonly class="form-control" name="username" id="username">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="producttype" class="col-sm-3 col-form-label">类别</label>
                        <div class="col-sm-8">
                            <input type="text" readonly class="form-control" name="producttype" id="producttype">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="typenoname" class="col-sm-3 col-form-label">型号</label>
                        <div class="col-sm-8">
                            <input type="text" readonly class="form-control" name="typenoname" id="typenoname">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="brand" class="col-sm-3 col-form-label">品牌</label>
                        <div class="col-sm-8">
                            <input type="text" readonly class="form-control" name="brand" id="brand">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="conf" class="col-sm-3 col-form-label">配置</label>
                        <div class="col-sm-8">
                            <input type="text" readonly class="form-control" name="conf" id="conf">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="num" class="col-sm-3 col-form-label">数量</label>
                        <div class="col-sm-8">
                            <input type="text" readonly class="form-control" name="num" id="num">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="sdnum" class="col-sm-4 col-form-label">实到数量</label>
                        <div class="col-sm-7">
                            <input type="text" readonly class="form-control" name="sdnum" id="sdnum">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="sendnum" class="col-sm-4 col-form-label">已发数量</label>
                        <div class="col-sm-7">
                            <input type="text" readonly class="form-control" name="sendnum" id="sendnum">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="kunum" class="col-sm-3 col-form-label">库存量</label>
                        <div class="col-sm-8">
                            <input type="text" readonly class="form-control" name="kunum" id="kunum">
                        </div>
                    </div>
                </form>
                <div id="rightPanel">
                    <div id="toolbar2" class="form-inline">
                        <button type="button" class="btn btn-primary" onclick="showInputModle()">
                            <i class="fa fa-info-circle"></i>库存转订单
                        </button>
                    </div>
                    <div id="tbody2" class="table-responsive">
                        <table id="myTable2" class="table table-bordered text-nowrap"></table>
                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                </button>

            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
<div class="modal fade" id="inputModle" tabindex="1" role="dialog" aria-labelledby="inputModle">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title">转换的数量</h4>
            </div>
            <div class="modal-body">
                <form id="inputForm">
                    <label for="inputSL" class="col-sm-4 col-form-label">请输入需要转换的数量</label>
                    <input type="text" class="form-control" required name="inputSL" id="inputSL">
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" onclick="doStockToOrder()"><i
                        class="fa fa-search"></i>确定
                </button>
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
        </form>
        <%--工具栏--%>
        <div id="toolbar" class="form-inline">
            <button type="button" class="btn btn-primary" onclick="updateOrder()"><i
                    class="glyphicon glyphicon-edit"></i>修改
            </button>
            <button type="button" class="btn btn-primary" onclick="deleteOrder()"><i
                    class="glyphicon glyphicon-minus"></i>删除
            </button>
            <button type="button" class="btn btn-primary" onclick="exportOrder()"><i
                    class="glyphicon glyphicon-export"></i>导出订单
            </button>
            <button type="button" class="btn btn-primary" onclick="exportData()"><i
                    class="glyphicon glyphicon-export"></i>导出数据
            </button>
            <button type="button" class="btn btn-primary" onclick="convertOrder1()"><i
                    class="glyphicon glyphicon-retweet"></i>库存转订单
            </button>
            <button type="button" class="btn btn-primary" onclick="convertOrder2()"><i
                    class="glyphicon glyphicon-retweet"></i>订单转库存
            </button>
            <button type="button" class="btn btn-primary" onclick="countMoney()"><i
                    class="glyphicon glyphicon-copy"></i>简单统计
            </button>
        </div>
        <%--表格--%>
        <div id="tbody" class="table-responsive">
            <table id="myTable" class="table table-bordered text-nowrap"></table>
        </div>
        <%--隐藏表单--%>
        <form action="${pageContext.request.contextPath}/manager_exportOrderToFactory.action" method="post"
              id="exportform">
            <input type="hidden" name="ids" id="ids" vaule="">
            <input type="hidden" name="flagstatus" id="flagstatus" vaule="${status}">
        </form>
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
        $.fn.editable.defaults.disabled = 'false';
    });

    $("#convert2").on('hidden.bs.modal', function () {
        $("#convertForm input").val('');
    });
    $("#inputModle").on('hidden.bs.modal', function () {
        $("#inputSL").val('');
    });

    // 导出订单
    function exportOrder() {
        var $row = $("#myTable").bootstrapTable('getSelections');
        if ($row.length <= 0) {
            modle.alert("请选择导出数据!", "tip");
            return false;
        }
        var array = new Array();
        //确定,发送请求
        //获取所有选中的取派员的id
        for (var i = 0; i < $row.length; i++) {
            var staff = $row[i];//json对象
            var id = staff.id;
            array.push(id);
        }
        var ids = array.join(",");//1,2,3,4,5
        $("#ids").val(ids);
        $("#exportform").submit();
    }

    // 导出数据
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

    // 库存转订单窗口打开
    function convertOrder1() {
        var $row = $("#myTable").bootstrapTable('getSelections');
        if ($row.length <= 0) {
            modle.alert("请选择需要处理的数据!", "tip");
        } else if ($row.length != 1) {
            modle.alert("请选择一条数据!", "tip");
        } else {
            $row = $row[0];
            $("#convert2").modal('show');
            $("#ordersid").val($row.ordersid);
            $("#customername").val($row.customername);
            $("#username").val($row.username);
            $("#producttype").val($row.producttype);
            $("#typenoname").val($row.typenoname);
            $("#brand").val($row.brand);
            $("#conf").val($row.conf);
            $("#num").val($row.num);
            $("#sdnum").val($row.sdnum);
            $("#sendnum").val($row.sendnum);
            $("#kunum").val($row.kunum);
            $("#id").val($row.id);

        }
    }

    // 库存转订单
    function doStockToOrder() {
        $("#inputModle").modal('hide');
        //获得这一行的id
        //获得需要转换订单的数据
        //校验数据是否正确
        var row = $("#myTable2").bootstrapTable("getSelections");
        var orderSdnum = $("#sdnum").val();
        var r = $("#inputSL").val();
        var ordernum = $("#num").val();
        var stocknum = row.num;
        if (r + orderSdnum > ordernum) {
            modle.alert("需要转换的数量大于实际数量!")
        } else if (stocknum < r) {
            modle.alert("需要转换的数量超出该行商品数量!")
        } else if (r <= 0 || isNaN(r)) {
            modle.alert("请输入正确的数!")
        } else {
            //进行异步请求
            //向服务器传送商品的id，实到数量。库存的一行数据。
            var p = $(".convertForm").serializeJson();
            $.ajax({
                url: "/manager_stockToOrder.action",
                type: 'post',
                data: {
                    "p": JSON.stringify(p),
                    "row": JSON.stringify(row[0]),
                    "changeNum": r
                },
                success: function (data) {
                    if (data == 0) {
                        //失败
                        modle.alert("转换失败，稍后重试！!")
                    } else {
                        $("#sdnum").val(data)
                        jQuery("#myTable2").bootstrapTable("refresh", {
                            silent: true, //静态刷新
                            url: '/cangKu_findStrock.action'
                        });
                    }
                }
            });
        }
        $('#inputSL').val('');
    }

    function showInputModle() {
        //判断用户是否选中
        var row = $("#myTable2").bootstrapTable("getSelections");
        if (row == null || row == "") {
            modle.alert("请选中商品!");
        } else {
            $("#inputModle").modal('show');
        }
    }

    // 简单统计
    function countMoney() {
        //获得选中的行，
        var rows = $("#myTable").bootstrapTable('getSelections');
        var saleMoney = 0;
        var sendMoney = 0;
        var customermoney = 0;
        var customer = '';
        var username = '';
        var usernamemoney = 0;
        var arr = new Array()
        var arrman = new Array();
        //计算哪个客户下单金额最大
        var max = 0;
        var usernamemax = 0;
        if (rows.length <= 0) {
            var rowsum = $("#myTable").bootstrapTable('getData');
            for (var i = 0; i < rowsum.length; i++) {
                if (rowsum[i].wczt == 4) {
                    sendMoney += rowsum[i].lessprice;
                }
                saleMoney += rowsum[i].lessprice;
                //去重客户
                var flag = 1;
                for (var j = 0; j < arr.length; j++) {
                    if (arr[j] == rowsum[i].customername) {
                        flag = 0;
                        break;
                    }
                }
                if (flag == 1) {
                    console.log(rowsum)
                    arr.push(rowsum[i].customername)
                }
                //去重业务员
                var flagman = 1;
                for (var j = 0; j < arrman.length; j++) {
                    if (arr[j] == rowsum[i].username) {
                        flag = 0;
                        break;
                    }
                }
                if (flagman == 1) {
                    console.log(rowsum[i].username);
                    arrman.push(rowsum[i].username)
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
            //计算哪个业务员下单金额最大
            for (var i = 0; i < arrman.length; i++) {
                usernamemoney = 0;
                for (var j = 0; j < rowsum.length; j++) {
                    if (arrman[i] == rowsum[j].username) {
                        usernamemoney += rowsum[j].lessprice;
                    }
                }

                if (usernamemoney >= usernamemax) {
                    username = arrman[i];
                    usernamemax = usernamemoney;
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

                //去重业务员
                var flagman = 1;
                for (var j = 0; j < arrman.length; j++) {
                    if (arr[j] == rows[i].username) {
                        flag = 0;
                        break;
                    }
                }
                if (flagman == 1) {
                    arrman.push(rows[i].username)
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


            //计算哪个业务员下单金额最大
            for (var i = 0; i < arrman.length; i++) {
                usernamemoney = 0;
                for (var j = 0; j < rows.length; j++) {
                    if (arrman[i] == rows[j].username) {
                        usernamemoney += rows[j].lessprice;
                    }
                }

                if (usernamemoney > usernamemax) {
                    username = arrman[i];
                    usernamemax = usernamemoney;
                }
            }
        }
        $("#sendMoney").html("销售额: " + sendMoney + "元")
        $("#saleMoney").html("已发货总金额: " + saleMoney + "元")
        $("#maxcustomer").html("最大客户: " + customer + "：" + max + "元")
        $("#betterman").html("最佳销售经理: " + username + "：" + usernamemax + "元")
        $('#showCount').modal('show');
    }


    // 订单转库存
    function convertOrder2() {
        var $row = $("#myTable").bootstrapTable('getSelections');
        //用来判断是否已经发货完毕
        var flag = 1;
        for (var i = 0; i < $row.length; i++) {
            if (($row[i].sdnum == $row[i].sendnum && $row[i].num == $row[i].sendnum) || $row[i].num != $row[i].sdnum) {
                flag = 0;
                break;
            }
        }
        if ($row.length <= 0) {
            modle.alert("请选择对应的订单!");
        } else if (flag == 0) {
            modle.alert("商品已发货或者货物未完全入库，无法转入库存!")
        } else {
            $.post(
                "${pageContext.request.contextPath}/manager_orderToStock.action",
                {"rows": JSON.stringify($row)},
                function (data) {
                    if (data == 1) {
                        modle.alert("处理成功");
                        search();
                    } else {
                        modle.alert("网络故障，稍后再试");
                    }
                }
            );
        }
    }

    // 复选框删除
    function deleteOrder() {
        var $row = $("#myTable").bootstrapTable('getSelections');
        if ($row.length <= 0) {
            modle.alert("请选择需要删除的数据!", "tip");
        } else {
            modle.confirm({message: "确认删除选中数据？"}).on(function (r) {
                if (r) {
                    var array = new Array();
                    $row.forEach(function (row) {
                        array.push(row.id);
                    })
                    var ids = array.join(",");
                    jQuery.ajax({
                        type: "post",
                        url: "${pageContext.request.contextPath}/admin_deleteOrderProduct.action",
                        dataType: "json",
                        data: {"ids": ids},
                        complete: function (data) {
                            // modle.alert(data.message);
                            $("#myTable").bootstrapTable("refresh");
                        }
                    });
                }
            });
        }
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
            // height: 750,
            // showExport: true,//工具栏上显示导出按钮
            // buttonsAlign:"left",
            // Icons:'glyphicon-export',
            // exportDataType:'selected',
            // exportTypes:['xlsx'],
            // theadClasses: 'thead-dark',
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
                    field: 'dingjin',
                    title: '定金',
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
                    width: 100,
                    align: 'center'
                }, {
                    field: 'stockaddress',
                    title: '存放地址',
                    width: 100,
                    align: 'center',
                    visible: false
                }, {
                    field: 'skqk',
                    title: '发货方式',
                    width: 110,
                    align: 'center',
                    editable: {
                        type: 'text',
                        title: '发货方式',
                    },
                    validate: function (v) {
                        if (v == '') return '不能为空';
                    }
                }, {
                    field: 'clqk',
                    title: '处理情况',
                    width: 110,
                    align: 'center',
                    editable: {
                        type: 'select',
                        title: '处理情况',
                        source: [{value: "0", text: "未处理"}, {value: "1", text: "已处理"}]
                    },
                    validate: function (v) {
                        if (v == '') return '不能为空';
                    }
                }
            ],
            onLoadSuccess: function () {
                $('.editable').editable('disable', 'true');
            },
            // TODO 原系统未实现功能
            onEditableSave: function (field, row, oldValue, $el) {
                $.ajax({
                    type: "post",
                    url: "/.action",
                    data: row,
                    dataType: 'JSON',
                    success: function (data, status) {

                    },
                    error: function () {
                        modle.alert('修改失败!');
                    }
                });
            }
        });
    }

    $("#convert2").on('show.bs.modal', function () {
        creteTable2();
        // 赋值
    })
    $('#convert2').on('hidden.bs.modal', function () {
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

    // 启用/禁用 修改
    var check = 1;

    function updateOrder() {
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

    // 初始化表单验证
    //TODO 转换表单校验
    function validateForm1() {
        $('form').bootstrapValidator({
            message: 'This value is not valid',
            // container: 'tooltip',
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
                inputSL: {
                    validators: {
                        notEmpty: {
                            message: '不能为空'
                        }
                    }
                }
            }
        });
    }

</script>
</html>

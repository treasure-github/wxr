<%@page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<head>
    <title>出货打单</title>
    <%@include file="/common/inc.jsp" %>
</head>
<style>
    label {
        text-align: right;
    }

    #printeara td {
        height: 25px;
    }

    .puttable td {
        height: 20px;

    }
</style>
<body>
<div id="orderOut" class="modal fade " tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
     aria-hidden="true">
    <div class="modal-dialog modal-lg" style="width:1400px;">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h3 class="modal-title">
                    打单
                </h3>
            </div>
            <div class="modal-body">
                <%--工具栏--%>
                <div id="toolbar2" class="btn-group">
                    <button id="preView" type="button" class="btn btn-primary" onclick="prepareView()">
                        <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>预览
                    </button>
                    <button id="updateCount" type="button" class="btn btn-primary" onclick="updateData()">
                        <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>修改发货数量
                    </button>
                </div>
                <%--表格--%>
                <div id="tbody2" class="table-responsive">
                    <table id="myTable2" class="table table-bordered text-nowrap"></table>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal -->
    </div>
</div>
<%--打印表格--%>
<div id="preViewWin" class="modal fade " tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
     aria-hidden="true">
    <div class="modal-dialog modal-lg" style="margin: 0 auto">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h3 class="modal-title">
                    预览
                </h3>
            </div>
            <div class="modal-body">
                <div id="printeara">
                    <table class="puttable" id="printtable" border="1px " bordercolor="black" cellspacing="0"
                           cellpadding="5" style="text-align: center;margin: 20px 40px;">
                        <thead>
                        <tr>
                            <td colspan="8" style="align-content: center;font-size: 18px;height: 40px">鼎国电器有限公司出货清单</td>
                        </tr>
                        <tr>
                            <td colspan="4" style="align-content: center">地址：广东省佛山市顺德区容桂街道华天北三路6号</td>
                            <td colspan="4" style="align-content: center">
                                财务：白联&nbsp&nbsp仓管：蓝联&nbsp&nbsp客户：红联&nbsp司机：黄联
                            </td>
                        </tr>
                        </thead>
                        <tbody id="printearabody">
                        </tbody>
                    </table>
                </div>
            </div><!-- /.modal-content -->
            <div class="modal-footer">
                <button id="sureprintbtn" type="button" class="btn btn-primary" onClick="printTable()">
                    <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>确认打印
                </button>
            </div>
        </div><!-- /.modal -->
    </div>
</div>
<div class="row">
    <div class="col-lg-12">
        <%--工具栏--%>
        <div id="toolbar" class="btn-group">
            <button id="btn_add" type="button" class="btn btn-primary" onclick="chooseOpen()">
                <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>选择
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
<script language="javascript" src="${pageContext.request.contextPath }/js/jquery.jqprint-0.3.js"></script>
<script language="javascript" src="${pageContext.request.contextPath }/js/jquery-migrate-1.2.1.js"></script>
<script type="text/javascript">
    $(document).ready(function () {
        createTable();
    });
    var selectorder;
    var ORDERNO;

    // 打印
    function printTable() {
        //更新货物状态
        // doAddProduct()
        ORDERNO = 1;
        $("#orderno").text("NO：" + ORDERNO)
        if (ORDERNO != undefined) {
            $("#printtable").jqprint()
        }
        ORDERNO = undefined;
    }

    function doAddProduct() {
        //获得当前选项行，获得订单id，传到页面
        var row = $("#myTable2").bootstrapTable('getSelections');
        //创建一个数据，存放数据，用于过滤数据
        var array = new Array();
        var flag = 1;//用于判断是否请求保存数据，1保存，0不保存
        if (row.length <= 0) {
            modle.alert("请选择相对应的商品", "tip")
        } else {
            for (var i = 0; i < row.length; i++) {
                if (row[i].sdnum == 0) {
                    modle.alert("第" + (i + 1) + "个商品没库存，出货打单失败！", "warn")
                    flag = 0;
                    ORDERNO = undefined;
                    break;
                }
            }
        }
        //可以打单，向后台请求
        if (flag == 1 && row.length > 0) {
            $.ajaxSettings.async = false;
            $.post(
                "${pageContext.request.contextPath}/cangKu_dd_updateOrderProduct.action",
                {"row": JSON.stringify(row)},
                function (data) {
                    if (data.status == 200) {
                        ORDERNO = data.message;
                        modle.alert(data.message, "success");
                    } else {
                        modle.alert(data.message, "warn");
                    }
                }, "json"
            );

        }
    }


    // 预览
    function prepareView() {
        repprint();
        $("#preViewWin").modal('show');
    }

    function updateData() {
        //TODO 修改操作
        modle.alert("功能未实现", "tip")
    }

    function chooseOpen() {
        var $row = $("#myTable").bootstrapTable('getSelections');
        if ($row.length <= 0) {
            modle.alert("请选择需要操作的数据", "tip");
            return;
        }
        $("#orderOut").modal('show');
        createTable2();
    }

    $('#orderOut').on('hidden.bs.modal', function () {

    });

    function createTable2() {
        var $row = $("#myTable").bootstrapTable('getSelections');
        selectorder = $row[0];
        $('#myTable2').bootstrapTable('destroy').bootstrapTable({
            url: '/cangKu_dd_showOrderProductById.action',
            toolbar: '#toolbar2',
            pagination: true,
            classes: 'table table-hover table-sm table-bordered',
            height: 500,
            search: true,
            showRefresh: true,
            theadClasses: 'thead-dark',
            clickToSelect: true,
            queryParams: {id: $row[0].id},
            pageSize: 10,
            pageList: [10, 20, 50, 100, 200, 500],
            uniqueId: 'ids2',
            columns: [{
                checkbox: true,
            }, {
                field: 'producttype',
                title: '类别',
                width: 120,
                align: 'center'
            }, {
                field: 'typenoname',
                title: '型号',
                width: 120,
                align: 'center'
            }, {
                field: 'brand',
                title: '品牌',
                width: 120,
                align: 'center'

            }, {
                field: 'conf',
                title: '特性备注',
                width: 220,
                align: 'center'
            }, {
                field: 'num',
                title: '数量',
                width: 120,
                align: 'center'
            }, {
                field: 'sdnum',
                title: '发货数',
                width: 120,
                align: 'center'
            }, {
                field: 'sendnum',
                title: '已发数',
                width: 120,
                align: 'center'
            }, {
                field: 'price',
                title: '单价',
                width: 120,
                align: 'center'
            }, {
                field: 'lessprice',
                title: '小计',
                width: 120,
                align: 'center'
            }, {
                field: 'wczt',
                title: '完成状态',
                width: 120,
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
                field: 'remark',
                title: '备注',
                width: 250,
                align: 'center'
            }]
        });
    }

    // 初始化表格
    function createTable() {
        $('#myTable').bootstrapTable({
            url: '/cangg_showYWYHWD.action',
            toolbar: '#toolbar',
            pagination: true,
            classes: 'table table-hover table-sm table-bordered',
            height: tableHeight,
            search: true,
            showRefresh: true,
            theadClasses: 'thead-dark',
            clickToSelect: false,
            pageSize: 20,
            pageList: [10, 20, 50, 100, 200, 500],
            uniqueId: 'ids',
            columns: [{
                radio: true
            }, {
                field: 'id',
                title: '订单编号',
                width: 120,
                align: 'center'
            }, {
                field: 'orderdate',
                title: '日期',
                width: 120,
                formatter: changeDateFormat,
                align: 'center'
            }, {
                field: 'customername',
                title: '客户',
                width: 120,
                align: 'center'

            }, {
                field: 'username',
                title: '业务员',
                width: 120,
                align: 'center'
            }, {
                field: 'fhfs',
                title: '发货方式',
                width: 120,
                align: 'center'
            }],
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

    function repprint() {
        //获得选中的行
        var row = $("#myTable2").bootstrapTable('getSelections');
        var printbody = "";
        var sum = 0;//统计数量
        var summoney = 0;//统计总金额
        var printRow = 16;//打印行数
        if (row.length >= 16) {
            printRow = row.length + 3;
        }

        //填写顾客信息
        printbody += "<tr >"
            + " <td style=' width: 200px' COLSPAN='3' align='left'>客户：" + selectorder.customername + "</td>"
            + " <td style=' width: 400px' COLSPAN='4' align='left'>日期：" + currentTime() + "</td>"
            + " <td style=' width: 150px' id='orderno'  align='left'>NO：</td>"
            + "</tr>"

        printbody += "<tr >"
            + "<td style=' width: 30px'>序号</td>"
            + "<td style=' width: 80px'>类别</td>"
            + "<td style=' width: 260px'>型号</td>"
            + "<td style=' width: 30px'>单位</td>"
            + "<td style=' width: 40px'>数量</td>"
            + "<td style=' width: 50px'>单价</td>"
            + "<td style=' width: 80px'>金额</td>"
            + "<td style=' width: 150px'>备注</td>"
            + "</tr>"
        for (var i = 0; i < printRow; i++) {
            if (i == printRow - 3) {
                printbody += "<tr >"
                    + "<td style='width: 30px'>" + (i + 1) + "</td>"
                    + "<td style=' border: 1px solid black;width: 80px'></td>"
                    + "<td style=' width: 260px'></td>"
                    + "<td style=' width: 30px'>总数</td>"
                    + "<td style=' width: 40px'>" + sum + "</td>"
                    + "<td style=' width: 50px'>定金</td>"
                    + "<td style=' width: 80px'>" + 0 + "</td>"
                    + "<td style=' width: 150px'></td>"
                    + "</tr>"
            } else if (i < row.length) {
                sum += row[i].sdnum;
                summoney += row[i].lessprice;
                printbody += "<tr >"
                    + "<td style=' width: 30px'>" + (i + 1) + "</td>"
                    + "<td style='  border: 1px solid black;width: 80px'>" + row[i].producttype + "</td>"
                    + "<td style='  width: 260px'>" + row[i].typenoname + "</td>"
                    + "<td style='  width: 30px'>台</td>"
                    + "<td style='  width: 40px'>" + row[i].sdnum + "</td>"
                    + "<td style='  width: 50px'>" + row[i].price + "</td>"
                    + "<td style='  width: 80px'>" + row[i].lessprice + "</td>"
                    + "<td style='  width: 150px'>" + row[i].brand + "</td>"
                    + "</tr>"
            } else if (i == printRow - 2) { //倒数第二行
                var DXmoney = convertCurrency(summoney);
                printbody += "<tr>"
                    + "<td style=' width: 110px' colspan='2'>大写金额</td>"
                    + "<td style=' width: 290px' colspan='2'>" + DXmoney + "</td>"
                    + "<td style=' width: 40px'></td>"
                    + "<td style=' width: 50px'>合计</td>"
                    + "<td style=' width: 80px'>" + summoney + "</td>"
                    + "<td style=' width: 150px'></td>"
                    + "</tr>"
            } else if (i == printRow - 1) { //最后一行
                //获得选中的订单，取出发货方式
                var fhfs = selectorder.fhfs;
                var username = selectorder.username;

                printbody += "<tr>"
                    + "<td style=' width: 110px' colspan='2'>制单：08</td>"
                    + "<td style=' width: 290px' colspan='2'>发货方式：" + fhfs + "</td>"
                    + "<td style=' width: 170px'align='left' colspan='3'>&nbsp;&nbsp;财务签字：</td>"
                    + "<td style=' width: 150px' >业务员:" + username + "</td>"
                    + "</tr>"
            } else {
                printbody += "<tr >"
                    + "<td style=' width: 30px'>" + (i + 1) + "</td>"
                    + "<td style=' width: 80px'></td>"
                    + "<td style='  width: 260px'></td>"
                    + "<td style='  width: 30px'></td>"
                    + "<td style='  width: 40px'></td>"
                    + "<td style='  width: 50px'></td>"
                    + "<td style='  width: 80px'></td>"
                    + "<td style='  width: 150px'></td>"
                    + "</tr>"
            }

        }
        $("#printearabody").html(printbody)
    };

    function currentTime() {
        var myDate = new Date;
        var year = myDate.getFullYear(); //获取当前年
        var mon = myDate.getMonth() + 1; //获取当前月
        var date = myDate.getDate(); //获取当前日
        var h = myDate.getHours();//获取当前小时数(0-23)
        var m = myDate.getMinutes();//获取当前分钟数(0-59)
        var s = myDate.getSeconds();//获取当前秒
        return year + "-" + mon + "-" + date + "&nbsp" + h + ":" + m + ":" + s;
    }

    function convertCurrency(money) {
        //汉字的数字
        var cnNums = new Array('零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖');
        //基本单位
        var cnIntRadice = new Array('', '拾', '佰', '仟');
        //对应整数部分扩展单位
        var cnIntUnits = new Array('', '万', '亿', '兆');
        //对应小数部分单位
        var cnDecUnits = new Array('角', '分', '毫', '厘');
        //整数金额时后面跟的字符
        var cnInteger = '整';
        //整型完以后的单位
        var cnIntLast = '元';
        //最大处理的数字
        var maxNum = 999999999999999.9999;
        //金额整数部分
        var integerNum;
        //金额小数部分
        var decimalNum;
        //输出的中文金额字符串
        var chineseStr = '';
        //分离金额后用的数组，预定义
        var parts;
        if (money == '') {
            return '';
        }
        money = parseFloat(money);
        if (money >= maxNum) {
            //超出最大处理数字
            return '';
        }
        if (money == 0) {
            chineseStr = cnNums[0] + cnIntLast + cnInteger;
            return chineseStr;
        }
        //转换为字符串
        money = money.toString();
        if (money.indexOf('.') == -1) {
            integerNum = money;
            decimalNum = '';
        } else {
            parts = money.split('.');
            integerNum = parts[0];
            decimalNum = parts[1].substr(0, 4);
        }
        //获取整型部分转换
        if (parseInt(integerNum, 10) > 0) {
            var zeroCount = 0;
            var IntLen = integerNum.length;
            for (var i = 0; i < IntLen; i++) {
                var n = integerNum.substr(i, 1);
                var p = IntLen - i - 1;
                var q = p / 4;
                var m = p % 4;
                if (n == '0') {
                    zeroCount++;
                } else {
                    if (zeroCount > 0) {
                        chineseStr += cnNums[0];
                    }
                    //归零
                    zeroCount = 0;
                    chineseStr += cnNums[parseInt(n)] + cnIntRadice[m];
                }
                if (m == 0 && zeroCount < 4) {
                    chineseStr += cnIntUnits[q];
                }
            }
            chineseStr += cnIntLast;
        }
        //小数部分
        if (decimalNum != '') {
            var decLen = decimalNum.length;
            for (var i = 0; i < decLen; i++) {
                var n = decimalNum.substr(i, 1);
                if (n != '0') {
                    chineseStr += cnNums[Number(n)] + cnDecUnits[i];
                }
            }
        }
        if (chineseStr == '') {
            chineseStr += cnNums[0] + cnIntLast + cnInteger;
        } else if (decimalNum == '') {
            chineseStr += cnInteger;
        }
        return chineseStr;
    }


    function validateForm() {
    }
</script>
</html>

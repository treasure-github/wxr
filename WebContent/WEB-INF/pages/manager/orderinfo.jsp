<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订单信息</title>
    <%@include file="/common/inc.jsp" %>
</head>
<style>
    label {
        text-align: right;
    }
</style>
<body>
<!-- 修改模态框 -->
<div id="myModalLabel" class="modal fade " id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
     aria-hidden="true">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h3 class="modal-title" id="customer">
                    新增客户
                </h3>
            </div>
            <div class="modal-body">
                <form class="myForm form">
                    <div class="form-group row">
                        <label for="customerName" class="col-sm-2 col-form-label">客户姓名</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="customername" id="customerName">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">性别</label>
                        <div class="col-sm-6">
                            <select class="form-control" name="gender">
                                <option>男</option>
                                <option>女</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="phone" class="col-sm-2 col-form-label">用户电话</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="customerphone" id="phone">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="expressName" class="col-sm-2 col-form-label">物流名称</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="wuliuname" id="expressName">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="expressPhone" class="col-sm-2 col-form-label">物流电话</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="wuliuphone" id="expressPhone">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="expressAddress" class="col-sm-2 col-form-label">物流地址</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="wuliuaddress" id="expressAddress">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="customerAddress" class="col-sm-2 col-form-label">客户地址</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="customeraddress" id="customerAddress">
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                        </button>
                        <button type="submit" name="submit" class="btn btn-primary" onclick="addCustomer()">提交</button>
                    </div>
                </form>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
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
                <label for="username">业务员或客户</label>
                <input type="email" class="form-control" name="username"
                       id="username">
            </div>
            <button type="button" class="btn btn-primary" onclick="searchInfo()"><i
                    class="fa fa-search"></i>查询
            </button>
        </form>
        <%--工具栏--%>
        <div id="toolbar" class="btn-group">
            <button id="btn_update" type="button" class="btn btn-primary" onclick="editEnable()">
                <span class="glyphicon glyphicon-edit" aria-hidden="true"></span>修改
            </button>
            <button id="btn_delete" type="button" class="btn btn-danger" onclick="doDelete()">
                <span class="glyphicon glyphicon-minus" aria-hidden="true"></span>删除
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

    //TODO 查询条件有问题
    function searchInfo() {
        var serializeJSON = $(".searchForm").serializeJSON();
        $.ajax({
            url: "/manager_findAllOrderInfo.action",
            type: 'post',
            data: serializeJSON,
            success: function (data) {
                data = JSON.parse(data);
                $("#myTable").bootstrapTable('load', data);
            }
        })

    }

    //TODO 原系统修改未实现
    function editEnable() {
        modle.alert("功能未实现", "tip")
    }

    function doDelete() {
        //获取数据表格中所有选中的行，返回数组对象
        var rows = $("#myTable").bootstrapTable('getSelections');
        if (rows.length == 0) {
            //没有选中记录，弹出提示
            modle.alert('请选择需要的信息!', "tip");
        } else {
            //选中了取派员,弹出确认框
            modle.confirm({message: "你确定要删除?"}).on(function (y) {
                if (y) {
                    var array = new Array();
                    //确定,发送请求
                    //获取所有选中的取派员的id
                    for (var i = 0; i < rows.length; i++) {
                        var staff = rows[i];//json对象
                        var id = staff.id;
                        array.push(id);
                    }
                    var ids = array.join(",");//1,2,3,4,5
                    //异步加载，判断是否还有子订单，如果有，不能进行删除。
                    $.ajax({
                        type: "post",
                        url: "${pageContext.request.contextPath}/admin_deleteOrder.action",
                        dataType: "json",
                        data: {"ids": ids},
                        success: function (data) {
                            data = JSON.parse(data);
                            if (data == 1) {
                                modle.alert("删除成功！", "success");
                                $("#myTable").bootstrapTable("refresh", {
                                    silent: true, //静态刷新
                                    url: '/manager_findAllOrderInfo.action'
                                });
                            } else {
                                //有子订单，删除失败
                                modle.alert("选择的订单中还有商品，不可以删除！", "tip");
                            }
                        }
                    });
                }
            });
        }
    }

    // 初始化表格
    function createTable() {
        $('#myTable').bootstrapTable({
            url: '/manager_findAllOrderInfo.action',
            toolbar: '#toolbar',
            pagination: true,
            classes: 'table table-hover table-sm table-bordered',
            // height: 750,
            // search: true,
            // showRefresh: true,
            theadClasses: 'thead-dark',
            clickToSelect: false,
            pageSize: 20,
            pageList: [10, 20, 50, 100, 200, 500],
            uniqueId: 'id',
            columns: [{
                checkbox: true,
            }, {
                field: 'ids',
                visible: false
            }, {
                field: 'id',
                title: '订单编号',
                width: 140,
                align: 'center'
            }, {
                field: 'orderdate',
                title: '日期',
                width: 120,
                align: 'center',
                formatter: changeDateFormat
            }, {
                field: 'customername',
                title: '客户',
                width: 120,
                align: 'center'
            }, {
                field: 'username',
                title: '业务员',
                width: 80,
                align: 'center'
            }, {
                field: 'wczt',
                title: '完成状态',
                width: 100,
                align: 'center',
                formatter: function (value) {
                    if (value == 0) {
                        return '未完成'
                    } else {
                        return '已完成';
                    }
                }
            }, {
                field: 'dingjin',
                title: '定金',
                width: 100,
                align: 'center'
            }, {
                field: 'sumprice',
                title: '总价',
                width: 80,
                align: 'center'
            }, {
                field: 'fhfs',
                title: '发货方式',
                width: 120,
                align: 'center'
            }, {
                field: 'wuliuname',
                title: '物流名称',
                width: 120,
                align: 'center'
            }, {
                field: 'wuliuphone',
                title: '物流电话',
                width: 120,
                align: 'center'
            }, {
                field: 'wuliuaddress',
                title: '物流地址',
                width: 300,
                align: 'center'
            }, {
                field: 'customerphone',
                title: '客户电话',
                width: 120,
                align: 'center'
            }, {
                field: 'customeraddress',
                title: '客户地址',
                width: 300,
                align: 'center'
            }, {
                field: 'bz',
                title: '备注',
                width: 300,
                align: 'center'
            }
            ],
            onEditableSave: function (field, row, oldValue, $el) {
                $.ajax({
                    type: "post",
                    url: "/index_updateCustomer.action",
                    data: {
                        "id": row.id, "gender": row.gender, "wuliuname": row.wuliuname, "wuliuphone": row.wuliuphone,
                        "wuliuaddress": row.wuliuaddress, "customeraddress": row.customeraddress
                    },
                    dataType: 'JSON',
                    success: function (data, status) {
                        // if (status == "success") {
                        //     setMsg('tip', '修改成功!');
                        // }
                    },
                    error: function () {
                        modle.alert("修改失败!", "error");
                    }
                });
            },
            onLoadSuccess: function () {
                $('.editable').editable('disable', 'true');
            },
            onDblClickRow: function (row) {
                //TODO 修改框
                // $('#customerDetail').modal('show');
            }
        })
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

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订单转库存记录</title>
    <%@include file="/common/inc.jsp" %>
</head>
<style>
    label {
        text-align: right;
    }
    /*table{*/
        /*table-layout:fixed;*/
    /*}*/
    /*td{*/
        /*width:100%;*/
        /*!*word-break:keep-all;!* 不换行 *!*!*/
        /*white-space:nowrap;!* 不换行 *!*/
        /*overflow:hidden;!* 内容超出宽度时隐藏超出部分的内容 *!*/
        /*text-overflow:ellipsis;!* 当对象内文本溢出时显示省略标记(...) ；需与overflow:hidden;一起使用*!*/
        /*-o-text-overflow:ellipsis;*/
        /*-icab-text-overflow: ellipsis;*/
        /*-khtml-text-overflow: ellipsis;*/
        /*-moz-text-overflow: ellipsis;*/
        /*-webkit-text-overflow: ellipsis;*/
    /*}*/
</style>
<body>
<!-- 新增模态框 -->
<div id="myModalLabel" class="modal fade " id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
     aria-hidden="true">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h3 class="modal-title" id="customer">
                    新增退货信息
                </h3>
            </div>
            <div class="modal-body">
                <form class="myForm form">
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">店铺名称</label>
                        <div class="col-sm-6">
                            <select class="form-control" name="storename" id="storename">
                                <option value="中腾">中腾</option>
                                <option value="海枝">海枝</option>
                                <option value="海盛">海盛</option>
                                <option value="百可">百可</option>
                                <option value="淘宝陈">淘宝陈</option>
                                <option value="淘宝江">淘宝江</option>
                                <option value="淘宝郭">淘宝郭</option>
                                <option value="淘宝黄">淘宝黄</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="orderid" class="col-sm-2 col-form-label">订单编号</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="orderid" id="orderid">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="customerinfo" class="col-sm-2 col-form-label">用户信息</label>
                        <div class="col-sm-6">
                            <%--<input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"--%>
                            <%--class="form-control" name="customerinfo" id="customerinfo" >--%>
                            <textarea type="text" class="form-control" name="customerinfo" id="customerinfo"></textarea>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="product" class="col-sm-2 col-form-label">商品类别</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="product" id="product">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="oldno" class="col-sm-2 col-form-label">原快递单号</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="oldno" id="oldno">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="backno" class="col-sm-2 col-form-label">回退单号</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="backno" id="backno">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="registmark" class="col-sm-2 col-form-label">登记备注</label>
                        <div class="col-sm-6">
                            <%--<input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"--%>
                            <%--class="form-control" name="registmark" id="registmark">--%>
                            <textarea type="text" class="form-control" name="registmark" id="registmark"></textarea>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                        <button type="button" name="submit" class="btn btn-primary" onclick="addOrderBack()">提交</button>
                    </div>
                </form>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
<div id="markWin"  class="modal fade" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">选择备注</h4>
            </div>
            <div class="modal-body">
                <div class="form-group row">
                    <label class="col-sm-3 col-form-label">签收备注</label>
                    <div class="col-sm-6">
                        <select class="form-control" name="mark" id="mark">
                            <option value="快递入仓已签收">快递入仓已签收</option>
                            <option value="快递未仓已签收">快递未仓已签收</option>
                            <option value="快递破损">快递破损</option>
                            <option value="快递非实际商品">快递非实际商品</option>
                            <option value="未收到快递">未收到快递</option>
                        </select>
                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button id="finallySure" type="button" class="btn btn-primary">确定</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->


<div class="row">
    <div class="col-lg-12">
        <%--工具栏--%>
        <div id="toolbar" class="btn-group">
            <button id="btn_update1" type="button" class="btn btn-primary" onclick="addWin()">
                <span class="glyphicon glyphicon-edit" aria-hidden="true"></span>新增
            </button>
            <button id="btn_update2" type="button" class="btn btn-primary" onclick="agreeRefund()">
                <span class="fa fa-handshake-o" aria-hidden="true"></span>同意退款
            </button>
            <button id="btn_update3" type="button" class="btn btn-warning" onclick="disagreeRefund()">
                <span class="fa fa-thumbs-down" aria-hidden="true"></span>拒绝退款
            </button>
            <button id="btn_update4" type="button" class="btn btn-success" onclick="signIn()">
                <span class="fa fa-clipboard" aria-hidden="true"></span>签收
            </button>
            <button id="btn_update5" type="button" class="btn btn-danger" onclick="deny()">
                <span class="fa fa-ban" aria-hidden="true"></span>拒收
            </button>
        </div>
        <%--表格--%>
        <div id="tbody" class="table-responsive">
            <table id="myTable" class="table table-bordered  text-nowrap"></table>
        </div>
    </div>
</div>
</body>

<%--引入script--%>
<%@include file="/common/incfooter.jsp" %>
<script type="text/javascript">
    $(document).ready(function () {
        createTable();
        $.fn.editable.defaults.mode = 'popup';//inline popup
    });


    // 同意退款
    function agreeRefund() {
        debugger
        var rows = $("#myTable").bootstrapTable('getSelections');
        if (rows.length == 0) {
            modle.alert("请选择需要处理的数据！", "tip")
            return;
        }
        if(rows.length>1){
            modle.alert("请选择一条数据！", "warn")
            return;
        }
        if (rows[0].handlereason != undefined) {
            modle.alert("大叫三声我是猪才可以更改！", "warn")
            return;
        }
        $.ajax({
            url:"${pageContext.request.contextPath}/dianshang_updateOrderRefund.action",
            data: {"orderid": rows[0].orderid, "handlereason": '同意退款'},
            dataType:'json',
            success:function (data) {
                modle.alert(data.message, "success")
            },
            error:function (data) {
                modle.alert('操作失败！', "warn")
            }
        })
    }

    // 拒绝退款
    function disagreeRefund() {
        var rows = $("#myTable").bootstrapTable('getSelections');
        if (rows.length == 0) {
            modle.alert("请选择需要处理的数据！", "tip")
            return;
        }
        if(rows.length>1){
            modle.alert("请选择一条数据！", "warn")
            return;
        }
        if (rows[0].handlereason != undefined) {
            modle.alert("大叫三声我是猪才可以更改！", "warn")
            return;
        }
        $.ajax({
            url:"${pageContext.request.contextPath}/dianshang_updateOrderRefund.action",
            data: {"orderid": rows[0].orderid, "handlereason": '拒绝退款'},
            dataType:'json',
            success:function (data) {
                modle.alert(data.message, "success")
            },
            error:function (data) {
                modle.alert('操作失败！', "warn")
            }
        })
    }

    var signstatu ='';
    // 签收
    function signIn() {
        signstatu = '签收';
        //获取数据表格中所有选中的行，返回数组对象
        var rows = $("#myTable").bootstrapTable('getSelections');
        if (rows.length == 0) {
            modle.alert("请选择需要处理的数据！", "tip")
            return;
        }
        if (rows[0].handlereason != undefined) {
            modle.alert("大叫三声我是猪才可以更改！", "warn")
            return;
        }
        $('#markWin').modal('show');
    }
    // 拒签
    function deny() {
        signstatu = '拒签';
        //获取数据表格中所有选中的行，返回数组对象
        var rows = $("#myTable").bootstrapTable('getSelections');
        if (rows.length == 0) {
            modle.alert("请选择需要处理的数据！", "tip")
            return;
        }
        if (rows[0].handlereason != undefined) {
            modle.alert("大叫三声我是猪才可以更改！", "warn")
            return;
        }
        $('#markWin').modal('show');
    }

    $("#finallySure").on('click',function (e) {
        $('#markWin').modal('hide');
        //点击确定时候，获得物流信息,提交表单
        var signmark=$('#mark').val();
        console.log(signmark)
        var rows = $("#myTable").bootstrapTable('getSelections');
        $.ajax({
            url: "${pageContext.request.contextPath}/dianshang_updateOrderBackToReject.action",
            data:{"orderid":rows[0].orderid,"signmark":signmark,"signstatu":signstatu},
            dataType:'json',
            success:function (data) {
                modle.alert(data.message, "success")
            },
            error:function (data) {
                modle.alert('操作失败！', "warn")
            }
        })
    })

    //新增回退订单信息
    function addOrderBack() {
        $('.myForm').data('bootstrapValidator').validate();
        if (!$('.myForm').data('bootstrapValidator').isValid()) {
            return;
        }
        var p = $(".myForm").serializeJson();
        $.ajax({
            url: '${pageContext.request.contextPath}/index_addOrderBackInfo.action',
            data: {"p": JSON.stringify(p)},
            dataType:'json',
            success: function (data) {
                if (data.status == '200') {
                    modle.alert("添加成功", "success");
                } else {
                    modle.alert(data.message, "warn");
                }
            },
            error: function (data) {
                modle.alert("系统错误，添加失败！", "error");
            }
        })
    }

    // 新增窗口
    function addWin() {
        $('#myModalLabel').modal('show');
        validateForm();
    }

    // 窗口关闭
    $('#myModalLabel').on('hidden.bs.modal', function () {
        // 表单重置
        $('#myModalLabel input').val('');
        $(".myForm").data('bootstrapValidator').destroy();
        $('.myForm').data('bootstrapValidator', null);
        validateForm();
    });


    // 初始化表格
    function createTable() {
        $('#myTable').bootstrapTable('destroy').bootstrapTable({
            url: '/dianshang_findOrderBackInfo.action',
            toolbar: '#toolbar',
            pagination: true,
            classes: 'table table-hover table-sm table-bordered',
            // height: tableHeight,
            search: true,
            showRefresh: true,
            theadClasses: 'thead-dark',
            clickToSelect: true,
            searchOnEnterKey: true,
            sidePagination: 'server',
            queryParams: function (params) {
                return {
                    rows: params.limit,
                    cruPage: (params.offset / params.limit) + 1,
                    q: params.search
                };
            },
            paginationShowPageGo: true,
            showJumpTo: true,
            pageNumber: 1,
            pageSize: 20,
            pageList: [10, 20, 50, 100],
            uniqueId: 'id',
            columns: [
                {
                    radio: true
                },
                {
                    field: 'storename',
                    title: '店铺名',
                    width: 150,
                    align: 'left',
                    sortable:true
                }, {
                    field: 'orderid',
                    title: '订单编号',
                    width: 150,
                    align: 'left'
                }, {
                    field: 'customerinfo',
                    title: '用户信息',
                    width: 200,
                    align: 'left',
                    // editable: {
                    //     type: 'text',
                    //     title: '用户信息'
                    // }
                }, {
                    field: 'product',
                    title: '商品',
                    width: 100,
                    align: 'left'
                }, {
                    field: 'oldno',
                    title: '原单号',
                    width: 150,
                    align: 'left'
                }, {
                    field: 'backno',
                    title: '返回单号',
                    width: 150,
                    align: 'left'
                },
                {field: 'registname',
                    title: '登记人',
                    width: 120,
                    align: 'left',
                    // editable: {
                    //     type: 'text',
                    //     title: '登记人',
                    //     validate: function (v) {
                    //         if (v == '') return '不能为空';
                    //     }
                    // }
                }, {
                    field: 'registtime',
                    title: '登记时间',
                    width: 200,
                    align: 'left',
                    formatter: changeDateFormat
                }, {
                    field: 'registmark',
                    title: '登记备注',
                    width: 200,
                    align: 'left',
                    // editable: {
                    //     type: 'text',
                    //     title: '登记备注'
                    // }
                }, {
                    field: 'handlename',
                    title: '处理人',
                    width: 100,
                    align: 'left',
                    // editable: {
                    //     type: 'text',
                    //     title: '处理人'
                    // }
                }, {
                    field: 'handlereason',
                    title: '处理原因',
                    width: 120,
                    align: 'left'
                }, {
                    field: 'handletime',
                    title: '处理时间',
                    width: 100,
                    align: 'left',
                    formatter: changeDateFormat
                }, {
                    field: 'basename',
                    title: '签收人',
                    width: 100,
                    align: 'left'
                }, {
                    field: 'signstatu',
                    title: '签收状态',
                    width: 100,
                    align: 'left'
                }, {
                    field: 'signmark',
                    title: '签收备注',
                    width: 100,
                    align: 'left'
                }, {
                    field: 'signtime',
                    title: '签收时间',
                    width: 100,
                    align: 'left',
                    formatter: changeDateFormat
                }
            ], onEditableSave: function (field, row, oldValue, $el) {

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

    // 初始化表单验证
    function validateForm() {
        $('form').bootstrapValidator({
            message: 'This value is not valid',
            container: 'tooltip',
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
                orderid: {
                    validators: {
                        notEmpty: {
                            message: '不能为空'
                        },
                        stringLength: {
                            min: 5,
                            message: '长度不能小于5位字符'
                        }
                    }
                },
                oldno: {
                    validators: {
                        notEmpty: {
                            message: '不能为空'
                        },
                        stringLength: {
                            min: 5,
                            message: '长度不能小于5位字符'
                        }
                    }
                }
            }
        });
    }
</script>
</html>
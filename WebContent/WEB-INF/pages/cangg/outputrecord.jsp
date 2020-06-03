<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>打单记录</title>
    <%@include file="/common/inc.jsp" %>
</head>
<style>
    label {
        text-align: right;
    }
</style>
<body>
<div id="pressesId" class="modal fade " tabindex="-1" role="dialog" aria-labelledby="pressesId"
     aria-hidden="true">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h3 class="modal-title" id="customer">
                    物流信息
                </h3>
            </div>
            <div class="modal-body">
                <form class="myForm form">
                    <div class="form-group row">
                        <label for="addwlInfo_wlno" class="col-sm-2 col-form-label">物流单号</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="wlno" id="addwlInfo_wlno">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="addwlInfo_skfs" class="col-sm-2 col-form-label">收款方式</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="skfs" id="addwlInfo_skfs">
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                        </button>
                        <button type="button" class="btn btn-primary" onclick="checkOutGoose()">提交
                        </button>
                    </div>
                </form>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
<div class="row">
    <div class="col-lg-12">
        <%--工具栏--%>
        <div id="toolbar" class="btn-group">
            <button id="btn_add" type="button" class="btn btn-primary" onclick="showInputPress()">
                <span class="glyphicon glyphicon-share" aria-hidden="true"></span>出货
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
        validateForm();
    });

    // 确认出货
    function checkOutGoose() {
        $('.myForm').data('bootstrapValidator').validate();
        if (!$('.myForm').data('bootstrapValidator').isValid()) {
            return;
        }
        var row = $("#myTable").bootstrapTable('getSelections');
        $.ajax({
            url: '/cangKu_ch_updateOrderProduct.action',
            type: 'post',
            data: {
                row: JSON.stringify(row),
                "wlno": $("#addwlInfo_wlno").val(),
                "skfs": $("#addwlInfo_skfs").val()
            },
            dataType: 'json',
            success: function (data) {
                console.log(data)
                if (data == 0) {
                    modle.alert("操作失败！", "warn")
                } else {
                    modle.alert("操作成功！", "success")
                    $('#pressesId').modal("hide");
                }
            }
        })
    }

    $('#pressesId').on('hide.bs.modal', function () {
        $(".myForm input").val('');
        $(".myForm").data('bootstrapValidator').destroy();
        $('.myForm').data('bootstrapValidator', null);
        validateForm();
    })

    //出货窗口
    function showInputPress() {
        var row = $("#myTable").bootstrapTable('getSelections');
        if (row.length <= 0) {
            modle.alert("请选择对应商品", "tip");
            return;
        }
        var flag = 1;//用于判断是否请求保存数据，1保存，0不保
        for (var i = 0; i < row.length; i++) {
            if (row[i].wczt == 4) {
                modle.alert("出货单号为：" + row[i].ordersid + ",该商品已发货!", "tip");
                flag = 0;
                break;
            }
        }
        if (flag == 1 && row.length > 0) {
            //打开窗口，输入物流信息
            $("#pressesId").modal("show");
        }
    }

    // 初始化表格
    function createTable() {
        $('#myTable').bootstrapTable('destroy').bootstrapTable({
            url: '/cangKu_showOutputRecord.action',
            toolbar: '#toolbar',
            pagination: true,
            // height: 1000,
            search: true,
            showRefresh: true,
            theadClasses: 'thead-dark',
            clickToSelect: true,
            sidePagination: 'server',//指定服务器端分,不然获取不到分页值
            queryParams: function (params) {
                var temp = {
                    rows: params.limit,
                    page: (params.offset / params.limit) + 1,//当前页索引
                    q: params.search
                }
                return temp;
            },
            pageNumber: 1,
            pageSize: 20,
            pageList: [10, 20, 50, 100, 200],
            uniqueId: 'ddrecordid',
            columns: [
                {
                    checkbox: true,
                    width: '10'
                },
                {
                    field: 'id',
                    visible: false
                },
                {
                    field: 'no',
                    title: '序号',
                    sortable: true,
                    align: "center",
                    width: 40,
                    formatter: function (value, row, index) {
                        //获取每页显示的数量
                        var pageSize = $('#myTable').bootstrapTable('getOptions').pageSize;
                        //获取当前是第几页
                        var pageNumber = $('#myTable').bootstrapTable('getOptions').pageNumber;
                        //返回序号，注意index是从0开始的，所以要加上1
                        return pageSize * (pageNumber - 1) + index + 1;
                    }
                }, {
                    field: 'outputdate',
                    title: '日期',
                    width: 160,
                    align: 'center',
                    formatter: changeDateFormat
                }, {
                    field: 'ordersid',
                    title: '出货单',
                    width: 140,
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
                    field: 'producttype',
                    title: '类别',
                    width: 120,
                    align: 'center'
                }, {
                    field: 'typenoname',
                    title: '型号',
                    width: 260,
                    align: 'center'
                }, {
                    field: 'conf',
                    title: '配置',
                    width: 200,
                    align: 'center'
                }, {
                    field: 'outputnum',
                    title: '数量',
                    width: 80,
                    type: 'num',
                    align: 'center'
                }, {
                    field: 'brand',
                    title: '品牌',
                    width: 120,
                    align: 'center'
                }, {
                    field: 'wlno',
                    title: '物流单号',
                    width: 120,
                    align: 'center'
                }, {
                    field: 'skfs',
                    title: '收款方式',
                    width: 120,
                    align: 'center'
                }, {
                    field: 'wczt',
                    title: '完成情况',
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

    // 初始化表单验证
    function validateForm() {
        $('.myForm').bootstrapValidator({
            message: 'This value is not valid',
            container: 'tooltip',
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
                wlno: {
                    validators: {
                        notEmpty: {
                            message: '不能为空'
                        }
                    }
                },
                skfs: {
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

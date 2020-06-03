<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>下订单</title>
    <%@include file="/common/inc.jsp" %>
    <link href="${pageContext.request.contextPath}/bootstrap-select/css/bootstrap-select.css" rel="stylesheet">
</head>
<style>
    label {
        text-align: right;
    }

    #customerInfoForm input {
        width: 70%;
    }
</style>
<body>
<div id="addWin" class="modal fade " tabindex="-1" role="dialog" aria-labelledby="addWin"
     aria-hidden="true">
    <div class="modal-dialog modal-sm" style="width: 600px;">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h3 class="modal-title">
                    新增下单信息
                </h3>
            </div>
            <div class="modal-body">
                <form id="addOrder" class="addTypeNo form">
                    <div class="form-group row">
                        <label for="producttype" class="col-sm-2 col-form-label">类别</label>
                        <div class="col-sm-6">
                            <%--TODO 可输入下拉框--%>
                            <select id='producttype' name="producttype" data-size="5"
                                    class="form-control selectpicker show-tick"
                                    data-width="250px"
                                    data-live-search="true" title="没有选中任何项">
                            </select>
                            <%--<input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"--%>
                            <%--class="form-control" name="producttype" id="producttype">--%>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="typenoname" class="col-sm-2 col-form-label">型号</label>
                        <div class="col-sm-6">
                            <%--TODO 可输入下拉框--%>
                            <select id='typenoname' name="typenoname" data-size="5"
                                    class="form-control selectpicker show-tick"
                                    data-width="250px"
                                    data-live-search="true" title="没有选中任何项">
                            </select>
                            <%--<input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"--%>
                            <%--class="form-control" name="typenoname" id="typenoname">--%>
                        </div>
                    </div>
                    <div class="form-group row">
                        <%--TODO 可输入下拉框--%>
                        <label for="brand" class="col-sm-2 col-form-label">品牌</label>
                        <div class="col-sm-6">
                            <select id='brand' name="brand" data-size="5" class="form-control selectpicker show-tick"
                                    data-width="250px"
                                    data-live-search="true" title="没有选中任何项">
                            </select>
                            <%--<input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"--%>
                            <%--class="form-control" name="brand" id="brand">--%>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="conf" class="col-sm-2 col-form-label">特殊备注</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="conf" id="conf">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="num" class="col-sm-2 col-form-label">数量(台)</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="num" id="num">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="price" class="col-sm-2 col-form-label">单价(元)</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="price" id="price">
                        </div>
                    </div>
                    <%--<div class="form-group row">--%>
                    <%--<label for="lessprice" class="col-sm-2 col-form-label">小计(元)</label>--%>
                    <%--<div class="col-sm-6">--%>
                    <%--<input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"--%>
                    <%--class="form-control" name="lessprice" id="lessprice">--%>
                    <%--</div>--%>
                    <%--</div>--%>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                </button>
                <button type="button" name="submit" class="btn btn-primary" onclick="doAddToTable()">提交</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
<div class="row">
    <div class="col-lg-12">
        <%--工具栏--%>
        <div id="toolbar" class="btn-group">
            <button id="btn_add" type="button" class="btn btn-primary" data-toggle="modal"
                    data-target="#addWin">
                <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增一行
            </button>
            <button id="btn_update" type="button" class="btn btn-danger" onclick="deleteBySelect()">
                <span class="glyphicon glyphicon-minus" aria-hidden="true"></span>删除
            </button>
            <button id="btn_delete" type="button" class="btn btn-primary" onclick="toOrder()">
                <span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span>确定下单
            </button>
        </div>
        <%--表格--%>
        <div id="tbody" class="table-responsive">
            <table id="myTable" class="table table-bordered text-nowrap"></table>
        </div>
        <div style="width: 60%;">
            <form id="customerInfoForm" class="form-inline">
                <table class="table table-bordered">
                    <tr>
                        <th colspan="2">
                            <babel>客户信息</babel>
                        </th>
                    </tr>
                    <tr>
                        <td>
                            <div class="form-group">
                                <label for="customername">客户姓名</label>
                                <input type="text" class="form-control" name="customername"
                                       id="customername">
                            </div>
                        </td>
                        <td>
                            <div class="form-group">
                                <label for="customerphone">客户电话</label>
                                <input type="text" class="form-control" name="customerphone"
                                       id="customerphone">
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label for="fhfs">发货方式</label>
                            <select class="form-control" name="fhfs" id="fhfs">
                                <option value="做好打款再发货">做好打款再发货</option>
                                <option value="等通知放货">等通知放货</option>
                                <option value="月结直接发">月结直接发</option>
                                <option value="开物流单打款">开物流单打款</option>
                            </select>
                        </td>
                        <td>
                            <label for="wuliuname">物流名称</label>
                            <input type="text" class="form-control" name="wuliuname" id="wuliuname">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label for="wuliuphone">物流电话</label>
                            <input type="text" class="form-control" name="wuliuphone" id="wuliuphone">
                        </td>
                        <td>
                            <label for="wuliuaddress">物流地址</label>
                            <input type="text" class="form-control" name="wuliuaddress"
                                   id="wuliuaddress">
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <label for="customeraddress">客户地址</label>
                            <input type="text" class="form-control" style="width: 85%"
                                   name="customeraddress" id="customeraddress">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label for="dingjin">定金&nbsp;&nbsp;&nbsp;&nbsp;</label>
                            <input type="text" class="form-control" name="dingjin"
                                   id="dingjin">
                        </td>
                        <td>
                            <label for="totalprice">总价&nbsp;&nbsp;&nbsp;&nbsp;</label>
                            <input type="text" readonly class="form-control" name="totalprice"
                                   id="totalprice">
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <label for="bz">备注</label>
                            <textarea class="form-control  input-group-lg" style="width: 90%;" name="bz"
                                      id="bz"></textarea>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </div>
</div>
</body>

<%--引入script--%>
<%@include file="/common/incfooter.jsp" %>
<script src="${pageContext.request.contextPath}/bootstrap-select/js/bootstrap-select.js"></script>
<script src="${pageContext.request.contextPath}/bootstrap-select/js/i18n/defaults-zh_CN.min.js"></script>
<script type="text/javascript">
    var editIndex;//全局变量
    $(document).ready(function () {
        creteTable();
        validateForm2();
    });

    // 往表格添加数据
    function doAddToTable() {
        $('#addOrder').data('bootstrapValidator').validate();
        if (!$('#addOrder').data('bootstrapValidator').isValid()) {
            return;
        }
        var producttypename = $('#producttype').find('option:selected');
        var typenoname_name = $('#typenoname').find('option:selected');
        var brandname = $('#brand').find('option:selected');

        var formData = $("#addOrder").serializeJson();
        formData.producttypename = producttypename[0].innerHTML;
        formData.typenoname_name = typenoname_name[0].innerHTML;
        formData.brandname = brandname[0].innerHTML;
        formData.lessprice = formData.num * formData.price;
        formData.id = (((1 + Math.random()) * 50) | 0).toString(16).substring(1);
        $("#myTable").bootstrapTable('insertRow', {index: 1, row: formData});
        $("#addWin").modal('hide');
    }

    $('#addWin').on('show.bs.modal', function () {
        validateForm();
        // 加载类别
        $.ajax({
            url: "dataTyep_findAllTypename.action",
            type: 'post',
            dataType: 'json',
            success: function (data) {
                var html = '';
                data.forEach(function (value) {
                    html += "<option value=" + value.id + ">" + value.typename + "</option>";
                })
                // 缺一不可
                $('#producttype').html(html);
                $('#producttype').selectpicker('refresh');
                $('#producttype').selectpicker('render');
            }
        })
    })
    $('#addWin').on('hide.bs.modal', function () {
        $("#addOrder input").val('');
        $("#addOrder [select]").html('')
        $("#addOrder").data('bootstrapValidator').destroy();
        $('#addOrder').data('bootstrapValidator', null);
        validateForm();
    })
    $("#producttype").on('change', function () {
        var type = $("#producttype").val();
        $('#typenoname').html('');
        $('#brand').html('');
        // 型号
        $.ajax({
            url: "/dataType_findAllTypenoByTypenameId.action",
            type: 'get',
            data: {id: type},
            dataType: 'json',
            success: function (data) {
                var html = '';
                data.forEach(function (value) {
                    html += "<option value=" + value.typenoid + ">" + value.typenoname + "</option>";
                })
                $('#typenoname').html(html);
                $('#typenoname').selectpicker('refresh');
                $('#typenoname').selectpicker('render');
            }
        });
        // 品牌
        $.ajax({
            url: "/dataType_findAllBrandByTypenameId.action",
            type: 'get',
            data: {id: type},
            dataType: 'json',
            success: function (data) {
                var html = '';
                data.forEach(function (value) {
                    html += "<option value=" + value.brandid + ">" + value.brandname + "</option>";
                })
                $('#brand').html(html);
                $('#brand').selectpicker('refresh');
                $('#brand').selectpicker('render');
            }
        })
    })

    // 删行
    function deleteBySelect() {
        var row = $("#myTable").bootstrapTable("getSelections");
        if (row.length <= 0) {
            modle.alert("请选择需要删除的数据", "tip");
            return;
        }
        $("#myTable").bootstrapTable('removeByUniqueId', row[0].id);
    }

    function creteTable() {
        $("#myTable").bootstrapTable({
            // url: '/salesMan_findOrderFollow.action',
            method: 'get',
            toolbar: '#toolbar',
            pagination: false,
            classes: 'table table-hover table-sm table-bordered',
            height: 500,
            theadClasses: 'thead-dark',
            clickToSelect: true,
            pageSize: 20,
            pageList: [10, 20, 50, 100, 200, 500],
            uniqueId: 'id',
            columns: [{
                radio: true
            },
                {
                    field: 'id',
                    visible: false
                }, {
                    field: 'producttype',
                    title: '类别id',
                    visible: false
                }, {
                    field: 'producttypename',
                    title: '类别',
                    width: 120,
                    align: 'center',
                },
                {
                    field: 'typenoname',
                    title: '型号id',
                    visible: false
                }, {
                    field: 'typenoname_name',
                    title: '型号',
                    width: 120,
                    align: 'center'
                },
                {
                    field: 'brand',
                    title: '品牌id',
                    visible: false
                },
                {
                    field: 'brandname',
                    title: '品牌',
                    width: 120,
                    align: 'center'

                }, {
                    field: 'conf',
                    title: '特殊备注',
                    width: 150,
                    align: 'center'
                }, {
                    field: 'num',
                    title: '数量(台)',
                    width: 100,
                    align: 'center',

                }, {
                    field: 'price',
                    title: '单价(元)',
                    width: 100,
                    align: 'center',

                },
                {
                    field: 'lessprice',
                    title: '小计(元)',
                    width: 100,
                    align: 'center'
                }
            ],
            onClickRow: function (row) {
                //TODO 修改框
                countTotal();
            }
        });
    }

    //当鼠标输入定金时，则计算出总价
    $("#dingjin").on('input', function () {
        countTotal();
    });

    function countTotal() {
        //获得定金的值
        var rows = $('#myTable').bootstrapTable('getData');
        console.log(rows)
        //如果校验成功，则执行下面的语句
        if (rows[0] != null || (rows[0] != "")) {
            var dingjin = $("#dingjin").val();
            if (dingjin >= 0) {
                var sum = 0;
                for (var i = 0; i < rows.length; i++) {
                    sum += rows[i].lessprice;
                }
                if (dingjin >= 0 && dingjin <= sum) {
                    $("#totalprice").val(sum - dingjin);
                }
            }
        }
    }


    //当添加客户的姓名时，判断editIndex是否为undefined
    $("#customername").on('input', function () {
        //获得客户姓名
        //var customername = $("#customername").val()
        //findCustomerInfoByname(customername);
        //查询该客户的所有信息
        //回显页面
        //TODO ??
    });
    $("#customerphone").on('input', function () {
        //获得输入的值
        //获得客户姓名
        //var customerphone = $("#customerphone").val()
        // customerphonefindCustomerInfoByphone(customerphone);
        //TODO ??
    });

    //下订单
    function toOrder() {
        $('#customerInfoForm').data('bootstrapValidator').validate();
        if (!$('#customerInfoForm').data('bootstrapValidator').isValid()) {
            return;
        }
        var rows = $("#myTable").bootstrapTable("getData");
        var flag = 1;
        for (var i = 0; i < rows.length; i++) {
            if (rows[i].producttype == undefined || rows[i].producttype == null || rows[i].producttype.trim() == '' || rows[i].typenoname == undefined || rows[i].typenoname == null || rows[i].typenoname.trim() == '' || rows[i].brand == undefined || rows[i].brand == null || rows[i].brand.trim() == '') {
                flag = 0;
            }
        }
        //判断下单数量是否为0
        if (rows.length > 0 && flag == 1) {
            var p = $("#customerInfoForm").serializeJson();
            $.ajax(
                {
                    type: 'POST',
                    url: '/saveOrderInfo.action',
                    async: false,
                    dataType: "json",
                    cache: false,
                    data: {
                        "row": JSON.stringify(rows),
                        "customerInfo": JSON.stringify(p)
                    },
                    success: function (result) {
                        if (result.status == 200) {
                            modle.alert(result.message, "success")
                        } else {
                            modle.alert("下单失败", "warn")
                        }
                    },
                    error: function (result) {
                        modle.alert(result.msg, "error");
                    }
                });
        } else {
            modle.alert("非法输入商品，不能自定义输入商品", "warn");
        }

    }

    // 初始化表单验证
    function validateForm() {
        $('#addOrder').bootstrapValidator({
            message: 'This value is not valid',
            container: 'tooltip',
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
                producttype: {
                    validators: {
                        notEmpty: {
                            message: '类别不能为空'
                        }
                    }
                },
                typenoname: {
                    validators: {
                        notEmpty: {
                            message: '型号不能为空'
                        }
                    }
                },
                brand: {
                    validators: {
                        notEmpty: {
                            message: '品牌不能为空'
                        }
                    }
                },
                num: {
                    validators: {
                        notEmpty: {
                            message: '数量不能为空'
                        },
                        numeric: {
                            message: "只能输入数值"
                        }
                    }
                },
                price: {
                    validators: {
                        notEmpty: {
                            message: '单价不能为空'
                        },
                        numeric: {
                            message: "只能输入数值"
                        }

                    }
                }
            }
        });
    }

    // 初始化表单验证 客户信息
    function validateForm2() {
        $('#customerInfoForm').bootstrapValidator({
            message: 'This value is not valid',
            container: 'tooltip',
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
                customername: {
                    validators: {
                        notEmpty: {
                            message: '客户姓名不能为空'
                        }
                    }
                },
                customerphone: {
                    validators: {
                        notEmpty: {
                            message: '客户电话不能为空'
                        },
                        phone: {
                            country: 'CN',
                            message: '电话格式不正确'
                        }
                    }
                }
            }
        });
    }

</script>
</html>

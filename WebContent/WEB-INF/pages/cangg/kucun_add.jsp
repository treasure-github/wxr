<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>库存录入</title>
    <%@include file="/common/inc.jsp" %>
    <link href="${pageContext.request.contextPath}/bootstrap-select/css/bootstrap-select.css" rel="stylesheet">

</head>
<style>
    label {
        text-align: right;
    }

</style>
<body>
<div class="panel panel-primary" style="width: 70%;margin:6% auto;">
    <div class="panel-heading">
        <h4>库存录入</h4>
    </div>
    <div class="panel-body">
        <div class="row">
            <form id="addKC">
                <div class="col-lg-12 form-group form-inline" style="padding-top: 20px;">
                    <div class="pull-left">
                        <label for="typename">类别&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
                        <select id='typename' data-size="5" class="form-control selectpicker show-tick"
                                data-width="250px"
                                data-live-search="true" title="没有选中任何项">
                        </select>

                    </div>
                    <div class="pull-right">
                        <label for="typeno">型号&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
                        <select id='typeno' data-size="10" class="form-control selectpicker show-tick"
                                data-width="250px" data-live-search="true">
                        </select>
                    </div>
                </div>
                <div class="col-lg-12 form-group form-inline" style="padding-top: 20px;">
                    <div class="pull-left">
                        <label for="conf">配置&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
                        <input type="text" id="conf" class="form-control" style="width: 250px;" name="conf">
                    </div>
                    <div class="pull-right">
                        <label for="num">数量&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
                        <input type="text" id="num" class="form-control" style="width: 250px;" name="num">
                    </div>
                </div>
                <div class="col-lg-12 form-group form-inline" style="padding-top: 20px;">
                    <div class="pull-left">
                        <label for="brandid">品牌&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
                        <select id='brandid' data-size="10" class="form-control selectpicker show-tick"
                                data-width="250px" data-live-search="true">
                        </select>
                    </div>
                    <div class="pull-right">
                        <label for="factory">厂商&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
                        <input type="text" data-size="5" id="factory" class="form-control"
                               style="width: 250px;"
                               name="factory">
                    </div>
                </div>
                <div class="col-lg-12 form-group form-inline" style="padding-top: 20px;">
                    <label for="address">存放地址</label>
                    <select id='address' class="form-control selectpicker show-tick"
                            data-width="250px" data-live-search="true">
                    </select>
                </div>
                <div class="col-lg-12 form-group form-inline" style="padding-top: 20px;">
                    <label for="remark">备注&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
                    <textarea type="text" class="form-control" style="width: 92%;max-width: 92%;"
                              name="remark" id="remark"></textarea>
                </div>
            </form>
        </div>
    </div>
    <div class="panel-footer">
        <button id="save" onclick="saveKC()" type="button" class="btn btn-primary" style="margin:0 90%;"
                value="保存">保存
        </button>
    </div>
</div>
</body>

<%--引入script--%>
<%@include file="/common/incfooter.jsp" %>
<script src="${pageContext.request.contextPath}/bootstrap-select/js/bootstrap-select.js"></script>
<script src="${pageContext.request.contextPath}/bootstrap-select/js/i18n/defaults-zh_CN.min.js"></script>

<script type="text/javascript">

    $(document).ready(function () {
        $.ajax({
            url: "dataTyep_findAllTypename.action",
            type: 'post',
            success: function (data) {
                data = JSON.parse(data)
                data.forEach(function (value) {
                    $('#typename').append("<option value=" + value.id + ">" + value.typename + "</option>");
                })
                // 缺一不可
                $('#typename').selectpicker('refresh');
                $('#typename').selectpicker('render');
            }
        })
        $.ajax({
            url: "dataType_findStockAddress.action",
            type: 'post',
            success: function (data) {
                data = JSON.parse(data)
                data.forEach(function (value) {
                    $('#address').append("<option value=" + value.saId + ">" + value.address + "</option>");
                })
                // 缺一不可
                $('#address').selectpicker('refresh');
                $('#address').selectpicker('render');
            }
        })
        $('#typename').change();
        // validateForm();
    });

    // 获取二级
    $('#typename').change(function () {
        var typeid = $("#typename").val();
        $.ajax({
            type: "POST",
            url: '${pageContext.request.contextPath}/canggfindtypeno.action?id=' + typeid,
            cache: false,
            dataType: "json",
            success: function (data1) {
                var selectList = "";
                data1.forEach(function (value) {
                    selectList += "<option value=" + value.typenoid + ">" + value.typenoname + "</option>";
                })
                $('#typeno').html(selectList)
                $('#typeno').selectpicker('refresh');
                $('#typeno').selectpicker('render');
            }
        });
        $.ajax({
            type: "POST",
            url: '${pageContext.request.contextPath}/canggfindbrand.action?id=' + typeid,
            cache: false,
            dataType: "json",
            success: function (data2) {
                var selectList2 = "";
                data2.forEach(function (value) {
                    selectList2 += "<option value=" + value.brandid + ">" + value.brandname + "</option>";
                })
                $('#brandid').html(selectList2)
                $('#brandid').selectpicker('refresh');
                $('#brandid').selectpicker('render');
            }
        });
    })

    function saveKC() {
        // $('#addKC').data('bootstrapValidator').validate();
        // if (!$('#addKC').data('bootstrapValidator').isValid()) {
        //     return;
        // }
        if ($("#typename").val() == '' || $("#typename").val() == null) {
            modle.alert("类别不能为空!", "tip")
            return;
        }

        var check = $('#num').val();
        if (check == '' || check == null) {
            modle.alert("数量不能为空!", "tip")
            return;
        }
        var ck = new RegExp(/^[0-9]*$/)
        if (!ck.test(check)) {
            modle.alert("数量只能为数字!", "tip")
            return;
        }
        var param = $("#addKC").serializeJson();
        param.typename = $("#typename").val();
        param.typeno = $("#typeno").val();
        param.brandid = $("#brandid").val();
        param.address = $("#address").val();
        $.ajax({
            url: '/cangg_kclradd.action',
            type: 'post',
            data: param,
            success: function (data) {
                if (data != 1) {
                    modle.alert("添加失败!", "warn")
                } else {
                    modle.alert("添加成功!", "success")
                    $('#addKC input').val('');
                    $('#addKC textarea').val('');
                }
            }

        })
    }

    // 初始化表单验证
    function validateForm() {
        $('#num').bootstrapValidator({
            message: 'This value is not valid',
            container: 'tooltip',
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
                num: {
                    validators: {
                        notEmpty: {
                            message: '不能为空'
                        },
                        digits: {
                            message: '只能为数字！'
                        }
                    }
                }
            }
        });
    }
</script>
</html>

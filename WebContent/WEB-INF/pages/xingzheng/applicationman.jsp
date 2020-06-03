<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>应聘人员</title>
    <%@include file="/common/inc.jsp" %>
</head>
<style>
    label {
        text-align: right;
    }
</style>
<body>
<!-- 新增模态框 -->
<div id="addApplicationMan" class="modal fade " tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
     aria-hidden="true">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h3 class="modal-title" id="customer">
                    新增人员
                </h3>
            </div>
            <div class="modal-body">
                <form class="appManForm form">
                    <div class="form-group row">
                        <label for="username" class="col-sm-2 col-form-label">姓名</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="username" id="username">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">性别</label>
                        <div class="col-sm-6">
                            <select class="form-control" name="gender">
                                <option value="男">男</option>
                                <option value="女">女</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="phone" class="col-sm-2 col-form-label">手机号码</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="phone" id="phone">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="job" class="col-sm-2 col-form-label">应聘职位</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="job" id="job">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="reason" class="col-sm-2 col-form-label">未录用原因</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="reason" id="reason">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="sal" class="col-sm-2 col-form-label">期望薪资</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="sal" id="sal">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="impression" class="col-sm-2 col-form-label">面试印象</label>
                        <div class="col-sm-6">
                            <input type="text" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="impression" id="impression">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="applicationdate" class="col-sm-2 col-form-label">应聘时间</label>
                        <div class="col-sm-6">
                            <input type="date" onkeypress="if(event.keyCode==13) focusNextInput(this);"
                                   class="form-control" name="applicationdate" id="applicationdate">
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                        </button>
                        <button type="button" name="submit" class="btn btn-primary" onclick="addSubmit()">提交</button>
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
            <button id="btn_add" type="button" class="btn btn-primary" onclick="addApplicationMan()">
                <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
            </button>
            <button id="btn_delete" type="button" class="btn btn-danger" onclick="deleteApplicationMan()">
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
        validateForm();
    });

    // 提交
    function addSubmit() {
        $('.appManForm').data('bootstrapValidator').validate();
        if (!$('.appManForm').data('bootstrapValidator').isValid()) {
            return;
        }
        var p = $('.appManForm').serializeJson();
        $.ajax({
            url: "/xz_application.action",
            type: "post",
            data: {row: JSON.stringify(p)},
            success: function (data) {
                $('#addApplicationMan').modal('hide');
                $("#myTable").bootstrapTable("refresh");
            }
        });
    }

    function addApplicationMan() {
        $('#addApplicationMan').modal('show');
    }

    // 清除表单数据
    $('#addApplicationMan').on('hide.bs.modal', function () {
        // 表单重置
        $('.appManForm input').val('');
        $(".appManForm").data('bootstrapValidator').destroy();
        $('.appManForm').data('bootstrapValidator', null);
        validateForm();
    });

    // 删除
    function deleteApplicationMan() {
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
                    $.ajax({
                        type: "post",
                        url: "/xz_deleteApplication.action",
                        dataType: "json",
                        data: {"ids": ids},
                        complete: function () {
                            modle.alert("删除成功！", "success");
                            $("#myTable").bootstrapTable("refresh");
                        }
                    });
                }
            });
        }
    }

    // 初始化表格
    function createTable() {
        $('#myTable').bootstrapTable({
            url: '/xz_findAllInfo.action',
            toolbar: '#toolbar',
            pagination: true,
            classes: 'table table-hover table-sm table-bordered',
            // height: 800,
            search: true,
            searchOnEnterKey: true,
            showRefresh: true,
            theadClasses: 'thead-dark',
            clickToSelect: false,
            pageSize: 20,
            pageList: [10, 20, 50, 100, 200, 500],
            uniqueId: 'id',
            columns: [{
                checkbox: true
            }, {
                field: 'username',
                title: '姓名',
                width: 120,
                align: 'center',

            }, {
                field: 'gender',
                title: '性别',
                width: 100,
                align: 'center',

            }, {
                field: 'phone',
                title: '手机号码',
                width: 120,
                align: 'center',

            }, {
                field: 'job',
                title: '应聘职位',
                width: 120,
                align: 'center',

            }, {
                field: 'reason',
                title: '未录用原因',
                width: 300,
                align: 'center',

            }, {
                field: 'sal',
                title: '期望薪资',
                width: 120,
                align: 'center',

            }, {
                field: 'impression',
                title: '面试印象',
                width: 200,
                align: 'center',

            }, {
                field: 'applicationdate',
                title: '应聘时间',
                width: 120,
                align: 'center',
                formatter: function (value, row, index) {
                    return changeDateFormat(value)
                }

            }],
            onDblClickRow: function (row) {

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
            return date.getFullYear() + "-" + month + "-" + currentDate;
        }
    }

    // 初始化表单验证
    function validateForm() {
        $('.appManForm').bootstrapValidator({
            message: 'This value is not valid',
            container: 'tooltip',
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
                username: {
                    validators: {
                        notEmpty: {
                            message: '姓名不能为空'
                        }
                    }
                },
                phone: {
                    validators: {
                        notEmpty: {
                            message: '手机号不能为空'
                        }
                    }
                },
                job: {
                    validators: {
                        notEmpty: {
                            message: '职位不能为空'
                        }
                    }
                },
                reason: {
                    validators: {
                        notEmpty: {
                            message: '未录用原因不能为空'
                        }
                    }
                },
                applicationdate: {
                    validators: {
                        notEmpty: {
                            message: '应聘时间不能为空'
                        }
                    }
                }
            }
        });
    }

</script>
</html>

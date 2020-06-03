<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>品牌录入</title>
    <%@include file="/common/inc.jsp" %>
</head>
<style>
    label {
        text-align: right;
    }
</style>
<body>
<div class="row">
    <div class="col-lg-12">
        <%--工具栏--%>
        <div id="toolbar" class="btn-group">
            <button id="btn_delete" type="button" class="btn btn-danger" onclick="deleteByCheckBox()">
                <span class="glyphicon glyphicon-minus" aria-hidden="true"></span>删除
            </button>
        </div>
        <%--表格--%>
        <div id="tbody" class="table-responsive">
            <table id="myTable" class="table table-bordered text-nowrap" style="table-layout: fixed;"></table>
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

    // 删除
    function deleteByCheckBox() {
        var $rows = $('#myTable').bootstrapTable('getSelections');
        if ($rows.length <= 0) {
            modle.alert("请选择需要删除的数据", "tip");
        } else {
            modle.confirm({message: "确认删除？"}).on(function (r) {
                if (r) {
                    var array = new Array();
                    for (var i = 0; i < $rows.length; i++) {
                        var staff = $rows[i];
                        var id = staff.brandid;
                        array.push(id);
                    }
                    var ids = array.join(",");
                    $.ajax({
                        url: "/dateType_deleteBrand.action",
                        type: 'post',
                        data: {"ids": ids},
                        dataType: 'JSON',
                        complete: function () {
                            $("#myTable").bootstrapTable('refresh');
                        }
                    })
                }
            });
        }
    }

    // 初始化表格
    function createTable() {
        $('#myTable').bootstrapTable({
            url: '/dataType_findAllBrand.action',
            toolbar: '#toolbar',
            pagination: true,
            classes: 'table table-hover table-sm table-bordered',
            // height: 800,
            search: true,
            showRefresh: true,
            theadClasses: 'thead-dark',
            clickToSelect: false,
            pageSize: 20,
            pageList: [10, 20, 50, 100, 200, 500],
            uniqueId: 'brandid',
            columns: [{
                checkbox: true,
                width: 5
            }, {
                field: 'typename',
                title: '类别名称',
                width: 10,
                align: 'center'
                // editor: {
                // }
            }, {
                field: 'brandname',
                title: '品牌名称',
                width: 50,
                align: 'left'
                // editor: {
                // }
            }
            ]
        });
    }

</script>
</html>
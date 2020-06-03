<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>拼多多订单信息</title>
    <%@include file="/common/inc.jsp" %>
    <%--可输入下拉框--%>
    <link href="<%=request.getContextPath() %>/css/jquery-editable-select.css" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/css/fileinput.css" rel="stylesheet">
</head>
<style>
    label {
        text-align: right;
    }
</style>
<body>
<div id="importData" class="modal fade " tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
     aria-hidden="true">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h3 class="modal-title" id="customer">
                    导入数据
                </h3>
            </div>
            <div class="modal-body" style="height: 200px;margin:50px 0">
                <form id="importForm" class="importForm form" method="POST" enctype="multipart/form-data">
                    <div class="file-loading">
                        <input id="myFile" name="file" type="file"><br>
                        <input type="hidden" name="storeId" id="formStoreId" value="">
                    </div>
                </form>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
<div class="row">
    <div class="col-lg-12">
        <form class="searchForm form-inline">
            <div class="form-group">
                <label for="cc1">店铺</label>
                <select id="cc1" class="form-control" name="storeId">
                </select>
            </div>
            <div class="form-group date">
                <label for="beginTime"></label>
                <input type="text" class="datepicker form-control" style="width: 150px;" name="beginTime"
                       id="beginTime" placeholder="开始日期">
            </div>
            <div class="form-group date">
                <label for="endTime"></label>
                <input type="text" class="datepicker form-control" style="width: 150px;" name="endTime"
                       id="endTime" placeholder="结束日期">
            </div>
            <%--TODO 以下几个输入没有作用--%>
            <div class="form-group">
                <label for="ordersid">订单编号</label>
                <input type="text" class="form-control" style="width: 150px;" name="ordersid" id="ordersid"
                       value="">
            </div>
            <div class="form-group">
                <label for="phone">手机号</label>
                <input type="text" class="form-control" style="width: 140px;" name="phone" id="phone"
                       value="">
            </div>
            <div class="form-group">
                <label for="ztcNum">收货人</label>
                <input type="text" class="form-control" style="width: 100px;" name="ztcNum" id="ztcNum"
                       value="">
            </div>
            <button type="button" class="btn btn-primary" onclick="search()"><i
                    class="fa fa-search"></i>查询
            </button>
        </form>
        <%--工具栏--%>
        <div id="toolbar" class="form-inline">
            <button type="button" class="btn btn-primary" onclick="importData()"><i
                    class="glyphicon glyphicon-import"></i>导入
            </button>
            <button type="button" class="btn btn-primary" onclick="editEnable()"><i
                    class="glyphicon glyphicon-edit"></i>修改
            </button>
            <button type="button" class="btn btn-danger" onclick="deleteBySelect()"><i
                    class="glyphicon glyphicon-minus"></i>删除
            </button>
        </div>
        <%--表格--%>
        <div id="tbody" class="table-responsive" style="padding-right:50px">
            <table id="myTable" class="table table-bordered text-nowrap"></table>
        </div>
    </div>
</div>
</body>

<%--引入script--%>
<%@include file="/common/incfooter.jsp" %>
<script src="${pageContext.request.contextPath}/js/jquery-editable-select.js"></script>
<script src="<%=request.getContextPath() %>/js/fileinput.js"></script>
<script src="<%=request.getContextPath() %>/js/zh.js"></script>
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


    //导入
    function importData() {
        var storeId = $("#cc1").val();
        if (storeId == "") {
            modle.alert("请选择店铺！", "tip")
        } else {
            $("#formStoreId").val(storeId)
            $("#importData").modal('show');
            initFileInput();
        }
    }

    $("#importData").on("hide.bs.modal", function () {
        document.getElementById("importForm").reset();
    });


    //TODO 上传回调没实现
    function initFileInput() {
        $("#myFile").fileinput({
            language: 'zh',
            uploadUrl: "/dianShang_inputPddOrder.action",
            allowedFileExtensions: ['xlsx'],
            uploadExtraData: {"storeId": $("#formStoreId").val()},
            uploadAsync: false, //默认异步上传
            showUpload: true, //是否显示上传按钮
            showRemove: true, //显示移除按钮
            showPreview: false, //是否显示预览
            // showCaption: true,//是否显示标题
            browseClass: "btn btn-primary", //按钮样式
            dropZoneEnabled: true,//是否显示拖拽区域
            maxFileSize: 1024 * 5,//单位为kb，如果为0表示不限制文件大小
            maxFileCount: 1, //表示允许同时上传的最大文件个数
            enctype: 'multipart/form-data',
            validateInitialCount: true,
            previewFileIcon: "<i class='glyphicon glyphicon-king'></i>",
            msgFilesTooMany: "选择上传的文件数量({n}) 超过允许的最大数值{m}！"
        }).on('filepreupload', function (event, data, previewId, index) {
            var form = data.form, files = data.files, extra = data.extra,
                response = data.response, reader = data.reader;
        }).on("fileuploaded", function (event, data, previewId, index) {
            modle.alert(data.message, "success");
        }).on('fileerror', function (event, data, msg) {
            modle.alert('文件上传失败！', "warn");
        })
    }

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
                        array.push(row.id);
                    })
                    var ids = array.join(",");
                    $.ajax({
                        type: "GET",
                        url: "${pageContext.request.contextPath}/dianShang_deletePddOrder.action",
                        data: {"ids": ids},
                        dataType: "json",
                        complete: function () {
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
        if (storeId == "" && beginTime.trim() == "" && endTime.trim() == "") {
            modle.alert("请选择日期或者店铺！", "tip")
            return false;
        } else {
            $.ajax({
                url: "/dianShang_findStraightNum.action",
                type: 'post',
                data: {"storeId": storeId, "time": endTime},
                dataType: 'json',
                sync: false,
                success: function (data) {
                    if (data.num != "" || data.num != null) {
                        $("#ztcNum").val(data.num);
                    } else {
                        $("#ztcNum").val(0);
                    }
                }
            })
            $("#myTable").bootstrapTable("refresh");
        }
    }

    // 初始化表格
    function createTable() {
        $('#myTable').bootstrapTable({
            url: '/dianShang_findAllPddorder.action',
            toolbar: '#toolbar',
            pagination: true,
            // classes: 'table table-hover table-sm table-bordered',
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
                    storeId: $("#cc1").val(),
                    ztcNum: $("#ztcNum").val()
                }
            },
            pageSize: 20,
            pageList: [10, 20, 50, 100, 200, 500],
            fixedColumns: true,
            //TODO 固定列和修改按钮事件冲突
            fixedNumber: 2,//6
            uniqueId: 'pddorderid',
            columns: [{checkbox: true},
                {field: 'orderid', title: '订单编号', width: 140, align: 'center'},
                {
                    field: 'zacost',
                    title: '杂费',
                    width: 80,
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
                }, {
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
                        console.log(result)
                        if (result == 1) {
                            // modle.alert("修改成功！");
                            // $("#myTable").bootstrapTable('refresh');
                        } else {
                            modle.alert("修改失败！", "warn");
                        }
                    },
                    error: function () {
                        modle.alert('修改失败!', "error");
                    }
                });
            },
            onLoadSuccess: function () {
                $('.editable').editable('toggleDisabled');
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

    function validateForm() {
    }
</script>
</html>
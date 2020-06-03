<%--
  Created by IntelliJ IDEA.
  User: bing
  Date: 2019/6/15
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <link rel="stylesheet" href="https://unpkg.com/bootstrap-table@1.14.2/dist/bootstrap-table.min.css">
    <script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>


    <script type="text/javascript">
        var peopleOptions;
        // 人口列表加载
        function tableItem() {
            peopleOptions = {
                method : "POST", // 使用get请求到服务器获取数据
                url : path + "/api/information/people/getList", // 获取数据的地址
                contentType : "application/x-www-form-urlencoded",// 重要否则POST会报错
                striped : false, // 表格显示条纹
                pagination : true, // 启动分页
                pageSize : 10, // 每页显示的记录数
                pageNumber : 1, // 当前第几页
                pageList : [ 10, 20, 50 ], // 记录数可选列表
                uniqueId : "id",
                showColumns : false, // 显示下拉框勾选要显示的列
                showToggle : false, // 显示 切换试图（table/card）按钮
                clickToSelect : false, // 点击可选
                singleSelect : false, // 禁止多选
                maintainSelected : true, // 在点击分页按钮或搜索按钮时，将记住checkbox的选择项
                sortable : true, // 禁止所有列的排序
                sidePagination : "server", // 表示服务端请求 后台分页
                toolbar : "#toolbar",// 指明自定义的toolbar
                queryParamsType : "undefined",
                queryParams : function queryParams(params) {
                    var param = {
                        pageNumber : params.pageNumber,
                        pageSize : params.pageSize,
                        orgId : ztreeId,
                        nodeId : ztreeId,
                        citizenName : $("#fullname").val().trim(),
                        sex : $("#sex").val(),
                        age : $("#age").val().trim(),
                        identityCode : $("#idCard").val().trim(),
                        cellPhone : $("#isMobile").val().trim(),
                        adress : $("#adress").val().trim(),
                    };
                    return param;
                },
                onLoadSuccess : function() { // 加载成功时执行
                    responseHandler : function(res) { // 格式化数据
                        console.log(res);
                        if (res.data.total != undefined)
                            tmp = {
                                total : res.data.total,
                                rows : res.data.rows
                            };
                        if (res.data.total == undefined)
                            tmp = {
                                total : res.data.length,
                                rows : res.data
                            };
                        return tmp;
                    },
                    columns : [ {
                        checkbox : true,
                        title : '全选',
                        valign : 'middle'
                    }, {
                        title : '序号',
                        field : 'number',
                        width : '40px',
                        align : 'center',
                        valign : 'middle',
                        formatter : indexFormatter
                    }, {
                        title : '姓名',
                        field : 'citizenName',
                        align : 'center',
                        valign : 'middle',
                    },  {
                        title : '年龄',
                        field : 'age',
                        align : 'center',
                        width : 28,
                        valign : 'middle',
                        formatter : ageFormatter
                    }, {
                        title : '性别',
                        field : 'sex',
                        width : 28,
                        align : 'center',
                        valign : 'middle',
                    },{
                        title : '身份证号',
                        field : 'identityCode',
                        align : 'center',
                        valign : 'middle',
                    }, {
                        title : '民族',
                        field : 'nation',
                        align : 'center',
                        valign : 'middle',
                    } ]
                }
            }

        };


        function getColumns() {
            // 加载动态表格
            $.ajax({
                url: path + "api/information/people/getLableColumn?ztreeId=" + ztreeId,
                type: 'get',
                dataType: "json",
                async: false,
                success: function (returnValue) {
                    // 未查询到相应的列，展示默认列
                    if (returnValue.retCode == "0") {
                        //没查到列的时候把之前的列再给它
                        myColumns = $table.bootstrapTable('getOptions').columns[0];
                    } else {
                        // 异步获取要动态生成的列
                        var arr = returnValue.data;
                        $.each(arr, function (i, item) {
                            myColumns.push({
                                "field": item.labelColumnCode,
                                "title": item.labelColumnName,
                                "hide": true,
                                "align": 'center',
                                "valign": 'middle'
                            });
                        });
                    }
                    console.log(myColumns);
                    return myColumns;
                }
            });
        }

    </script>
</head>
<body>
<table id="table">
</table>
<script type="text/javascript">
    $(function(){
        $('#table').bootstrapTable({
            url: 'data1.json',
            pagination: true,
            search: true,
            columns: [{
                field: 'id',
                title: 'Item ID'
            }, {
                field: 'name',
                title: 'Item Name'
            }, {
                field: 'price',
                title: 'Item Price'
            }]
        })
    })

</script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
<script src="https://unpkg.com/bootstrap-table@1.14.2/dist/bootstrap-table.min.js"></script>
</body>
</html>

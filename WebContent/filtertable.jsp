<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript"
            src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
    <!-- 导入easyui类库 -->
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath }/js/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath }/js/easyui/themes/icon.css">
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath }/js/easyui/ext/portal.css">
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath }/css/default.css">

    <script type="text/javascript"
            src="${pageContext.request.contextPath }/js/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript"
            src="${pageContext.request.contextPath }/js/easyui/ext/jquery.portal.js"></script>
    <script type="text/javascript"
            src="${pageContext.request.contextPath }/js/easyui/ext/jquery.cookie.js"></script>
    <script
            src="${pageContext.request.contextPath }/js/easyui/locale/easyui-lang-zh_CN.js"
            type="text/javascript"></script>
    <script type="text/javascript" src="datagrid-filter.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#detailedmappingGrid").datagrid({
                pagination:true,
                fit:true,
                fitColumns:true,
                toolbar:'#detailedmappingToolbar',
                singleSelect:true,
                checkOnSelect:true,
                selectOnCheck:true,
                pageNumber:1,
                pageSize:15,
                pageList:[10,15,20,50,100], // 可选翻页列表
                singleSelect:true,
                remoteSort:false,
                sortName:'',
                sortOrder:'asc',
                remoteFilter: false,
                filterDelay: 400,
                filterRules: [],
                columns:[[{field:"id",hidden:true},
                    {field:'mappingTypeId',hidden:true},
                    {field:'tableInId',hidden:true},
                    {field:'tableOutId',hidden:true},
                    {field:'',title:'',checkbox:true},
                    {field:'tableInCode',title:"内部字典DIC码",width:100,align:'center'},
                    {field:'tableInName',title:"内部字典名称",width:200,align:'center'},
                    {field:"tableOutName",title:"外部字典名称",width:200,align:'center'},
                    {field:"tableOutCode",title:"外部字典DIC码",width:100,align:'center'},
                    {field:"operation",title:'操作',width:50,align:'center',formatter:
                            function(value,row,index){
                                return "<a  href='#' onclick='detailed("+index+")'>详细映射</a>";
                            }}
                ]]
            });
            $("#detailedmappingGrid").datagrid('enableFilter');
        })


    </script>
</head>
<body>
<table id="detailedmappingGrid"></table>
<script>
    $(function () {

    })
</script>
</body>
</html>

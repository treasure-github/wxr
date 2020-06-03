<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>利润</title>
    <%@include file="/common/inc.jsp" %>
    <link href="${pageContext.request.contextPath}/bootstrap-select/css/bootstrap-select.css" rel="stylesheet">
</head>
<style>
    label {
        text-align: right;
    }
</style>
<body>
<div class="row">
    <div class="col-lg-12">
        <form class="myForm form-inline" cle style="padding: 0 20%">
            <div class="form-group">
                <%--//TODO 下拉可选框--%>
                <label for="cc1" class="col-form-label">店铺类型</label>
                <select id="cc1" class="form-control" name="id" style="width: 150px;">
                    <option value="0">淘宝</option>
                    <option value="1">拼多多</option>
                </select>
            </div>
            <div class="form-group ">
                <%--//TODO 下拉可选框--%>
                <label for="cc2" class="col-form-label">店铺</label>
                <select id="cc2" class="form-control" name="storeid" style="width: 150px;min-width: 150px;"
                        title="请选择店铺">

                </select>
            </div>
            <div class="form-group">
                <label for="profittime" class="col-form-label">月份</label>
                <input type="text" class="form-control" name="profittime" id="profittime">
            </div>
            <button type="button" class="btn btn-primary" onclick="search()"><i
                    class="fa fa-search"></i>查询
            </button>
        </form>
    </div>
</div>
<div id="container" style="height: 700px"></div>
</body>

<%--引入script--%>
<%@include file="/common/incfooter.jsp" %>
<script src="${pageContext.request.contextPath}/bootstrap-select/js/bootstrap-select.js"></script>
<script src="${pageContext.request.contextPath}/bootstrap-select/js/i18n/defaults-zh_CN.min.js"></script>
<script type="text/javascript">
    $(document).ready(function () {
        $("#profittime").datepicker({
            language: 'zh-CN',
            format: 'yyyy-mm',
            autoclose: 1
        })
        search();
    });

    $("#cc1").on("change", function () {
        $.ajax({
            url: '/dianShang_findStoreNameByTypeId.action',
            data: {id: $("#cc1").val()},
            type: 'get',
            dataType: 'JSON',
            success: function (data) {
                var html = ""
                data.forEach(function (value) {
                    html += "<option value=" + value.storeid + ">" + value.storename + "</option>";
                })
                // 缺一不可
                $('#cc2').html(html);
                $('#cc2').selectpicker('refresh');
                // $('#cc2').selectpicker('render');
            }
        });
    })

    // 绘制echarts
    var myChart = echarts.init(document.getElementById("container"));
    myChart.setOption({
        tooltip: {
            trigger: 'axis',
            axisPointer: {            // 坐标轴指示器，坐标轴触发有效
                type: 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
            }
        },
        legend: {
            data: ['销售量', '利润', '销售额']
        },
        grid: {
            left: '3%',
            right: '4%',
            bottom: '3%',
            containLabel: true
        },
        xAxis: [
            {
                type: 'category',
                data: ['1', '2', '3', '4', '5', '6', '7', '8', '9', '10', '11', '12', '13', '14', '15', '16', '17', '18', '19', '20', '21', '22', '23', '24', '25', '26', '27', '28', '29', '30', '31']
            }
        ],
        yAxis: [
            {
                type: 'value'
            }
        ]
    });

    function search() {
        var profittime = $("#profittime").val();
        var storeid = $("#cc2").val();
        var storetype = $("#cc1").val();
        $.ajax({
            url: "/dianShang_findLiRunByQ.action",
            data: {
                "profittime": profittime,
                "storeid": storeid,
                "storetype": storetype
            },
            dataType: 'json',
            success: function (data) {
                // 填入数据
                myChart.setOption({
                    // 填入数据
                    series: [{
                        name: '销售量',
                        type: 'bar',
                        data: data.shipmentNumList
                    }, {
                        name: '利润',
                        type: 'bar',
                        data: data.profitList
                    }, {
                        name: '销售额',
                        type: 'bar',
                        data: data.saleMoneyList
                    }]
                });
            }
        })
//[{storeid:'001',storename:'taobao001',selected:true},{storeid:'002',storename:'taobao002'}]
//                 $("#cc2").combobox('loadData', data.storeList)
//                 $("#cc2").combobox("select", data.storeList[0].storename)
//                 $('#win').window('close');
//             }, "json"
//         )
    }

</script>
</html>
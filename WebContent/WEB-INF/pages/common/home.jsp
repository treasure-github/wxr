<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>主页</title>
    <%@include file="/common/inc.jsp" %>
</head>
<body style="overflow: hidden;">
<div id="wrapper">
    <%@include file="left.jsp" %>
    <%@include file="head.jsp" %>
    <!-- 标签页区域 -->
    <div class="span10" id="mainFrameTabs" style="padding-top: 60px;">
        <ul class="nav nav-tabs" role="tablist">
            <!-- 设置默认的首页标签页，设置noclose样式，则不会被关闭 -->
            <li role="presentation" class="active noclose"><a href="#bTabs_navTabsMainPage" data-toggle="tab">首页</a></li>
        </ul>
        <div class="tab-content">
            <!-- 默认标签页（首页）的内容区域 -->
            <div class="tab-pane active" id="bTabs_navTabsMainPage">
                <div id="container" style="height: 330px;"></div>
                <div id="main" style="height: 330px;margin-top:5%"></div>
            </div>
        </div>
    </div>
</div>
</body>
<%--引入script--%>
<%@include file="/common/incfooter.jsp" %>
<%--dom--%>
<script type="text/javascript">
    // 首页初始化
    $(document).ready(function () {// 加载菜单
        // 用户个人信息
        getUserInfo();
    });

</script>
<%--echarts--%>
<script type="text/javascript">
    var myChart = echarts.init(document.getElementById("container"));
    myChart.setOption({
        title: {
            text: ''
        },
        tooltip: {
            trigger: 'axis',
            axisPointer: {            // 坐标轴指示器，坐标轴触发有效
                type: 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
            },
            show: false
        },
        legend: {
            data: ['当月销售额']
        },

        grid: {
            left: '3%',
            right: '4%',
            bottom: '3%',
            containLabel: true
        },
        xAxis: {},
        yAxis: [
            {
                axisLabel: {
                    formatter: function () {
                        return "";
                    }

                },
                axisLine: {
                    show: true
                },
                splitLine: {
                    show: false
                },
                axisTick: {
                    show: false
                }
            }
        ]
    })

    $.ajax({
        url: "/index_findAllStaffShipmentNum.action",
        success: function (data) {
            data = JSON.parse(data);
            // 填入数据
            myChart.setOption({
                xAxis: [
                    {
                        type: 'category',
                        data: data.usernameList
                    }
                ],
                series: [{
                    name: '当月销售额',
                    type: 'bar',
                    data: data.shipmentNumList
                }]
            });
        }
    })
</script>
<%--echarts--%>
<script type="text/javascript">
    var myChart2 = echarts.init(document.getElementById("main"));
    myChart2.setOption({
        tooltip: {
            title: {
                text: ''
            },
            trigger: 'axis',
            axisPointer: {            // 坐标轴指示器，坐标轴触发有效
                type: 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
            },
            show: false
        },
        legend: {
            data: ['当月收款排行']
        },
        grid: {
            left: '3%',
            right: '4%',
            bottom: '3%',
            containLabel: true
        },
        xAxis: {},
        yAxis: [
            {
                axisLabel: {
                    formatter: function () {
                        return "";
                    }

                },
                axisLine: {
                    show: true
                },
                splitLine: {
                    show: false
                },
                axisTick: {
                    show: false
                }
            }
        ]

    });

    $.ajax({
        url: "/index_findAllCollectionMoney.action",
        success: function (data) {
            data = JSON.parse(data);
            // 填入数据
            myChart2.setOption({
                xAxis: [
                    {
                        type: 'category',
                        data: data.usernameList
                    }
                ],
                series: [{
                    name: '当月收款排行',
                    type: 'bar',
                    data: data.shipmentNumList
                }]
            });
        }
    })
</script>
</html>

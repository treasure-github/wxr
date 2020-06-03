<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>业绩查询</title>
    <%@include file="/common/inc.jsp" %>
</head>
<style>
    label {
        text-align: right;
    }
</style>
<body>
<div class="row">
    <div class="btn-group col-md-4" role="group">
        <input type="button" class="btn btn-primary" name="recentYear" id="recentYear" value="近一年"
               onclick="recentYear()">
        <input type="button" class="btn btn-primary" name="recentMidYear" id="recentMidYear" value="近半年"
               onclick="recentMidYear()">
        <input type="button" class="btn btn-primary" name="recentThreeMonth" id="recentThreeMonth"
               value="近三个月"
               onclick="recentThreeMonth()">
        <input type="button" class="btn btn-primary" name="recentOneMonth" id="recentOneMonth" value="近一个月"
               onclick="recentOneMonth()">
    </div>
    <div class="col-md-8" style="margin-top: 0.5%">
        <h5 class="col-md-3" style="display: inline-block;margin-left:25%">当前数据(已发货)：</h5>
        <h5 class="col-md-6" style="text-align: left" id="currentData">近一个月</h5>
    </div>
</div>
<div id="container" style="height: 50%"></div>
<hr style="margin: 10px 0;padding: 0">
<div id="main" style="height: 50%"></div>
</body>

<%--引入script--%>
<%@include file="/common/incfooter.jsp" %>
<script type="text/javascript">

    $(document).ready(function () {

    });

    var myChart = echarts.init(document.getElementById('container'));
    myChart.setOption({
        title: {
            text: '数量统计'
        },
        tooltip: {
            trigger: 'axis',
            axisPointer: {            // 坐标轴指示器，坐标轴触发有效
                type: 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
            },
            show: false
        },
        legend: {
            data: ['销售数量', '销售金额']
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
        url: "/index_findTypeRank.action",
        success: function (data) {
            var dataList = JSON.parse(data);
            // 填入数据
            myChart.setOption({
                xAxis: [
                    {
                        type: 'category',
                        data: dataList.typeNameList
                    }
                ],
                series: [{
                    name: '销售数量',
                    type: 'bar',
                    data: dataList.typeNumList
                }, {
                    name: '销售金额',
                    type: 'bar',
                    data: dataList.typeMoneyList
                }]
            });
        }
    })
    var myChart2 = echarts.init(document.getElementById('main'));
    myChart2.setOption({
        title: {
            text: '类型统计'
        },
        tooltip: {
            trigger: 'axis',
            axisPointer: {            // 坐标轴指示器，坐标轴触发有效
                type: 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
            },
            show: false
        },
        legend: {
            data: ['电热销售数量', '电热销售金额']
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
        url: "/index_findDRtypenonameRank.action",
        success: function (data) {
            var dataList = JSON.parse(data);
            // 填入数据
            myChart2.setOption({
                xAxis: [
                    {
                        type: 'category',
                        data: dataList.typeNoNameList,
                        axisLabel: {
                            interval: 0,//横轴信息全部显示
                            rotate: -30//-30度角倾斜显示
                        }
                    },
                ],
                series: [{
                    name: '电热销售数量',
                    type: 'bar',
                    data: dataList.typeNumList
                }, {
                    name: '电热销售金额',
                    type: 'bar',
                    data: dataList.typeMoneyList
                }]
            });
        }
    })

    //最近半年
    function recentMidYear() {
        $.ajax({
            url: "/index_findTypeRank.action",
            data: {"type": 2},
            type: 'post',
            success: function (data) {
                var dataList = JSON.parse(data);
                // 填入数据
                myChart.setOption({
                    xAxis: [
                        {
                            type: 'category',
                            data: dataList.typeNameList
                        }
                    ],
                    series: [{
                        name: '销售数量',
                        type: 'bar',
                        data: dataList.typeNumList
                    }, {
                        name: '销售金额',
                        type: 'bar',
                        data: dataList.typeMoneyList
                    }]
                });
            }
        })
        $.ajax({
            url: "/index_findDRtypenonameRank.action",
            data: {"type": 2},
            type: 'post',
            success: function (data) {
                data = JSON.parse(data);
                // 填入数据
                myChart2.setOption({
                    xAxis: [
                        {
                            type: 'category',
                            data: data.typeNoNameList
                        }
                    ],
                    series: [{
                        name: '电热销售数量',
                        type: 'bar',
                        data: data.typeNumList
                    }, {
                        name: '电热销售金额',
                        type: 'bar',
                        data: data.typeMoneyList
                    }]
                });
            }
        })
    }

    //最三个月
    function recentThreeMonth() {
        $.ajax({
            url: "/index_findTypeRank.action",
            data: {"type": 3},
            type: 'post',
            success: function (data) {
                data = JSON.parse(data);
                // 填入数据
                myChart.setOption({
                    xAxis: [
                        {
                            type: 'category',
                            data: data.typeNameList
                        }
                    ],
                    series: [{
                        name: '销售数量',
                        type: 'bar',
                        data: data.typeNumList
                    }, {
                        name: '销售金额',
                        type: 'bar',
                        data: data.typeMoneyList
                    }]
                });
            }
        })
        $.ajax({
            url: "/index_findDRtypenonameRank.action",
            data: {"type": 3},
            type: 'post',
            success: function (data) {
                data = JSON.parse(data);
                // 填入数据
                myChart2.setOption({
                    xAxis: [
                        {
                            type: 'category',
                            data: data.typeNoNameList
                        }
                    ],
                    series: [{
                        name: '电热销售数量',
                        type: 'bar',
                        data: data.typeNumList
                    }, {
                        name: '电热销售金额',
                        type: 'bar',
                        data: data.typeMoneyList
                    }]
                });

            }
        })
    }

    //最近一年
    function recentYear() {
        $.ajax({
            url: "/index_findTypeRank.action",
            data: {"type": 1},
            type: 'post',
            success: function (data) {
                data = JSON.parse(data);
                // 填入数据
                myChart.setOption({
                    xAxis: [
                        {
                            type: 'category',
                            data: data.typeNameList
                        }
                    ],
                    series: [{
                        name: '销售数量',
                        type: 'bar',
                        data: data.typeNumList
                    }, {
                        name: '销售金额',
                        type: 'bar',
                        data: data.typeMoneyList
                    }]
                });
            }
        })
        $.ajax({
            url: "/index_findDRtypenonameRank.action",
            data: {"type": 1},
            type: 'post',
            success: function (data) {
                data = JSON.parse(data);
                // 填入数据
                myChart2.setOption({
                    xAxis: [
                        {
                            type: 'category',
                            data: data.typeNoNameList,
                            axisLabel: {
                                interval: 0,//横轴信息全部显示
                                rotate: -30,//-30度角倾斜显示
                            }
                        }
                    ],
                    series: [{
                        name: '电热销售数量',
                        type: 'bar',
                        data: data.typeNumList
                    }, {
                        name: '电热销售金额',
                        type: 'bar',
                        data: data.typeMoneyList
                    }]
                });
            }
        })
    }

    //最近一个月
    function recentOneMonth() {
        window.location.reload()
    }

    function validateForm() {
    }

</script>

</html>

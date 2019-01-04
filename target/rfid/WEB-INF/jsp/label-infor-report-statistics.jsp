<%--
  Created by IntelliJ IDEA.
  User: JDY
  Date: 2019-01-03
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>
<html>
<head>
    <title>标签信息</title>
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/css/stylesheets/fatstyle.css" />
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/css/stylesheets/manage.css" />
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/css/stylesheets/newresource.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/css/stylesheets/resource.css" />
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/css/stylesheets/printform.css" />
    <script type="text/javascript" src="<%=basePath%>/js/echarts-js/echarts.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>/js/jquery-3.2.1.min.js"></script>
</head>
<body>
<div class="u-wrap resource">
    <div class="mainbackground nopadding mt15">
        <!--5.2.9新加页面开始-->
        <div class="lxs-priDa" id="printReceipt">
            <%-- 图形报表begin --%>
            <div class="lxs-priLi mb-30" name="printCenter">
                <div class="lxs-priLi-ti">
                    <h3 class="color-black">标题</h3>
                </div>

                <%--<div class="clear lxs-priLi-info mb-6">--%>
                    <%--<p class="fl">--%>
                        <%--<span class="color-gray mr-40">里程：<strong class="color-black">${baseData.mileage}公里</strong></span>--%>
                        <%--<span class="color-gray mr-40">道床类型：<strong class="color-black">${baseData.track_bed_type}</strong></span>--%>
                        <%--<span class="color-gray mr-40">扣件类型：<strong class="color-black">${baseData.fastener_type}</strong></span>--%>
                        <%--<span class="color-gray mr-40">锁定温度：<strong class="color-black">${baseData.temperature}℃</strong></span>--%>
                    <%--</p>--%>
                <%--</div>--%>

                <table class="lxs-priTab" >
                    <tbody>
                    <div id="main" style="width: 100%;height: 400px"></div>
                    </tbody>
                </table>
            </div>
            <%-- 图形报表end --%>
            <div style='page-break-after: always;'></div>
        </div>
        <!--5.2.9新加页面结束-->
    </div>
</div>

<script>
    $(function(){
        $('#fi_li').addClass('active');
    });

    $(function () {
        var myChart = echarts.init(document.getElementById('main'));

        var colors = ['#5793f3', '#d14a61', '#675bba'];

        //private String gauge;//轨距
        //private String surpassHigh;//超高
        //private String railSurfaceHigh;//轨面高程

        option = {
            color: colors,
            tooltip: {trigger: 'axis'},
            legend: {data:['轨距', '超高','轨面高程']},
            xAxis: {
                    type: 'category',
                    boundaryGap: false,
                    data: ["2016-1", "2016-2", "2016-3", "2016-4", "2016-5", "2016-6", "2016-7", "2016-8", "2016-9", "2016-10", "2016-11", "2016-12"]
                },

            yAxis: {type: 'value'},
            series: [
                {
                    name:'轨距',
                    type:'line',
                    smooth: false,
                    data: [2.6, 5.9, 9.0, 26.4, 28.7, 70.7, 175.6, 182.2, 48.7, 18.8, 6.0, 2.3]
                },
                {
                    name:'超高',
                    type:'line',
                    smooth: false,
                    data: [3.9, 5.9, 11.1, 18.7, 48.3, 69.2, 231.6, 46.6, 55.4, 18.4, 10.3, 0.7]
                },
                {
                    name:'轨面高程',
                    type:'line',
                    smooth: false,
                    data: [4.9, 6.9, 21.1, 28.7, 58.3, 79.2, 331.6, 56.6, 65.4, 28.4, 20.3, 1.7]
                }
            ]
        };
        myChart.setOption(option);
    });
</script>
</body>
</html>


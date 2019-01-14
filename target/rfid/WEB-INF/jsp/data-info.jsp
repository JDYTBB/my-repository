<%--
  Created by IntelliJ IDEA.
  User: JDY
  Date: 2019-01-04
  Time: 17:34
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
    <%--<div class="mainbackground nopadding mt15">
        <div class="lxs-priDa" id="printReceipt">
            <div class="lxs-priLi mb-30" name="printCenter">
                <div class="lxs-priLi-ti">
                    <h3 class="color-black">标题</h3>
                </div>

                <table class="lxs-priTab" >
                    <tbody>
                    <div id="main" style="width: 100%;height: 400px"></div>
                    </tbody>
                </table>
            </div>
            <div style='page-break-after: always;'></div>
        </div>
    </div>--%>
    <div class="lxs-priLi-ti">
        <h3 class="color-black">标题</h3>
    </div>
    <table class="lxs-priTab" >
        <tbody>
        <div id="main" style="width: 100%;height: 400px"></div>
        </tbody>
    </table>
</div>

<script>
    $(function(){
        $('#fi_li').addClass('active');
    });

    $(function () {
        var myChart = echarts.init(document.getElementById('main'));

        var colors = ['#5793f3', '#d14a61', '#675bba'];

        option = {
            color: colors,
            tooltip: {trigger: 'axis'},
            legend: {data:['轨距', '超高','轨面高程']},
            xAxis: {
                type: 'category',
                boundaryGap: false,
                data: ["rfid0001", "rfid0002", "rfid0003", "rfid0004", "rfid0005", "rfid0006", "rfid0007", "rfid0008", "rfid0009", "rfid0010", "rfid0011", "rfid0012"]
            },

            yAxis: {type: 'value'},
            series: [
                {
                    name:'轨距',
                    type:'line',
                    smooth: false,
                    data: [2.6, 5.9, 9.0, 2.4, 8.7, 7.7, 1.6, 2.2, 8.7, 1.8, 3.0, 2.3]
                },
                {
                    name:'超高',
                    type:'line',
                    smooth: false,
                    data: [3.9, 5.9, 3.1, 1.7, 5.3, 6.2, 7.6, 2.6, 1.4, 9.4, 1.3, 0.7]
                },
                {
                    name:'轨面高程',
                    type:'line',
                    smooth: false,
                    data: [4.9, 6.9, 2.1, 8.7, 5.3, 7.2, 3.6, 6.6, 5.4, 8.4, 2.3, 1.7]
                }
            ]
        };
        myChart.setOption(option);
    });
</script>
</body>
</html>


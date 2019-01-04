<%--
  Created by IntelliJ IDEA.
  User: JDY
  Date: 2018-12-28
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>数据信息</title>
    <link href="<%=basePath%>/css/style.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="<%=basePath%>/js/jquery-1.11.3.min.js"></script>
</head>

<body>

<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="#">首页</a></li>
    </ul>
</div>

<div class="mainindex">

    <div class="welinfo">
        &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<span><img src="" alt="" /></span>
        <b>管理员：您好，欢迎使用巡检系统平台</b>
        <a href="#"></a>
    </div>

    <div class="xline"></div>

    <div class="welinfo">
        <span><img src="<%=basePath%>/images/time.png"/></span>
        <i>您上次登录的时间：2017-09-09 15:22</i>
    </div>

    <div class="xline"></div>
    <div class="box"></div>

    <div class="welinfo">
        <span><img src="<%=basePath%>/images/dp.png"/></span>
        <b>巡检系统平台简介</b>
    </div>

    <ul class="infolist">
        <li><span>该巡检系统平台用于进行****段轨道信息监测，该标段长度500米，标签间隔10米，共设置50个标签，每月进行两次数据读写。</span></li>
        <li><span>该巡检系统平台用于进行****段轨道信息监测，该标段长度500米，标签间隔10米，共设置50个标签，每月进行两次数据读写。</span></li>
        <li><span>该巡检系统平台用于进行****段轨道信息监测，该标段长度500米，标签间隔10米，共设置50个标签，每月进行两次数据读写。</span></li>
    </ul>

</div>

</body>

</html>


<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>沉降检测系统</title>
    <link href="<%=basePath%>/css/style.css" rel="stylesheet" type="text/css" />
    <script language="JavaScript" src="<%=basePath%>/js/jquery-1.11.3.min.js"></script>
    <script type="text/javascript">
        $(function(){
            //顶部导航切换
            $(".nav li a").click(function(){
                $(".nav li a.selected").removeClass("selected")
                $(this).addClass("selected");
            })
        })
    </script>
</head>

<body style="background:url(<%=basePath%>/images/topbg.gif) repeat-x;">
<div class="topleft">
    <a href="<%=basePath%>/jsp/goLogin.do" target="_parent">系统首页</a>
</div>

<!--中间放任务栏-->
<ul class="nav">
    <li><a href="<%=basePath%>/user-data/user-info.do" target="rightFrame" class="selected"><h2>人员信息</h2></a></li>
    <li><a href="<%=basePath%>/lable-data/label-info.do" target="rightFrame"><h2>标签信息</h2></a></li>
    <li><a href="<%=basePath%>/data-data/data-info.do"  target="rightFrame"><h2>数据信息</h2></a></li>
</ul>

<!--右边放一些用户登录信息和帮助信息-->
<div class="topright">
    <ul>
        <li><span><img src="<%=basePath%>/images/help.png" title="帮助"  class="helpimg"/></span><a href="#">帮助</a></li>
        <li><a href="#">关于</a></li>
        <li><a href="<%=basePath%>/jsp/dropOut.do" target="_parent">退出</a></li>
    </ul>
</div>
</body>
</html>

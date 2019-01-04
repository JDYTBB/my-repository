<%--
  Created by IntelliJ IDEA.
  User: JDY
  Date: 2018-12-28
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>无标题文档</title>
    <link href="<%=basePath%>/css/style.css" rel="stylesheet" type="text/css" />

</head>

<body>
<div class="footer">
    <span>北京龙辰博望科技有限公司</span>
    <i>www.lcbw.com</i>
</div>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: JDY
  Date: 2018-12-28
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>
<html>
<head>
    <title>巡检系统平台</title>
    <frameset rows="10%,*,5%" cols="*" frameborder="yes" border="1" framespacing="0">
        <frame src="<%=basePath%>/jsp/goTop.do" name="topFrame" scrolling="No" noresize="noresize" id="topFrame" title="topFrame" />

        <frameset cols="187,*" frameborder="no" border="0" framespacing="0">
            <frame src="${pageContext.request.contextPath}/jsp/goLeft.do" name="leftFrame" scrolling="No" noresize="noresize" id="leftFrame" title="leftFrame" />
            <frame src="${pageContext.request.contextPath}/jsp/goIndex.do" name="rightFrame" id="rightFrame" title="rightFrame" />
        </frameset>

        <frame src="${pageContext.request.contextPath}/jsp/goFooter.do" name="bottomFrame" scrolling="No" noresize="noresize" id="bottomFrame" title="bottomFrame" />
    </frameset>
</head>
<body>
<h>main.jsp</h>
</body>
</html>

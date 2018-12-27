<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %>
<html>
<head></head>
<body>
<%request.getRequestDispatcher(request.getContextPath()+"/jumpPage/goToLogin").forward(request,response);%>
</body>
</html>
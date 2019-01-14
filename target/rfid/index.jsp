<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>巡检系统</title>
    <script src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript">
        $(function(){
            login();
        });

        function login(){
            window.location.href="${pageContext.request.contextPath}/jsp/goToLogin.do";
        }
    </script>
</head>
<body>
<%--<%request.getRequestDispatcher(request.getContextPath()+"/jsp/goToLogin").forward(request,response);%>--%>
</body>
</html>
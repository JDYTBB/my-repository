<%--
  Created by IntelliJ IDEA.
  User: JDY
  Date: 2018-12-29
  Time: 9:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>数据信息</title>
    <link href="<%=basePath%>/css/style.css" rel="stylesheet" type="text/css">
    <%--<link href="<%=basePath%>/css/jquery.dataTables.min.css" rel="stylesheet" type="text/css">--%>
    <%--<link href="<%=basePath%>/css/dataTables.bootstrap.css" rel="stylesheet" type="text/css">--%>
    <%--<link href="<%=basePath%>/css/bootstrap.min.css" rel="stylesheet" type="text/css">--%>

    <script src="<%=basePath%>/js/jquery.js" type="text/javascript"></script>
    <script type="text/javascript" src="<%=basePath%>/js/page-js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>/js/page-js/jquery.pagination.js"></script>

    <script type="text/javascript">
        $(document).ready(function(){
            $(".click").click(function(){
                $(".tip").fadeIn(200);
            });

            $(".tiptop a").click(function(){
                $(".tip").fadeOut(200);
            });

            $(".sure").click(function(){
                $(".tip").fadeOut(100);
            });

            $(".cancel").click(function(){
                $(".tip").fadeOut(100);
            });
        });
    </script>
</head>


<body>

<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="#">首页</a></li>
        <li><a href="#">标签信息</a></li>
    </ul>
</div>

<div class="rightinfo">

    <%--<div class="tools">--%>
        <%--<ul class="toolbar">--%>
            <%--<li class="click"><span><img src="<%=basePath%>/images/t01.png" /></span>添加</li>--%>
            <%--<li class="click"><span><img src="<%=basePath%>/images/t02.png" /></span>修改</li>--%>
            <%--<li><span><img src="<%=basePath%>/images/t03.png" /></span>删除</li>--%>
            <%--<li><span><img src="<%=basePath%>/images/t04.png" /></span>统计</li>--%>
        <%--</ul>--%>
    <%--</div>--%>


    <table class="tablelist" id="user-list">
        <thead>
        <tr>
            <th>编号<i class="sort"></i></th>
            <th>是否启用</th>
            <th>采集次数</th>
            <th>操作</th>
        </tr>
        </thead>

        <tbody>
            <c:forEach items="${labelList.data}" var="labelList" varStatus="recorder">
                <tr>
                    <td>rfid000${recorder.count}</td>
                    <c:choose>
                        <c:when test="${labelList.expansion2 == 1}">
                            <td>是</td>
                        </c:when>
                        <c:otherwise>
                            <td>否</td>
                        </c:otherwise>
                    </c:choose>
                    <td>${labelList.expansion1}</td>
                    <td><a href="<%=basePath%>/data-data/view-labelInformation.do" class="tablelink">查看详情</a> | <a href="<%=basePath%>/data-data/view-labelInforReport.do" class="tablelink"> 报表统计</a> | <a href="#" class="tablelink"> 禁用</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <div class="pagin">
        <c:if test="${not empty labelList.data}">
            <div class="message">共<i class="blue">${labelList.totalCount}</i>条记录，当前显示第&nbsp;<i class="blue">${labelList.currentPage}&nbsp;</i>页</div>
            <ul class="paginList">
                <c:choose>
                    <c:when test="${labelList.currentPage == '1'}">
                        <li class="paginItem current"><a href="javascript:;"><span class="pagepre"></span></a></li>
                    </c:when>
                    <c:otherwise>
                        <li class="paginItem"><a href="<%=basePath%>/lable-data/label-info?currentPage=${labelList.currentPage - 1}"><span class="pagepre"></span></a></li>
                    </c:otherwise>
                </c:choose>
                <c:forEach begin="${labelList.start}" end="${labelList.end}" var="num" step="1">
                    <li ${labelList.currentPage == num ? "class='paginItem current'":"class='paginItem'"}>
                        <a href="<%=basePath%>/lable-data/label-info?currentPage=${num}">${num}</a>
                    </li>
                </c:forEach>
                <c:choose>
                    <c:when test="${labelList.currentPage == labelList.totalPage}">
                        <li class="paginItem current"><a href="javascript:;"><span class="pagenxt"></span></a></li>
                    </c:when>
                    <c:otherwise>
                        <li class="paginItem"><a href="<%=basePath%>/lable-data/label-info?currentPage=${labelList.currentPage + 1}"><span class="pagenxt"></span></a></li>
                    </c:otherwise>
                </c:choose>
            </ul>
        </c:if>
    </div>

    <div class="tip">
        <div class="tiptop"><span>提示信息</span><a></a></div>

        <div class="tipinfo">
            <span><img src="<%=basePath%>/images/ticon.png" /></span>
            <div class="tipright">
                <p>是否确认对信息的修改 ？</p>
                <cite>如果是请点击确定按钮 ，否则请点取消。</cite>
            </div>
        </div>

        <div class="tipbtn">
            <input name="" type="button"  class="sure" value="确定" />&nbsp;
            <input name="" type="button"  class="cancel" value="取消" />
        </div>
    </div>
</div>
</body>

</html>



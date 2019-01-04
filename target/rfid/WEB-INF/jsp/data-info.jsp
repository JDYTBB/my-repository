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
        <li><a href="#">数据表</a></li>
        <li><a href="#">基本内容</a></li>
    </ul>
</div>

<div class="rightinfo">

    <div class="tools">
        <ul class="toolbar">
            <li class="click"><span><img src="<%=basePath%>/images/t01.png" /></span>添加</li>
            <li class="click"><span><img src="<%=basePath%>/images/t02.png" /></span>修改</li>
            <li><span><img src="<%=basePath%>/images/t03.png" /></span>删除</li>
            <li><span><img src="<%=basePath%>/images/t04.png" /></span>统计</li>
        </ul>
        <ul class="toolbar1">
            <li><span><img src="<%=basePath%>/images/t05.png" /></span>设置</li>
        </ul>
    </div>


    <table class="tablelist" id="user-list">
        <thead>
        <tr>
            <th>编号<i class="sort"></i></th>
            <th>用户名</th>
            <th>用户类型</th>
            <th>上传次数</th>
            <th>操作</th>
        </tr>
        </thead>

        <tbody>
        <tr>
            <td>0001</td>
            <td>小张</td>
            <td>管理员</td>
            <td>0</td>
            <td><a href="#" class="tablelink">查看</a>     <a href="#" class="tablelink"> 删除</a></td>
        </tr>

        <tr>
            <td>0002</td>
            <td>小王</td>
            <td>操作工</td>
            <td>32</td>
            <td><a href="#" class="tablelink">查看</a>     <a href="#" class="tablelink">删除</a></td>
        </tr>

        <tr>
            <td>0003</td>
            <td>小李</td>
            <td>操作工</td>
            <td>34</td>
            <td><a href="#" class="tablelink">查看</a>     <a href="#" class="tablelink">删除</a></td>
        </tr>
        </tbody>
    </table>


    <div id="pagenation-id" class="pages pagination"></div>
    <div class="pagin">
        <div class="message">共<i class="blue">1256</i>条记录，当前显示第&nbsp;<i class="blue">2&nbsp;</i>页</div>
        <ul class="paginList">
            <li class="paginItem"><a href="javascript:;"><span class="pagepre"></span></a></li>
            <li class="paginItem"><a href="javascript:;">1</a></li>
            <li class="paginItem current"><a href="javascript:;">2</a></li>
            <li class="paginItem"><a href="javascript:;">3</a></li>
            <li class="paginItem"><a href="javascript:;">4</a></li>
            <li class="paginItem"><a href="javascript:;">5</a></li>
            <li class="paginItem more"><a href="javascript:;">...</a></li>
            <li class="paginItem"><a href="javascript:;">10</a></li>
            <li class="paginItem"><a href="javascript:;"><span class="pagenxt"></span></a></li>
        </ul>
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

<%--<script type="text/javascript">
    $('.tablelist tbody tr:odd').addClass('odd');
    $(function () {
        userPagenation(1);
    });
    function userPagenation(index){
        $.ajax({
            url: "/user-data/user-info.do",
            data: {page: index,pageSize:3},
            type: "POST",
            success: function (data) {
                $("#user-list tr:gt(0)").remove();
                $.each(data.data, function (i, item) {
                    $("#user-list tbody").append("<tr><td>"
                        + 'add1' + "</td><td>"
                        + 'add2' + "</td><td>"
                        + 'add3' + "</td><td>"
                        + 'add4' + "</td><td>"
                        +"<a data-id='"+item.id+"' class = 'deleteClick' href='#'>删除</a> <a data-id='"+item.id+"' class = 'modifyClick' href='#'>修改</a> "
                        +"</td></tr>");
                });
                $("#pagenation-id").pagination(data.rowCount, {
                    next_text: "下一页",
                    prev_text: "上一页",
                    current_page: data.pageNo - 1,
                    num_display_entries: 8,
                    items_per_page: data.pageSize,
                    num_edge_entries: 1,
                    callback: function (page, jq) {
                        var pageNo = page + 1;
                        userPagenation(pageNo);
                    }
                });
            }
        });
    }
</script>--%>

</body>

</html>



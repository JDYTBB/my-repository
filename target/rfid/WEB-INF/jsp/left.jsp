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
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>沉降检测系统</title>
    <link href="<%=basePath%>/css/style.css" rel="stylesheet" type="text/css" />
    <script language="JavaScript" src="<%=basePath%>/js/jquery-1.11.3.min.js"></script>

    <script type="text/javascript">
        $(function(){
            //导航切换
            $(".menuson .header").click(function(){
                var $parent = $(this).parent();
                $(".menuson>li.active").not($parent).removeClass("active open").find('.sub-menus').hide();

                $parent.addClass("active");
                if(!!$(this).next('.sub-menus').size()){
                    if($parent.hasClass("open")){
                        $parent.removeClass("open").find('.sub-menus').hide();
                    }else{
                        $parent.addClass("open").find('.sub-menus').show();
                    }
                }
            });

            // 三级菜单点击
            $('.sub-menus li').click(function(e) {
                $(".sub-menus li.active").removeClass("active")
                $(this).addClass("active");
            });

            $('.title').click(function(){
                var $ul = $(this).next('ul');
                $('dd').find('.menuson').slideUp();
                if($ul.is(':visible')){
                    $(this).next('.menuson').slideUp();
                }else{
                    $(this).next('.menuson').slideDown();
                }
            });
        })
    </script>


</head>

<body style="background:#f0f9fd;">
<div class="lefttop"><span></span>数据信息</div>

<dl class="leftmenu">
    <dd>
        <%-- 一级标题 --%>
        <div class="title">
            <span><img src="<%=basePath%>/images/leftico01.png" /></span>华东区
        </div>
        <ul class="menuson">
            <li>
                <div class="header">
                    <cite></cite>
                    <a href="index.html" target="rightFrame">济南铁路局</a>
                    <i></i>
                </div>
                <ul class="sub-menus">
                    <li><a href="javascript:;">人员信息</a></li>
                    <li><a href="javascript:;">标签信息</a></li>
                    <li><a href="javascript:;">数据信息</a></li>
                </ul>
            </li>

            <li>
                <div class="header">
                    <cite></cite>
                    <a href="right.html" target="rightFrame">上海铁路局</a>
                    <i></i>
                </div>
                <ul class="sub-menus">
                    <li><a href="javascript:;">人员信息</a></li>
                    <li><a href="javascript:;">标签信息</a></li>
                    <li><a href="javascript:;">数据信息</a></li>
                </ul>
            </li>
        </ul>
    </dd>


    <dd>
        <div class="title">
            <span><img src="<%=basePath%>/images/leftico01.png" /></span>华南区
        </div>
        <ul class="menuson">
            <li>
                <div class="header">
                    <cite></cite>
                    <a href="flow.html" target="rightFrame">***工务段</a>
                    <i></i>
                </div>
                <ul class="sub-menus">
                    <li><a href="javascript:;">人员信息</a></li>
                    <li><a href="javascript:;">标签信息</a></li>
                    <li><a href="javascript:;">数据信息</a></li>
                </ul>
            </li>

            <li>
                <div class="header">
                    <cite></cite>
                    <a href="flow.html" target="rightFrame">***工务段</a>
                    <i></i>
                </div>
                <ul class="sub-menus">
                    <li><a href="javascript:;">人员信息</a></li>
                    <li><a href="javascript:;">标签信息</a></li>
                    <li><a href="javascript:;">数据信息</a></li>
                </ul>
            </li>
        </ul>
    </dd>


    <dd>
        <div class="title">
            <span><img src="<%=basePath%>/images/leftico01.png" /></span>华中区
        </div>
        <ul class="menuson">
            <li>
                <div class="header">
                    <cite></cite>
                    <a href="flow.html" target="rightFrame">***工务段</a>
                    <i></i>
                </div>
                <ul class="sub-menus">
                    <li><a href="javascript:;">人员信息</a></li>
                    <li><a href="javascript:;">标签信息</a></li>
                    <li><a href="javascript:;">数据信息</a></li>
                </ul>
            </li>

            <li>
                <div class="header">
                    <cite></cite>
                    <a href="flow.html" target="rightFrame">***工务段</a>
                    <i></i>
                </div>
                <ul class="sub-menus">
                    <li><a href="javascript:;">人员信息</a></li>
                    <li><a href="javascript:;">标签信息</a></li>
                    <li><a href="javascript:;">数据信息</a></li>
                </ul>
            </li>
        </ul>
    </dd>


    <dd><div class="title"><span><img src="<%=basePath%>/images/leftico01.png" /></span>华北区</div>
        <ul class="menuson">
            <li>
                <div class="header">
                    <cite></cite>
                    <a href="flow.html" target="rightFrame">***工务段</a>
                    <i></i>
                </div>
                <ul class="sub-menus">
                    <li><a href="javascript:;">人员信息</a></li>
                    <li><a href="javascript:;">标签信息</a></li>
                    <li><a href="javascript:;">数据信息</a></li>
                </ul>
            </li>

            <li>
                <div class="header">
                    <cite></cite>
                    <a href="flow.html" target="rightFrame">***工务段</a>
                    <i></i>
                </div>
                <ul class="sub-menus">
                    <li><a href="javascript:;">人员信息</a></li>
                    <li><a href="javascript:;">标签信息</a></li>
                    <li><a href="javascript:;">数据信息</a></li>
                </ul>
            </li>
        </ul>
    </dd>

    <dd><div class="title"><span><img src="<%=basePath%>/images/leftico01.png" /></span>西北区</div>
        <ul class="menuson">
            <li>
                <div class="header">
                    <cite></cite>
                    <a href="flow.html" target="rightFrame">***工务段</a>
                    <i></i>
                </div>
                <ul class="sub-menus">
                    <li><a href="javascript:;">人员信息</a></li>
                    <li><a href="javascript:;">标签信息</a></li>
                    <li><a href="javascript:;">数据信息</a></li>
                </ul>
            </li>

            <li>
                <div class="header">
                    <cite></cite>
                    <a href="flow.html" target="rightFrame">***工务段</a>
                    <i></i>
                </div>
                <ul class="sub-menus">
                    <li><a href="javascript:;">人员信息</a></li>
                    <li><a href="javascript:;">标签信息</a></li>
                    <li><a href="javascript:;">数据信息</a></li>
                </ul>
            </li>
        </ul>
    </dd>

    <dd><div class="title"><span><img src="<%=basePath%>/images/leftico01.png" /></span>西南区</div>
        <ul class="menuson">
            <li>
                <div class="header">
                    <cite></cite>
                    <a href="flow.html" target="rightFrame">***工务段</a>
                    <i></i>
                </div>
                <ul class="sub-menus">
                    <li><a href="javascript:;">人员信息</a></li>
                    <li><a href="javascript:;">标签信息</a></li>
                    <li><a href="javascript:;">数据信息</a></li>
                </ul>
            </li>

            <li>
                <div class="header">
                    <cite></cite>
                    <a href="flow.html" target="rightFrame">***工务段</a>
                    <i></i>
                </div>
                <ul class="sub-menus">
                    <li><a href="javascript:;">人员信息</a></li>
                    <li><a href="javascript:;">标签信息</a></li>
                    <li><a href="javascript:;">数据信息</a></li>
                </ul>
            </li>
        </ul>
    </dd>

    <dd><div class="title"><span><img src="<%=basePath%>/images/leftico01.png" /></span>东北区</div>
        <ul class="menuson">
            <li>
                <div class="header">
                    <cite></cite>
                    <a href="flow.html" target="rightFrame">***工务段</a>
                    <i></i>
                </div>
                <ul class="sub-menus">
                    <li><a href="javascript:;">人员信息</a></li>
                    <li><a href="javascript:;">标签信息</a></li>
                    <li><a href="javascript:;">数据信息</a></li>
                </ul>
            </li>

            <li>
                <div class="header">
                    <cite></cite>
                    <a href="flow.html" target="rightFrame">***工务段</a>
                    <i></i>
                </div>
                <ul class="sub-menus">
                    <li><a href="javascript:;">人员信息</a></li>
                    <li><a href="javascript:;">标签信息</a></li>
                    <li><a href="javascript:;">数据信息</a></li>
                </ul>
            </li>
        </ul>
    </dd>

</dl>

</body>
</html>

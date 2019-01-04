<%--
  Created by IntelliJ IDEA.
  User: JDY
  Date: 2019-01-02
  Time: 14:53
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
    <%--<script type="text/javascript" src="<%=basePath%>/js/printArea/jquery-3.2.1.min.js"></script>--%>
    <script type="text/javascript" src="<%=basePath%>/js/printArea/jquery.PrintArea.js"></script>
</head>
<body>
    <div class="u-wrap resource">
        <div class="mainbackground nopadding mt15">
            <div class="heading headingImp">
                <h2 class="h5">打印数据</h2>
                <div class="search searchAdmin" onclick="printReceipt();">
                    <a href="javascript:;" class="btn btn-mini btn-primary">打印全部</a>
                </div>
                <span class="line"></span>
            </div>
            <!--5.2.9新加页面开始-->
            <div class="lxs-priDa" id="printReceipt">
                <%-- 数据表格begin --%>
                <div class="lxs-priLi mb-30" name="printCenter">
                    <div class="lxs-priLi-ti">
                        <h3 class="color-black">标题</h3>
                    </div>
                    <div class="clear lxs-priLi-info mb-6">
                        <p class="fl">
                            <span class="color-gray mr-40">里程：<strong class="color-black">${baseData.mileage}公里</strong></span>
                            <span class="color-gray mr-40">道床类型：<strong class="color-black">${baseData.track_bed_type}</strong></span>
                            <span class="color-gray mr-40">扣件类型：<strong class="color-black">${baseData.fastener_type}</strong></span>
                            <span class="color-gray mr-40">锁定温度：<strong class="color-black">${baseData.temperature}℃</strong></span>
                        </p>
                    </div>

                    <table class="lxs-priTab" >
                        <colgroup>
                            <col width="4%">
                            <col width="23%">
                            <col width="10%">
                            <col width="10%">
                            <col width="10%">
                            <col width="10%">
                            <col width="33%">
                        </colgroup>
                        <thead>
                            <tr>
                                <th><span>序号</span></th>
                                <th><span>时间</span></th>
                                <th><span>作业人员</span></th>
                                <th><span>轨距</span></th>
                                <th><span>超高</span></th>
                                <th><span>轨面高程</span></th>
                                <th><span>问题描述</span></th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${labelList.data}" var="labelInfor" varStatus="recorder">
                                <tr>
                                    <td><span class="prit-con">${recorder.count}</span></td>
                                    <td><span class="prit-con">${labelInfor.time.substring(0,9)}</span></td>
                                    <td><span class="prit-con">${labelInfor.personNumber}</span></td>
                                    <td><span class="prit-con">${labelInfor.l}</span></td>
                                    <td><span class="prit-con">${labelInfor.i}</span></td>
                                    <td><span class="prit-con">${labelInfor.h}</span></td>
                                    <td><span class="prit-con">${labelInfor.q}</span></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>

                    <div class="clear lxs-priLi-info mt-16">
                        <p class="fl mr-40">
                            <span class="color-gray">备注1：<strong class="color-black"></strong></span>
                        </p>
                        <p class="fl">
                            <span class="color-gray mr-40">备注2：<strong class="color-black"></strong></span>
                            <span class="color-gray mr-40">备注3：<strong class="color-black"></strong></span>
                        </p>
                    </div>
                </div>
                <%-- 数据表格end --%>
                <div style='page-break-after: always;'></div>
            </div>
            <!--5.2.9新加页面结束-->
        </div>
    </div>


    <script>
        $(function(){
            $('#fi_li').addClass('active');
        });
        function printReceipt() {
            $('#printReceipt').printArea();
        }
    </script>
</body>
</html>

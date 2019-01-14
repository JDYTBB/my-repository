<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@include file="/decorators/import.jsp"%>
<!doctype html>
<html lang="zh-cn">
<head>
    <meta charset="UTF-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <c:choose>
        <c:when test="${! empty sessionScope.domain_icon}">
            <link rel="icon" href="${sessionScope.domain_icon}" type="image/x-icon" />
        </c:when>
        <c:otherwise>
            <link rel="icon" href="<%=rootPath%>/images/favicon.ico" type="image/x-icon" />
        </c:otherwise>
    </c:choose>
    <title>打印收据</title>
    <link rel="stylesheet" href="<%=rootPath%>/stylesheets/fatstyle.css?version=${version}" />
    <link rel="stylesheet" type="text/css" href="<%=rootPath%>/stylesheets/manage.css?version=${version}" />
    <link rel="stylesheet" href="<%=rootPath%>/stylesheets/css/newresource.css?version=${version}">
    <link rel="stylesheet" type="text/css" href="<%=rootPath%>/stylesheets/resource.css?version=${version}" />
    <link rel="stylesheet" type="text/css" href="<%=rootPath%>/stylesheets/printform.css?version=${version}" />
</head>
<body>
<!-- 二级导航 -->
<jsp:include page="/WEB-INF/jsp/menu/menu_balance.jsp"></jsp:include>
<!--  内容开始 -->
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
            <c:forEach items="${receiptList }" var="receipt">
                <div class="lxs-priLi mb-30" name="printCenter">
                    <div class="lxs-priLi-ti">
                        <h3 class="color-black">${receipt.companyName}电子收据</h3>
                    </div>
                    <div class="clear lxs-priLi-info mb-6">
                        <p class="fl mr-40">
                            <strong class="color-black">${receipt.stuName}</strong>
                        </p>
                        <p class="fl">
                            <span class="color-gray mr-40">订单编号：<strong class="color-black">${receipt.orderNum}</strong></span>
                            <span class="color-gray mr-40">购买日期：<strong class="color-black">
                                <fmt:formatDate value="${receipt.payDate}" pattern="yyyy-MM-dd"/>
                            </strong></span>
                        </p>
                    </div>
                    <table class="lxs-priTab" >
                        <colgroup>
                            <col width="4%">
                            <col width="24%">
                            <col width="11%">
                            <col width="11%">
                            <col width="28%">
                            <col width="11%">
                            <col width="11%">
                        </colgroup>
                        <thead>
                        <tr>
                            <th><span>序号</span></th>
                            <th><span>年级</span></th>
                            <th><span>专业</span></th>
                            <th><span>商品类型</span></th>
                            <th><span>商品名称</span></th>
                            <th><span>缴费渠道</span></th>
                            <th><span>金额</span></th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td><span>1</span></td>
                            <td><span>${receipt.grade}</span></td>
                            <td><span>${receipt.aimExamMajor}</span></td>
                            <td><span>${receipt.commodityType}</span></td>
                            <td><span>${receipt.commodityName}</span></td>
                            <td><span>${receipt.payMethod}</span></td>
                            <td><span>￥${receipt.payPrice}</span></td>
                        </tr>
                        <tr>
                            <td><span class="prit-con"></span></td>
                            <td><span class="prit-con"></span></td>
                            <td><span class="prit-con"></span></td>
                            <td><span class="prit-con"></span></td>
                            <td><span class="prit-con"></span></td>
                            <td><span class="prit-con"></span></td>
                            <td><span class="prit-con"></span></td>
                        </tr>
                        <tr>
                            <td><span class="prit-con"></span></td>
                            <td><span class="prit-con"></span></td>
                            <td><span class="prit-con"></span></td>
                            <td><span class="prit-con"></span></td>
                            <td><span class="prit-con"></span></td>
                            <td><span class="prit-con"></span></td>
                            <td><span class="prit-con"></span></td>
                        </tr>
                        </tbody>
                        <tfoot>
                        <tr>
                            <td colspan="5"><span>合计金额（大写）：<strong></strong>${receipt.payPriceCapital}</span></td>
                            <td colspan="2"><span>合计：<b>￥${receipt.payPrice}</b></span></td>
                        </tr>
                        </tfoot>
                    </table>
                    <div class="clear lxs-priLi-info mt-16">
                        <p class="fl mr-40">
                            <span class="color-gray">课程顾问：<strong class="color-black">${receipt.followUp}</strong></span>
                        </p>
                        <p class="fl">
                            <span class="color-gray mr-40">收款单位：<strong class="color-black">${receipt.companyName}</strong></span>
                            <span class="color-gray mr-40">联系电话：<strong class="color-black">${receipt.companyPhone}</strong></span>
                        </p>
                    </div>
                </div>
                <div style='page-break-after: always;'></div>
            </c:forEach>
        </div>
        <!--5.2.9新加页面结束-->
    </div>
</div>
<!--老师选时间弹框结束-->
<!--背景阴影开始-->
<div class="bg-layer-tips"></div>
<!--背景阴影结束-->
<!--添加结束代下拉-->
<!-- ajax加载中div开始 -->
<div class="loading lp-units-loading" style="display:none">
    <p><i></i>加载中,请稍后...</p>
</div>
<div class="loading-bg lp-units-loading-bg" style="display:none"></div>
<!--  ajax加载中div结束 -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script type="text/javascript" src="<%=rootPath%>/javascripts/plus/jquery.min.js?version=${version}"></script>
<script type="text/javascript" src="<%=rootPath%>/javascripts/plus/jquery.PrintArea.js?version=${version}"></script>
<script>
    $(function(){
        $('#fi_li').addClass('active');
    })
    function printReceipt() {
        $('#printReceipt').printArea();
    }
</script>
</body>
</html>
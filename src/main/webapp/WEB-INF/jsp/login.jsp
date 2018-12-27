<%--
  Created by IntelliJ IDEA.
  User: JDY
  Date: 2018-12-26
  Time: 14:48
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
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>巡检管理系统用户登录</title>
    <link href="<%=basePath%>/css/login.css" rel="stylesheet" rev="stylesheet" type="text/css" media="all"/>
    <script type="text/javascript" src="<%=basePath%>/js/login-js/jQuery1.7.js"></script>
    <script type="text/javascript" src="<%=basePath%>/js/login-js/jquery-1.8.2.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>/js/login-js/jquery1.42.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>/js/login-js/jquery.SuperSlide.js"></script>
    <script type="text/javascript" src="<%=basePath%>/js/login-js/Validform_v5.3.2_min.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            var $tab_li = $('#tab ul li');
            $tab_li.hover(function () {
                $(this).addClass('selected').siblings().removeClass('selected');
                var index = $tab_li.index(this);
                $('div.tab_box > div').eq(index).show().siblings().hide();
            });
        });
    </script>
    <script type="text/javascript">
        $(function () {
            /*学生登录信息验证*/
            $("#stu_username_hide").focus(function () {
                var username = $(this).val();
                if (username == '输入账号') {
                    $(this).val('');
                }
            });
            $("#stu_username_hide").focusout(function () {
                var username = $(this).val();
                if (username == '') {
                    $(this).val('输入账号');
                }
            });
            $("#stu_password_hide").focus(function () {
                var username = $(this).val();
                if (username == '输入密码') {
                    $(this).val('');
                }
            });
            $("#stu_password_hide").focusout(function () {
                var username = $(this).val();
                if (username == '') {
                    $(this).val('输入密码');
                }
            });
            $("#stu_code_hide").focus(function () {
                var username = $(this).val();
                if (username == '输入验证码') {
                    $(this).val('');
                }
            });
            $("#stu_code_hide").focusout(function () {
                var username = $(this).val();
                if (username == '') {
                    $(this).val('输入验证码');
                }
            });
            $(".stu_login_error").Validform({
                tiptype: function (msg, o, cssctl) {
                    var objtip = $(".stu_error_box");
                    cssctl(objtip, o.type);
                    objtip.text(msg);
                },
                ajaxPost: true
            });

        });
    </script>
</head>

<body>
<div id="tab">
    <ul class="tab_menu">
        <li class="selected" style="width: 99.7%">用户登录</li>
    </ul>
    <div class="tab_box">
        <!-- 学生登录开始 -->
        <div>
            <div class="stu_error_box" hidden></div>
            <form action="<%=basePath%>/user/userLogin.do" id="login-form" method="post" class="stu_login_error">
                <div id="username">
                    <label>账&nbsp;&nbsp;&nbsp;号：</label>
                    <input type="text" id="stu_username_hide" name="username" value="输入账号" nullmsg="账号不能为空！"
                           datatype="s6-18" errormsg="账号范围在6~18个字符之间！" sucmsg="账号验证通过！"/>
                    <!--ajaxurl="demo/valid.jsp"-->
                </div>
                <div id="password">
                    <label>密&nbsp;&nbsp;&nbsp;码：</label>
                    <input type="password" id="stu_password_hide" name="password" value="输入密码" nullmsg="密码不能为空！"
                           datatype="*6-16" errormsg="密码范围在6~16位之间！" sucmsg="密码验证通过！"/>
                </div>
                <div id="code">
                    <label>验证码：</label>
                    <%--<input type="text" id="stu_code_hide" name="code" value="输入验证码" nullmsg="验证码不能为空！" datatype="*4-4" errormsg="验证码有4位数！" sucmsg="验证码验证通过！" required/>--%>
                    <input type="text" id="stu_code_hide" name="code" value="输入验证码" required/>
                    <%--<img id="verification_img" align="center" src="images/login-img/captcha.jpg" title="点击更换" alt="验证码占位图"/>--%>
                    <canvas width="100" height="40" id="verifyCanvas" hidden></canvas>
                    <img id="verification_img" align="center" alt="验证码占位图"/>
                </div>
                <div id="remember">
                    <input type="checkbox" name="remember">
                    <label>记住密码</label>
                </div>
                <div id="login">
                    <button id="btn_submit" type="button">登录</button>
                </div>
            </form>
        </div>
        <!-- 学生登录结束-->
    </div>
</div>
<div class="bottom">1111<a href="javascript:;" target="_blank">关于</a> <span>2222</span> More Information <a
        href="http://www.lcbw.com/" target="_blank" title="后台系统">龙辰博望</a> - Collect from <a href="http://www.lcbw.com/"
                                                                                            title="巡检系统"
                                                                                            target="_blank">巡检系统</a>
</div>
<div class="screenbg">
    <ul>
        <li><a href="javascript:;"><img src="<%=basePath%>/images/login-img/4.jpg"></a></li>
    </ul>
</div>
</body>
<script>
    var nums = ["1", "2", "3", "4", "5", "6", "7", "8", "9", "0", 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
        'L', 'M', 'N', 'O', 'P', 'Q', 'R',
        'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
        'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
        'y', 'z'
    ];
    var colors = []
    drawCode();

    // 绘制验证码
    function drawCode() {
        var canvas = document.getElementById("verifyCanvas"); //获取HTML端画布
        var context = canvas.getContext("2d"); //获取画布2D上下文
        context.fillStyle = "#FFFFFF"; //画布填充色
        context.fillRect(0, 0, canvas.width, canvas.height);
        // 创建渐变
        var gradient = context.createLinearGradient(0, 0, canvas.width, 0);
        gradient.addColorStop("0", "magenta");
        gradient.addColorStop("0.5", "blue");
        gradient.addColorStop("1.0", "red");
        //清空画布
        context.fillStyle = gradient; //设置字体颜色
        context.font = "25px Arial"; //设置字体
        //var rand = new Array();
        rand = new Array();
        var x = new Array();
        var y = new Array();
        for (var i = 0; i < 4; i++) {
            rand[i] = nums[Math.floor(Math.random() * nums.length)]
            x[i] = i * 16 + 10;
            y[i] = Math.random() * 20 + 20;
            context.fillText(rand[i], x[i], y[i]);
        }
        //画3条随机线
        for (var i = 0; i < 3; i++) {
            drawline(canvas, context);
        }

        // 画10个随机点
        for (var i = 0; i < 10; i++) {
            drawDot(canvas, context);
        }
        convertCanvasToImage(canvas);
    }

    // 随机线
    function drawline(canvas, context) {
        context.moveTo(Math.floor(Math.random() * canvas.width), Math.floor(Math.random() * canvas.height)); //随机线的起点x坐标是画布x坐标0位置，y坐标是画布高度的随机数
        context.lineTo(Math.floor(Math.random() * canvas.width), Math.floor(Math.random() * canvas.height)); //随机线的终点x坐标是画布宽度，y坐标是画布高度的随机数
        context.lineWidth = 0.5; //随机线宽
        context.strokeStyle = 'rgba(50,50,50,0.3)'; //随机线描边属性
        context.stroke(); //描边，即起点描到终点
    }

    // 随机点(所谓画点其实就是画1px像素的线，方法不再赘述)
    function drawDot(canvas, context) {
        var px = Math.floor(Math.random() * canvas.width);
        var py = Math.floor(Math.random() * canvas.height);
        context.moveTo(px, py);
        context.lineTo(px + 1, py + 1);
        context.lineWidth = 0.2;
        context.stroke();

    }

    // 绘制图片
    function convertCanvasToImage(canvas) {
        document.getElementById("verifyCanvas").style.display = "none";
        var image = document.getElementById("verification_img");
        image.src = canvas.toDataURL("image/png");
        return image;
    }

    // 点击图片刷新
    document.getElementById('verification_img').onclick = function () {
        $('#verifyCanvas').remove();
        $('#stu_code_hide').after('<canvas width="100" height="40" id="verifyCanvas"></canvas>')
        drawCode();
    }

    $("#btn_submit").click(function(e) {
        var status = $(".stu_error_box").text();
        var newRand = rand.join('').toUpperCase();
        //下面就是判断是否==的代码，无需解释
        var oValue = $('#stu_code_hide').val().toUpperCase();

        if(status == "密码验证通过！" || status == "status: 200; statusText: OK"){
            console.log(status);
            if (oValue == 0) {
                alert('请输入验证码');
            } else if (oValue != newRand) {
                alert('验证码不正确，请重新输入');
                oValue = ' ';
            } else {
                document.getElementById("login-form").submit();
            }
        }
    });

</script>
</html>


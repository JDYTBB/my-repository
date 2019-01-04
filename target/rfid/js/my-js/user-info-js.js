//点击删除按钮时候弹出删除提示框
$(document).on('click','.deleteClick',function(){
    var id = $(this).attr("data-id");
    $('.deleteTip').fadeIn(200);//删除提示框
    //点击确定先关闭提示框，再执行删除
    deleteBox(id);
});

//点击修改时候出现修改提示框
$(document).on('click','.modifyClick',function(){
    var id = $(this).attr("data-id");
    $('.modiTip').fadeIn(200);//修改提示框
    //点击确定先关闭提示框，再进入修改界面
    modifyBox(id);
});

//点击删除时候的操作function
function deleteBox(id){
    var pageContext = $("#PageContext").val();
    //box点击关闭小叉号
    $(".tiptop a").click(function() {
        $(".deleteTip").fadeOut(200);//关闭提示框小叉号
    });

    //box点击取消
    $(".cancel").click(function() {
        $(".deleteTip").fadeOut(100);//点击取消后提示框隐藏
    });

    //删除box点击确定
    $(".sure").click(function() {
        $(".deleteTip").fadeOut(100);//点击确定后提示框隐藏
        $.ajax({
            url : pageContext+"/controller/deleteStaff.do",//删除staff的url
            type : "post",
            data : {"id": id},
            dataType : "json",
            success : function(data){
                if(data.json[0] == 1){
                    window.location.href = pageContext+"/jsp/staffmanager.do";//删除成功后进行页面请求
                }
            }
        });
    });
}

//点击修改时候的操作function
function modifyBox(id){
    var pageContext = $("#PageContext").val();
    //box点击关闭小叉号
    $(".tiptop a").click(function() {
        $(".modiTip").fadeOut(200);//关闭提示框小叉号
    });

    //box点击取消
    $(".cancel").click(function() {
        $(".modiTip").fadeOut(100);//点击取消后提示框隐藏
    });

    //修改box点击确定
    $(".sure").click(function() {
        $(".modiTip").fadeOut(100);//点击确定后提示框隐藏
        $.ajax({
            url : pageContext+"/session/staffSessionId.do",//将id存进session中
            type : "post",
            data : {"id": id},
            dataType : "json",
            success : function(data){
                if(data.json[0] == 1){
                    window.location.href = pageContext+"/jsp/modifyStaffJsp.do";//根据上边sessionId进行内容查找，jsp回显
                }
            }
        });
    });
}
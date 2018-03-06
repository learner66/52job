<%--
  Created by IntelliJ IDEA.
  User: ku
  Date: 2018/1/22
  Time: 上午9:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<script type="text/javascript" src="../../js/jquery-3.2.1.js"></script>
<html>
  <head>

    <title>注册</title>
    <script>
        function publish() {
            var position = $("#userName").val();
            alert(position);
            data = JSON.stringify(data);
            $.ajax({
                url: '/person/sendCode',//修改
                type: 'post',
                dataType: 'json',
                data: {userName:username},
                success: succFunction,
                error: erryFunction
            })

            function erryFunction(data) {
                if(data.msg!=null){
                alert(data.msg);
                }else{
                    if(data==null){
                        alert("失败");
                    }else{
                        alert("失败");
                    }
                }
            }

            function succFunction(data) {
                if(data.msg!=null){
                    alert(data.msg);
                }else{
                    if(data==null){
                        alert(data);
                    }else{
                        alert(data);
                    }
                }
            }
        }
    </script>
  </head>
  <body>
   <form action="${pageContext.request.contextPath}/person/register" method="post">
      账号：(手机或邮箱) <input type="text"  name="userName" id="userName" ><br>
      密码：<input type="password" name="passWord"><br>
      验证码:<input type="text" name="verifyNum" >
       <input type="button"  onclick="publish()" value="发送验证码"><br>
      <input type="submit" value="注册">

   </form>

  </body>
</html>

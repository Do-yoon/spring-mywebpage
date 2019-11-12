<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2019-11-02
  Time: 오후 6:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Administrator login</title>
    <!--%@ include file="../include/header.jsp" %-->
    <script>
        $(document).ready(function(){
            $("#btnLogin").click(function () {
                var userId = $("#id").val();
                var userPw = $("#pw").val();
                if(userId == ""){
                    alert("아이디를 입력하세요.")
                    $("#id").focus();
                    return;
                }
                if(userPw == "")
                document.form1.action="${path}/admin/loginCheck.do"
                document.form1.submit();
            });
        });
    </script>
</head>
<body>
<%@ include file="../include/menu.jsp" %>
<h2>Login</h2>
<form name="form1" method="post">
    <table border="1" width="400px">
        <tr>
            <td>ID</td>
            <td><input name="id" id="id"></td>
        </tr>
        <tr>
            <td>PASSWORD</td>
            <td><input type="password" name="pw" id="pw"></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <button type="button" id="btnLogin">Login</button>
                <c:if test="${msg == 'failure'}">
                    <div style="color: red">
                        wrong ID or PASSWORD
                    </div>
                </c:if>
                <c:if test="${msg == 'logout'}">
                    <div style="color: red">
                        logged out
                    </div>
                </c:if>
            </td>
        </tr>
    </table>
</form>
</body>
</html>

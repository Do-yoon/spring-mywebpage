<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2019-11-02
  Time: 오후 6:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cheeze the Programmer</title>
    <!--%@ include file="../include/header.jsp"%-->
</head>
<body>
    <%@ include file="../include/menu.jsp"%>
    <c:if test="${msg == 'success'}">
        <h2>${sessionScope.userId} 님 환영합니다!</h2>
    </c:if>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2019-11-02
  Time: 오후 6:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<a href="${path}/admin/profile"></a>
<c:choose>
    <c:when test="${sessionScope.userId == null}">
        <a href="${path}/admin/login.do">로그인</a>
    </c:when>
    <c:otherwise>
        ${sessionScope.userId}님이 로그인 중입니다.
    </c:otherwise>
</c:choose>

<hr>
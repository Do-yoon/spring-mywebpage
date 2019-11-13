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
    <script>
      $(document).ready(function(){
        $("#inputCareer").click(function(){
          var company = $("#company").val();
          var startDate = $("#startDate").val();
          var quitDate = $("#quitDate").val();
          var intro = $("#intro").val();
          if(id == "" || startDate == "" || quitDate == "" ||intro == ""){
            alert("빈칸은 다 채웠니...? 확인해보렴");
            return;
          }
          document.careerForm.action = "{path}/admin/category/update/career";
          document.careerForm.submit();
        })
      })
    </script>
</head>
<body>
    <%@ include file="../include/menu.jsp"%>
    <h2>커리어</h2>
    <!--c-if-->
    <form name="careerForm" method="post">
      <label for="company">회사</label>
      <input type="text" name="company" id = "company"><br>
      <label for="startDate" id="startDate">입사일</label>
      <input type="datetime-local"/><br>
      <label for="quitDate" id="quitDate">퇴사일</label>
      <input type="datetime-local"/><br>
      <label for="intro">소개</label>
      <input type="text"><br>
      <button type="button" id="inputCareer">입력</button>
    </form>
</body>
</html>

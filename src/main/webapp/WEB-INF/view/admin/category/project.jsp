<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cheeze the Programmer</title>
    <!--%@ include file="../include/header.jsp"%-->
    <script>
      $(document).ready(function(){
        $("#inputProject").click(function(){
          var company = $("#company").val();
          var startDate = $("#startDate").val();
          var endDate = $("#endDate").val();
          var intro = $("#intro").val();
          if(id == "" || startDate == "" || endDate == "" ||intro == ""){
            alert("빈칸은 다 채웠니...? 확인해보렴");
            return;
          }
          document.projectForm.action = "{path}/admin/category/update/project";
          document.projectForm.submit();
        })
      })
    </script>
</head>
<body>
    <%@ include file="../include/menu.jsp"%>
    <h2>프로젝트</h2>
    <form name="projectForm" method="post">
      <label for="startDate" id="startDate">시작일</label>
      <!--input type="datetime-local"/><br-->
      <input type="text" name="startDate" id="startDate"><br>
      <label for="endDate" id="endDate">마감일</label>
      <!--input type="datetime-local"/><br-->
      <input type="text" name="endDate" id="endDate"><br>
      <label for="intro">소개</label>
      <input type="text"><br>
      <button type="button" id="inputProject">입력</button>
    </form>
</body>
</html>

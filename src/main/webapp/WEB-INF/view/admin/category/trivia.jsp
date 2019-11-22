<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cheeze the Programmer</title>
    <!--%@ include file="../include/header.jsp"%-->
    <script>
      $(document).ready(function(){
        $("#inputCareer").click(function(){
          var intro = $("#intro").val();
          if(intro == ""){
            alert("빈칸은 다 채웠니...? 확인해보렴");
            return;
          }
          document.profileForm.action = "{path}/admin/category/update/trivia";
          document.profileForm.submit();
        })
      })
    </script>
</head>
<body>
    <%@ include file="../include/menu.jsp"%>
    <h2>프로필</h2>
    <form name="profileForm" method="put">
      <label for="intro">소개</label>
      <input type="text"><br>
      <button type="button" id="inputProfile">입력</button>
    </form>
</body>
</html>

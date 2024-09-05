<%--
  Created by IntelliJ IDEA.
  User: snhng
  Date: 2024. 9. 5.
  Time: 오후 2:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Quiz</title>
</head>
<body>
<form action="/quiz" method="post">
    ${quiz1}: <input type="text" name="name"><br>
    ${quiz2}: <input type="text" name="age"><br>
    ${quiz3}: <input type="text" name="birth"><br>
    <button type="submit">제출</button>
</form>
</body>
</html>

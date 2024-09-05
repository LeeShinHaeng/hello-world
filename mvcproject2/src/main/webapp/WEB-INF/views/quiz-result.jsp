<%--
  Created by IntelliJ IDEA.
  User: snhng
  Date: 2024. 9. 5.
  Time: 오후 2:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Quiz Result</title>
</head>
<body>
<h3>점수: ${quizSession.score} / 3</h3>

<a href="/restart">퀴즈 재시작</a>
</body>
</html>

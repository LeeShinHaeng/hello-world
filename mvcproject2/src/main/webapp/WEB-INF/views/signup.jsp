<%--
  Created by IntelliJ IDEA.
  User: snhng
  Date: 2024. 9. 3.
  Time: 오전 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="user">
    이름: <form:input path="name"/><br>
    이메일: <form:input path="email"/><br>
    비밀번호: <form:input path="password"/><br>
    나이: <form:input path="age"/><br>
    <input type="submit" value="가입"/>
</form:form>
</body>
</html>

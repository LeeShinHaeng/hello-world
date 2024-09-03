<%--
  Created by IntelliJ IDEA.
  User: snhng
  Date: 2024. 9. 3.
  Time: 오전 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form:form modelAttribute="login">
  이름: <form:input path="name"/><br>
  비밀번호: <form:input path="password"/><br>
  <input type="submit" value="로그인"/>
</form:form>
</body>
</html>

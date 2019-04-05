<%--
  Created by IntelliJ IDEA.
  User: bart
  Date: 17.02.19
  Time: 09:26
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
    <style>

    </style>
</head>
<body>

<h1>Signed in.</h1>

Welcome: ${user.login}<br>
name: ${user.firstName}<br>
last name: ${user.lastName}<br>
email: ${user.email}


</body>
</html>

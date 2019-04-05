<%--
  Created by IntelliJ IDEA.
  User: bart
  Date: 17.02.19
  Time: 09:26
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
    <style>

    </style>
</head>
<body>

<h1>Sign in or register.</h1>
<form:form method="POST" enctype="utf8" action="/home">

    <table>
        <tr>
            <td>Login:</td>
            <td><input type="text" id="loginParam" name="loginParam"></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type="password" id="passwordParam" name="passwordParam"></td>
        </tr>
    </table>
    <input type="submit" value="Sign-in">
</form:form>
<a href="http://localhost:8080/registration_form">Register</a>
<br>
<br>

<table>
    <tr>
        <th colspan="2">Latest Tweets</th>
    </tr>
<c:forEach items="${allTweets}" var="tweet">
    <tr>
        <th>Created by: ${tweet.user.login}<br>
            Created on: ${tweet.created}
        </th>
        <th>
            Tweet
        </th>
    </tr>
    <tr>
        <td></td>
        <td>${tweet.text}</td>
    </tr>
</c:forEach>
</table>

</body>
</html>

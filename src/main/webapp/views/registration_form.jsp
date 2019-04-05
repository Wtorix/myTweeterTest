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

<h1>Registration</h1>

<form:form method="POST" enctype="utf8" modelAttribute="userRegistrationDto">
    <table>
        <tr>
            <td> Login:</td>
            <td>
                <form:input path="login"/> <form:errors path="login" cssStyle="color: red"/>
            </td>
        </tr>
         <tr>
            <td>Firstname:</td>
            <td>
                <form:input path="firstName"/> <form:errors path="firstName" cssStyle="color: red"/>
            </td>
        </tr>
         <tr>
            <td>Lastname:</td>
            <td>
                <form:input path="lastName"/> <form:errors path="lastName" cssStyle="color: red"/>
            </td>
        </tr>
         <tr>
            <td>Email:</td>
            <td><form:input path="email"/> <form:errors path="email" cssStyle="color: red"/></td>
        </tr>
         <tr>
            <td>Password (lower, upper, digit, min 6):</td>
            <td>
                <form:password path="password"/> <form:errors path="password" cssStyle="color: red"/>
            </td>
        </tr>  <tr>
            <td>Repeat password:</td>
            <td>
                <form:password path="repeatPassword"/> <form:errors path="repeatPassword" cssStyle="color: red"/>
            </td>
        </tr>

<tr>

    <td><input type="submit" value="Register"></td>
</tr>

            <%--Repeat password: <form:password path="repeatPassword"/> <br>--%>
            <%--<form:errors path="repeatPassword"/>--%>

    </table>
</form:form>


</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: miral
  Date: 7/6/2017
  Time: 11:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Submit</title>
    <h3>${heading}</h3>
</head>
<body>
<h2>form</h2>
<form method="post" action="user">
    <input name="firstName" placeholder="firstName" type="text"/><br>
    <input name="lastName" placeholder="lastName" type="text"/><br>
    <p>
        <input type="submit" class="btn btn-default" href="#" role="button"/>
    </p>
</form>
</body>
</html>

<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Legion
  Date: 12.03.2021
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Registration</h1>
<%
    if(request.getAttribute("errors") != null) {
%>
<div>
    <ul>
        <%
            for (String error: (List<String>)request.getAttribute("errors")){
        %>
        <li>
            <%=error%>
        </li>
        <%
            }
        %>
    </ul>
</div>
<%
    }
%>
<form action="register" method="post">
    <div class="mb-3">
        <label>Name</label>
        <input name="name" type="text">
    </div>
    <div class="mb-3">
        <label>Email</label>
        <input name="email" type="email">
    </div>
    <div class="mb-3">
        <label>Password</label>
        <input name="password" type="password">
    </div>
    <div class="mb-3">
        <label>Confirm Password</label>
        <input name="password_confirmation" type="password">
    </div>
    <a href="login">Already have account?</a>
    <a href="index">Back</a>
    <button type="submit">Submit</button>
</form>

</body>
</html>

<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Legion
  Date: 12.03.2021
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Login</h1>
<%
    if(request.getAttribute("errors") != null) {
%>
<ul class="m-3 p-3">
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
<%
    }
%>
<form action="login" method="post">
    <label>Email</label>
    <input name="email" type="email">
    <br>
    <label class="form-label">Password</label>
    <input name="password" type="password">
    <br>
    <a href="register">Don't have account?</a>
    <br>
    <a href="index">Back</a>
    <br>
    <button type="submit">Submit</button>
</form>

</body>
</html>

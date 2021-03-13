<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Profile</h1>

<table>
    <tr>
        <td>Email:</td>
        <td><%=request.getParameter("email")%></td>
    </tr>
    <%
        if(request.getAttribute("isNew") != null) {
    %>
    <tr>
        <td>Name:</td>
        <td><%=request.getParameter("name")%></td>
    </tr>
    <%
        }
    %>
</table>

<a href="index">Go to Home Page</a>

</body>
</html>

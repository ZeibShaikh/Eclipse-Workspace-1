<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String myname=(String) session.getAttribute("name_key");
%>
<h1>Welcome <%=myname%></h1>
<a href="index.jsp">Home</a>
<a href="about.jsp">About</a>s
<a href="logout">Logout</a>
</body>
</html>
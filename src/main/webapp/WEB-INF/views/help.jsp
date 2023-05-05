<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>This is help page</h1>
<%
   String name = (String) request.getAttribute("name");
   int rollNo = (Integer)request.getAttribute("rollno");
   LocalDateTime time =(LocalDateTime) request.getAttribute("time");
%>
<h1>Name :<%=name %></h1>
<h1>Roll no : <%=rollNo %></h1>
<h1>Current Data and time is <%=time %></h1>

<h1></h1>
</body>
</html>
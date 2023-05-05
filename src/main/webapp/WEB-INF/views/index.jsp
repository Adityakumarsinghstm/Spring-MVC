<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>This is Home page</h1>
	<h1>called by home controller</h1>
	<%
	String name = (String) request.getAttribute("name");
	Integer id = (Integer)request.getAttribute("id");
	List<String> friends = (List<String>)request.getAttribute("friends");
	%>
	<h1> Name is  <%=name  %></h1>
	<h1>id is <%=id %></h1>
	<%
	  for(String f:friends)
	  {
    %>
		  <h1><%=f %></h1>
	<%
	  }
	%>
</body>
</html>
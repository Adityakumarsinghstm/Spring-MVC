<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
     <h1>This is home page</h1>
     <h1>This is called by home controller</h1>
     <h1>url /home</h1>
     <% 
     String name = (String)request.getAttribute("name");
     int id = (Integer)request.getAttribute("id");
     List<String> frnds =(List<String>)request.getAttribute("f");
     %>
     <h1>Name is <%=name %></h1>
     <h1>Id is <%=id %></h1>
     
     <%
      for(String s: frnds)
      {
     %>
        <h1>Friend of adi is :<%=s %></h1>
     
     <% }
     %>
</body>
</html>
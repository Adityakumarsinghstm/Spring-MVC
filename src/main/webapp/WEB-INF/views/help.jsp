<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>This is help page</h1>


	<%-- <%
   String name = (String) request.getAttribute("name");
   int rollNo = (Integer)request.getAttribute("rollno");
   LocalDateTime time =(LocalDateTime) request.getAttribute("time");
%> --%>


	<h1>
		Name :
		<%-- <%=name %> --%>
		${name }
	</h1>
	<h1>
		Roll no :
		<%-- <%=rollNo %> --%>
		${rollno }
	</h1>
	<h1>
		Current Data and time is
		<%-- <%=time %> --%>
		${time }
	</h1>
	<hr>
	<c:forEach var="item" items="${marks }">
        <%-- <h1>${item }</h1> --%>
        <h1><c:out value="${item }"></c:out></h1>
	</c:forEach>

	<h1></h1>
</body>
</html>
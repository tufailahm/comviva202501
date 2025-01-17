<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<body>
<h2>Way 1 - Printing 1---5 via scriplet</h2>
	<%
			for (int i = 1; i <= 5; i++) 
			{
	%>
	<font color="red">
	<br/>
	<%
			out.println(i);
	}
	%>
	</font>
<h2>Printing 1---5 via JSTL </h2>
<c:forEach begin="1" end="5" step="1" var="j">
	<h2>${j}</h2>
</c:forEach>


</body>
</html>








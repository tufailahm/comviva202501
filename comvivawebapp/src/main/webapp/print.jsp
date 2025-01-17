<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Date,java.util.*" %>
<!DOCTYPE html>
<html>
<body>
	<%
	for (int i = 1; i <= 3; i++) 
	{
	%>
		out.println(i);
	<%
	}
	%>
	<h2>Printing your name</h2>
	<%!int num1 = 100;
	String name = "Piyush";

	public String getMessage(int n1, int n2) {
		return n1 + n2 + "Hello Comviva";
	}%>

	<%=getMessage(12, 12)%>
	<%
	String un = request.getParameter("username");
	session.setAttribute("currentUser", un);
	for (int i = 1; i <= 5; i++) {
		out.println("<h2>" + un);
	}
	%>
	<h2>Thanks for visiting my website</h2>
	<%
	out.println("<h2> Todays date is :" + new Date());
	%>
	<h2>
		<%
		out.println("Welcome " + name);
		%><br />
		<%="Welcome" + name%>
		<%="Num1 value is :" + num1%>
	</h2>


</body>
</html>















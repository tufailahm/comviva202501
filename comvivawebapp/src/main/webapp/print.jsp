<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	%>
	<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
	
<%@ include file="company.jsp" %>
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
	session.setAttribute("uname", un);
	if(un.length()==0)
		session.setAttribute("erruname", "Username is empty");
	else
		session.setAttribute("erruname", "");

	session.setAttribute("currentUser", un);
	

	for (int i = 1; i <= 5; i++) {
		out.println("<h2>" + un);
	}
	%>
	<c:redirect url="login.jsp"></c:redirect>
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















<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login Page</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f2f2f2;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
	margin: 0;
}

.login-container {
	background-color: #fff;
	padding: 30px;
	border-radius: 8px;
	box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
	width: 300px;
}

h2 {
	text-align: center;
	color: #333;
}

.form-group {
	margin-bottom: 20px;
}

label {
	display: block;
	font-weight: bold;
	margin-bottom: 5px;
}

input[type="text"], input[type="password"] {
	width: 100%;
	padding: 10px;
	border: 1px solid #ccc;
	border-radius: 4px;
	font-size: 16px;
}

input[type="text"]:focus, input[type="password"]:focus {
	border-color: #007bff;
	outline: none;
}

.btn-login {
	width: 100%;
	padding: 10px;
	background-color: #007bff;
	color: white;
	font-size: 16px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

.btn-login:hover {
	background-color: #0056b3;
}

.forgot-password {
	text-align: center;
	margin-top: 10px;
}

.forgot-password a {
	text-decoration: none;
	color: #007bff;
}

.forgot-password a:hover {
	text-decoration: underline;
}
</style>
</head>
<body>

<h2>Comviva Login page</h2>
<% 
	String username = (String)session.getAttribute("uname");
	String errusername = (String)session.getAttribute("erruname");
	if(username==null)
		username="";
	if(errusername==null)
		errusername="";
	%>
	<div class="login-container">
		<h2>Login</h2>
		<form action="LoginController" method="POST">
			<div class="form-group">
				<label for="username">Username</label> <input type="text"
					id="username" name="username" value="<%= username %>"
					   >
					   <font color="red"><%= errusername %></font>
			</div>
			<div class="form-group">
				<label for="password">Password</label> <input type="password"
					id="password" name="password" required>
			</div>
			<button type="submit" class="btn-login">Login</button>
			<input  type="submit" class="btn-login" formaction="print.jsp">Print</button>

		</form>
		<div class="forgot-password">
			<a href="#">Forgot Password?</a>
		</div>
	</div>

</body>
</html>

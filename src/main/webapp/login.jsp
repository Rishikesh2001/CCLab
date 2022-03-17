<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login here</title>
</head>
<body>
	<h1>Employee Details</h1>
	<form action="Login" method="get">
		Enter Employee_ID: <input type="text" name="uname"><br>
		Enter Password: <input type="password" name="pass"><br>
		<input type="submit" value="Login"/>
	</form>
	<a href="signup.jsp"><button>Sign Up</button></a>
</body>
</html>
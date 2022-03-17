<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>
</head>
<body>
	<h1>Enter your details:</h1>
	<form action="Signup" method="post">
		Enter Employee_ID: <input type="text" name="id"><br>
		Enter First name: <input type="text" name="fname"><br>
		Enter Last name: <input type="text" name="lname"><br>
		Date of birth: <input type="text" name="dob"><br>
		Enter ContactNumber: <input type="text" name="contact"><br>
		Enter Password: <input type="password" name="pass"><br>
		Enter Job role: <input type="text" name="job"><br>
		Enter Monthly salary: <input type="text" name="salary"><br>
		Enter Yearly bonus: <input type="text" name="bonus"><br>
		<input type="submit" value="Submit">
	</form>
</body>
</html>
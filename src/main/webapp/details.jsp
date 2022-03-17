<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="com.login.LoginDAO"%>
    <%@page import="com.employee.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details</title>
</head>
<body>
	<%
		int empid = Integer.parseInt(request.getParameter("employee_id"));
		LoginDAO login = new LoginDAO();
		Employee emp = login.display(empid);
	%>
	
	Name:<%= emp.getFirstname() + " " + emp.getLastname() %><br>
	Contact:<%= emp.getContact() %><br>
	Job role: <%= emp.getJob() %><br>
	Salary: <%= emp.getSalary() %><br>
	Annual salary:<%= 12*emp.getSalary() + emp.getYearlyBonus() %>
	
</body>
</html>
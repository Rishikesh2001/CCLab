package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Signup")
public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Signup() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		LoginDAO loginDAO = new LoginDAO();
		int empid = Integer.parseInt(request.getParameter("id"));
		int contact = Integer.parseInt(request.getParameter("contact"));
		String pass = request.getParameter("pass");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String dob = request.getParameter("dob");
		String job = request.getParameter("job");
		float salary = Float.parseFloat(request.getParameter("salary"));
		float yearbonus = Float.parseFloat(request.getParameter("bonus"));
		
		if(loginDAO.insertEmployeeDetails(empid, fname, lname, dob, contact, job, salary, yearbonus, pass))
		{
			response.sendRedirect("report.jsp");
		}
		else {
			response.sendRedirect("login.jsp");
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}


}

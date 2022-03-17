package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.annotation.WebServlet;
import com.employee.Employee;

public class LoginDAO {
	String url = "jdbc:mysql://localhost:3306/cclab";
	String username = "root";
	String password = "Divya@143";	
	String query = "SELECT * from rishikesh_111915103_details WHERE Employee_ID_Number=? AND Password=?";
	String details = "SELECT d.Employee_ID_Number, d.First_Name, d.Last_Name, d.Contact_Number, j.Monthly_Salary, j.Job_Role, j.Yearly_Bonus from rishikesh_111915103_details d join rishikesh_111915103_salary j on d.Employee_ID_Number = j.Employee_ID_Number WHERE d.Employee_ID_Number=?";
	String insertDetails = "INSERT into rishikesh_111915103_details values (?,?,?,?,?,?)";
	String insertSalary = "INSERT into rishikesh_111915103_salary values (?,?,?,?)";
	
	public boolean insertEmployeeDetails(int empid, String fname, String lname, String dob, int contact, String job, float salary, float yearbonus, String pass) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connect = DriverManager.getConnection(url, username, password);
			
			PreparedStatement statement1 = connect.prepareStatement(insertDetails);
			statement1.setInt(1, empid);
			statement1.setString(2, fname);
			statement1.setString(3, lname);
			statement1.setString(4, dob);
			statement1.setInt(5, contact);
			statement1.setString(6, pass);
			
			PreparedStatement statement2 = connect.prepareStatement(insertSalary);
			statement2.setInt(1, empid);
			statement2.setString(2, job);
			statement2.setFloat(3, salary);
			statement2.setFloat(4, yearbonus);
			
			return true;
		} catch(Exception e){
			
		}
		return false;
	}
	
	public Employee display(int empid) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connect = DriverManager.getConnection(url, username, password);
			
			PreparedStatement statement = connect.prepareStatement(details);
			statement.setInt(1, empid);
			ResultSet set = statement.executeQuery();
			
			while(set.next()) {
				int id = set.getInt("Employee_ID_Number");
				String fname = set.getString("First_Name");
				String lname = set.getString("Last_Name");
				int contact = set.getInt("Contact_Number");
				String job = set.getString("Job_Role");
				float salary = set.getFloat("Monthly_Salary");
				float bonus = set.getFloat("Yearly_Bonus");
			
				return (new Employee(id, fname, lname, job, salary, bonus, contact));
			}
			
			
		}
		catch (Exception e) {
			
		}
		return null;
	}
	
	public boolean check(int user, String pass) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connect = DriverManager.getConnection(url, username, password);
			
			PreparedStatement statement = connect.prepareStatement(query);
			statement.setInt(1, user);
			statement.setString(2, pass);
			
			ResultSet set = statement.executeQuery();
			if(set.next()) {
				return true;
			}
		} catch(Exception e){
			e.printStackTrace();
		}
		
		return false;
	}
	
	
}
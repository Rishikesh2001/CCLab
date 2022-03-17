package com.employee;

public class Employee {
	
	int employee_id;
	String firstname;
	String lastname;
	String job;
	float salary;
	float yearly_bonus;
	int contact;
	
	public Employee(int employee_id,String firstname,String lastname,String job,float salary,float yearly_bonus,int contact) 
	{
		this.employee_id = employee_id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.job = job;
		this.salary = salary;
		this.yearly_bonus = yearly_bonus;
		this.contact = contact;
	}
	
	public Employee() {
	}
	
	public void setEmpID(int employee_id)
	{
		this.employee_id = employee_id;
	}
	public int getEmpID()
	{
		return employee_id;
	}
	
	public void setSalary(float salary)
	{
		this.salary = salary;
	}
	public float getSalary()
	{
		return salary;
	}
	
	public void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}
	public String getFirstname()
	{
		return firstname;
	}
	
	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}
	public String getLastname()
	{
		return lastname;
	}
	
	public void setJob(String job)
	{
		this.job = job;
	}
	public String getJob()
	{
		return job;
	}
	
	public void setYearlyBonus(float yearly_bonus)
	{
		this.yearly_bonus = yearly_bonus;
	}
	public float getYearlyBonus()
	{
		return yearly_bonus;
	}
	
	public void setContact(int contact)
	{
		this.contact = contact;
	}
	
	public int getContact() 
	{
		return contact;
	}
	
	public void display() 
	{
		System.out.println(employee_id);
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(job);
		System.out.println(salary);
		System.out.println(yearly_bonus);
		System.out.println(contact);
	}
}
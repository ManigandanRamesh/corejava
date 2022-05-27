package com.chainsys.miniproject.pojo;

import java.sql.Date;

public class Employee {
	  private  int employee_id;
	  private String first_name;       
	  private String last_name;      
	  private String email;           
	  private java.util.Date hire_date;              
	  private String job_id;          
	  private Float salary;    
	  public int getEmp_id() {
		return employee_id;
	}
	public void setEmp_id(int emp_id) {
		this.employee_id = emp_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public java.util.Date getHire_date() {
		return hire_date;
	}
	public void setHire_date(java.util.Date  hire_date) {
		this.hire_date =hire_date;
	}
	public String getJob_id() {
		return job_id;
	}
	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(float i) {
		this.salary = i;
	}
	            
	
}

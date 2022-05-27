package com.chainsys.miniproject.entry;

import com.chainsys.miniproject.test.TestEmployeeDao;
import com.chainsys.miniproject.ui.EmployeeUi;



public class Startup {
	public static void main(String args[]) {
		loadMenu();
	}

	private static void loadMenu() {
		System.out.println("Enter Menu : 1 is EmployeeMenu, 2 is Doctor Menu, 3 is Appointment Menu ");
		java.util.Scanner sc = new java.util.Scanner(System.in);
      try {
		int call = sc.nextInt();
		switch (call) {
		case 1:
			loadEmployeeMenu();
			break;
		case 2:
			loadMenu();
			break;
		
		}
      }finally {
    	  sc.close();
      }
	}

	private static void loadEmployeeMenu() {
		System.out.println(
				"Enter Employee Method : 1=addEmployee, 2=updateEmployeefirstname ,3=updateEmpDetails ,4=updateEmployeeSalary, 5=ViewAllEmployeeDetails, 6=viewEmployeeDetails 7=deleteEmpdetails");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
		int call = sc.nextInt();
		
		switch (call) {
		case 1:
			EmployeeUi.addNewEmployee();
			break;

		case 2:
			EmployeeUi.updateEmployeeFirstName();
			break;
		case 3:
			EmployeeUi.updateEmpDetails();
			break;
		case 4:
			EmployeeUi.updateEmployeeSalary();
			break;
		case 5:
			EmployeeUi.ViewAllEmployeeDetails();
			break;
		case 6:
			EmployeeUi.viewEmployeeDetails();
			break;
		case 7:
			EmployeeUi.deleteEmpdetails();
			break;
		}
		}finally {
			sc.close();
		}
	}
}
	

	
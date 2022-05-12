package com.chainsys.unittest;

import com.chainsys.classandmethods.Employee;

public class EmployeeTester {
	
	public static void testEmpName() {
		Employee firstEmployee = new Employee(1234);
		firstEmployee.setName("Manigandan");
		System.out.println(firstEmployee.getName());
	}
	public static void testCity() {
		Employee firstEmployee = new Employee(1234);
		firstEmployee.setCity("Chennai");
		System.out.println(firstEmployee.getCity());
	}
	public static void testSalary() {
		Employee firstEmployee = new Employee(1234);
		firstEmployee.setSalary(20000);
		System.out.println(firstEmployee.getSalary());
	}

}

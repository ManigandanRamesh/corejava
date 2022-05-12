package com.chainsys.collections;

public class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp firstEmp=new Emp(111);
		Emp secondEmp=new Emp(111);
		System.out.println(firstEmp.hashCode());
		System.out.println(secondEmp.hashCode());
		boolean result=firstEmp.equals(secondEmp);
		System.out.println(result);
		result=firstEmp.equals(firstEmp);
		System.out.println(result);
		result=firstEmp.equals("Hello");
		System.out.println(result);

	}

}

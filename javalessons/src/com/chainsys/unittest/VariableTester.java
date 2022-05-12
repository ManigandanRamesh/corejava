package com.chainsys.unittest;

import com.chainsys.variables.Startup;

public class VariableTester {
	//test static variable
	
	public static void testGlobalVariable()
	{
		//display the value of static field
		//value is zero (default value)
		//DataA is accessed without creating an object
		System.out.println("DataA: " + Startup.DataA);
		//display the value of immutable field
		//this is not possible  without an object
		//System.out.println("DataB: " + Startup.DataB);
		//display the value of constant field
		
		System.out.println("DataC: " + Startup.DataC);
		//modifying value of the static field DataA
		Startup.DataA=2345;
		System.out.println("DataA: " + Startup.DataA);
		//modifying value of the static field DataC
		//ERROR: The final field Startup.DatC cannot be assigned
		//Startup.DataC=2345;
	}
	public static void testImmutableVariable()
	{
		//cannot make  a static reference to the non static field Startup.
		//Startup.DataB=123;
		
		//first create an object or the class
		//pass an int value as an argument to the constructor
		//access the immutable instance field using the object reference
		Startup firstObject=new Startup (123);
		System.out.println(firstObject.DataB);
		
		//value assigned to an immutable field can not be changed
		//value for the immutable field can be assigned only through the constructor
		
		//firstObject.DataB=567;
		
	}
	//calling static method using class name
	//without creating an object
	
	public static void testStaticMethod() {
		  
		Startup.sayHello();
		
	}
	//calling non  static method using class name
	//without creating an object,non static methods can not be called
	public static void testNonStaticMethod()
		{
		//ERROR
		//Startup.greetUser();
		Startup firstObject=new Startup(111);
		//call the non static method
		firstObject.greetUser();
	}
	

}

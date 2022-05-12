package com.chainsys.variables;

public class Startup {
	public static int DataA;//static global variable
	public final int DataB; //immutable global variable (not static)
	public final static int DataC=300; //constant
	
	//constructor
	//constructor is a special method
	//the name of the constructor and the name of the class will be same
	//constructor don't have return type
	//Constructors can take parameters
	public Startup(int dataB)
	{
		//assigning value to the global read only field(this.DataB)
		this.DataB=dataB;
	}
	//static method can be called without an object
	public static void sayHello() {
		System.out.println("Hello Developer!!!");
	}
	//non static method
	public void greetUser()
	{
		System.out.println("Greetings User!!!");
	}

	
	}



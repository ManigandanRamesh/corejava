package com.chainsys.constructors;


	public class Shape //class with private constructor
	{
	    private Shape()
	    {
	    	System.out.println("Shape Created");
	    }
	  //factory method
	    public static Shape getShape()
	    {
	    	return new Shape();// calling the private constructor
	    }
	    public void display()
	    {
	    	System.out.println("Shape.display");
	    }
	}
	

package com.chainsys.abstractclass;


	public abstract class AbsDemoA 
	{
	  //constructor
	  public AbsDemoA()
	  {
		  System.out.println("AbsDemoA created "+hashCode());
	  }
	  //instance method
	  public void echo()
	  {
		  System.out.println("AbsDemoA echo "+hashCode());
	  }
	  // static method
	  public static void show()
	  {
		  System.out.println("AbsDemoA show ");
	  }
	}



package com.chsainsys.garbageCollection;

public class FinlaizeDemo {

	
		
			public static void main(String args[])throws Exception
			{
				Calculator c1=new Calculator();
				c1.add(100, 50);
				c1=null;
				Calculator c2=new Calculator();
				Calculator c3=new Calculator();
				//Creating an object for Runtime
				//It is not possible to Create an object directly for runtime like
				//Runtime firstRt=new Runtime();
				//The default constructor for Runtime is private here.
				//so we use a static method getRuntime() of the Runtime Class to create an object for Runtime

				Runtime rt=Runtime.getRuntime();//factorymethod
			     rt.gc();  //forcing Garbage Collection
			     c2=null;
			     c3=null;
			     rt.gc();
				//System.in.read();
			}
		}
	



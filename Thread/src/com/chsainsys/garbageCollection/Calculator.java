package com.chsainsys.garbageCollection;


	public class Calculator
	{
		public Calculator()
		{
			System.out.println("Object Created "+this.hashCode());
		}
		//the finalize method will be called on object by the gc
		protected void finalize()//overrides Object.finalize() method
		{
			System.out.println("Object Finalized "+this.hashCode());
		}
		public int add(int x,int y)
		{
			Object obj=new Object();
			System.out.println("From Add");
			return x+y;
		}
		public int div(int x,int y)
		{
			System.out.println("From div");
			return x/y;
		}
		public int product(int x,int y)
		{
			System.out.println("From product");
			return x*y;
		}

	}
	



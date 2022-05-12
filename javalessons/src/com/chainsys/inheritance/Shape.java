package com.chainsys.inheritance;


	public class Shape // base class
	{
		public int height;
		public int width;
		public Shape(int x)
		{
			height=x;
			width=x;
			System.out.println("c2 Shape Object Created "+hashCode());
		}
		//Not override able method. Not virtual method
		public final void draw()
		{
			System.out.println("Shape.draw:Height= "+height+" Width= "+width);
		}
		public final void draw(int j)
		{
			System.out.println("Shape.draw:= "+j);
		}
		
		//override able method. Virtual Method
		protected void show()
		{
			System.out.println("Shape show "+height+" Width= "+width);
		}
		// Overloaded method. override able method. Virtual Method
		public void show(int x)
		{
			System.out.println("Shape show "+x);
		}
		// Overloaded method. Override able method. Virtual Method
		public void show(double x)
		{
			System.out.println("Shape show "+x);
		}
	}



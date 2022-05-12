package com.chainsys.inheritance;


	public class Triangle extends Shape
	{
		public Triangle()
		{
			super(0);
			System.out.println("c1 Triangle Object Created "+hashCode());
		}
		public Triangle(int y)
		{
			super(y);
			System.out.println("c2 Triangle Object Created "+hashCode());
		}
		// method override
		public void show()
		{
			System.out.println("Triangle show");
		}
		// not polymorphic
		public void echo()
		{
			super.show();
			System.out.println("Triangle.draw:Height= "+height+" Width= "+width);
		}
	}




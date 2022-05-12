package com.chainsys.usingFinal;

public class ShapeAPrivateConstructor {
	public int height;
	public int width;
	
	private ShapeAPrivateConstructor() {
		System.out.println("ShapeA CreatedA " +hashCode());
	}
	private ShapeAPrivateConstructor (int x)
	{
		height=x;width=x;
		System.out.println(x+"ShapeA CreatedB " +hashCode());
	}
	public void echo() {
		System.out.println("ShapeA ECHO....");
		System.out.println(height + " " + width);
	}
	public static ShapeAPrivateConstructor getObject()//factory method)
			{
				return new ShapeAPrivateConstructor();//call to private Constructor
			}
	
		
	}


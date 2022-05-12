package com.chainsys.exception;

import java.util.Scanner;

public class TryandCatch {
        public static void main(String[]args) {
        	m4();
}

	public static void m4() {
		System.out.println("Before try");
		int x=0,y=0,z=0;
		String s1=null,s2=null;
		java.util.Scanner sc=null;
		try
		{
			sc=new Scanner(System.in);
			System.out.println("Inside try");
			System.out.println("Enter value for x");
			s1=sc.nextLine();
			System.out.println("Enter value for y");
			s2=sc.nextLine();
			x=Integer.parseInt(s1);
			y=Integer.parseInt(s2);
			z=x/y;
			System.out.println("Result " +z);
		}
		//catch(Exception err)
	    //{
	    // System.out.println("Inside catch3" +err.getMessage());
		// System.out.println("ErrorType "+err.getClass().getName());
		catch(ArithmeticException err)
		{
			System.out.println("Inside catch1 "+err.getMessage());
			System.out.println("ErrorType "+err.getClass().getName());
			
		}
		catch(NumberFormatException err)
		{
			System.out.println("Inside catch2 "+err.getMessage());
			System.out.println("ErrorType "+err.getClass().getName());
			
			
		}
		catch(Exception err)
		{
			System.out.println("Inside catch3 "+err.getMessage());
			System.out.println("ErrorType "+err.getClass().getName());
			
		}
		finally
		{
			System.out.println("inside finally");
		}
		System.out.println("After finally");
	}
}




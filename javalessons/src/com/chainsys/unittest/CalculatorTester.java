package com.chainsys.unittest;

import com.chainsys.variables.Calculator;

public class CalculatorTester {
	
	public static void testadd()
	{
		Calculator.add(10, 120);
		System.out.println("Add Value is:" + Calculator.add(10, 120));
		
	}
	public static void testSub()
	{
		Calculator.Subtraction(150, 75);
		System.out.println("subtraction value is:" + Calculator.Subtraction(150, 75));
	}
	public static void testMul()
	{
		Calculator.multiply(15, 5);
		System.out.println("Multiply value is :" + Calculator.multiply(15, 5));
	}
	public static void testDiv()
	{
		Calculator.divide(200, 10);
		System.out.println("divide value is : " +Calculator.divide(200, 10));
	}

}

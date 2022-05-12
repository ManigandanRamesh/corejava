package com.chainsys.unittest;

import com.chainsys.classandmethods.Car;

public class CarTester {
	public static void testCar()
	{
		Car firstCar = new Car("TN 10A 6580");
		firstCar.setColor("White");
		firstCar.setFuel("Petrol");
		firstCar.setYearOfPurchase(2011);
		System.out.println(firstCar.getRegNo());
		System.out.println(firstCar.getColor());
		System.out.println(firstCar.getFuel());
		System.out.println(firstCar.getYearOfPurchase());
	}

}

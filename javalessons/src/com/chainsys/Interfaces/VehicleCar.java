package com.chainsys.Interfaces;


	public class VehicleCar extends VehicleAbstract 
	{
		@Override
		public void echo() 
		{
			System.out.println("Car.Echo");
		}

		@Override
		public void move() 
		{
			System.out.println("Car.Move");
		}
		@Override
		public void stop() 
		{
			System.out.println("Car.Stop");
		}
		public void park() 
		{
			System.out.println("Car.Parked");
		}
	}



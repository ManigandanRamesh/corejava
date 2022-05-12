package com.chainsys.abstractclass;


	public class TestCar {
		public static void main(String[] args) {
			Car c1=new Car();
			c1.Regno="TN10X1234";
			c1.move();
			
			Vehicle v1=new Vehicle("");
			v1.Regno="TN22X5678";
			v1.move();
			
			Vehicle innova=new Vehicle("TN22X5679");
			Vehicle m800=new Vehicle("TN22X5677");
			Vehicle ae3=new Vehicle("TN22X5676");
			Vehicle fer=new Vehicle("TN22X5675");
		}
	}




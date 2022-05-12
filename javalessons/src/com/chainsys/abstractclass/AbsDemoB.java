package com.chainsys.abstractclass;


	public abstract class AbsDemoB {
		public abstract void echo();
	}
	// Abstract class must be inherited
	// abstract methods must be overriden
	class DemoBChild extends AbsDemoB
	{
		public void echo() {
			System.out.println("Overriding the abstract method");
		}
	}



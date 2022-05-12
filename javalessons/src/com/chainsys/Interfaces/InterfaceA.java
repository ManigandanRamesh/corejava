package com.chainsys.Interfaces;


	public interface InterfaceA {
		void m1();
		void m2();
		void print();
		default void print(String type)
		{
			System.out.println("");
		}
		static void echo()
		{
			System.out.println("Static Echo");
		}
	}



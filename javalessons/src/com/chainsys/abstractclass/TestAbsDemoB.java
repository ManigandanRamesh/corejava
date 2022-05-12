package com.chainsys.abstractclass;

public class TestAbsDemoB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static void testAbsDemoB() {
			// abstract class can not be instantiated
//			AbsDemoB objectDemob=new AbsDemoB();
			AbsDemoB objectDemob=new DemoBChild();
			objectDemob.echo();
		}

	}

}

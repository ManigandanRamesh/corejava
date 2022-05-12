package com.chainsys.Abstract;


	public  class Calculator implements InterfaceCalculator {



		public int add(int Arg1, int Arg2) 
		{
		    System.out.println( Arg1  + Arg2);
		    return Arg1 + Arg2;
		}
		public int multiply(int Arg1,int Arg2)
		{
		    System.out.println( Arg1  * Arg2);
		    return Arg1 * Arg2;

		}

		public int divide(int Arg1, int Arg2) {
		    System.out.println( Arg1 / Arg2);
		    return Arg1 / Arg2;
		}
		}



  package com.chainsys.variables;

public class Calculator {
	
	//add method:will take 2 integer values using the following parameters,
	//and will add the values.the result of totaling will be  returned back to the caller
	//this  a static method, object reference is not required.
	
	//@param param1 of type int
	//@param param2 of type int
	//return type int
	public static int add (int param1,int param2)
	{
		int result=param1+param2;
		return result;
	}
	//multiply method:will take 2 integer values using the following parameters,
		//and will multiply the values.the result of totaling will be  returned back to the caller
		//this  a static method, object reference is not required.
		
		//@param param1 of type int
		//@param param2 of type int
		//return type int
		public static int multiply(int param1,int param2)
		{
			int result=param1*param2;
			return result;
		}
		//divide method:will take 2 integer values using the following parameters,
				//and will  the values.the result of totaling will be  returned back to the caller
				//this  a static method, object reference is not required.
				
				//@param param1 of type int
				//@param param2 of type int
				//return type int
				public static int divide(int param1,int param2)
				{
					if(param2==0)
					{
						System.out.println("value of param2 is not a zero");
					}
					int result=param1/param2;
					return result;
				}
				//sub method:will take 2 integer values using the following parameters,
				//and will subtract the values.the result of totaling will be  returned back to the caller
				//this  a static method, object reference is not required.
				
				//@param param1 of type int
				//@param param2 of type int
				//return type int
				public static int Subtraction(int param1,int param2)
				{
					int result=param1-param2;
					return result;
				}



}

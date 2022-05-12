package javalessons;

public class Fifth {

	public static void main(String[] args) {
		
		printDiamondPattern();

	}
	public static void printNumberOneToTen() {
		int count =0;
		for(count =0;count<=10;count++)
		{
			System.out.println(count + " ");
		}
	}
	public static void printNumberTenToOne() {
		int count =0;
		for(count =10;count>=1;count--)
		{
			System.out.println(count + " ");
		}
	}
	//nested or loop
	public static void printMatrix() {
		int countA =0;
		for(countA =1;countA<=10;countA++)
		{
			for(int countB=1;countB<=10;countB++)
			{
				System.out.print(countB + " ");
			}
			System.out.println();
		}
	

	
	}
	public static void printTriangle() {
		int countA =0;
		for(countA =1;countA<=10;countA++)
		{
			for(int countB=1;countB<=countA;countB++)
			{
				System.out.print(countB + " ");
			}
			System.out.println();
		}
	}


	public static void printTriangleB() {
	int countA = 0;
		for (countA = 1; countA <=9; countA++) {
		 if (countA < 6) {

		 for (int countB = 5; countB >= countA; countB--) {
		 System.out.print(" ");
		 }

		for (int countC = countA; countC >= 1; countC--) {
		System.out.print(countC);
		}
       for (int countC = 2; countC <= countA; countC++) {
       System.out.print(countC);

	 }
 } 
    else {
    	  for (int count = 0; count <= countA - 5; count++) {
              System.out.print(" ");
      }
      for (int i = 10 - countA; i >= 1; i--) {
              System.out.print(i);
      }
      for (int j = 2; j <= 10 - countA; j++) {
              System.out.print(j);
      }

}
System.out.println("");
}
}
    	
     public static void printDiamondPattern() {
		int countA = 0;
		for(countA = 1;countA < 10;countA++)
		{
			 for (int countB = 5;countB > countA;countB--) {
				System.out.print(".");
		}
		for(int countC = countA;countC >=1;countC--)
		{
			System.out.print(countC);
		}
		for(int countD = 2;countD <= countA;countD++)
		{
			System.out.print(countD);
		}
		for(int countE = 5;countE > 0;countE--)
		{
			for(int countF =1;countE<countF;countF++)
			{
				System.out.print(" ");
			}
		for(int countG = countE;countG >=1;countG--)
		{
			System.out.print(" ");
		}
		}
		
		System.out.println();
		
	
	}
	}
}


	


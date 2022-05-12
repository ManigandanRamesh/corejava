package com.chainsys.javatest;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a three digit number");
		int number=scan.nextInt();
		int OriginalNum,remainder,result=0;
		OriginalNum=number;
		while(OriginalNum!=0) {
			remainder=OriginalNum%10;
			result+=Math.pow(remainder, 3);
			OriginalNum=OriginalNum/10;
		}
		if(result==number) {
			System.out.println(number +"is Armstrong Number");
		}
		else {
			System.out.println(number + "is Not a Armstrong Number");
		}

	}

}

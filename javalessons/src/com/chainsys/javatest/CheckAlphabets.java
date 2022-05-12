package com.chainsys.javatest;

import java.util.Scanner;

public class CheckAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name");
		String userName = sc.nextLine();
		sc.close();
				char[] nameAsCharacters = userName.toCharArray();
		int lengthofCharArray=nameAsCharacters.length;
		int ref=0;
		
		if(lengthofCharArray <8)
		{ 
			System.out.println("Name Must have atleast 8 chars");
		}
		else {
		String nameInUppercase = userName.toUpperCase();
		
		nameInUppercase = nameInUppercase.trim();
		char[] uppercaseCharArray=nameInUppercase.toCharArray();
		lengthofCharArray = uppercaseCharArray.length;
		int asciiValue=0;
		for(int index=0;index<lengthofCharArray;index++)
		{
			asciiValue =(int) uppercaseCharArray[index];
			
			if (asciiValue < 65 ||asciiValue >90) {
				if (asciiValue != 32) {
					System.out.println("IN Valid Character in Name: ");
					ref++;
					break;
				}
			} 
			
		}
		if(ref==0) {
			System.out.println("this name is full of alphabet:"+ userName);
		}
		}

	}

}

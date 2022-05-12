package javalessons;

import java.util.Scanner;

public class Sixth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     checkUserName();
	}
	public static void checkUserName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name");
		String userName = sc.nextLine();
		sc.close();
		System.out.println("Name is " + userName);
		char[] nameAsCharacters = userName.toCharArray();
		int lengthofCharArray=nameAsCharacters.length;
		System.out.println("Length of your name is: " +lengthofCharArray);
		if(lengthofCharArray <3)
		{
			System.out.println("Name Must have atleast 3 chars");
			return;
		}
		if(lengthofCharArray >15)
		{
			System.out.println("Name must not have More than 15 Chars");
			return;
		}
		String nameInUppercase = userName.toUpperCase();
		
		nameInUppercase = nameInUppercase.trim();
		char[] uppercaseCharArray=nameInUppercase.toCharArray();
		lengthofCharArray = uppercaseCharArray.length;
		int asciiValue=0;
		for(int index=0;index<lengthofCharArray;index++)
		{
			asciiValue =(int) uppercaseCharArray[index];
			System.out.println("ASCII :" + asciiValue);
			if (asciiValue < 65 ||asciiValue >90) {
				if (asciiValue != 32) {
					System.out.println("IN Valid Character in Name: ");
				}
			}
			
		}
		
				
	}

}

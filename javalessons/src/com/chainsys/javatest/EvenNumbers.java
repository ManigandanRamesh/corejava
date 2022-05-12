package com.chainsys.javatest;

public class EvenNumbers {
	public static void main(String[]args) {
		int input = 1546903;
		
	
		long reminder=0;
		while(input>0) {
			reminder=input%10;
			if(reminder%2==0) {
				System.out.println(reminder);
			}
			input=input/10;
		
		}
		
		}
	}



package com.chainsys.javatest;

public class StringCountandReverse {

	public static void main(String[] args) {
		String S2="Tom and jerry are good friends";
		
		String trimmedString =S2.trim();
		String[] data=trimmedString.split(" ");
		int count=data.length;
		System.out.println("word count :" +count);
		char a[]=S2.toCharArray();
		System.out.println("the reversed string is:");
		for(int i=S2.length()-1;i>=0;i--) {
			System.out.print(S2.charAt(i));
		}
		
		
		}
	}

	


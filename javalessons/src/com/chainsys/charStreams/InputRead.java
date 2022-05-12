package com.chainsys.charStreams;

import java.io.InputStreamReader;

public class InputRead {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		char c;
		InputStreamReader sr = new InputStreamReader(System.in);
		System.out.println("Enter characters, 'q' to quit.");
		do
		{
			c = (char) sr.read();
			System.out.println(c);
		}while (c != 'q');

	}

}

package com.chainsys.charStreams;

import java.io.BufferedReader;

public class ReadLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String str;
		System.out.println("Enter lines of Text:");
		System.out.println("Enter stop to quit:");
		do {
			str=br.readLine();
			System.out.println(str);
		}

	}

}

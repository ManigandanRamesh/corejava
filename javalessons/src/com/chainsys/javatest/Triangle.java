package com.chainsys.javatest;

public class Triangle {

	public static void main(String[] args) {
		int n=10;
		for(int a=1;a<=10-1;a++) {
			for(int b=1;b<=n-a;b++) {
				System.out.print(".");
			}
			for(int c=a;c>=1;c--) {
				System.out.print(c);
			}
			for(int d=2;d<=a;d++) {
				System.out.print(d);
			}
			System.out.println();
		}
	}
}

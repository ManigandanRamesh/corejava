package javalessons;

public class Fourth {
	public static void main(String[]args) {
		// task1();
		//task2();
		//task3();
		task4();
	}
	public static void task1() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("what is ur name:");
		String name=sc.next();
		sc.close();
		System.out.println(name);
				 
	}
	public static void task2() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter a number");
		String name=sc.next();
		int firstvalue = sc.nextInt();
		int result = firstvalue*100;
		System.out.println(result);
		sc.close();
				 
	}
	public static void task3() {
		String s1="100";
		String s2="25";
		System.out.println(s1+s2);
		int x = Integer.parseInt(s1);
		int y = Integer.parseInt(s2);
		int z = x + y;
		System.out.println(z);
	}
	public static void task4() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		if(age<0)
		{
			System.out.println("invalid age");
		}
		if(age<18) {
			System.out.println("sorry!!! you need to wait to get DL");
		}
		else {
			System.out.println(" To Ride Freely Without any fear");
		}
	}

}

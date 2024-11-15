package com.reviewProjects;

public class PrintNumberZeroTwohundred {
	/* Print 1 to 100 without using any number.
	 * */
	
	static void method1() {
		int one = 'A'-'A';
		
		String s1= "..........";
		
		for(int i = one; i<=(s1.length()*s1.length()); i++) {
			System.out.println(i);
		}
		
	}
	static void method2() {
		int one = 'A'/'A';
		for (int i = one; i<= 'd'; i+=one ) {
			System.out.println(i);
		}
		
	}
	
	static void method3() {
		String s = "rifataminn";
		int zero = s.length()- s.length();
		int hundred = s.length()*s.length();
		for (int i= zero; i<=hundred; i++) {
			System.out.println(i);
		}
		
	}
	public static void main(String[] args) {
		//PrintNumberZeroTwohundred.method1();
		PrintNumberZeroTwohundred.method2();
		//PrintNumberZeroTwohundred.method3();
	}
	

}

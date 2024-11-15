package com.reviewProjects;

public class Class1 {
	
	 int a =10;
	static int b = 20;
	
	private static void method () {
		 int a = 50;
		 
		 int sum = a+b;
		
		System.out.println(sum);
	}
		
	protected void method2 () {
		
		int multiply = a*b;
		
		System.out.println(multiply);
	}
	
	 static int method3 (int a , int b) {
		
		int divide  = (a/b);
		
		
		return divide;
	}
	 public void method4 (int a, int b) {
		
		int multiply = a*b;
		
		System.out.println(multiply);
	}
	
	
	public static void main (String[]  args) {
		
		int a=20;
		int b=3;
		int result = a-b;
		
		Class1 sc = new Class1();
		
	
		System.out.println( "The result of the summation is = " + result);
		
		Class1.method();
		
		System.out.println(Class1.method3(20, 2) + 500);
		
		sc.method4(1000, 4);

		sc.method2();
		
		
		
	
		
	}

}

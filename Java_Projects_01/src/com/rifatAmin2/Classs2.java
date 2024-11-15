package com.rifatAmin2;

public class Classs2 extends Calculator {
	
	public void math1(int a, int b) { //parameterize  void type method!

	int total = a+b;
	
	System.out.println(total);	
	}
	
	public int math1(int a, int b, int d) {//parameterize return type method!
		
		int total = a-b;
		
		return total;
		
		
	}
	
	public void method1() {
		
	  	super.method1();
		//System.out.println("Hi!");
	
		System.out.println("Hello World!!!");
	}
	public static void main(String[] args) {
			Calculator n= new Classs2();
			Classs2 b = new Classs2 ();
			b.method1();
			n.method1();
			b.math1(40, 20);
			System.out.println(b.math1(20, 2, 0)+ 10);
			//b.math1(20, 2, 0);
			
			
		}	

	
	
	
}

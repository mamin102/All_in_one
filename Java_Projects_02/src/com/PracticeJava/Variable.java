package com.PracticeJava;

public class Variable {
	// global variable / class level variable 

	 static int x =2;  //static Variable 
	 
	   int y=5;		//Instance Variable or public variable 
	   
	void sum() {
		int total = x+y;
	
	System.out.println(total);	
	}
	
	static void minus() {
		
		//local variable
		int y = 10;
		int total =  y -x;
		
		System.out.println(total);
	}
	
	public static void main(String[] args) {
		minus();
		//or 
		Variable.minus();
		
		Variable vr = new Variable();
		
		vr.sum();
		
		//not a good practice :
		vr.minus();
		
		System.out.println("HI Everyone!");
		System.out.println("my name is rifat");
		System.out.println("I live is queens.");
		System.out.println("my address is 7814 woodside ave, elmhurst, ny , 11373");
		
		
		
	}
}

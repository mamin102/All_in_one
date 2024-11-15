package com.rifatAmin;

public class Class9  {
	

	protected int divide (int x,int y){
		
		
		int divide = x/y;
		
		
		System.out.println(divide);
		return x/y;
		
		
	}
	
	protected void calculator () {
		
		int a = 40000000;
		int b = 30000000;
		int total= a-b;
		
		System.out.println(total);
	}

	public static void main(String[] args) {
		Class9 D= new Class9();
		
		D.divide(200, 20);
		D.calculator(); 
		
	}
}



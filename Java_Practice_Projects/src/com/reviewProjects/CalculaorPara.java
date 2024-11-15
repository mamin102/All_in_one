package com.reviewProjects;

 public class CalculaorPara {
	
	
	//overloading by parameterize :
	
	public static void calculator (int a, int b) { 
		
		
		
		int sum = a+b;
		
			System.out.println("The Answer of the Sum is : " + sum);
				
	} 
	
	
	// Overloading By changing the sequence : 
	
	public void Calculator (int b , int a) {
		 
		int divide = a/b ;
		
		System.out.println("the answer for the divide is = " + divide);
		
	}
	
	// overloading by adding an argument/or adding a parameter :  
	
	public void calculator (int b, int a, int c ) {
		
		int multiply = a*b*c;
		
			System.out.println("The Answer of the Multiply is : " + multiply);
		
	}
	
	
	// overloading simply with no argument : 
	
   public void  Calculator () {
		
		int a = 60;
		
		int b = 20;
		
		
		
		int minus = a-b;
		
		
			System.out.println("The answer for the minus is : " + minus);
		
	}
   
  

   
   public static void Calculator ( char op, int a , int b) {
	   
   }
	
	
	
	public static void main(String[] args) {
		
		
		CalculaorPara cal = new CalculaorPara();
		
			cal.calculator(20, 30);
			
			cal.calculator(30, 20, 2);
			
			cal.Calculator(2, 30);
			
			cal.Calculator();
			
			calculator(30, 4);
			
			
			
			
			
			
		
	}

}

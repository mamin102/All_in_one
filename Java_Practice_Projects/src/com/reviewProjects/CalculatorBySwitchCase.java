package com.reviewProjects;

import java.util.Scanner;

public class CalculatorBySwitchCase {
	
	
	public static void main(String[] args) {
		
		int a;
		
		int b;
		
		int total = 0;
		
		char op;
		

		
		@SuppressWarnings("resource")
		Scanner src = new Scanner(System.in);
	
		System.out.println("Please Enter the First Number = ");
	
		 a = src.nextInt();
	 
		System.out.println("Enter the Oparetor = ");
	
		 op = src.next().charAt(0);
	 
		System.out.println("Please Enter the Second Number = ");
	
		 b = src.nextInt();
	 
	
	
		 switch (op) {
		 
		 	case '+' : System.out.println(total = a+b );
		 
		 		break;
		 	
		 	case '-' : System.out.println(total = a-b);
		 	
		 		break;
		 		
		 	case '*' : System.out.println(total = a*b);
		 	
		 		break;
		 		
		 	case '/' : System.out.println(total = a/b);
		 	
		 		break;
		 		
		 		
		 	default : System.out.println(" Please enter any of the following Oparetor : +, or -, or *, or /");
		 		
		 }
		 
		 	
		 	System.out.println("The Answer is = " + total);
		 	
	}

}

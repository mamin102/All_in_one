package com.rifatAmin2;

import java.util.Scanner;

public class Calculator {
	public void method1() {
		
		System.out.println("Hi!");
	}
	
	
	
	public static void main(String[] args) {
		
		int num1;
		
		int num2;
		
		int total= 0;
		
		char op;
		
	Scanner sc = new Scanner(System.in);
	
		System.out.println(" Please Enter the 1st nummber : ");
		
		num1= sc.nextInt();
		
		System.out.println(" Operator : ");
		
		op = sc.next().charAt(0);
		
		System.out.println(" Please Enter The 2nd number: ");
		
		num2= sc.nextInt();
		
//	if (op == '+') {
//			total= num1 + num2;
//	}
//	
//	else if (op == '-') {
//			total = num1- num2;
//	}
//	else if (op == '*') {
//			total = num1*num2;
//	}
//	else if (op == '/') {
//			total = num1/num2;
//			
//		
//	}
//	else {System.out.println("Please Enter +,or -, or *,or/ ");}
//	
//		System.out.println("The Answer is : " + total );
		
		
		switch (op) {

		case '+' : System.out.println(total = num1+ num2);
		
			break;
			
		case '-' : System.out.println(total = num1-num2);
			break;
			
		case '*' : System.out.println(total = num1* num2);
			break;
		
		case '/' : System.out.println(total = num1/ num2);
			break;
			
		case '%' : System.out.println(total = num1%num2);
			break;
		
			
		default : System.out.println( "Please Enter operator +, or-, or*, or/, or% ");
		
		}
			
			System.out.println("The Answer you are seeking for is : " + total);
			
		
		
	}


}

package com.reviewProjects;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		 
		double num1;
		
		double num2;
		
		double total = 0;
		
		char op;
		
	Scanner sc = new Scanner (System.in);
	
		System.out.println("Please enter the First Number = ");
		
		num1 = sc.nextDouble();
		
		System.out.println("Enter the oparetor ");
		
		op = sc.next().charAt(0);
		
		System.out.println("Please enter the Last Number = ");
		
		num2 = sc.nextDouble();
		
		
	if (op == '+') { 
				
				System.out.println(total = num1+ num2);
				
		}
				
		else if (op== '-')  {
			
				System.out.println(total = num1 - num2);
				
		}
		else if (op== '*')  {
			
				System.out.println(total = num1 * num2);
							
		}
		else if (op== '/')  {
			
				System.out.println(total = num1 / num2);
						
		}
		else { System.out.println("Please enter any of the oparetor :500 +, or -, or *, or /");
			
		}
	
		System.out.println("The Answer is = " +  total);
		
		
	}
	
	
	
	}



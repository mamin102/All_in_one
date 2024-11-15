package com.reviewProjects;

import java.util.Scanner;

public class NewCal extends CalculaorPara {
	
	 
	@Override
	public void  Calculator (int a, int b) { 
		
		super.Calculator(3, 300);
		
		int result = a *b ;
		
		System.out.println("the answer is : "+ result);
		 
		 
	 }
	
	
	public void Calculator () {
		   
		   int total = 0 ;
		   
		   
		   
		   
		   @SuppressWarnings("resource")
		Scanner se = new Scanner (System.in);
		   
		   
		   System.out.println("Please enter the first Number = ");
		   
		  int  a = se.nextInt();
		  
		   
		   System.out.println("Enter the Oparetor : ");
		   
		  char  op = se.next().charAt(0);
		  
		   
		   System.out.println("Please enter the last number = ");
		   
		   int b = se.nextInt();
		   
		   
		   
		 switch (op) {
		   
		   		case '+' : System.out.println(total= a+ b );
		   		
		   			break;
		   		case '-' : System.out.println(total= a- b );
		   		
		   			break;
		   			
		   		case '*' : System.out.println(total= a* b );
		   		
	   				break;
	   				
		   		case '/' : System.out.println(total= a/ b );
		   		
	   			break;
	   			
	   			default : System.out.println("Please enter any of the following Operator : +, or -, or *, or / ");
		   		
		   }
		   
		   System.out.println(" The Answer is = " + total );
		   
		   
	   }
	
	
	public static void main(String[] args) {
		 
		NewCal obj = new NewCal ();

		obj.Calculator(20, 2);
		
		obj.Calculator();
		
		
//		
//		CalculaorPara ob = new NewCal();
//		
//		ob.Calculator(); // why its showing the parent class name but printout the results of the child class's method ?
//							//--- because this has been override perfectly;
//		
//		
//		CalculaorPara o = new CalculaorPara ();
//		
//		o.Calculator();
		
		
		 
		 
		
		
	
		
	}
}

package com.reviewProjects;

import java.util.Scanner;

public class Demo {
	
		static String userName ;
		static int pass = 4567;




	public static void checkAge() {
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Please Enter Your Age = ");
		
		int age = sc.nextInt();
		
		
		
		
	if (age < 18 ) {
		
		throw new ArithmeticException ("Access denied - because you are not eligible for the program." );

	}
	
	else if ( age >50) {
		
		throw new ArithmeticException ( "Access Denied - Because you are too old for this program.");
		
		
	}
		
		else {
		
			System.out.println("Procced to the next level to Enter your UserName and Password to get Access.");
	}
		
	

	}
	
	public static void password () {
		
		
		
		//String userName; 
		//int password;
		
		
		Scanner sn = new Scanner (System.in); 
		
		System.out.println("What is your Username?");
		
		userName = sn.next();
		
		System.out.println("Please enter your Passsword - ");
		
		int password = sn.nextInt();
		
		
		while (true) {
			
	
		if (userName.equals("Rifat")) {	System.out.println("Access may be graned if the password is right.");
		}
		
		
		else if (!userName.equals("Rifat") ) {
					
					//throw new ArithmeticException ( "Access Denied - wrong UserName!");
				
			 System.out.println("Access Denied - wrong UserName!!!!!");
			 
			// System.exit(pass);
				 userName = sn.next();

			 
			  
				}}
		
			
	
		
//		while (true) {
//		if (password==pass) {
//			
//				System.out.println("Access Granted!");}
//				
//		else if  ( password != pass) {
//			
//				System.out.println("Access Denied - wrong password");
//		}
//		}
	
		
		
		
//		else {
//				System.out.println("Access Denied ");
//		}
		
	
	}
	
	
	public static void main(String[] args) {
		 
		
		checkAge();
		
		Demo.password();
		
		
	}

}

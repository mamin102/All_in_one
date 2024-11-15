package com.reviewProjects;

import java.util.Scanner;

public class Demo3 {
	
	static String userName;
	static int pass;
	static Scanner sc;




	public static void checkAge() {

		sc = new Scanner (System.in);

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


		//Scanner sn = new Scanner (System.in); 

		System.out.println("What is your Username?");

		userName = sc.next();




		

			if (userName.equals("Rifat")) {	

				System.out.println("Access may be graned if the password is right.");
			}

			
			else if (!userName.equals("Rifat") ) {

				//throw new ArithmeticException ( "Access Denied - wrong UserName!");
				System.out.println("Access Denied - wrong UserName!!!!!");

				// System.exit(pass);
				userName = sc.next();

			}
		

		System.out.println("Please enter your Passsword - ");

		pass = sc.nextInt();


		if (pass==4567) {

			System.out.println("Access Granted!");}

		else if  ( pass != 4567) {

			System.out.println("Access Denied - wrong password");
		}

	}





	//	else {
	//			System.out.println("Access Denied ");

	//	}

	public static void main(String[] args) {

		Demo3.checkAge();

		Demo3.password();


	}

}

package com.rifatAmin2;

public class IfElseStatment {

	int a= 100;
	int b=1;

	
	public int con () {
	  int sum = a+b;
	  
//	  System.out.println(multi);
	return sum;
	 
 }
	
	public static void main(String[] args) {
		IfElseStatment ie= new IfElseStatment();
		int n= ie.con();
		
		if (n<72) 
		{
			System.out.println("the result is less the 72");
				
				if (n==71) { 
					System.out.println("its 71");}
				
					else if (n== 70) {
						System.out.println("its 70");}
					else if (n== 69) {
						System.out.println("its 69");}
				else if (n== 68) {
						System.out.println("its 68");}
				else if (n== 67) {
						System.out.println("its 67");}
				else if (n== 66) {
						System.out.println("its 66");}
				else if (n== 65) {
						System.out.println("its 65");}
				else if (n== 64) {
						System.out.println("its 64");}
				else if (n== 63) {
						System.out.println("its 63");}
				else if (n== 62) {
						System.out.println("its 62");}
				else if (n== 61) { 
						System.out.println("its 61");}
				else if (n== 60) {
						System.out.println("its 60");}
				else {
						System.out.println("its less than 60!!");
						
				} //why the line is not printing?
			
			
			} 
		else if (n>72 && n < 100) {
			System.out.println( "the result is greater than 72");
				
			if (n==72) { System.out.println("its 72");}
			else if (n== 73) {System.out.println("its 73");}
			else if (n== 74) {System.out.println("its 74");}
			else if (n== 75) {System.out.println("its 75");}
			else if (n== 76) {System.out.println("its 76");}
			else if (n== 77) {System.out.println("its 77");}
			else if (n== 78) {System.out.println("its 78");}
			else if (n== 79) {System.out.println("its 79");}
			else if (n== 80) {System.out.println("its 80");}
			else if (n== 81) {System.out.println("its 81");}
		}
		
		else {
			
			System.out.println("the result is none of the above!!!");// 82 its not printing 
		}
		
		
	}

}

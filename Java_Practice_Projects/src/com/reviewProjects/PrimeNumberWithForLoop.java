package com.reviewProjects;

public class PrimeNumberWithForLoop {
	
	void method(int num) {
		 
		
		for (int i=2; i<=num; i++) {
			
			if (i==num){
				System.out.println(" it's a prime number = "+ i);
				
			}
			
			else if (num%i==0) {
				
			System.out.println(i +" is not a prime number.");
			
		}	
			}
	}
	public static void main(String arg[]) {
		PrimeNumberWithForLoop p= new PrimeNumberWithForLoop();
		
		p.method(599);
		
	}
}

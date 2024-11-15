package com.reviewProjects;

public class PrimeNumberByForLoop {
	
	public void primeNumber ( int num ) {
		
		for (int i =2; i<150; i++) {
			for(int j =2; j<=i;  j++) {
				if(i==j) {
					System.out.println("Prime = "+ i);
				}
				 if (i%j==0) {
					//System.out.println("Not Prime !!!");
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		PrimeNumberByForLoop p = new PrimeNumberByForLoop();
		
		p.primeNumber(150);
	}

}

package com.reviewProjects;

import java.util.Scanner;

public class PrimeNumber {
	
	
	public static void scannerPrime () {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int i = 2;
		
		while (i<num) {
			if (num%i==0) {
				System.out.println("******NOT A PRIME NUMBER*******");
				break;		
			}
			i++;
			if (i==num) {
				System.out.println("*******Its a Prime Number *********");
			}
		}

	}
	public static void primeNumber() {
		
		int x= 10009;
		
		int i = 2;
		
		while (i<x) {
			if (x%i==0) {
				System.out.println(x);
				System.out.println("******NOT A PRIME NUMBER*******");
				break;		
			}
			i++;
			if (i==x) {
				System.out.println(x);
				System.out.println(" *******Its a Prime Number *********");
			}
		}
	}
	public static void parameterizePrimeNumber(int y) {
		
		int i = 2;
		
		while (i<y) {
			if (y%i==0) {
				System.out.println(y);
				System.out.println("******NOT A PRIME NUMBER*******");
				break;		
			}
			i++;
			if (i==y) {
				System.out.println(y);
				System.out.println(" *******Its a Prime Number *********");
			}
		}
		
	}
	

	public static void main(String[] args) {
		
	
		PrimeNumber.primeNumber();
		
		PrimeNumber.parameterizePrimeNumber(600);
		
		PrimeNumber.scannerPrime();
		
	}

}

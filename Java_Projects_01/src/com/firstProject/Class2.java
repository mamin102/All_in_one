package com.firstProject;

public class Class2 {
	
	
	// No argument constructor:
	public Class2() {
		
	}
	
	int a;
	static int b= 20;
	String k;
	
	// Default Constructor/no argument constructor
	// parameterize Constructor :
	Class2(int N, int I) {
		
	}
	
	 static int N = 30;
     static int I= 20;
		
	
	
	public static void main(String[] args) {
		
		Class2 Mark = new Class2();
		int a = 10;
		b= 25;
		int id = a*b;
		
		Mark.k = "Mark is a student, and his id is ";
		
		System.out.println(Mark.k + a*b);
		
		
		
	// parameterize Constructor :
		Class2 munltiply = new Class2();
		
		I =20;
		N= 20;
		
		munltiply.k = "The Multiplication result is = ";
		
		System.out.println(munltiply.k + (I+N));
		
		
	}

}

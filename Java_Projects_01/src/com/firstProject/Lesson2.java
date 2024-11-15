package com.firstProject;

public class Lesson2{


//	length = 20;
//	height = 5; 
//	width = 10;
//
//	
//public static void measur(){ // when i use void type method, this doesn't allow me to use static variable under the class?
//		
//		 int length;
//		 int height;
//		 int width;  
//		
//		
//		int measurment = (length* height *width);
//		System.out.println(measurment);
//   
//	}
	
	public int multiply() {
		 int Ban = 300;
		 int Ind = 250;
		 int multi = (Ban*Ind);
		 
		
		return multi;

	}
	
	int l;
	int h;
	static int w;
	
	
	public void multiply1() {
		l= 5;
		h= 10;
		w=2;
	int multi1 = (l*h*w);
	System.out.println(multi1);
	
	}
	public static void sum() {
		double a= 10.0005;
		w= 20;
		
		double sum =(a+w);
		System.out.println(sum);
		
	}
	
	
	
	
	public static void main(String[] args) {
		   
		Lesson2 Calculator = new Lesson2();
		
		Calculator.multiply1();
		
		Calculator.sum(); // whats a static way?
		
	
		int lol = Calculator.multiply();
		
		System.out.println(lol);
		

		}
	
	
	
	
}

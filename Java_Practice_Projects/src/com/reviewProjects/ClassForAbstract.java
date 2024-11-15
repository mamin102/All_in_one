package com.reviewProjects;

abstract class ClassForAbstract {
	
	
	abstract void hi(String Name);
	
	synchronized static void method () {
		
		int a = 2, b=5, c=6 ;
		 int sum = a+b+c;
		 
		 System.out.println("toatl " + sum);
	}
	
	public static void main(String[] args) {
		
	//	ClassForAbstract obj = new ClassForAbstract(); 
		
		
		ClassForAbstract.method();
		
				
	}
	

}

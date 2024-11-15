package com.reviewProjects;

import com.reviewProjects.method;

public  class PracticeForInterface2 implements method {

	@Override
	public void m1() {
		
		System.out.println("The was an unimplemented method from the interface.");
		
	}

	@Override
	public int m2() {
		
		int a = 3 , b = 2, c = 4;
		
		int sum = a+b+c;
		
		return sum;
	}
	
	public static void main(String[] args) {

		method obj = new PracticeForInterface2();
		
		obj.m1();
		
		System.out.println(obj.m2() + 20);
		
		
		
		
	}
	
}
	
	



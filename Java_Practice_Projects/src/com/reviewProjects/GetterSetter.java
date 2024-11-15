package com.reviewProjects;

public class GetterSetter {
	

	
		private int a;
		
		private int x;
		
		
	public int getA() {
					
		return a;
				
	}
	
	public int getA( int x) {
		
		return x;
		
	}
	
	
	
	public void setA(int b) {
		
		a=b;
		
		System.out.println(a);
		
		
	}
	
	public void setA () {
		x= 45;
		System.out.println(x);
	}

	public static void main(String[] args) {
		
		GetterSetter object = new GetterSetter();
		
		
//		object.setA(30);
//		
//		System.out.println(object.getA());	
//
//		
		object.setA();
//		
//		System.out.println(object.getA());	
		
		System.out.println(object.getA(69));
		
	}

}

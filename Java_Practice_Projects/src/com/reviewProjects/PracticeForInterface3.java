package com.reviewProjects;

import com.reviewProjects.method.add;

public class PracticeForInterface3 implements add {
	
			
			double x = 10.99 ;
							//changing the value of x to y as int from the previous value double;
	
			int y = (int) x;
		
	
	public static void main(String[] args) {		
		
		PracticeForInterface2 obj = new PracticeForInterface2 ();
		
		obj.m1();
		
		System.out.println(obj.m2()+ 20);
		
		//System.out.println("2");
		PracticeForInterface3 obj3 = new PracticeForInterface3();
		obj3.m3();

	}


	@Override
	public void m3() {
		int a= 30, b= 20;
		int add = a+b; 
		
		System.out.println( "implemented mehtod of inteface3 add = "+ add );
		
		
	}

}

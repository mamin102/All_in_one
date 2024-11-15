package com.reviewProjects;

public class ForLoop {
	
	public static void main(String[] args) {
		 
		for( int i= 10; i>1 ; i-- ) {
			
				System.out.println("The value for 'i' is = " + i);
			
		}
		

		
		for(int i = 10; i>1;) {
			
			System.out.println("i = " + i);
			
			i--;
		}
		
		
		
		//iterate array using For Loop :
		
	int arr[] = {3,6,9,12,15,18};
		
		for (int i=0; i<arr.length ; i++) {
			
			System.out.println(arr[i]);
			
		}
		
		
		
		// iterate array using Enhanced For loop: 
		
		for (int num : arr) {
			
			System.out.println("The Squence of the series of the Number is " + num);
		}
		
		
		
	}

}

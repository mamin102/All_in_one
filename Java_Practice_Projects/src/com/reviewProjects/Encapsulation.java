package com.reviewProjects;

public class Encapsulation  {
	
	/* Encapsulation is one of the concept in java oops concept,
	 	to achieve this we need to have all the attributes/ variables in private & 
	 	we need getter and setter method to access it;
	 	
	 	getter method = to access/ to read the data and it returns the value to the variable,
	 	which basically means that it has to a return type method;
	 	
	 	setter method = to change / to modify the value of the variable, 
	 	needs 'this' - keyword to identify the variable.
	 	
	 
	 */
	
	 private String names  =  "Rifat" ;

	
	private String getNames() {
		
		return names ;
		
	}
	
	private void setNames (String newNames) {
		
		this.names = newNames; 
		
	}

	
	public static void main(String[] args) {
		
		Encapsulation obj = new Encapsulation ();
		
		obj.setNames("Mohibul");
		
		
		System.out.println(obj.getNames() + ", his age is 55.");
		
		
		
		
		

	}
	 
	 
	 
	

}

package com.reviewProjects;

public class Enum {
	
	/*enum = Enumeration : specifically listed ;
	
	enum is a special class that represent a group of varriable that is unchangeable/ "final" 
	
	its like a class or interface but the keyword is "enum". 
	
	The values should be all the CapsLock/ UpporCase Letter. 
	
	for loop = value() method is used .
	
	*/
	
	enum Level {
		
		HIGH,
		
		MIDEUM,
		
		LOW,
		
		SEMI
	}
	
	public static void main(String[] args) {
			
			Level obj = Level.SEMI;
			
			System.out.println(obj);
			
			
			
	switch (obj)	{
		
		case HIGH : System.out.println("the level is HIGH");
		
		break;
		
		case MIDEUM : System.out.println(" the level is MIDEUM");
		
		break;
		
		case LOW : System.out.println("the level is LOW");
		
			
			default : System.out.println(" Nothing Above!");
		}
		
	
		
	for (Level ob :  Level.values() ) {
			
			System.out.println(ob);
		}

		
				
			}
			
			
			
			
		}


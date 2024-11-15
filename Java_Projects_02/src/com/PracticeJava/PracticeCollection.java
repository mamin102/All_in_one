package com.PracticeJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

 public class PracticeCollection {
	
	public static void main(String[] args) {
		
		ArrayList <String> studentName = new ArrayList<>();
		
		//to add the value of the student :
		
		studentName.add("tom");
		
		studentName.add("jerry");

		studentName.add("marry");

		studentName.add("lol");

		studentName.add("harry");

		studentName.add("megan");

		
		studentName.add("dina");

		studentName.add("liha");
		
		studentName.add("geroge");
		
		
		//to check the size 
		
		int size = studentName.size();
		
	System.out.println("the number of student is = "+ size );
		
			//boolean method if is the value there in the list 
		
		
	//System.out.println(	studentName.contains("marry"));
	
				
		//to print the value of the the arraylist :
	
	
	System.out.println(studentName.get(6));
		
		//or
	
//	for(int i =0; i< studentName.size(); i++ ) {
//		
//		System.out.println("the name of the student :  "+ studentName.get(i));
		
		
		//or advance for loop:
		
		for (String name : studentName) {
			
			System.out.println(name);
		}
		
		//or thro while loop iterator
		
		
//		Iterator <String> it = studentName.iterator();
//		
//		while(it.hasNext()) {
//			
//			String name = it.next();
//			
//			System.out.println("Name thro iterator :  "+name );
//		}
		
		
ListIterator <String> it = studentName.listIterator();
		
		while(it.hasPrevious()) {
			
			String name = it.previous();
			
			System.out.println("Name thro List iterator :  "+name );
		}
		
		
		
		
	}

		
		
		
	}


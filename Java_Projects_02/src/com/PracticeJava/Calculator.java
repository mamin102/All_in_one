package com.PracticeJava;

public class Calculator {
	int a = 20;
	static int b = 30;
	
	public int add() {
		int a = 10;
	int add= (a+b);
	System.out.println("The result is = "+ add);
	return add;
	}
	private void multiply() {
		int multi = a *b;
		System.out.println("The result is = "+multi);	
	}
	static int minus () {
		int x= 300;
		int min= x- b;
		System.out.println("The result is = "+min);
		return min;
	}
	static void divide () {
		int a= 400;
		int div = a/b;
		System.out.println("The result is = "+div);	
	}
	public static void main(String[] args) {
		
		Calculator u1= new Calculator();
		u1.add();
		u1.minus();
		u1.multiply();
		u1.divide();
		
		Calculator u2 = new Calculator();
		u2.minus();
		u2.add();
		
		
		Calculator.divide();
		Calculator.minus();
	}

}

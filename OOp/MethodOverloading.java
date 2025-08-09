package com.practice.oop;

class Calculator1{
	//Method1
	int add(int a, int b){
		return a+b;
		
	}
	
	int add(int a,int b, int c) {
		return a+b+c;
		
	}
	double add(double a , double b) {
		return a+b;
	}
	
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator1 calc=new Calculator1();
		System.out.println(calc.add(2, 3));
		System.out.println(calc.add(3, 4, 5));
		System.out.println(calc.add(2.3, 4.5));
		

	}

}

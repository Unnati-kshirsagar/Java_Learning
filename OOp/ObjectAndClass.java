package com.practice.oop;

class Calculator
{
	int a;
	int b;

	
	public int add()
	{
		int x=a+b;
		System.out.println(x + " in add ");
		return 0;
	}
}

public class ObjectAndClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=4;
		int num2=5;
		
		Calculator calc = new Calculator();
		calc.a=num1;
		calc.b=num2;
		calc.add();
		


	}

}

//Object oriented programming
//Object have properties and behavious
//object is a insatnce of class 
//class is a blueprint for creating for object
//jvm creates object in java 
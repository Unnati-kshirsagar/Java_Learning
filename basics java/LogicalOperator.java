package com.practice.start;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Logical operator 
		//Used to combine boolean expressions.
		//Operator	Meaning	Example	Result
		int a=10;
		int b=5;
		
		//&& Logical AND :true if both true
		System.out.println("(a > 0 && b > 0): " + (a > 0 && b > 0)); 
		//| logical or true if any one result is true
		 System.out.println("(a > 0 || b < 0): " + (a > 0 || b < 0)); 
		//! Logical not if vlaue is true it return false nd if false output is true
		 System.out.println("!(a == b): " + !(a == b));
		

	}

}

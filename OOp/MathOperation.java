package com.practice.oop;

class M1{
	int add(int a, int b) {
		return a +b;
	}
	
	int add (int a,int b , int c) {
		return a+b+c;
	}
	
	double add(double a, double b) {
		return a+b;
	}
}

public class MathOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M1 M=new M1();
		
		
		System.out.println(M.add(2,3));
		System.out.println(M.add(3, 4,5));
		System.out.println(M.add(2.3,3.5));

	}

}

package com.practice.oop;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {3,4,5,6};
		num[1]=6;
		System.out.println(num[1]);
		
		int num1[] = new int[4];
		num1[0]=1;
		num1[1]=2;
		num1[2]=3;
		num1[3]=4;
		
		for(int i=0;i<=3;i++) {
			System.out.println(num1[i]); 
		}
		

	}

}

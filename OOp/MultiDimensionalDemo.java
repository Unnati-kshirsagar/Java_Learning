package com.practice.oop;

public class MultiDimensionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[][]= new int[2][3];  //2 row 3 column
		num[0][0]=10;
		num[0][1]=20;
		num[0][2]=30;
		
		num[1][0]=40;
		num[1][1]=50;
		num[1][2]=60;
		
		for(int i=0;i<=num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}

package com.practice.oop;

public class MultiDimensionalArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num2[][]= new int[3][4] ;
		
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				num2[i][j]=(int)(Math.random()*100) ;
				
				System.out.print(num2[i][j]+ " ");
			}
			System.out.println();
			
		}

	}

}
 
package com.practice.oop;

public class StringBufferDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringBuffer are mutable
		//USes for appending,inserting,deleting,or modifing string without creating a new object
		StringBuffer sb= new StringBuffer("Unnati");
		sb.append(" Patil");
		//sb.deleteCharAt(0);
		System.out.println(sb);
		
		//Both StringBuffer and StringBuilder are:
		//Mutable → You can change their content

		//Used for: appending, inserting, deleting, or modifying strings without creating a new object

		//Better than String when you're changing string values frequently (e.g. in loops)
		

	}

}

package com.practice.oop;

enum Status{
	RUNNING,
	FAILED,
	PENDING,
	SUCCESS;
}

public class EnumIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Status s= Status.RUNNING;
		
		if(s==Status.RUNNING)
			System.out.println("all good");
		else if(s==Status.FAILED)
			System.out.println("Try again");
		else if(s==Status.PENDING)
			System.out.println("wait");
		else
			System.out.println("Done");
		
		
		
		
 
	}

}

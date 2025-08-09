package com.practice.oop;

//Static variable is a common variable shared by all objects of class 
//it belongs to the class not the object

//for example here student of different name have same school

class School{
	String name;
	static String school;
	
	public void show()
	{
		System.out.println(name + " " + school);
	}
	
}
	

public class StaticVariableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School sch=new School();
		sch.name="Unnati";
		
		School sc2=new School();
		sc2.name="Vedika";
		
		
		School.school="GHRCEMl";
		
		sch.show();
		sc2.show();
		
		
	}

}

package com.practice.oop;

class Student {
	String name;
	int age;
	
	void displayDetails() {
		System.out.println("name " + name);
		System.out.println("age " + age);
	}
	
	
}

public class StudentNameAndAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student ();
		s.name ="Unnati";
		s.age=  24;
		s.displayDetails();

	}

}

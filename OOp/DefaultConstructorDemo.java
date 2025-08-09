package com.practice.oop;

class Human4{
	String name;
	int age;
	public Human4(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void display() {
		System.out.println(name + age );
	}
	
}
public class DefaultConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human4 h=new Human4("unnati ", 24);
		h.display();

	}

}

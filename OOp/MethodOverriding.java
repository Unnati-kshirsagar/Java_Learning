 package com.practice.oop;
 class Animal{
	 void sound(){
		 System.out.println("Animal make sound");
		 
	 }
	 
 }

class Dog extends Animal{
	@Override
	void sound() {
		System.out.println("DOg can bark");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//same method and same parameters but different behaviour
		Animal a=new Dog();  //upcasting
		a.sound();
		
		
		//upcasting means assigning a chilld class object to a parent class reference
		
		

	}

}

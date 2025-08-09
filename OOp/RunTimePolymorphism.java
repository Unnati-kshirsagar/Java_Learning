package com.practice.oop;

class Vehicle{
	void start() {
		System.out.println("vehicle is satrting");
	}
}
class CarV extends Vehicle{
	void start() {
		System.out.println("Car is Starting");
	}

}
class Bike extends Vehicle{
	void start() {
		System.out.println("Bike is starting");
	}
}

public class RunTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle V;
		
		V=new CarV();
		V.start();
		
		V=new Bike();
		V.start();
		
		
	
		

	}

}

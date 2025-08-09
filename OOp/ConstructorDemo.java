package com.practice.oop;

// constructor is a special method that has same name as the class
// automatically runs when you create an object
// is used to initialize (set) value in object
// you use it when you want to automatically set values or initialize object soon as it created

class Car6 {
    String brand;

    Car6() {
        brand = "Honda";
    }
}

public class ConstructorDemo {

    public static void main(String[] args) {
        Car6 c = new Car6();  // Create object
        System.out.println("Brand is: " + c.brand);   
    }
}

package com.practice.oop;

abstract class Shape {
    abstract void area();  // abstract method

    void display() {
        System.out.println("This is a shape.");
    }
}

class Rectangle extends Shape {
    double length = 4;
    double breadth = 5;

    void area() {
        double result = length * breadth;
        System.out.println("Area: " + result);
    }
}

public class AbstarctDemo {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.area();
        r.display();
    }
}

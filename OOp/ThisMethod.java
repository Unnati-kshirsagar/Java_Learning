package com.practice.oop;

class A {
    public A() {
    	super();
        System.out.println("A: Default constructor");
    }

    public A(int x) {
    	this();
        System.out.println("A: Parameterized constructor with value " + x);
    }
}

class B extends A {
    public B() {
        this(10);  
        System.out.println("B: Default constructor");
    }

    public B(int x) {
        super();  // calls A(int x)
        System.out.println("B: Parameterized constructor with value " + x);
    }
}

public class ThisMethod {
    public static void main(String[] args) {
        B obj = new B();
    }
}

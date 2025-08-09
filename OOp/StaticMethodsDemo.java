 package com.practice.oop;
 class MathUtils {

	    // static method
	    static int add(int a, int b) {
	        return a + b;
	    }

	    // non-static method
	    void greet() {
	        System.out.println("Hello!");
	    }
	}

public class StaticMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = MathUtils.add(10, 20);
        System.out.println("Sum = " + result);

        // Call non-static method using object
        MathUtils obj = new MathUtils();
        obj.greet();
    }

}



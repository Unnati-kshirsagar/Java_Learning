package com.practice.oop;

 final class Calc{
	final public void show() {
		System.out.println("");
	}
}

//class AdvCalc extenddsCalc{ error cannot inherit from final class
      //void display() { Error cannot overrride final method 
 //System.out.println("Trying to override")
    	  
      //}
	
//}
public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Final Variable:
		//Once a variable is marked as final, 
		//its value cannot be changed after initialization.
		final int x=20;
		//x=30; //Error cannot assign a value to final variable
		System.out.println("x :" + x);

	}

}

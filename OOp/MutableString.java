package com.practice.oop;

public class MutableString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//once created the object cannot be changed
		String s="Unnati";
		s.concat("Unnati");
		System.out.println(s); //output Unnati 
		
		//so here even you tried to add patil the original s did not chnage
		
		//if you want the result you must store it in a new string
		String s1="Unnati";
		String s5 = s1.concat(" patil");
		System.out.println(s5);

	}

}

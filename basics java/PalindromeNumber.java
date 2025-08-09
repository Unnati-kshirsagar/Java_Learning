package com.practice.start;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madam";
		String reverse="";
		for(int i= s.length()-1;i>=0;i--) {
			reverse += s.charAt(i);
		}
		if(s.equals(reverse)) {
			System.out.println(s + " PAlINDROME ");
			
		}
		else {
			
			System.out.println(s + "Not palindrome");
		}
	}

}

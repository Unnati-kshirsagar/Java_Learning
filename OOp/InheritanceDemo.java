package com.practice.oop;

class Calc4{
	public int add(int n1,int n2) {
		return n1+n2;
	}
	public int sub(int n1,int n2) {
		return n1-n2;
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdvCalc obj=new AdvCalc();
		int r1=obj.add(2, 3);
		int r2=obj.sub(4, 2);
		int r3=obj.multi(3,4);
		int r4=obj.div(10, 2);
		
		
		System.out.println(r1 + " : " + r2  + ": " + r3 + " : " + r4);

	}

}

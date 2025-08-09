package com.practice.oop;

class Human
{
	private int age;    //private hidden from outside
	private String name;
	
	public int  getAge()
	{
		return age;
	}
	public String getName()
	{
		return name;
	}
	public void setAge(int a)
	{
		age=a;
	}
	public void setName(String n)
	{
		name=n;
	}
	
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human obj=new Human();
		obj.setAge(30);
		obj.setName("Unnati");
		System.out.println(obj.getName() + " " + obj.getAge());

	
	}

}

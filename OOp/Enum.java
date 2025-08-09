package com.practice.oop;

enum Season{
	SUMMER,
	WINTER,
	SPRING,
	AUTUMN
}

public class Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Season currentSeason=Season.SUMMER;
		
	switch(currentSeason) {
	
	case SUMMER:
		System.out.println("It's hot and sunny!!");
		break;
	case WINTER:
		System.out.println("Its cold and snowy!!");
		break;
	case SPRING:
		System.out.println("FLowers are blooming");
		break;
	case AUTUMN:
		System.out.println("Leaves are falling");
		
		break;
	
	}

	}

}

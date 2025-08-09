package com.practice.oop;

class Book{
	String title;
	String author;
	double price;
	
	void showBook() {
		System.out.println("title " + title);
		System.out.println("author " + author);
		System.out.println("price " + price);
		
	}
}

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book();
		b.title="Atomic Habit";
		b.author="James Clear";
		b.price= 300;
		b.showBook();

	}

}

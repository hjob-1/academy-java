package com.bptn.course._23_junit_books;

public class Book {
	private String title;
	private double price;

	public Book(String title, double price) {
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return this.title;
	}

	public String getBookInfo() {
		return title + "-" + price;
	}
}

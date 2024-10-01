package com.bptn.course._07_OOP;

class Car {
	private String color; // attributes
	private String brand; // attributes
	private int price; // attributes

	// constructor to initialize attributes
	public Car(String color, String brand, int price) {
		this.color = color;
		this.brand = brand;
		this.price = price;

	}

	// display
	public void printCarDetails() {
		// this keyword refers to the current instance object
		this.print();
	}

	public void print() {
		System.out.println("Car{" + "color='" + color + ' ' + ", brand='" + brand + ' ' + ", price=" + price + '}');

	}
}

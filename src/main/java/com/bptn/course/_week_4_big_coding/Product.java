package com.bptn.course._week_4_big_coding;

import java.util.ArrayList;
import java.util.List;

public class Product {

	// Create your instance variables
	private int id;
	private String name;
	private double price;

	// Create a constructor to initialize the product properties
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	// Create a static method "countProducts"
	public static long countproducts(List<Product> productsList) {
		// Filter products based on the price and get the count of products
		// filter stream method loop through the product list and filter out products
		// whose price is less than 30000
		// terminal count method will count the number of products whose price is less
		// 30000
		long count = productsList.stream().filter(product -> product.price < 30000).count();
		return count;
	}

	public static void main(String[] args) {
		// Create a list of products
		List<Product> productsList = new ArrayList<Product>();

		// Add products to the list
		productsList.add(new Product(1, "HP Laptop", 25000));
		productsList.add(new Product(2, "Dell Laptop", 30000));
		productsList.add(new Product(3, "Lenevo Laptop", 28000));
		productsList.add(new Product(4, "Sony Laptop", 28000));
		productsList.add(new Product(5, "Apple Laptop", 90000));

		// Call "countProducts" method and hold return type in "count" variable
		long count = Product.countproducts(productsList);

		// Print the count of products whose price is less than 30000
		System.out.println("Number of products with price less than 30000: " + count);
	}
}

/*
 * CountProduct is a static method which means we can directly invoke without
 * the need of to create an object instance of the class. countProduct takes a
 * list of products as its argument. I used stream().filter method to filter out
 * list of products whose price is less than 30000. Then i have used a terminal
 * operation called "count" to know the number of product whose price is less
 * than 30000. I have created a varible count and its data type is "long" coz
 * count method return a long data type.
 * 
 */

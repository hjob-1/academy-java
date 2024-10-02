package com.bptn.course._07_OOP_DEMO;

class Customer {

	private String customerID;
	private String customerName;
	private String customerEmail;
	private ShoppingCart cart;

	public Customer(String customerID, String customerName, String customerEmail) {

		this.customerID = customerID;
		this.customerEmail = customerEmail;
		this.customerName = customerName;
		this.cart = new ShoppingCart();
	}

	// Getter for customer name

	public String getCustomerName() {
		return this.customerName;
	}

	public ShoppingCart getCart() {
		return this.cart;
	}

	public void checkout() {

		System.out.println("Processing order for " + customerName);
	}

}

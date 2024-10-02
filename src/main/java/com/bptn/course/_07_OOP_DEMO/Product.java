package com.bptn.course._07_OOP_DEMO;

// Private class
class Product {
	private String productId;
	private String productName;
	private double productPrice;
	private int productQuantity;

	public Product(String productId, String productName, double productPrice, int productQuantity) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
	}

	// getters // Accessors

	public String getProductId() {
		return this.productId;
	}

	public String getProductName() {
		return this.productName;
	}

	public double getProductPrice() {
		return this.productPrice;
	}

	public int getProductQuantity() {
		return this.productQuantity;
	}

	public void reduceStock(int quantity) {
		if (quantity <= this.productPrice) {
			this.productQuantity -= quantity;
		} else {
			throw new IllegalArgumentException("insufficient stock");
		}
	}

	// Setters

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

}

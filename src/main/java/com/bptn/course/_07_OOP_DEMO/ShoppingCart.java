package com.bptn.course._07_OOP_DEMO;

class ShoppingCart {

	private CartItem[] items;
	private int itemCount;

	public ShoppingCart() {
		this.items = new CartItem[5];
		this.itemCount = 0;
	}

	// addProductToCart
	public void addProductToCart(Product product, int quantity) {

		if (itemCount <= 4) {
			CartItem newItem = new CartItem(product, quantity);
			items[itemCount] = newItem;
			itemCount++;
			product.reduceStock(quantity);
		} else {
			throw new IllegalArgumentException("cart is full");
		}

	}

	//

	public CartItem[] showProductsInCart() {
		CartItem[] currentItems = new CartItem[itemCount];

		for (int i = 0; i < itemCount; i++) {
			currentItems[i] = items[i];

		}

		return currentItems;

	}

}

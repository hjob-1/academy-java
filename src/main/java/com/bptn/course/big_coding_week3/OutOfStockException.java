package com.bptn.course.big_coding_week3;

public class OutOfStockException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Modify the constructor below to take a String message parameter.
	public OutOfStockException(String message) {
		// Call the superclass constructor passing the message parameter.
		super(message);
	}
}

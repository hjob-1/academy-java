package com.bptn.course.big_coding_week3;

class SumCalculator extends Thread {

	// The start point of the range
	private int start;

	// The end point of the range
	private int end;

	// The sum of the numbers in the range
	private int sum;

	// Constructor to set the start and end points of the range
	public SumCalculator(int start, int end) {
		// Initialize the instance variables start and end
		this.start = start;
		this.end = end;
		// Initialize the sum to 0
		this.sum = 0;

	}

	// Override the run method to calculate the sum of the numbers in the range
	public void run() {
		// Iterate through the numbers in the range and add them to the sum

		for (int i = start; i <= end; i++) {
			this.sum += i;

		}

	}

	// Method to get the sum of the numbers in the range
	public int getSum() {
		return sum;
	}
}
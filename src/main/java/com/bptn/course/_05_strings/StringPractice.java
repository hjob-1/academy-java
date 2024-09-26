package com.bptn.course._05_strings;

import java.util.Scanner;

public class StringPractice {

	public static void main(String[] args) {

		// Initialize the Scanner Object
		Scanner scanner = new Scanner(System.in);
		int n;

		System.out.print("Enter the number of elements: ");

		// Fetch the input from the user and store in the variable called n
		n = scanner.nextInt();
		if (n < 0) {
			System.out.println("Please enter a non-negative number.");
		} else {

			int first = 0; // First element of Fibonacci series
			int second = 1; // Second element of Fibonacci series

			System.out.print("Fibonacci Series up to " + n + " elements: ");

			// Print the first n elements of Fibonacci series
			for (int i = 0; i < n; i++) {
				System.out.print(first + " ");
				// Fill in the missing piece of code below to print the elelments
				int next = first + second;
				first = second;
				second = next;

			}
		}

		scanner.close();

	}
}

package com.bptn.course._06_switch_Statement;

import java.util.Scanner;

public class SwitchCalculator {
	// Adding a new comment
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int choice;
		double totalPrice = 0.0;
		do {
			System.out.println("Welcome to the menu!");
			System.out.println("Please choose an item from the list: ");
			System.out.println("1. Pizza - $12.99");
			System.out.println("2. Burger - $8.99");
			System.out.println("3. Pasta - $9.99");
			System.out.println("4. Salad - $6.99");
			System.out.println("5. Exit");

			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("You ordered Pizza!");
				totalPrice += 12.99;
				break;
			case 2:
				System.out.println("You ordered Burger!");
				totalPrice += 8.99;
				break;
			case 3:
				System.out.println("You ordered Pasta!");
				totalPrice += 9.99;
				break;
			case 4:
				System.out.println("You ordered Salad!");
				totalPrice += 6.99;
				break;
			case 5:
				if (totalPrice == 0) {
					System.out.println("Thank you for stopping by!");
				} else {
					System.out.println("Thank you for stopping by!, Your bill is " + totalPrice);
				}
				break;
			default:
				System.out.println("Invalid Choice!");
			}

		} while (choice != 5);

		// 1. Allow multiple selections
		// 2. Calculate total price for the order
		// 3. While exiting, show the total price
	}

}

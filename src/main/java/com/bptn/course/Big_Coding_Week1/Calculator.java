package com.bptn.course.Big_Coding_Week1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int number;
		double firstNumber;
		double secondNumber;
		double result;
		int choice;
		int restart = 1; // Control variable to decide whether to continue or exit

		do {
			calculatorMenu();
			choice = scanner.nextInt();

			// Check if the choice is for basic arithmetic operations
			if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
				System.out.print("Enter the first number: ");
				firstNumber = scanner.nextDouble();

				System.out.print("Enter the second number: ");
				secondNumber = scanner.nextDouble();

				switch (choice) {
				case 1:// Addition
					result = firstNumber + secondNumber;
					print("The sum of the numbers " + firstNumber + " and " + secondNumber + " is = " + result);
					break;
				case 2:// Subtraction
					result = firstNumber - secondNumber;
					print("The Subtraction of the numbers " + firstNumber + " and " + secondNumber + " is = " + result);
					break;
				case 3:// Multiplication
					result = firstNumber * secondNumber;
					print("The product of the numbers " + firstNumber + " and " + secondNumber + " is = " + result);
					break;
				case 4:// Division
					result = (int) (firstNumber / secondNumber);
					double remainder = firstNumber % secondNumber;
					print("Dividing " + firstNumber + " by " + secondNumber + " the quotient is " + result
							+ " The remainder is " + remainder);
					break;

				}

			} else if (choice == 5 || choice == 6 || choice == 7) {
				System.out.print("Enter Number: ");
				number = scanner.nextInt();

				switch (choice) {
				case 5:// Square
					result = number * number;
					print("The Square of the number " + number + " is = " + result);
					break;
				case 6: // Square root
					result = Math.sqrt(number);
					print("The Square root of the number " + number + " is =" + result);
					break;
				case 7:// Reciprocal
					if (number == 0) {
						print("Number " + number + " Do not have a reciprocal number");
					} else {
						result = 1 / number;
						print("The Reciprocal of the number " + number + " is =" + result);
					}
					break;
				}
			} else { // Handle invalid choices
				print("Invalid choice! Please make a valid choice.");
			}

			print("To continue calculation Press 1, else press any other number to exit");
			restart = scanner.nextInt();
		} while (restart == 1);

		scanner.close();

	}

	public static void print(String str) {
		System.out.println(str);

	}

	public static void calculatorMenu() {

		String[] menuList = { "/…Calculator Menu…/", "Press 1 for addition", "Press 2 for subtraction",
				"Press 3 for multiplication", "Press 4 for division", "Press 5 to square a number",
				"Press 6 to find a square root", "Press 7 to find the reciprocal" };

		for (String list : menuList) {
			print(list);
		}
	}

}

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

		System.out.println("/…Calculator Menu…/");
		System.out.println("Press 1 for addition");
		System.out.println("Press 2 for subtraction");
		System.out.println("Press 3 for multiplication");
		System.out.println("Press 4 for division");
		System.out.println("Press 5 to square a number");
		System.out.println("Press 6 to find a square root");
		System.out.println("Press 7 to find the reciprocal");

		choice = scanner.nextInt();

		if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
			System.out.print("Enter the first number: ");
			firstNumber = scanner.nextDouble();

			System.out.print("Enter the second number: ");
			secondNumber = scanner.nextDouble();

			if (choice == 1) {

				result = firstNumber + secondNumber;
				System.out.print("The sum of the numbers " + firstNumber + " and " + secondNumber + " is = " + result);
			} else if (choice == 2) {
				result = firstNumber - secondNumber;
				System.out.print(
						"The Subtraction of the numbers " + firstNumber + " and " + secondNumber + " is = " + result);
			} else if (choice == 3) {
				result = firstNumber * secondNumber;
				System.out.print("The Multiplication of the numbers " + firstNumber + " and " + secondNumber + " is = "
						+ result);
			} else if (choice == 4) {
				result = firstNumber / secondNumber;
				System.out.print(
						"The Division of the numbers " + firstNumber + " and " + secondNumber + " is = " + result);
			}

		} else {
			System.out.print("Enter Number: ");
			number = scanner.nextInt();

			if (choice == 5) {
				result = number * number;
				System.out.print(" The square of a number " + number + " is = " + result);
			}

		}

		scanner.close();

	}

}

package com.bptn.course.Big_Coding_Week1;

import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int targetNumber = 23;
		int guess;
		print("Please enter a number between 1 and 100.");
		do {
			guess = scanner.nextInt();
			if (guess < 1 || guess > 100) {
				print("Invalid input Please Enter the correct number");
			} else if (guess == targetNumber) {
				print("Congratulations! You guessed the number correctly!");
			} else if (guess > targetNumber) {
				print("Too high! Try again.");

			} else

				print("Too low! Try again.");

		} while (guess != targetNumber);
		{

		}

	}

	public static void print(String str) {
		System.out.println(str);

	}

}

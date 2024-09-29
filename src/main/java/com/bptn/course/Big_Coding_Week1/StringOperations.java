package com.bptn.course.Big_Coding_Week1;

import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int choice;
		String userInput1;
		String userInput2;
		boolean stop = false;
		String restart = "y";

		do {
			stringOperationMenu();
			choice = scanner.nextInt();

			switch (choice) {

			case 1:
				print("Palindrome Check");
				print("Enter a string");
				userInput1 = scanner.next();
				palindrome(userInput1);
				break;
			case 2:
				print("Reverse the string");

				print("Enter a string");
				userInput1 = scanner.next();

				String reversed = new StringBuilder(userInput1).reverse().toString();
				print(reversed);
				break;
			case 3:
				print("Concatenate two Strings");

				print("Enter The first string:");
				userInput1 = scanner.next();

				print("Enter The Second string:");
				userInput2 = scanner.next();

				print(userInput1 + userInput2);
				break;
			case 4:
				print("String Comparison");

				print("Enter The first string:");
				userInput1 = scanner.next();

				print("Enter The Second string:");
				userInput2 = scanner.next();

				if (userInput1.equals(userInput2))
					print("The entered strings are equal");

				else
					print("The entered strings are not equal");
				break;
			case 5:
				print("Length of a string");
				print("Enter a string:");
				userInput1 = scanner.next();

				print("The length of the entered string is: " + userInput1.length());
				break;
			default:
				print("Invalid choice! Please make a valid choice.");
				choice = scanner.nextInt();

			}

			print("Do you wish to continue y/n");
			restart = scanner.next();
			if (restart.toLowerCase().equals("n"))
				stop = true;

		} while (!stop);

		scanner.close();
	}

	public static void palindrome(String str) {

		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);
		}
		if (str.equals(reversed)) {
			print(str + " is a palindrome");
		} else {
			print(str + " is not a palindrome");
		}
	}

	public static void print(String str) {
		System.out.println(str);

	}

	public static void stringOperationMenu() {
		String[] menuList = { "/…String Menu…/", "Press 1 for Palindrome Check", "Press 2 to reverse a String",
				"Press 3 to Concatenate two Strings", "Press 4 for String Comparison",
				"Press 5 to Calculate the Length of String" };

		for (String list : menuList) {
			print(list);
		}
	}

}

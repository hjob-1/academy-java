package com.bptn.course._06_switch_Statement;

import java.util.Scanner;

public class DataPlan {

	public static void displayMessage(int price, String plan) {
		System.out.println("You have selected the " + plan + " plan");

		System.out.println("The total cost of your selected plan is: " + price);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int dataPlanChoice;

		System.out.println("Welcome to the mobile Data Plan Selector!");
		System.out.println("Please select a data plan:");
		System.out.println("1. 1 GB - $10");
		System.out.println("2. 5 GB - $30");
		System.out.println("3. 10 GB - $50");
		System.out.println("4. Unlimited - $70");
		System.out.println("5. Exit");

		dataPlanChoice = scanner.nextInt();

		switch (dataPlanChoice) {

		case 1:
			displayMessage(10, "1 GB");
			break;
		case 2:
			displayMessage(30, "5 GB");
			break;
		case 3:
			displayMessage(50, "10 GB");
			break;
		case 4:
			displayMessage(70, "Unlimited");
			break;
		case 5:
			System.out.println("You Are Exited");
			break;

		}

	}

}

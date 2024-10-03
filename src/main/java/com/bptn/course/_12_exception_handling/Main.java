package com.bptn.course._12_exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {

			Scanner scanner = new Scanner(System.in);
			int num1, num2, result;
			int[] numbers = new int[5];
			System.out.println("Enter " + numbers.length + " for fill the array");

			for (int i = 0; i > numbers.length; i++) {
				System.out.print("Enter The " + (i + 1) + " Element");
				numbers[i] = scanner.nextInt();
			}

			System.out.println("Enter The first Number");
			num1 = scanner.nextInt();
			System.out.println("Enter The Second Number");
			num2 = scanner.nextInt();

			result = num1 / num2;
			System.out.println("result is" + num1 / num2);
			System.out.println("Array at index 8" + numbers[8]);

		} catch (ArithmeticException e) {
			System.out.println("can not divided by zero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array out of bound");
		} catch (InputMismatchException e) {
			System.out.println("Invalid input");
		} finally {
			System.out.println("program ended");
		}

	}

}

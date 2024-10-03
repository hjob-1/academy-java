package com.bptn.course._12_exception_handling;

import java.util.Scanner;

public class CustomExceptionProblem2 {

	public static void main(String[] args) {
		// Write your code below.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the file name with correct extension i.e. .txt ");

		String fileName = scanner.nextLine();
		fileName.toLowerCase();

		try {
			validateFileExtension(fileName);
			System.out.println("Correct file name with extension .txt");
		} catch (FileExtensionException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			scanner.close();
		}

	}

	private static void validateFileExtension(String fileName) throws FileExtensionException {
		if (!fileName.endsWith(".txt")) {
			throw new FileExtensionException("File doesn't have .txt extension");
		}
	}

}

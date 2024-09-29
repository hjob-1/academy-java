package com.bptn.course.Big_Coding_Week1;

import java.util.Scanner;

public class WordEncryption {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word;
		String encrypted = "";
		print("Enter The word");
		word = scanner.nextLine();
		// small all ascii code 97 and 65 for capital letter
		for (int i = 0; i < word.length(); i++) {
			int ascii = (int) word.charAt(i);

			// Determine if the ASCII code corresponds to a letter.
			if (ascii >= 65 && ascii <= 90 || ascii >= 97 && ascii <= 122) {

				if (ascii == 90) // If capital Z shifted to A
					ascii = 65;
				else if (ascii == 122) // If small z shifted to a
					ascii = 97;
				else
					ascii = ascii + 1; // otherwise shift The character by one position
				char convertToChar = (char) ascii; // convert the ASCII code to The character value

				encrypted += convertToChar; // Append to encrypted string

			} else {

				encrypted += word.charAt(i); // If it's not a letter, append it as is.
			}

		}
		print("Encrypted word: " + encrypted);

		scanner.close(); // close scanner object

	}

	public static void print(String str) {
		System.out.println(str);

	}
}

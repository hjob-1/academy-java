package com.bptn.course.Big_Coding_Week1;

import java.util.Scanner;

public class PluralForm {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amt;
		String word;
		String plural;

		print("# In: ");
		amt = scanner.nextInt();
		scanner.nextLine(); // Consume the newline character

		print("word: ");
		word = scanner.nextLine(); // Read the input word

		// Check if the amount is 1 and the word is not empty
		if (amt == 1 && !word.isEmpty()) {
			print(amt + " " + word); // Print singular form

		} else {
			// Determine the plural form based on the word's ending

			if (word.endsWith("us")) {
				// For words ending in 'us', change to 'i'
				int lastIndex_us = word.toLowerCase().lastIndexOf("us");
				String subString = word.substring(0, lastIndex_us);
				plural = subString + "i";
			}

			else if (endsWith(word, new String[] { "s", "sh", "ch", "x", "z" })) {
				// For words ending in s, sh, ch, x, or z, add 'es'
				plural = word + "es";

			} else if (endsWith(word, new String[] { "fe", "f" })) {
				// For words ending in 'f' or 'fe', change to 'ves'
				int lastIndex_f = word.toLowerCase().lastIndexOf('f'); // get the last index of f.
				String subString = word.substring(0, lastIndex_f); // cut the word until f
				plural = subString + "ves";

			} else if (endsWith(word, new String[] { "ey", "iy", "oy", "ay", "uy" })) {
				// For words ending in 'ey', 'iy', 'oy', 'ay', or 'uy', add 's'
				plural = word + "s";

			} else if (word.endsWith("y")) {
				// For words ending in 'y', change to 'ies'
				int lastIndex_y = word.toLowerCase().lastIndexOf('y'); // get the last index of y.
				String subString = word.substring(0, lastIndex_y); // cut the word until y
				plural = subString + "ies";

			} else {
				plural = word + "s";

			}

			print(amt + " " + plural);
		}

		scanner.close();

	}

	public static void print(String str) {
		System.out.println(str);

	}

	public static boolean endsWith(String word, String[] endSuffixes) {
		String lowerCase = word.toLowerCase();
		boolean found = false;

		for (String suffix : endSuffixes) {
			if (lowerCase.endsWith(suffix)) {
				found = true;
				break;
			}
		}
		return found;
	}

}

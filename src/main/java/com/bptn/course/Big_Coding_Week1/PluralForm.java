package com.bptn.course.Big_Coding_Week1;

import java.util.Scanner;

public class PluralForm {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amt = 2;
		String word;
		String plural;
		print("# In: ");
		amt = scanner.nextInt();
		scanner.nextLine();

		print("word: ");
		word = scanner.nextLine();

		if (amt == 1 && !word.isEmpty()) {
			print(amt + " " + word);
		} else {
			if (word.endsWith("us")) {
				int lastIndex_us = word.toLowerCase().lastIndexOf("us");
				String subString = word.substring(0, lastIndex_us);
				plural = subString + "i";
			}

			else if (endsWith(word, new String[] { "s", "sh", "ch", "x", "z" })) {

				plural = word + "es";
			} else if (endsWith(word, new String[] { "fe", "f" })) {
				// get the index of the last occurence f
				int lastIndex_f = word.toLowerCase().lastIndexOf('f');
				String subString = word.substring(0, lastIndex_f);
				plural = subString + "ves";

			} else if (endsWith(word, new String[] { "ey", "iy", "oy", "ay", "uy" })) {
				plural = word + "s";
			} else if (word.endsWith("y")) {
				// get the index of the last occurrence y
				int lastIndex_y = word.toLowerCase().lastIndexOf('y');
				String subString = word.substring(0, lastIndex_y);
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

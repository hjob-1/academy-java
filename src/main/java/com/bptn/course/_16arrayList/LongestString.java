package com.bptn.course._16arrayList;

import java.util.ArrayList;

public class LongestString {
	public static String findLongest(ArrayList<String> list) {
		// code here
		String longestWord = "";

		for (String word : list) {
			if (word.length() > longestWord.length()) {
				longestWord = word;
			}
		}

		return longestWord;

	}

	public static void main(String[] args) {
		// instantiate ArrayList
		ArrayList<String> values = new ArrayList<String>();
		String[] words = { "singapore", "cattle", "metropolitan", "turnstile" };
		for (int i = 0; i < words.length; i++) {
			values.add(words[i]);
		}
		System.out.println("Expected Result: metropolitan");
		System.out.print("Your Result: ");
		System.out.println(findLongest(values));

	}

}

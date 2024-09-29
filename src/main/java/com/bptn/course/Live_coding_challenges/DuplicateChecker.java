package com.bptn.course.Live_coding_challenges;

public class DuplicateChecker {

	public static void main(String[] args) {
		// declare variables
		// loop through the array
		// check an element is duplicated
		// display;

		int[] nums = { 1, 2, 3, 0, 4, 5 };
		boolean isDuplicate = false;

		for (int i = 0; i < nums.length; i++) {

			for (int j = i + 1; j < nums.length - 1; j++) {

				if (nums[i] == nums[j]) {
					isDuplicate = true;
					break;
				}

			}
			if (isDuplicate) {
				break;
			}

		}

		if (isDuplicate) {
			System.out.println("Array Containes Duplicates values");
		} else {
			System.out.println("Array does not Containes Duplicates values");
		}

	}

}

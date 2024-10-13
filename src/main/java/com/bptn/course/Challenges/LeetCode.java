package com.bptn.course.Challenges;

public class LeetCode {

	public static void main(String[] args) {
		int nums[] = { 2, 7, 11, 15 };
		int target = 17;
		int firstIndex = -1;
		int secondIndex = -1;

		for (int i = 0; i < nums.length - 1; i++) {
			firstIndex = i;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[firstIndex] + nums[j] == target) {
					secondIndex = j;
					break;
				}
			}
			if (secondIndex != -1) {
				break;
			}
		}
		if (firstIndex != -1 && secondIndex != -1) {
			System.out.println("The index: [" + firstIndex + "," + secondIndex + "]");
		} else {
			System.out.println("The index not found");
		}

	}

}

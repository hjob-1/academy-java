package com.bptn.course._24_searching_algorithms;

import java.util.Arrays;

public class BinarySearch {

	public void Start() {

		int[] array = { 3, 6, 1, 4, 2, 9, 7, 8, 5, 0 };
		int key = 1;

		Arrays.sort(array);

		// sort array
		int result = binarySearch(array, key);

		// Print values in array after sort
		System.out.println(result);

	}

	int binarySearch(int arr[], int key) {
		// put your code here.
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {

			int mid = (low + high) / 2;
			if (arr[mid] == key) {
				return mid;
			} else if (arr[mid] < key) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		BinarySearch main = new BinarySearch();
		main.Start();

	}
}

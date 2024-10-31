package com.bptn.course._25_sorting_algorithms;

import java.util.Arrays;

// Find the smallest from the array list bring it to the front
// used when you know the data  specifically when the begining of the array is the smallest 
public class InsertionSort {
	static void insertionSort(int[] arr) {
		int size = arr.length;
		// outer llop for each index
		for (int i = 0; i < size; i++) {
			// inner loop to compare and swap
			int key = arr[i];// assuming key is the smallest
			int j = i - 1; //
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 5, 3, -1, 7, 10, 2 };
		System.out.println("Before sort:" + Arrays.toString(data));
		insertionSort(data);
		System.out.println("After sort:" + Arrays.toString(data));

	}

}

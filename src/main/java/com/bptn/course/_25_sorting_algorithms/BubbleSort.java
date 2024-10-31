package com.bptn.course._25_sorting_algorithms;

import java.util.Arrays;

public class BubbleSort {

	static void bubbleSort(int array[]) {
		int size = array.length;
		// loop for every element
		for (int i = 0; i < size - 1; i++) {

			// loop for comparison
			for (int j = 0; j < size - 1; j++) {
				// if the value on the left is greater than the value on the right, we swap
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 5, 3, -1, 7, 10, 2 };
		int[] data2 = { 1, 2, 3, 4 };
		System.out.println("Before sort:" + Arrays.toString(data2));
		bubbleSort(data2);
		System.out.println("After sort:" + Arrays.toString(data2));

	}

}

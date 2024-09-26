package com.bptn.course._04_arrays;

public class TwoDimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] grades = { { 85, 90, 75 }, { 88, 92, 60 }, { 60, 60, 50 } };

		int maxRowValue;

		for (int i = 0; i < 3; i++) {
			maxRowValue = grades[i][0];
			for (int j = 0; j < 3; j++) {
				if (grades[i][j] > maxRowValue) {
					maxRowValue = grades[i][j]; //
				}

			}
			System.out.println("The max value in the " + i + " Row is = " + maxRowValue);
		}

	}

}

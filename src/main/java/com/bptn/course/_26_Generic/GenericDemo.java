package com.bptn.course._26_Generic;

public class GenericDemo {

//	static int findMax(int x, int y) {
//
//		return x > y ? x : y;
//	}
	// Change the above to generic method
	static <T extends Comparable<T>> T findMax(T x, T y) {
		if (x.compareTo(y) > 0) {
			return x;
		} else {
			return y;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Max of 10 and 20: " + findMax(10, 20));
		System.out.println("Max of 10 and 20: " + findMax(10.2, 20.3));
		System.out.println("Max of 10 and 20: " + findMax(10.3, 20.2));

	}

}

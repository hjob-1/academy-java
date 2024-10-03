package com.bptn.course._09_inheritance;

public class MathUtil {

	// we create static fields and method when we want to share the data across
	// every instance objects.

	//

	static int count = 0;

	public MathUtil() {
		this.count++;
	}

	static double valueOfPi = 3.14;

	static int add(int a, int b) {
		return a + b;
	}

	public void display() {
		System.out.println("this is not static");
	}
}

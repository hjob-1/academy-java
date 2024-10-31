package com.bptn.course._26_Generic;

import java.util.ArrayList;
import java.util.List;

public class GenericClass<T extends Number> {

	private List<T> list = new ArrayList<>();

	public void add(T num) {
		list.add(num);
	}

	public T get(int index) {
		return list.get(index);
	}

	public double sum() {
		double sum = 0;
		for (T number : list) {
			sum += number.doubleValue();
		}
		return sum;
	}

	public static void main(String[] args) {
		GenericClass<Integer> intList = new GenericClass<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);

		System.out.println("Integer List:");
		for (int i = 0; i < intList.list.size(); i++) {
			System.out.println(intList.get(i));
		}
		System.out.println("Integer List Sum = " + intList.sum());

		GenericClass<Double> doubleList = new GenericClass<>();
		doubleList.add(1.1);
		doubleList.add(2.2);
		doubleList.add(3.3);

		System.out.println("\nDouble List:");
		for (int i = 0; i < doubleList.list.size(); i++) {
			System.out.println(doubleList.get(i));
		}
		System.out.println("Double List Sum = " + doubleList.sum());
	}
}

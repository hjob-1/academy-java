package com.bptn.course._16arrayList;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// We should provide data type, if not It will store different type of data.
		// We don't have to specify the data type on the right side => new ArrayList<>
		// reserve storage for 10 items by default
		ArrayList<String> groceries = new ArrayList<>();

		groceries.add("Milk");
		groceries.add("bread");
		groceries.add("Eggs");
		groceries.removeIf((value) -> value.indexOf('M') != -1);

		// R -> read
		System.out.println("grocery list:" + groceries);
		// System.out.println(groceries.get(2));
		System.out.println(groceries.getLast());
		System.out.println(groceries.getFirst());

		// U - Update
		// groceries.set(1, "Coffee");
		// groceries.set(3, "Sugar");// we can not add a new element using set
		// System.out.println("grocery list:" + groceries);

		// D -> Delete
		// groceries.remove(2);
		System.out.println("grocery list:" + groceries);

	}

}

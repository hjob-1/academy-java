package com.bptn.course._19_treeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		// Create a TreeSet and populate it with initial elements
		TreeSet<Integer> treeSet = new TreeSet<>();

		// Add elements to the TreeSet
		treeSet.add(10);
		treeSet.add(20);
		treeSet.add(30);
		treeSet.add(40);
		treeSet.add(50);

		// Print the size of the TreeSet
		System.out.println("TreeSet size: " + treeSet.size());

		// Use for each loop to print the elements in the TreeSet
		System.out.println("Elements in the TreeSet (using for-each loop):");
		for (Integer element : treeSet) {
			System.out.println("Element: " + element);
		}

		// Use remove() method to remove an element from the TreeSet
		treeSet.remove(20);
		System.out.println("TreeSet after using remove(): " + treeSet);

		// first Element
		System.out.println("First element: " + treeSet.getFirst());

		// Check if an element exists in the TreeSet
		System.out.println("Does TreeSet contain 20? " + treeSet.contains(20));

		// Get the headSet from the TreeSet
		System.out.println("Elements in the headSet: " + treeSet.headSet(30));

		// Get the tailSet from the TreeSet
		System.out.println("Elements in the tailSet: " + treeSet.tailSet(30));

		// Get the subSet from the TreeSet
		System.out.println("Elements in the subSet: " + treeSet.subSet(30, 50));

		// Get the descendingSet from the TreeSet
		NavigableSet<Integer> descendingSet = treeSet.descendingSet();

		System.out.println("Elements in the descendingSet: " + descendingSet);

		// Use clear() method to remove all elements from the TreeSet
		treeSet.clear();
		System.out.println("TreeSet after using clear(): " + treeSet);
	}

}

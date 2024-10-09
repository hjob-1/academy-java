package com.bptn.course._17_iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<String> myBooks = new ArrayList<>();

		// Add 3 favorite books to this list
		myBooks.add("The alchemist");
		myBooks.add("Think and grow Rich");
		myBooks.add("Rich Dad Poor Dad");

		Iterator<String> iterator = myBooks.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}

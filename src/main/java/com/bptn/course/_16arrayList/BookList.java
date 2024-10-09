package com.bptn.course._16arrayList;

import java.util.ArrayList;

public class BookList {

	public static void main(String[] args) {
		ArrayList<String> myBooks = new ArrayList<>();

		// Add 3 favorite books to this list
		myBooks.add("The alchemist");
		myBooks.add("Think and grow Rich");
		myBooks.add("Rich Dad Poor Dad");

		// display all books
		System.out.println("Favorite books:" + myBooks);
		// Display The first book
		System.out.println("First book:" + myBooks.getFirst());
		System.out.println("First book:" + myBooks.get(0));

		// Delete The second book
		myBooks.remove(1);
		System.out.println("Favorite books:" + myBooks);

		// Search for a book .Contains Is case
		// Size of the ArrayList
		System.out.println("Favorite books:" + myBooks.size());

	}

}

package com.bptn.course._20_hashset;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// no duplicates
		// unordered
		HashSet<String> mySet = new HashSet<>();
		mySet.add("Toronto");
		mySet.add("Vancouver"); // There is no add(index,value)
		mySet.add("Hamilton");

		System.out.println(mySet);

		// delete
		mySet.remove("Hamilton");
		System.out.println(mySet);

		/*
		 * To remove duplicate elements from array we simply change it to set
		 *
		 */

	}

}

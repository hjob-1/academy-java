package com.bptn.course._18_linkedList;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<>();
		// insert
		myList.add("test1");
		myList.add("test2");
		myList.addFirst("test0");
		System.out.println(myList);
		// delete
		myList.remove();// remove the head element
		// update
		myList.set(0, "test00");
		System.out.println(myList);

	}

}

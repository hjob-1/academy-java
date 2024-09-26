package com.bptn.course._05_strings;

public class Strings {

	public static void main(String[] args) {
		String userName = "testuser";
		System.out.println(userName.length()); // 8
		System.out.println(userName.charAt(2)); // s
		System.out.println(userName.substring(2, 4)); // st
		System.out.println(userName.equals("tesUser"));// false
		System.out.println(userName.trim()); // will ignore before and after the string, not space between strings
		System.out.println(userName.indexOf("t")); // try to find the first character apperance
	}
}

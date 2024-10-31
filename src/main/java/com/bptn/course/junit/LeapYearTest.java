package com.bptn.course.junit;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class LeapYearTest {
	// Test case to check if a year is a leap year
	@Test
	public void testLeapYear() {
		// create a variable of int type called "year" and assign it with value 2020
		int year = 2020;
		// create a variable of boolean type, call it "expectedResult" and assign it
		// with value true
		boolean expectedResult = true;
		// Call the method isLeapYear() and pass "year" as an argument to it,store the
		// result in a variable of boolean type called "actualResult"
		boolean actualResult = isLeapYear(year);

		// Verify if the actual result is equal to the expected result using
		// assertTrue()
		assertTrue(actualResult == expectedResult);

	}

	// Test case to check if a year is not a leap year
	@Test
	public void testNotLeapYear() {

		// create a variable of int type,call it "year" and assign it with value 1900
		int year = 1900;
		// create a variable of boolean type, call it "expectedResult" and assign it
		// with value false
		boolean expectedResult = false;
		// Call the method isLeapYear() and pass "year" as an argument to it, store the
		// result in a variable of boolean type called "actualResult"
		boolean actualResult = isLeapYear(year);
		// Verify if the actual result is equal to the expected result using
		// assertTrue()
		assertTrue(actualResult == expectedResult);

	}

	// Do not modify this code
	// Method to check if a year is a leap year or not
	private static boolean isLeapYear(int year) {
		// Check if the year is divisible by 400 or divisible by 4 and not divisible by
		// 100
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}

}

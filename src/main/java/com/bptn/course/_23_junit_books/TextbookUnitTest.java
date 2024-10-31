package com.bptn.course._23_junit_books;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TextbookUnitTest {
	@Test
	public void testGetTitle() {
		Textbook tb = new Textbook("Computer Science", 14.99, 9);
		assertEquals("Computer Science", tb.getTitle());
	}

	@Test
	public void testGetEdition() {
		Textbook tb = new Textbook("Computer Science", 14.99, 9);
		assertEquals(9, tb.getEdition());
	}

	@Test
	public void testGetBookInfo() {
		Textbook tb = new Textbook("Computer Science", 14.99, 9);
		assertEquals("Computer Science-14.99-9", tb.getBookInfo());
	}

	@Test
	public void testCanSubstituteFor_canSubstitute() {
		Textbook tb = new Textbook("Computer Science", 14.99, 9);
		Textbook tb2 = new Textbook("Computer Science", 19.99, 2);
		assertEquals(true, tb.canSubstituteFor(tb2));
	}

	@Test
	public void testCanSubstituteFor_cannotSubstitute() {
		Textbook tb = new Textbook("Computer Science", 14.99, 9);
		Textbook tb2 = new Textbook("Basketweaving", 19.99, 2);
		assertEquals(false, tb.canSubstituteFor(tb2));
	}
}

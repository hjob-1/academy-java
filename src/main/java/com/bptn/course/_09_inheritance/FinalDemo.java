package com.bptn.course._09_inheritance;

public class FinalDemo {

	// static final => can be Accesible without creating object
	// most of the time its a best practice to make it not static
	// final method can not be Overridden
	// final class can not be extended
	final int MAX_ATTEMPTS_FOR_LOGIN = 3;// Can not be Modified

	public void displayAttempts() {
		System.out.println("Max Attempts: " + MAX_ATTEMPTS_FOR_LOGIN);
	}
}

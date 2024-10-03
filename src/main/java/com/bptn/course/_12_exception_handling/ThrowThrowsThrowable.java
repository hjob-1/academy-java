package com.bptn.course._12_exception_handling;

public class ThrowThrowsThrowable {
	public static void main(String[] args) {

		// throw
		// throw new IllegalArgumentException
		double accountBalance = -500.00;
		try {
			checkBalance(accountBalance);
		} catch (IllegalArgumentException e) {
			System.out.println("Not enough money to withdraw!");
		}
	}

	public static void checkBalance(double balance) {
		if (balance < 0) {
			throw new IllegalArgumentException("Account balace cannot be negative");
		} else {
			System.out.println("Withdrawal successful!");
		}
	}

}

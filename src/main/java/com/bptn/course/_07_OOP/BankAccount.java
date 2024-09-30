package com.bptn.course._07_OOP;

// No access modifier, makes the class private
class BankAccount {
	// Data Members / Properties
	private String accountNumber;
	private double balance;

	// Constructor
	public BankAccount(String accountNumber, double initialBalance) {
		this.accountNumber = accountNumber; // "This" keyword is a placeholder for an object instance
		this.balance = initialBalance;
	}

	// Method, Class Method, Behavior
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && balance >= amount) {
			balance -= amount;
		}
	}

	// Getters and Setters
	public double getBalance() {
		return balance;
	}

	public void displayAccountInfo() {
		System.out.println("Account Number " + accountNumber);
		System.out.println("Current Balance " + balance);

	}
}

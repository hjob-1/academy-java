package com.bptn.course._07_OOP;

// private
class SavingAccount extends BankAccount {
	private double interestRate;

	public SavingAccount(String accountNumber, double initialBalance, double interestRate) {
		super(accountNumber, initialBalance);// refers parents constructor

		this.interestRate = interestRate;
	}

	public void applyInterest() {
		double interest = getBalance() * interestRate / 100;
		deposit(interest);
	}

}

package com.bptn.course._07_OOP;

public class BankSystem {

	public static void main(String[] args) {

		BankAccount myAccount = new BankAccount("987654", 1200.00);
		myAccount.displayAccountInfo();

		System.out.println("**********");

		SavingAccount savingAccount = new SavingAccount("savings123", 500.00, 1.00);
		savingAccount.applyInterest();
		savingAccount.displayAccountInfo();

		System.out.println("**********");

		ChequingAccount myChequingAccount = new ChequingAccount("chequing123", 500.00, 200.00);
		myChequingAccount.withdraw(100);
		myChequingAccount.displayAccountInfo();
	}

}

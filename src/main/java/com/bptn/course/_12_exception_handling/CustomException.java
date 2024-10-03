package com.bptn.course._12_exception_handling;

class InsufficientException extends Exception {
	public InsufficientException(String message) {
		super(message);
	}

}

public class CustomException {
	private double accountBalance;

	public CustomException(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public void withdraw(double amountToWithdraw) throws InsufficientException {
		if (this.accountBalance >= amountToWithdraw) {
			System.out.println("sucessfull");
		} else {
			throw new InsufficientException("insufficient funds");
		}
	}

	public static void main(String[] args) {

		CustomException myDemo = new CustomException(1000.00);
		try {
			myDemo.withdraw(1500);
		} catch (InsufficientException e) {
			System.out.println(e.getMessage());
		}

	}

}

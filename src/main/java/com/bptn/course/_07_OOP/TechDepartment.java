package com.bptn.course._07_OOP;

// private
class TechDepartment extends Department {
	private double totalPurchaseAmt;

	public TechDepartment(String nameOfTheDepartement, int numOfEmployees, double totalPurchaseAmt) {
		super(nameOfTheDepartement, numOfEmployees);
		this.totalPurchaseAmt = totalPurchaseAmt;
	}

}

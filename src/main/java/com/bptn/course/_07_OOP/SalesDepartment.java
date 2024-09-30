package com.bptn.course._07_OOP;

class SalesDepartment extends Department {
	private double totalSalesAmount;

	public SalesDepartment(String nameOfTheDepartement, int numOfEmployees, double totalSalesAmount) {
		super(nameOfTheDepartement, numOfEmployees);
		this.totalSalesAmount = totalSalesAmount;
	}

}

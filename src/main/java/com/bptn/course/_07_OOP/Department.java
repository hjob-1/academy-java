package com.bptn.course._07_OOP;

// private class 
class Department {
	private String nameOfTheDepartement;
	private int numOfEmployees;

	public Department(String nameOfTheDepartement, int numOfEmployees) {
		this.numOfEmployees = numOfEmployees;
		this.nameOfTheDepartement = nameOfTheDepartement;
	}

	public void departmentInfo() {
		System.out.println("Name of the Department: " + nameOfTheDepartement);
		System.out.println("Number of Employess: " + numOfEmployees);
	}
}

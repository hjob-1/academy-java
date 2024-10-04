package com.bptn.course.big_coding_week2;

public class Employee {
	private int salary;
	private int hoursPerDay;

	public Employee(int salary, int hoursPerDay) {
		setSalary(salary);
		setHoursPerDay(hoursPerDay);
	}

	public void setSalary(int salary) {
		if (salary < 500) {
			this.salary = salary + 10;
		} else {
			this.salary = salary;
		}
	}

	public void setHoursPerDay(int hoursPerDay) {
		if (hoursPerDay > 6) {
			this.salary += 5;
		}

		this.hoursPerDay = hoursPerDay;

	}

	public int getSalary() {
		return this.salary;
	}

}

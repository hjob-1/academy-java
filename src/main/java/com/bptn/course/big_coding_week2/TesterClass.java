package com.bptn.course.big_coding_week2;

public class TesterClass {

	public static void main(String[] args) {
//		Triangle object = new Triangle();
//
//		int a = 7;
//		int b = 10;
//		int c = 35;
//
//		int perimeter = object.perimeterCalculator(a, b, c);
//		int area = object.areaCalculator(7, 10);
//
//		System.out.println("Perimeter of the triangle is: " + perimeter + "\nThe Area of the Triangle is: " + area);

		// print the salary of the employee
//		Employee student = new Employee(100, 8);
//
//		System.out.println(student.getSalary());

//		Stock stock = new Stock("GOOG", "Google, Inc.", 802, 6700);
//		System.out.println(stock);
//		stock.adjustPrice(20);
//		System.out.println(stock);
		Person person1 = new Person("John", "Doe", 1, 1, 1990, "123-45-6789");
		Person person2 = new Person("Jane", "Doe", 2, 2, 1991, "987-65-4321");
		Person person3 = new Person("Jane", "Smith", 1, 1, 1990, "111-11-1111");
		Person person4 = new Person("Jane", "Smith", 2, 2, 1991, "222-22-2222");

		System.out.println("Person 1: " + person1.getFirstName() + " " + person1.getLastName() + " Birthday: "
				+ person1.getBirthday() + " SSN: " + person1.verifySSN("123-45-6789"));
		System.out.println("Person 2: " + person2.getFirstName() + " " + person2.getLastName() + " Birthday: "
				+ person2.getBirthday() + " SSN: " + person2.verifySSN("987-65-4321"));
		System.out.println("Person 3: " + person3.getFirstName() + " " + person3.getLastName() + " Birthday: "
				+ person3.getBirthday() + " SSN: " + person3.verifySSN("111-11-1111"));
		System.out.println("Person 4: " + person4.getFirstName() + " " + person4.getLastName() + " Birthday: "
				+ person4.getBirthday() + " SSN: " + person4.verifySSN("222-22-2222"));

	}

}

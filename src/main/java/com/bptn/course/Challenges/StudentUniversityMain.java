package com.bptn.course.Challenges;

import java.util.Date;

public class StudentUniversityMain {

	public static void main(String[] args) {
		// Start by looking in the University and Student classes. Implement the
		// methods.

		// Create a bunch of student objects
		// (Make sure one student has the following studentId: 123)
		// (Make sure one other student has the following username: testUsername1)

		// Create instance of university called "university" and populate it with the
		// students.
		Student student1 = new Student(120, "testUsername1", "password123", "John", "Doe", "john.doe@example.com",
				"555-1234", "123 Elm St, Springfield", "Male", new Date(2000, 1, 15), new Date(2020, 8, 15), 101,
				"Computer Science");

		Student student2 = new Student(123, "jane_smith", "securePassword", "Jane", "Smith", "jane.smith@example.com",
				"555-5678", "456 Oak St, Springfield", "Female", new Date(1999, 5, 25), new Date(2021, 8, 15), 102,
				"Mathematics");

		Student student3 = new Student(124, "job_t", "jobPass123", "Job", "Taylor", "job.taylor@example.com",
				"555-8765", "789 Pine St, Springfield", "Male", new Date(2001, 3, 10), new Date(2020, 8, 15), 103,
				"Electrical Engineering");

		Student student4 = new Student(457, "william_s", "willPass456", "William", "Smith", "william.smith@example.com",
				"555-4321", "321 Maple St, Springfield", "Male", new Date(1998, 11, 30), new Date(2021, 8, 15), 104,
				"tware Engineering");

		Student student5 = new Student(789, "emily_j", "emilyPass789", "Emily", "Johnson", "emily.johnson@example.com",
				"555-1357", "654 Cedar St, Springfield", "Female", new Date(2002, 7, 20), new Date(2022, 8, 15), 105,
				"Biology");

		University university = new University();
		university.addStudent(student1);
		university.addStudent(student2);
		university.addStudent(student3);
		university.addStudent(student4);
		university.addStudent(student5);

//		System.out.println("\nUniversity ------ \n" + university.students);
//		System.out.println("\nGetting student------\n" + university.getStudent(123));
//		System.out.println("\nDeleting student------\n" + university.deleteStudent(123));
//		System.out.println("\nSeaching student------\n" + university.searchStudent("testUserna"));
		student4.editStudent(university.students, student5);
		System.out.println("\nUniversity ------ \n" + university.students);

	}

}

package com.bptn.course.Challenges;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class University {

	// property - get inspired by the UML diagram

	public ArrayList<Student> students;

	public University() {
		this.students = new ArrayList<>();
	}

	public void addStudent(Student s) {
		// add a student to the "university" arraylist
		students.add(s);

	}

	public Student getStudent(long studentId) {
		// get the first student in the university that has the studentId. (ideally,
		// this would be unique, so you can stop searching after finding the fist match)
		Student foundStudent = null;
		for (Student student : students) {
			if (student.getStudentId() == studentId) {
				foundStudent = student;
				break;
			}
		}
		return foundStudent;

	}

	public List<Student> searchStudent(String userNamePrefix) {
		// return all students that have usernames beginning with the prefix
		List<Student> filteredStudent = new ArrayList<>();
		for (Student student : students) {
			if (student.getUserName().startsWith(userNamePrefix)) {
				filteredStudent.add(student);
			}
		}

		return filteredStudent;

	}

	public boolean deleteStudent(long studentId) {
		// return if a successful deletion happened
		Iterator<Student> iterator = students.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			if (student.getStudentId() == studentId) {
				iterator.remove(); // removes student
				return true;
			}
		}
		return false; // No student was found with the given ID
	}

}

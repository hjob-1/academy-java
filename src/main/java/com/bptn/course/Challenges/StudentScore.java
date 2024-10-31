package com.bptn.course.Challenges;

import java.util.HashMap;
import java.util.Map;

public class StudentScore {
	private String name;
	private HashMap<String, Double> subjects;

	public StudentScore(String name, HashMap<String, Double> subjects) {
		this.name = name;
		this.subjects = subjects;
	}

	public static double calculateAverage(StudentScore student, Map<String, Double> scores) {
		double average, sum = 0;
		for (Double score : scores.values()) {
			sum += score;
		}
		average = sum / scores.size();

		return average;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Double> student1Course = new HashMap<>();

		student1Course.put("Course 1", 70.5);
		student1Course.put("Course 2", 90.5);
		student1Course.put("Course 3", 98.5);
		StudentScore student1 = new StudentScore("student 1", student1Course);

		System.out.printf("The average score is: %.2f", calculateAverage(student1, student1Course));

	}

}

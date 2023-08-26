package com.questions.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Student {

	public static void main(String[] args) {
		List<Student1> studList  = new ArrayList<>();
		studList.stream()
				.collect(Collectors.groupingBy(Student1::getGrade,
						Collectors.maxBy(Comparator.comparing(Student1::getMarks))));
	}
}
class Student1{
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	String grade;
	int marks;
}

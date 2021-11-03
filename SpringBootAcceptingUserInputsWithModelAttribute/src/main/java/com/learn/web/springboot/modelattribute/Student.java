package com.learn.web.springboot.modelattribute;

public class Student {
	private String studentName2;
	private int studentRoll;

	public String getStudentName() {
		return studentName2;
	}

	public void setStudentName(String studentName) {
		System.out.println("name setter method called");
		this.studentName2 = studentName;
	}

	public int getStudentRoll() {
		return studentRoll;
	}

	public void setStudentRoll(int studentRoll) {
		System.out.println("roll setter method called");
		this.studentRoll = studentRoll;
	}

}

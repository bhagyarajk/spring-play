package com.learn.rest.boot.beans;

public class StudentBean {
	private String studentName;
	private String studentRoll;

	public StudentBean(String studentName, String studentRoll) {
		super();
		this.studentName = studentName;
		this.studentRoll = studentRoll;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentRoll() {
		return studentRoll;
	}

	public void setStudentRoll(String studentRoll) {
		this.studentRoll = studentRoll;
	}

	@Override
	public String toString() {
		return "StudentName : " + getStudentName() + " StudentRoll : " + getStudentRoll();
	}

}

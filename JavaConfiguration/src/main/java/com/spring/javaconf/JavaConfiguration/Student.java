package com.spring.javaconf.JavaConfiguration;

public class Student {
	private String name;
	private String id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void display() {
		System.out.println("hello from the destroy method");
	}

}

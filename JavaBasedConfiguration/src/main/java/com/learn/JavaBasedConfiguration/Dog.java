package com.learn.JavaBasedConfiguration;

public class Dog {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void init() {
		System.out.println("this is inside the init method");
	}

	public void destroy() {
		System.out.println("this is inside the destroy method");
	}

}

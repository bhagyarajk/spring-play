package com.learn.plainspring;

public class TestClass {
	int x;
	Demo demo;

	TestClass() {
		System.out.println("Inside the constructor of Test Class");

	}

	public void display() {
		System.out.println("inside the disp method");
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setDemo(Demo demo) {
		this.demo = demo;
	}

}

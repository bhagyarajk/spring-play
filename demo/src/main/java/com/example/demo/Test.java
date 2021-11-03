package com.example.demo;

import org.springframework.stereotype.Component;

// Here you are using the @Component to say the springboot to create an obect for the class
@Component
public class Test {

	int x;
	int y;

	Test() {
		System.out.println("Entered inside the constructor");
	}

	public void display() {
		System.out.println("Inside the display");
	}
}

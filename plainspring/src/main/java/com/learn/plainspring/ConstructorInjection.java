package com.learn.plainspring;

public class ConstructorInjection {
	private int x;
	private Animal animal;

	public ConstructorInjection(int x, Animal animal) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.animal = animal;

	}

	// I dont want the setters to be here, I want to perform constructor injection
}

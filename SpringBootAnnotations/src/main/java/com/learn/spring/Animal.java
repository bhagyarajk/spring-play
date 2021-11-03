package com.learn.spring;

import org.springframework.stereotype.Component;

@Component
public class Animal {

	public void sound() {
		System.out.println("Ohh I have a soudbox with me");
	}

	public void eyes() {
		System.out.println("I have a eyes with me ");
	}
}

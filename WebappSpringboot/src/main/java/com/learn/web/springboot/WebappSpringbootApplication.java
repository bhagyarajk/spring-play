package com.learn.web.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebappSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebappSpringbootApplication.class, args);
		System.out.println("Inside the main method");
	}

}

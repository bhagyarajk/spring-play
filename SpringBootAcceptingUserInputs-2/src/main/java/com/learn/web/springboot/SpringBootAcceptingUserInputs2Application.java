package com.learn.web.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootAcceptingUserInputs2Application extends SpringBootServletInitializer {

//	@Override
//	public SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//		return builder.sources(SpringBootAcceptingUserInputs2Application.class);
//	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAcceptingUserInputs2Application.class, args);
		System.out.println("inside the main method");
	}

}

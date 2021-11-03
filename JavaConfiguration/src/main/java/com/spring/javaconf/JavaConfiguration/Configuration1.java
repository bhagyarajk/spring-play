package com.spring.javaconf.JavaConfiguration;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Configuration1 {

	@Bean(destroyMethod = "display")
	public Student getStudent() {
		Student student = new Student();
		student.setId("10");
		student.setName("Prajwal");
		return student;
	}

}

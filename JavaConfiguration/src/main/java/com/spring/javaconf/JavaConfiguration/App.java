package com.spring.javaconf.JavaConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(Configuration1.class);
		context.refresh();
		Student student = context.getBean(Student.class);
		System.out.println(student.getName());
		System.out.println(student.getId());
		context.destroy();
		context.close();
	}
}

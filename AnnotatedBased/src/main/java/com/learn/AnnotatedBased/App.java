package com.learn.AnnotatedBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Student student = (Student) context.getBean("student");
		Book book = (Book) context.getBean("book");
		System.out.println(student.getBook().getName());
		System.out.println(student.getJavaHome());
		((AbstractApplicationContext) context).close();
	}
}

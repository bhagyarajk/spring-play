package com.learn.AnnotatedBased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	// @Value("#{systemProperties['java.home']}")
	@Value("${java.home}")
	private String javaHome;
	@Autowired
	private Book book;

	private String name;

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println(name);
		this.name = name;
	}

	public String getJavaHome() {
		return javaHome;
	}

}

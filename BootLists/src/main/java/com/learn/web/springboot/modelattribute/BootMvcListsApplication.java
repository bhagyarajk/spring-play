package com.learn.web.springboot.modelattribute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BootMvcListsApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(BootMvcListsApplication.class, args);
		Student student = context.getBean(Student.class);
		System.out.println(student.getNames());
		System.out.println(student.getMapValues());
		((ConfigurableApplicationContext) context).close();
	}

}

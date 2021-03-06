package com.learn.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication

public class SpringBootAnnotationsApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootAnnotationsApplication.class, args);

		Dog dog = (Dog) context.getBean(Dog.class);
		Cat cat = (Cat) context.getBean(Cat.class);

		dog.barks();
		cat.barks();
		((ConfigurableApplicationContext) context).close();

	}

}

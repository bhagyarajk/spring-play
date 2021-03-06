package com.learn.JavaBasedConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(ConfigurationClass.class);
		context.refresh();
		Animal animal = context.getBean(Animal.class);
		Dog dog = context.getBean(Dog.class);

//		ApplicationContext context2 = new ClassPathXmlApplicationContext("spring.xml");
//		Cat cat = context2.getBean(Cat.class);
		// Cat cat = context.getBean(Cat.class);
		System.out.println(animal.getX());
		System.out.println(dog.getName());
//		System.out.println(cat.getName());

		DemoClass demo1 = (DemoClass) context.getBean("bake");
		DemoClass demo2 = (DemoClass) context.getBean("bake");
		System.out.println(demo1 == demo2);

	}
}

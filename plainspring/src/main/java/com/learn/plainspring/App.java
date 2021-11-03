package com.learn.plainspring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));

		// Depedency injection 1st - method
		// TestClass test = beanFactory.getBean(TestClass.class);
		// TestClass test = (TestClass) beanFactory.getBean("test");

		// Dependency injection 2nd - method

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		TestClass test1 = (TestClass) context.getBean("test");
		test1.display();
		TestClass test2 = (TestClass) context.getBean("test");
		System.out.println(test1 == test2);
		System.out.println(test2.x);
		Demo demo = (Demo) context.getBean("demo");
		demo.demoDisplay();
		System.out.println(demo.y);
		// I have initialized the Animal object to be lazy loaded by using lazy-init =
		// "true"

		Animal animal1 = (Animal) context.getBean("animal");
		Animal animal2 = (Animal) context.getBean("animal");
		System.out.println(animal1 == animal2);
		animal1.dog.barks();

	}
}

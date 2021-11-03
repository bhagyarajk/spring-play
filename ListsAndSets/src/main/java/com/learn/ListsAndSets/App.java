package com.learn.ListsAndSets;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		CollectionsDemo collectionDemo = (CollectionsDemo) context.getBean("collectiondemo");
		System.out.println(collectionDemo.getAddressList());
		System.out.println(collectionDemo.getAddressMap());
		System.out.println(collectionDemo.getAddressSet());
		System.out.println(collectionDemo.getAddressProps());
	}
}

package com.learn.InnerBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// generally to achieve the composition we can use the inner bean concept
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		InnerBeans innerBeans = (InnerBeans) context.getBean("inner");
		innerBeans.getAnother().display();
		innerBeans = null;
		// now we don't have any way to access the JustAnother class object

	}
}

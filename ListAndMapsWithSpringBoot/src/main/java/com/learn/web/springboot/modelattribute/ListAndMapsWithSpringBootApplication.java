package com.learn.web.springboot.modelattribute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties(ListAndMapUsingConfigurationProperties.class)
public class ListAndMapsWithSpringBootApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ListAndMapsWithSpringBootApplication.class, args);
		NetworkInfo network = context.getBean(NetworkInfo.class);
		System.out.println(network.getIpWithPort());
		System.out.println(network.getIpWithPort().get("1.1.1.1"));
		System.out.println(network.getName());

	}

}

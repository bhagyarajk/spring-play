package com.learn.JavaBasedConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class AnotherConf {
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public Dog dog() {
		Dog d = new Dog();
		d.setName("Husky!!!");
		return d;
	}

}

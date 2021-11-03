package com.learn.JavaBasedConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

//@ComponentScan(basePackages = "com.learn")

@Configuration
@Import(AnotherConf.class)
public class ConfigurationClass {
	public ConfigurationClass() {
		System.out.println("configuration class object created");
	}

	@Bean

	public Animal Animal() {
		System.out.println("inside the animal");
		return new Animal(200);
	}

	@Bean
	@Lazy
	@Scope(value = "prototype")

	public DemoClass bake() {
		System.out.println("inside the demo method");
		return new DemoClass();
	}

}

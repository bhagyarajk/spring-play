package com.learn.web.springboot.modelattribute;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "classpath:listvalues.properties", ignoreResourceNotFound = true)
//@PropertySource(value = "classpath: mapvalues.yml", ignoreResourceNotFound = true)
@PropertySource(value = "classpath: mapvalues.properties", ignoreResourceNotFound = true)

@ConfigurationProperties(prefix = "values")
public class Student {

	private List<String> listValues;
	// @Value("#{${mapvalues}}")
	private Map<String, Integer> mapValues;

	public Map<String, Integer> getMapValues() {
		return mapValues;
	}

	public void setMapValues(Map mapValues) {
		this.mapValues = mapValues;
	}

	public List getNames() {
		return listValues;
	}

	// @Value("${names}")
	public void setNames(List names) {
		this.listValues = names;
	}

}

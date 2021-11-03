package com.learn.web.springboot.modelattribute;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "classpath:listvalues.properties")
public class NetworkInfo {
	private Map<String, Integer> ipWithPort;
	private List<String> name;

	public List<String> getName() {
		return name;
	}

	@Value("${listvalues}")
	public void setName(List<String> name) {
		this.name = name;
	}

	public Map<String, Integer> getIpWithPort() {
		return ipWithPort;
	}

	@Value("#{${mapvalues}}")
	public void setIpWithPort(Map<String, Integer> ipWithPort) {
		System.out.println("inside the setter method");
		this.ipWithPort = ipWithPort;
	}

}

package com.learn.web.springboot.modelattribute;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "server")
@PropertySource("classpath:serverconf.yml")
public class ListAndMapUsingConfigurationProperties {

	private Map<String, String> application;
	private Map<String, List<String>> config;
	private Map<String, Credential> users;

	// getters and setters
	public Map<String, String> getApplication() {
		return application;
	}

	public void setApplication(Map<String, String> application) {
		System.out.println("setApplication method ");
		this.application = application;
	}

	public Map<String, List<String>> getConfig() {
		return config;
	}

	public void setConfig(Map<String, List<String>> config) {
		this.config = config;
	}

	public Map<String, Credential> getUsers() {
		return users;
	}

	public void setUsers(Map<String, Credential> users) {
		this.users = users;
	}

	public static class Credential {

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		private String username;
		private String password;

	}
}

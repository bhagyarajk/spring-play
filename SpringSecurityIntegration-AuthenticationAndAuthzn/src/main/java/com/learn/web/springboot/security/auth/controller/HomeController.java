package com.learn.web.springboot.security.auth.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@ComponentScan
public class HomeController {

	@GetMapping("/")
	public String getHome() {
		System.out.println("gethome called");
		return "index";
	}

	@GetMapping("/user")
	public String getUserPage() {
		System.out.println("user page called");
		return "index";
	}

	@GetMapping("/admin")
	public String getAdminPage() {
		System.out.println("admin page called");
		return "index";
	}

}

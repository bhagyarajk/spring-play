package com.learn.spring.vanillaspringmvcproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		System.out.println("index page called");
		return "index";
	}

}

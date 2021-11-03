package com.learn.web.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping
	public String index() {
		System.out.println("hello executing");
		return "index";
	}

}

package com.learn.web.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	public HomeController() {
		System.out.println("creating an object of the HomeController");
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getIndexPage() {
		System.out.println("index controller method called");
		return "index";
	}

}

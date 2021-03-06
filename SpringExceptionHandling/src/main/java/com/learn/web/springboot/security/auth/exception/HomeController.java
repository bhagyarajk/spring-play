package com.learn.web.springboot.security.auth.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getHome() {
		System.out.println("home page method called");
		return "index.jsp";
	}

	@RequestMapping(value = "/exception", method = RequestMethod.GET)
	public void throwException() {
		System.out.println("exception page method called");
		throw new SimpleException("Test exception");
	}

}

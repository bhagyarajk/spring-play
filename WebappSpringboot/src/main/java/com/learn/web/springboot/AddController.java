package com.learn.web.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("num1") int number1, @RequestParam("num2") int number2,
			ModelAndView modelAndView) {
		System.out.println("add method called");
		modelAndView.setViewName("sum");
		int sum = number1 + number2;
		modelAndView.addObject("sum", sum);
		return modelAndView;
	}
}

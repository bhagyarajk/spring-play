package com.learn.web.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdditionController {
	public AdditionController() {
		System.out.println("creating an object of Addition controller");
	}

	// 1. How to get the user object -->
	// accessing the user inputs from the HttpRequest object
	// ie. by using HttpServletRequest object --> this is given by the spring DI
	// 2. Now how to send the user object
	// you can use the session to send back the values

	/*
	 * @RequestMapping(value = "/add", method = RequestMethod.GET) public String
	 * getSum(HttpServletRequest request, HttpSession session) {
	 * System.out.println("Inside the addition controller"); int number1 =
	 * Integer.parseInt(request.getParameter("num1")); int number2 =
	 * Integer.parseInt(request.getParameter("num2")); int sum = number1 + number2;
	 * session.setAttribute("sumOfNumbers", sum);
	 * 
	 * return "sum"; }
	 */

	// this time we will use the spring way of handling those requests
	// we will use @RequestParam for accepting the user inputs
	// we will use the ModelAndView object to return the value to the user from the
	// server

	/*
	 * @RequestMapping(value = "/add", method = RequestMethod.GET) public
	 * ModelAndView getSum(@RequestParam("num1") int number1, @RequestParam("num2")
	 * int number2, ModelAndView modelAndView) {
	 * System.out.println("Inside the addition controller"); int sum = number1 +
	 * number2; modelAndView.setViewName("sum"); // we know the thum rule of spring
	 * ie. if you follow the conventions you will // reduce the configurations // so
	 * if you maintain the object name conventions same then you need not to add //
	 * our objects into the model and viewname object // this means --> the name of
	 * our object is sum here so use the sum to retrieve // the data in jsp file
	 * also // unlike here we used it as "sumOfNumbers"
	 * modelAndView.addObject("sumOfNumbers", sum); return modelAndView; }
	 */

	// Just using the model object
	/*
	 * @RequestMapping(value = "/add", method = RequestMethod.GET) public String
	 * getSum(@RequestParam("num1") int number1, @RequestParam("num2") int number2,
	 * Model model) { System.out.println("Inside the addition controller"); int sum
	 * = number1 + number2; model.addAttribute("sumOfNumbers", sum); return "sum";
	 * 
	 * }
	 */
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String getSum(@RequestParam("num1") int number1, @RequestParam("num2") int number2, ModelMap modelMap) {
		System.out.println("Inside the addition controller");
		int sum = number1 + number2;
		modelMap.addAttribute("sumOfNumbers", sum);

		return "sum";

	}

}

package com.learn.web.springboot.modelattribute;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentInfoController {
	@RequestMapping(value = "/studentinfo", method = RequestMethod.POST)
	public String getStudentInfo(@ModelAttribute("Student2") Student student, HttpServletResponse response) {
		System.out.println("student info called");

		return "student";

	}

	@ModelAttribute
	public void modelAttribute() {
		System.out.println("inside the model attribute method");
	}

}

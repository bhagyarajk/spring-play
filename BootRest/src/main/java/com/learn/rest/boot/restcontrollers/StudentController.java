package com.learn.rest.boot.restcontrollers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.learn.rest.boot.beans.StudentBean;

//@Controller
@RestController
public class StudentController {
	@Autowired
	private List<StudentBean> studentList;

	@GetMapping(value = "/students")
	public List<StudentBean> students(@RequestHeader Map<String, String> headers) {
		System.out.println("Headers " + headers);

		return studentList;
	}

	@GetMapping(value = "/students/{studentRoll}", produces = "Application/json")
	// @ResponseBody
	public StudentBean studentList(@PathVariable("studentRoll") String roll) {
		for (StudentBean student : studentList) {
			if (student.getStudentRoll().equals(roll)) {
				return student;
			}

		}
		return null;
	}

	@PostMapping(value = "/students", consumes = "application/json")
	public void studentPost(StudentBean student) {
		studentList.add(student);
		System.out.println(studentList);

	}

}

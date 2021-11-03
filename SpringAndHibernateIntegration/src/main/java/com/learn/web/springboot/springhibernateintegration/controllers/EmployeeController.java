package com.learn.web.springboot.springhibernateintegration.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.learn.web.springboot.springhibernateintegration.entities.Employee;
import com.learn.web.springboot.springhibernateintegration.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	public EmployeeService employeeService;

	@RequestMapping(method = RequestMethod.GET, value = "/all")
	public List<Employee> getEmployees() {
		System.out.println(employeeService.getEmployees());
		return employeeService.getEmployees();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/add")
	public List<Employee> addEmployee(@RequestBody List<Employee> employees) {
		return employeeService.addEmployees(employees);
	}

}

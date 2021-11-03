package com.learn.web.springboot.springhibernateintegration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.web.springboot.springhibernateintegration.entities.Employee;
import com.learn.web.springboot.springhibernateintegration.repos.RepositoryService;

@Service
public class EmployeeService {
	@Autowired
	public RepositoryService repoService;

	public List<Employee> getEmployees() {
		return repoService.findAll();
	}

	public List<Employee> addEmployees(List<Employee> employees) {
		// TODO Auto-generated method stub
		return repoService.saveAll(employees);

	}

}

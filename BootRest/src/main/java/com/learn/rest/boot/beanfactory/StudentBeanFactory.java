package com.learn.rest.boot.beanfactory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learn.rest.boot.beans.StudentBean;

@Configuration
public class StudentBeanFactory {

	@Bean
	@Autowired
	public List<StudentBean> studentList(List<StudentBean> studentList) {
		studentList.add(new StudentBean("Ramesh", "101"));
		studentList.add(new StudentBean("Suresh", "102"));
		studentList.add(new StudentBean("Gireesh", "103"));
		return studentList;
	}
}

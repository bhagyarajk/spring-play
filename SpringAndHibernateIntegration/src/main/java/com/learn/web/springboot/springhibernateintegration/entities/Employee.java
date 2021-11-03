package com.learn.web.springboot.springhibernateintegration.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "employee")
@Getter
@Setter
@ToString
public class Employee {
	@Id

	@Column(name = "emp_id")
	private int id;
	@Column(name = "emp_name")
	private String empName;

}

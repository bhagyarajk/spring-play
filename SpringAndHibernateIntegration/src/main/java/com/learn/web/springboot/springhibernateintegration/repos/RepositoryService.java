package com.learn.web.springboot.springhibernateintegration.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learn.web.springboot.springhibernateintegration.entities.Employee;

@Repository
public interface RepositoryService extends JpaRepository<Employee, Integer> {

}

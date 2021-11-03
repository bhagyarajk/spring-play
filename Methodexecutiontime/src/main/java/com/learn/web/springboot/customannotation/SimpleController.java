package com.learn.web.springboot.customannotation;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SimpleController {

	@GetMapping("/list")
	@ExecutionTime
	public ArrayList list(String name) {
		ArrayList list = new ArrayList();
		list.add("hello");
		list.add("hi");
		list.add(name);

		return list;
	}

}

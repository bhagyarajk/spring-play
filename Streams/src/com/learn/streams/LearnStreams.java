package com.learn.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LearnStreams {
	static int countTimes;

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Bhagyaraj", "Ramesh", "Kulkarni");
		long count = list.stream().filter(name -> name.length() > 8).count();
		System.out.println(count);

		List<String> list2 = list.stream().filter(name -> {
			countTimes++;
			return name.length() > 8;
		}).collect(Collectors.toList());

		System.out.println(list2);

		System.out.println(countTimes);

	}

}

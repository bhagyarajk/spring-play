package com.learn.web.springboot.customannotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeExecute {

	@Around("@annotation(ExecutionTime)")
	public Object calculateTime(ProceedingJoinPoint point) {
		long start = System.currentTimeMillis();
		try {
			String[] s = { "java" };

			Object obj = point.proceed(s);
			long executionTime = System.currentTimeMillis() - start;
			System.out.println(executionTime);
			return obj;

		} catch (Throwable e) {
			e.printStackTrace();
		}
		return null;

	}
}

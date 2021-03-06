package com.learn.rest.boot.loggingaspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspects {
	private static final Logger LOGGER = LoggerFactory.getLogger(LogAspects.class);

//	@Before(value = "execution(* com.learn.rest.boot.restcontrollers.StudentController.students(java.util.Map<java.lang.String, java.lang.String>) )")
//
//	public void logForGetMappingForBefore() {
//
//		System.out.println("aspect method executed");
//		LOGGER.info("getting info executed");
//	}
//
//	@After("execution(* com.learn.rest.boot.restcontrollers.StudentController.students(java.util.Map<java.lang.String, java.lang.String>) )")
//	public void logForGetMappingForAfter() {
//
//		System.out.println("aspect method executed with @After annotation");
//		LOGGER.info("getting info executed with @After annotation");
//	}
	@Around("execution(* com.learn.rest.boot.restcontrollers.StudentController.students(java.util.Map<java.lang.String, java.lang.String>) )")
	public Object logForGetMappingForAfter(ProceedingJoinPoint joinPoint) throws Throwable {

		System.out.println("aspect method executed with @After annotation");
		LOGGER.info("getting info executed with @Around annotation");
		System.out.println(joinPoint.getArgs());

		Object obj = joinPoint.proceed();

		System.out.println("once the join method completed");
		return obj;

	}

//	public void logForGetMapping() {
//
//		System.out.println("aspect method executed");
//		LOGGER.info("getting info executed");
//	}
}

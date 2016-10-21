package com.joyuri.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/*
 * This class is called Aspect
 */
@Aspect
@Component
public class Logger {

	/*
	 * Reusable pointcut
	 */
	@Pointcut("execution(void com.joyuri.spring.aop.Camera.snap())")
	public void cameraSnap() {
	}

	/*
	 * This method is called Advice
	 */
	@Before("cameraSnap()")
	public void PreSnap() {
		System.out.println("Someone is about to take a photo.");
	}
}

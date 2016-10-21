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
	 * Executed with every param type
	 */
	@Pointcut("execution(void com.joyuri.spring.aop.Camera.snap(..))")
	public void cameraSnap() {
	}
	
	/*
	 * Reusable pointcut
	 * Executed with every String param
	 */
	@Pointcut("execution(void com.joyuri.spring.aop.Camera.snap(String))")
	public void cameraSnapString() {
	}


	/*
	 * This method is called Advice
	 */
	@Before("cameraSnap()")
	public void PreSnap() {
		System.out.println("Someone is about to take a photo.");
	}
	
	/*
	 * This method is called Advice
	 */
	@Before("cameraSnapString()")
	public void PreSnapString() {
		System.out.println("Someone is about to take a photo with Name.");
	}
}

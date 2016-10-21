package com.joyuri.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/*
 * This class is called Aspect
 */
@Aspect
@Component
public class Logger {
	
	/*
	 * This method is called Advice
	 */
	@Before("execution(void com.joyuri.spring.aop.Camera.snap())")
	public void PreSnap(){
		System.out.println("Someone is about to take a photo.");
	}
}

package com.joyuri.spring.aop;

import org.springframework.stereotype.Component;

/*
 * This class is called Aspect
 */
@Component
public class Logger {
	/*
	 * This method is called Advice
	 */
	public void PreSnap(){
		System.out.println("Someone is about to take a photo.");
	}
}

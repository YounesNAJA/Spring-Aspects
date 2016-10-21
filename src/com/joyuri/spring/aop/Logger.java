package com.joyuri.spring.aop;


/*
 * This class is called Aspect
 */
public class Logger {
	/*
	 * This method is called Advice
	 */
	public void PreSnap(){
		System.out.println("Someone is about to take a photo.");
	}
}

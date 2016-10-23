package com.joyuri.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
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
	 * Reusable pointcut Executed with every param type
	 */
	@Pointcut("execution(void com.joyuri.spring.aop.Camera.snap(..))")
	public void cameraSnap() {
	}

	/*
	 * Reusable pointcut Executed with every String param
	 */
	@Pointcut("execution(* com.joyuri.spring.aop.Camera.snap(String))")
	public void cameraSnapString() {
	}

	/*
	 * Reusable pointcut Executed with every action
	 */
	@Pointcut("execution(* com.joyuri.spring.aop.*.*(..))")
	public void anyActionPC() {
	}

	/*
	 * This method is called Advice
	 */
	// @Before("cameraSnap()")
	public void PreSnap() {
		System.out.println("Someone is about to take a photo.");
	}

	/*
	 * This method is called Advice
	 */
	// @Before("cameraSnapString()")
	public void PreSnapString() {
		System.out.println("Someone is about to take a photo with Name.");
	}

	/*
	 * This method is called Advice
	 */
	// @Before("anyActionPC()")
	public void anyAction() {
		System.out.println("Any action.");
	}

	/*
	 * This method is called if there is no exception
	 */
	// @AfterReturning("execution(* *.*(..))")
	public void afterReturning() {
		System.out.println("After a method without exception.");
	}

	/*
	 * This method is called if there an exception
	 */
	// @AfterThrowing("execution(* *.*(..))")
	@Around("cameraSnap()")
	public void AfterThrowing(ProceedingJoinPoint pjp) {
		System.out.println("Around before");
		
		try {
			pjp.proceed();
		} catch (Throwable e) {
			System.out.println("Exception: " + e.getMessage());
		}
		
		System.out.println("Around after");
		
	}
}

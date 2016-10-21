package com.joyuri.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Robot {
	public void move(){
		System.out.println("Robot moves.");
	}
}

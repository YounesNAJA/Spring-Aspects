package com.joyuri.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Camera {
	public void snap(){
		System.out.println("SNAP!");
	}
}

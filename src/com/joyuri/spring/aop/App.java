package com.joyuri.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/joyuri/spring/aop/beans.xml");
		Camera cam = (Camera) context.getBean("camera");
		
		context.close();
		cam.snap();
	}

}

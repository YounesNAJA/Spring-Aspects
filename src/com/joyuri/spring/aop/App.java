package com.joyuri.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/joyuri/spring/aop/beans.xml");
		Camera cam = (Camera) context.getBean("camera");
		Robot robot = (Robot) context.getBean("robot");
		
		context.close();
		cam.snap();
		cam.snap(2500);
		cam.snap("Younes");
		try {
			cam.snapNight(15);
		} catch (Exception e) {
			System.out.println("Exception");
		}
		
		
		robot.move();
	}

}

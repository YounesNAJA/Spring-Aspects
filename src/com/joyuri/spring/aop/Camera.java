package com.joyuri.spring.aop;

import org.springframework.stereotype.Component;


@Component
public class Camera implements Snap, Machine {
	
	public void snap(){
		System.out.println("SNAP!");
	}
	
	public void snap(int exposure){
		System.out.println("SNAP! Exposure: " + exposure);
	}
	
	public String snap(String name){
		System.out.println("SNAP! Name: " + name);
		return name;
	}
	
	public void snapNight(int a){
		int b = a / 0;
		System.out.println("SNAP! Night mode.");
	}
}

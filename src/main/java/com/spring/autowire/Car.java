package com.spring.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	
	@Autowired
	@Qualifier("Bs4_engine")
	private Engine engine;
	
	
		
	public void statusEngine() {
		if(engine != null) {
		engine.ImplementEngine();
		System.out.println("Engine type : "+ engine.getEnginetype());
		System.out.println("Warranty : "+ engine.getWarranty());
		} else {
			System.out.println("Engine is not implemented");
		}
	}

}

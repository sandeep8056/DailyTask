package com.spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String args[]) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/autowire/Bean.xml");
		Car car = context.getBean("car",Car.class);
		
		car.statusEngine();
		
				
	}
	
	

}

package com.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context =  new ClassPathXmlApplicationContext("com/spring/di/Bean.xml");
		Airtel air = context.getBean("airtel",Airtel.class);
		air.Service();
		
		
	}
}

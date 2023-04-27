package com.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/annotation/config.xml");
		
		Student st = (Student)context.getBean("student");
		
		st.displayStudentInfo();
		
	}
}

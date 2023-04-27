package com.spring.autoconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context  = new AnnotationConfigApplicationContext(ConfigClass.class);
		College coll = context.getBean("collegeBean",College.class);
		System.out.println("Object   : "+coll );
		
//		Principal p = context.getBean("principal",Principal.class);
//		System.out.println(" principal obj : "+p);
		
		coll.test();
		
		//p.principalInfo();
		
		
	}
 
}

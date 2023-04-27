package com.spring.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args)  {
		
		
		ApplicationContext context =  new ClassPathXmlApplicationContext("com/spring/assignment/config.xml");
		JDBCConnection connection =  context.getBean("conn",JDBCConnection.class);
		
		System.out.println("config done");
		
		connection.displayConnection();
		
		System.out.println();
		
		try {
			connection.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package com.spring.bean;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/bean/config.xml");
		
		
			}

}

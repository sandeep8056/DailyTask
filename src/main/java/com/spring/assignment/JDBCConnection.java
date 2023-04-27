package com.spring.assignment;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Value;

public class JDBCConnection {
	
	@Value("${mysql.driver}")
	private String driver;
	
	@Value("${mysql.url}")
	private String url;
	
	@Value("${mysql.username}")
	private String username;
	
	@Value("${mysql.password}")
	private String password;

	
	
	
	public String getDriver() {
		return driver;
	}

	public String getUrl() {
		return url;
	}
	public String getPassword() {
		return password;
	}

	
	public void displayConnection() {
		System.out.println(
				"Driver : "+driver +
				"  \n url : "+url+
				" \n username : "+username+
				" \n password : "+password +
				" ");
		
	}
	
	public void getConnection()  throws Exception{
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("connection Successful"+ con);
	}
	
	
}

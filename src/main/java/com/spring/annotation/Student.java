package com.spring.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;

public class Student {
	
	@Value("${Student.name}")
	private String name;
	
	@Value("${Student.hobby}")
	private String course;
	
	@Value("${Student.course}")
	private String hobby;
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	
	
	public void setCourse(String course) {
		this.course = course;
	}
	public String getHobby() {
		return hobby;
	}
	
		public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public void displayStudentInfo() {
		System.out.println("Student name : " + name);
		System.out.println("Studnet course "+ course);
		System.out.println("Stduent hobby"+ hobby );
	}

}

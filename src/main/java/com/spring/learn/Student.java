package com.spring.learn;

import java.util.List;

public class Student {

	
	private int id;
	private String studentName;
	private List<String> contactNumber;
	private Exam exam;
	
	
	
	
	
	





	public Student() {
		
	}
	
	
	
	public Student(int id, String studentName, List<String> contactNumber,Exam exam) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.contactNumber = contactNumber;
		this.exam = exam;
	}



	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
	 return this.id;
	}
	
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getStudnetName() {
		return this.studentName;
	}
	
	public List<String> getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(List<String> contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	
	

	public Exam getExam() {
		return exam;
	}



	public void setExam(Exam exam) {
		this.exam = exam;
	}
	
}

package com.spring.learn;

public class Exam {
	
	private String subject;
	private byte duration;
	public Exam(String subject, byte duration) {
		super();
		this.subject = subject;
		this.duration = duration;
	}
	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public byte getDuration() {
		return duration;
	}
	public void setDuration(byte duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Exam [subject=" + subject + ", duration=" + duration + "]";
	}
	
	
	

}

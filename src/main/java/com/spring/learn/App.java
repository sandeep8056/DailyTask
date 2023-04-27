package com.spring.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        System.out.println( "Spring started ..!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        
        Student st1 =context.getBean("sandeep",Student.class);
        Student st2 = context.getBean("manish",Student.class);
        
        System.out.println(" Student id is : "+st1.getId());
        System.out.println("Student name is :  "+ st1.getStudnetName());
        System.out.println("Contact Number are : "+ st1.getContactNumber());
        System.out.println("Exam "+ st1.getExam());
        
        
        System.out.println("Stduent id is : "+ st2.getId());
        System.out.println("Stduent id is : "+ st2.getStudnetName());
        System.out.println("Stduent id is : "+ st2.getContactNumber());
        System.out.println("Exam : "+st2.getExam());
    	}
}

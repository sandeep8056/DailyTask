package com.spring.autoconfig;

import org.springframework.stereotype.Component;

@Component("mathTeacher")
public class MathTeacher implements Teacher {

	
	public void teach() {
		System.out.println("Hey i am maths teacher and I am going to teach you maths");
  }
  
  
}

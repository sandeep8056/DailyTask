package com.spring.autoconfig;

import org.springframework.stereotype.Component;

@Component("scienceTeacher")
public class ScienceTeacher  implements Teacher{

	
	public void teach() {
		System.out.println("I am your science Teacher");		
	}

	
}

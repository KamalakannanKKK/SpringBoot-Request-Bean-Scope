package com.example.Task21.Bean;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class SessionBean {
    
	private String Course="Java";

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}
	
	public SessionBean() {
		System.out.println("Session Bean Created.....");
	}
	
	
}

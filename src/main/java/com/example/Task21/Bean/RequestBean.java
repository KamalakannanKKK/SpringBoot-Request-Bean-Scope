package com.example.Task21.Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.annotation.RequestScope;

@Component
//@Scope(value=WebApplicationContext.SCOPE_REQUEST,proxyMode=ScopedProxyMode.TARGET_CLASS)
@RequestScope
public class RequestBean {

	private String name="Kamal";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RequestBean() {
	 System.out.println("Request Bean.....");
	}
	

	
	
	
}

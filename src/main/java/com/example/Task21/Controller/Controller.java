package com.example.Task21.Controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;

import com.example.Task21.Bean.RequestBean;
import com.example.Task21.Bean.SessionBean;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class Controller {

	@Autowired
	public SessionBean course;

	@Autowired
	public RequestBean user;

	// Request Scope
	@GetMapping("/PrintName")
	public void printName(HttpServletResponse response) throws IOException {
		response.getWriter().write("Name :" + user.getName() + "\n");
		user.setName("Kamalakannan");
		response.getWriter().write("Updated Name :" + user.getName());
	}

	@GetMapping("/PrintName1")
	public void printName1(HttpServletResponse response) throws IOException {
		response.getWriter().write("Name :" + user.getName() + "\n");
	}

	// Session Scope
	@GetMapping("/printcourse")
	public void printcourse(HttpServletResponse response) throws IOException {
		response.getWriter().write("Course :" + course.getCourse() + "\n");
		course.setCourse("Spring Boot");
		response.getWriter().write("Updated Course :" + course.getCourse());
	}

	@GetMapping("/printcourse1")
	public void printcourse1(HttpServletResponse response) throws IOException {
		response.getWriter().write("Course :" + course.getCourse() + "\n");
	}

}

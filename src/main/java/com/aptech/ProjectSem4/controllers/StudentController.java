package com.aptech.ProjectSem4.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("/User/students")
public class StudentController {
	@GetMapping("/ViewStudents")
	public String ViewAdStudents() {
		return "view-students";
	}
}

package com.aptech.ProjectSem4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class ProjectSem4Application {

	public static void main(String[] args) {
		SpringApplication.run(ProjectSem4Application.class, args);
	}

}

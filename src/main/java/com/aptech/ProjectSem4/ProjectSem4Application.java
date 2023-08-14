package com.aptech.ProjectSem4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan(basePackages = "com.aptech.ProjectSem4.entities")
@EnableJpaRepositories(basePackages = "com.aptech.ProjectSem4.repositories")	
@SpringBootApplication
public class ProjectSem4Application {

	public static void main(String[] args) {
		
		SpringApplication.run(ProjectSem4Application.class, args);
			
	}

}

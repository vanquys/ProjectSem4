package com.aptech.ProjectSem4.controllers;

import java.sql.Date;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aptech.ProjectSem4.entities.Admin;
import com.aptech.ProjectSem4.entities.LoginModel;
import com.aptech.ProjectSem4.entities.Students;
import com.aptech.ProjectSem4.entities.Teachers;
import com.aptech.ProjectSem4.reponsitory.AdminRepository;
import com.aptech.ProjectSem4.reponsitory.StudentRepository;
import com.aptech.ProjectSem4.reponsitory.TeacherRepository;


@Controller
@RequestMapping("/account")
public class AccountController {
	@Autowired
	private StudentRepository studentRepository ;
	@Autowired
	private TeacherRepository teacherRepository ;
	@Autowired 
	private AdminRepository adminRepository;
	@GetMapping("/studentRegister")
	public String StudentRegister() {
		return "studentRegister";
	}
	@GetMapping("/teacherRegister")
	public String TeacherRegister() {
		return "teacherRegister";
	}
	
	
	@PostMapping("/studentRegister")
	public String StudentRegister(Students student) {
		long millis=System.currentTimeMillis();  
        java.sql.Date createDate =new java.sql.Date(millis);   
		try {
			student.setCreateDate(createDate);
			student.setPassword(BCrypt.hashpw(student.getPassword(), BCrypt.gensalt()));
			studentRepository.save(student);
			return "index";
			
		}catch (Exception e) {
			return "studentRegister";
		}
	}
	@PostMapping("/teacherRegister")
	public String TeacherRegister(Teachers teacher) {
		long millis=System.currentTimeMillis();  
        java.sql.Date createDate =new java.sql.Date(millis);   
		try {
		    
			teacher.setCreateDate(createDate);
			teacher.setPassword(BCrypt.hashpw(teacher.getPassword(), BCrypt.gensalt()));
			teacherRepository.save(teacher);
			return "index";
			
		}catch (Exception e) {
			// that bai 
			return "index";
		}
		
		
	}
	
	
	
	
	@RequestMapping("login")
	public String LoginView() {
		return "login";
	}
	
	@PostMapping("login")
	public String Login(LoginModel user) {
		String hasPass =  BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		if(user.getRole().toString().equals("Admin") ) {
			
			Admin loged = adminRepository.findByUserName(user.getUserName());
			 if (loged != null && BCrypt.checkpw(user.getPassword(), loged.getPassword())) {
		            return "index";
		        } else {
		            return "login";
		        }
		}else if(user.getRole() == "Teacher") {
			
			  Teachers loged = teacherRepository.findByPhoneOrEmail(user.getUserName(), hasPass);
			  if (loged != null && BCrypt.checkpw(user.getPassword(), loged.getPassword())) {
		            return "index";
		        } else {
		            return "login";
		        }
		}else {
			Students loged = studentRepository.findByPhoneOrEmail(user.getUserName(), hasPass);
			if (loged != null && BCrypt.checkpw(user.getPassword(), loged.getPassword())) {
	            return "index";
	        } else {
	            return "login";
	        }
		}
		
		
	}
}

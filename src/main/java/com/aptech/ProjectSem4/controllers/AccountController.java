package com.aptech.ProjectSem4.controllers;

import java.sql.Date;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
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
			studentRepository.save(student);
			// thanh cong
			return "index";
			
		}catch (Exception e) {
			// that bai 
			return "index";
		}
	}
	@PostMapping("/teacherRegister")
	public String TeacherRegister(Teachers teacher) {
		long millis=System.currentTimeMillis();  
        java.sql.Date createDate =new java.sql.Date(millis);   
		try {
		    
			teacher.setCreateDate(createDate);
			teacherRepository.save(teacher);
			// thanh cong
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
		
		if(user.getRole().toString().equals("admin") ) {
			Admin loged = adminRepository.findByUserNameAndPassword(user.getUserName(), user.getPassword());
			if(loged != null ) {
				return "index";
			}
			else {
				return "login";
			}
		}else if(user.getRole() == "teacher") {
			
			  Teachers logedPhone = teacherRepository.findByPhoneAndPassword(user.getUserName(),user.getPassword());
			  if(logedPhone != null ) { return "index"; } 
			  Teachers logedEmail = teacherRepository.findByEmailAndPassword(user.getUserName(),user.getPassword());
			  if(logedEmail != null ) { return "index"; } 
			  return "login";
		}else {
			Students logedPhone = studentRepository.findByPhoneAndPassword(user.getUserName(), user.getPassword());
			if(logedPhone != null ) { return "index"; }
			Students logedEmail = studentRepository.findByEmailAndPassword(user.getUserName(), user.getPassword());
			if(logedEmail != null ) { return "index"; }
				return "login";
		}
		
		
	}
}

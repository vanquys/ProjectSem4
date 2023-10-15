package com.aptech.ProjectSem4.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aptech.ProjectSem4.entities.Admin;
import com.aptech.ProjectSem4.entities.LoginModel;
import com.aptech.ProjectSem4.entities.Students;
import com.aptech.ProjectSem4.entities.Teachers;
import com.aptech.ProjectSem4.reponsitory.AdminRepository;
import com.aptech.ProjectSem4.reponsitory.CourseRepository;
import com.aptech.ProjectSem4.reponsitory.StudentRepository;
import com.aptech.ProjectSem4.reponsitory.TeacherRepository;

import jakarta.servlet.http.HttpSession;


@Controller
@RequestMapping("/account")
public class AccountController {
	@Autowired
	private StudentRepository studentRepository ;
	@Autowired
	private TeacherRepository teacherRepository ;
	@Autowired 
	private AdminRepository adminRepository;
	@Autowired 
	private CourseRepository courseRepository;
	@GetMapping("/studentRegister")
	public String StudentRegister() {
		return "studentRegister";
	}
	@GetMapping("/teacherRegister")
	public String TeacherRegister() {
		return "teacherRegister";
	}
	
	
	@PostMapping("/studentRegister")
	public String StudentRegister(Students student, Model model) {
		long millis=System.currentTimeMillis();  
        java.sql.Date createDate =new java.sql.Date(millis);  
       Students checkAcc = studentRepository.findByPhoneOrEmail(student.getPhone() , student.getEmail());
        if(checkAcc != null ) {
        	String errorMessage = "Email or phone is exits!";
            model.addAttribute("errorMessage", errorMessage);
        	return "studentRegister";
        }
        
		try {
			
			student.setCreateDate(createDate);
			student.setPassword(BCrypt.hashpw(student.getPassword(), BCrypt.gensalt()));
			studentRepository.save(student);
			String success = "Sign up success!";
            model.addAttribute("success", success);
			return "login";
			
		}catch (Exception e) {
			String errorMessage = e.getMessage();
            model.addAttribute("errorMessage", errorMessage);
			return "studentRegister";
		}
	}
	@PostMapping("/teacherRegister")
	public String TeacherRegister(Teachers teacher, Model model) {
		long millis=System.currentTimeMillis();  
        java.sql.Date createDate =new java.sql.Date(millis); 
        Teachers checkAcc = teacherRepository.findByPhoneOrEmail(teacher.getPhone(), teacher.getEmail());
         if(checkAcc != null  ) {
        	 String errorMessage = "Email or phone is exits!";
             model.addAttribute("errorMessage", errorMessage);
         	return "teacherRegister";
         }
		try {
		    
			teacher.setCreateDate(createDate);
			teacher.setPassword(BCrypt.hashpw(teacher.getPassword(), BCrypt.gensalt()));
			teacherRepository.save(teacher);
			String success = "Sign up success!";
            model.addAttribute("success", success);
			return "login";
			
		}catch (Exception e) {
			 String errorMessage = e.getMessage();
            model.addAttribute("errorMessage", errorMessage);
			return "teacherRegister";
		}
		
		
	}
	
	@RequestMapping("login")
	public String LoginView() {
		return "login";
	}
	
	@PostMapping("login")
	public String Login(LoginModel user , HttpSession session, Model model) {
		
		if(user.getRole().toString().equals("Admin") ) {
			Admin loged = adminRepository.findByUserName(user.getUserName());
			 if (loged != null && BCrypt.checkpw(user.getPassword(), loged.getPassword())) {
				 session.setAttribute("userName", user.getUserName()); 
				 List<Teachers> teachers = (List<Teachers>)teacherRepository.findAll();
					model.addAttribute("Teachers", teachers);
				 model.addAttribute("ListCourses", courseRepository.findAll());
				   return "course";
		        } else {
		        	 String errorMessage = "Tên người dùng hoặc mật khẩu không chính xác.";
		             model.addAttribute("errorMessage", errorMessage);
		            return "login";
		        }
		}else if(user.getRole() == "Teacher") {
			
			  Teachers loged = teacherRepository.findByPhoneOrEmail(user.getUserName(),user.getUserName() );
			  if (loged != null && BCrypt.checkpw(user.getPassword(), loged.getPassword())) {
				  session.setAttribute("userName", user.getUserName());
				  session.setAttribute("name", loged.getFullName()); 
				  session.setAttribute("teacherId", loged.getId()); 
		            return "view-teachers";
		        } else {
		        	String errorMessage = "Tên người dùng hoặc mật khẩu không chính xác.";
		             model.addAttribute("errorMessage", errorMessage);
		            return "login";
		        }
		}else {
			Students loged = studentRepository.findByPhoneOrEmail(user.getUserName(), user.getUserName());
			if (loged != null && BCrypt.checkpw(user.getPassword(), loged.getPassword())) {
				session.setAttribute("userName", user.getUserName());
				session.setAttribute("name", loged.getFullName()); 
				session.setAttribute("studentId", loged.getId()); 
				
				  return "redirect:/User/students/ViewStudents";
	        } else {
	        	String errorMessage = "Tên người dùng hoặc mật khẩu không chính xác.";
	             model.addAttribute("errorMessage", errorMessage);
	            return "login";
	        }
		}
		
		
	}
	@GetMapping("logout")
	public String Logout(HttpSession session) {
		session.invalidate();
		return "login";
	}
}

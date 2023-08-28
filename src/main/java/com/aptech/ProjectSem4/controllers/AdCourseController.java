package com.aptech.ProjectSem4.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aptech.ProjectSem4.entities.Courses;
import com.aptech.ProjectSem4.reponsitory.CourseRepository;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;



@Controller
@RequestMapping("/admin")
public class AdCourseController {
	@Autowired
	private CourseRepository courseRepository;
	
	
	@GetMapping("/ViewAdCourses")
	public String ViewAdCourses(Model model) {
	model.addAttribute("ListCourses" , courseRepository.findAll());
	return "admin/ad_Course";
	}
	
	
	@GetMapping("/editModel")
    public String getCourseById( Model model, int id) {
		Courses courses = courseRepository.findById(id).get();
		model.addAttribute("course", courses);
        return "admin/course_detail";
    }

	
	
	
	// chỉnh sửa khóa học
    @PostMapping("/edit")
    @ResponseBody
    public String processEditForm( Courses updatedCourse) {
    	courseRepository.save( updatedCourse);
        return "Success";
    }
    
    // thêm khóa học
    @PostMapping("/add")
    @ResponseBody
    public String processAddForm( Courses newCourse) {
    	courseRepository.save(newCourse);
        return "Success";
    }
    
    // xóa khóa học
    @PostMapping("/delete/{id}")
    @ResponseBody
    public String deleteCourse( int id) {
        courseRepository.deleteById(id);
        return "Success";
    }
	
	
}	

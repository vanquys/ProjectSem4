package com.aptech.ProjectSem4.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aptech.ProjectSem4.entities.Courses;
import com.aptech.ProjectSem4.reponsitory.CourseRepository;
import com.aptech.ProjectSem4.reponsitory.TeacherRepository;


@Controller

@RequestMapping("/admin/course")
public class AdCourseController {
	@Autowired
	private CourseRepository courseRepository;
	@Autowired
	private TeacherRepository teacherReponsitory;

	@GetMapping("/ViewAdCourses")
	public String ViewAdCourses(Model model) {
		model.addAttribute("ListCourses", courseRepository.findAll());
		model.addAttribute("teachers" , teacherReponsitory.findAll());
		return "course";
	}


	@GetMapping("/editModel")
	@ResponseBody
	public ResponseEntity<Courses> getCourseById(@RequestParam int id) {
		Courses course = courseRepository.findById(id).orElse(null);
		if (course != null) {
			return ResponseEntity.ok(course);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PostMapping("/edit")
	@ResponseBody
	public String processEditForm(Courses updatedCourse) {
		courseRepository.save(updatedCourse);
		return "course";
	}

//	// thêm khóa học
	@GetMapping("/add")
	@ResponseBody
	public String saveAddForm(Courses newCourse) {
		courseRepository.save(newCourse);
		return "course";
	}
	
	
	

	// xóa khóa học
	@PostMapping("/delete/{id}")
	@ResponseBody
	public String deleteCourse(int id) {
		courseRepository.deleteById(id);
		return "Success";
	}

}

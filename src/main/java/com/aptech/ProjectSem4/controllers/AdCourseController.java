package com.aptech.ProjectSem4.controllers;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aptech.ProjectSem4.entities.Courses;
import com.aptech.ProjectSem4.reponsitory.CourseRepository;
import com.aptech.ProjectSem4.service.CoursesService;



@Controller
@RequestMapping("/admin")
public class AdCourseController {
	@Autowired
	private CoursesService _coursesService;
	
	@GetMapping("/ViewAdCourses")
	public String ViewAdCourses(Model model) {
	model.addAttribute("ListCourses" , _coursesService.getAllCourses());
	return "adminCourses";
	}
	
	@GetMapping("/getModelEdit")
	public ResponseEntity<Courses> getModelEdit(int id) {
	Courses course =  _coursesService.getCourseById(id);
	return ResponseEntity.ok(course);
	}
	
	@GetMapping("/{id}")
    @ResponseBody
    public Courses getCourseById(@PathVariable int id) {
        return _coursesService.getCourseById(id);
    }

    @PostMapping("/edit")
    @ResponseBody
    public String processEditForm(@ModelAttribute Courses updatedCourse) {
    	_coursesService.updateCourse(updatedCourse.getId(), updatedCourse);
        return "Success";
    }

    @PostMapping("/add")
    @ResponseBody
    public String processAddForm(@ModelAttribute Courses newCourse) {
    	_coursesService.saveCourse(newCourse);
        return "Success";
    }
    @PostMapping("/save")
    @ResponseBody
    public String saveCourse(@ModelAttribute Courses course) {
        _coursesService.saveCourse(course);
        return "Success";
    }
    @PostMapping("/delete/{id}")
    @ResponseBody
    public String deleteCourse(@PathVariable int id) {
        _coursesService.deleteCourse(id);
        return "Success";
    }
	
	
}	

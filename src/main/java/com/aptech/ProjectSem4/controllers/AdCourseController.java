package com.aptech.ProjectSem4.controllers;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aptech.ProjectSem4.entities.Courses;
import com.aptech.ProjectSem4.reponsitory.CourseRepository;

@Controller
@RequestMapping("/admin/courses")
public class AdCourseController {
	
	
	private CourseRepository _courseRepository;
	
	@Autowired
	public AdCourseController(CourseRepository courseRepository) {
		this._courseRepository = courseRepository;
	}
	
	@GetMapping
	public ResponseEntity<List<Courses>> getAllCourses(){
		List<Courses> courses = (List<Courses>) _courseRepository.findAll();
		return ResponseEntity.ok(courses);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Courses> getCourseById(@PathVariable Integer id){
		Optional<Courses> optionalCourse = (Optional<Courses>) _courseRepository.findById(id);
		return optionalCourse.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	
	}
	
	@PostMapping
	public ResponseEntity<Courses> createCourse(@RequestBody Courses course){
		Courses createdCourse = _courseRepository.save(course);
		List<Courses> updatedCourses = (List<Courses>) _courseRepository.findAll();
		return ResponseEntity.status(HttpStatus.CREATED).body(createdCourse);
		
	}
	
	@PutMapping("/{id}") 
    public ResponseEntity<Courses> updateCourse(@PathVariable Integer id, @RequestBody  Courses updatedCourses) {
        if (!_courseRepository.existsById(id)) {
            return ResponseEntity.notFound().build(); 
        }
        updatedCourses.setId(id); 
        Courses savedCourse = _courseRepository.save(updatedCourses); 
        return ResponseEntity.ok(savedCourse); 
	}
	@DeleteMapping("/{id}") 
    public ResponseEntity<Void> deleteCourse(@PathVariable Integer id) {
        if (!_courseRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        
        _courseRepository.deleteById(id); 
        return ResponseEntity.noContent().build(); 
    }
	 @GetMapping("/search")
	    public ResponseEntity<List<Courses>> searchCourses(@RequestParam(required = false) Integer id, @RequestParam(required = false) String name) {
	        List<Courses> courses;

	        if (id != null) {
	            // Tìm kiếm theo ID
	            Optional<Courses> optionalCourse = (Optional<Courses>) _courseRepository.findById(id);
	            if (optionalCourse.isPresent()) {
	                courses = Collections.singletonList(optionalCourse.get());
	            } else {
	                return ResponseEntity.notFound().build();
	            }
	        } else if (name != null) {
	            // Tìm kiếm theo tên
	            courses = _courseRepository.findByNameContainingIgnoreCase(name);
	        } else {
	            return ResponseEntity.badRequest().build();
	        }

	        return ResponseEntity.ok(courses);
	    }
	
}
	

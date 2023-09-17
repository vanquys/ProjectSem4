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

@Controller

<<<<<<< HEAD
<<<<<<< HEAD
@RequestMapping("/admin/course")
=======
=======
>>>>>>> df8ef064bc45eba9d94f8aadc20833a9220af01b
@RequestMapping("/admin")
>>>>>>> df8ef064bc45eba9d94f8aadc20833a9220af01b
public class AdCourseController {
	@Autowired
	private CourseRepository courseRepository;

	@GetMapping("/ViewAdCourses")
	public String ViewAdCourses(Model model) {
		model.addAttribute("ListCourses", courseRepository.findAll());
<<<<<<< HEAD
<<<<<<< HEAD
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

	@GetMapping("/edit")
	@ResponseBody
	public String processEditForm(Courses updatedCourse) {
		courseRepository.save(updatedCourse);
		return "Success";
	}

//	// thêm khóa học
	@GetMapping("/add")
	@ResponseBody
	public String saveAddForm(Courses newCourse) {
		courseRepository.save(newCourse);
		return "Success";
	}
	
	
	

	// xóa khóa học
=======
		return "ad_Courses";
	}

=======
		return "ad_Courses";
	}

>>>>>>> df8ef064bc45eba9d94f8aadc20833a9220af01b
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

	@GetMapping("/edit")
	@ResponseBody
	public String processEditForm(Courses updatedCourse) {
		courseRepository.save(updatedCourse);
		return "Success";
	}

	@GetMapping("/add")
	@ResponseBody
	public String saveAddForm(Courses newCourse) {
		courseRepository.save(newCourse);
		return "Success";
	}

<<<<<<< HEAD
>>>>>>> df8ef064bc45eba9d94f8aadc20833a9220af01b
=======
>>>>>>> df8ef064bc45eba9d94f8aadc20833a9220af01b
	@PostMapping("/delete/{id}")
	@ResponseBody
	public String deleteCourse(int id) {
		courseRepository.deleteById(id);
		return "Success";
	}

<<<<<<< HEAD
<<<<<<< HEAD
}
=======
}
>>>>>>> df8ef064bc45eba9d94f8aadc20833a9220af01b
=======
}
>>>>>>> df8ef064bc45eba9d94f8aadc20833a9220af01b

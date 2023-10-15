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

import com.aptech.ProjectSem4.entities.Students;
import com.aptech.ProjectSem4.reponsitory.StudentRepository;

@Controller
@RequestMapping("/admin/students")
public class AdStudentController {
	@Autowired
	private StudentRepository studentRepository;

	@GetMapping("/ViewAdStudents")
	public String ViewAdStudents(Model model) {
		model.addAttribute("ListStudents", studentRepository.findAll());
		return "students";
	}

	@GetMapping("/editModel")
	@ResponseBody
	public ResponseEntity<Students> getCourseById(@RequestParam int id) {
		Students student = studentRepository.findById(id).orElse(null);
		if (student != null) {
			return ResponseEntity.ok(student);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@GetMapping("/edit")
	@ResponseBody
	public String processEditForm(Students updatedStudent) {
		studentRepository.save(updatedStudent);
		return "Success";
	}

	@PostMapping("/add")
	@ResponseBody
	public String saveAddForm(Students newCourse) {
		studentRepository.save(newCourse);
		return "Success";
	}

	@PostMapping("/delete/{id}")
	@ResponseBody
	public String deleteStudent(int id) {
		studentRepository.deleteById(id);
		return "Success";
	}

}
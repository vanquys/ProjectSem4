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

import com.aptech.ProjectSem4.entities.Teachers;
import com.aptech.ProjectSem4.reponsitory.TeacherRepository;


@Controller
@RequestMapping("/admin/teachers")
public class AdTeacherController {

	@Autowired
	private TeacherRepository teacherRepository;

	@GetMapping("/ViewAdTeachers")
	public String ViewAdStudents(Model model) {
		model.addAttribute("ListTeachers", teacherRepository.findAll());
		return "teachers";
	}

	@GetMapping("/editModel")
	@ResponseBody
	public ResponseEntity<Teachers> getCourseById(@RequestParam int id) {
		Teachers teacher = teacherRepository.findById(id).orElse(null);
		if (teacher != null) {
			return ResponseEntity.ok(teacher);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@GetMapping("/edit")
	@ResponseBody
	public String processEditForm(Teachers updatedTeacher) {
		teacherRepository.save(updatedTeacher);
		return "Success";
	}

	@GetMapping("/add")
	@ResponseBody
	public String saveAddForm(Teachers newTeacher) {
		teacherRepository.save(newTeacher);
		return "Success";
	}

	@PostMapping("/delete/{id}")
	@ResponseBody
	public String deleteTeacher(int id) {
		teacherRepository.deleteById(id);
		return "Success";
	}

}

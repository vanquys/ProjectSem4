//package com.example.spring.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//
//import com.example.spring.entities.Courses;
//import com.example.spring.entities.Students;
//import com.example.spring.entities.Teachers;
//import com.example.spring.reponsitory.CourseRepository;
//import com.example.spring.reponsitory.StudentRepository;
//import com.example.spring.reponsitory.TeacherRepository;
//
//@Controller
//@RequestMapping("/admin")
//public class AdminController {
//
////	@Autowired
////	private StudentRepository studentRepository;
////
////	@GetMapping("/ViewAdStudents")
////	public String ViewAdStudents(Model model) {
////		model.addAttribute("ListCourses", studentRepository.findAll());
////		return "students";
////	}
//	
//	@RequestMapping("/ViewAdStudents")
//	public class AdStudentController {
//		@Autowired
//		private StudentRepository studentRepository;
//
//		@GetMapping("/View")
//		public String ViewAdStudents(Model model) {
//			model.addAttribute("ListCourses", studentRepository.findAll());
//			return "students";
//		}
//
//		@GetMapping("/editModel")
//		@ResponseBody
//		public ResponseEntity<Students> getCourseById(@RequestParam int id) {
//			Students student = studentRepository.findById(id).orElse(null);
//			if (student != null) {
//				return ResponseEntity.ok(student);
//			} else {
//				return ResponseEntity.notFound().build();
//			}
//		}
//
//		@GetMapping("/edit")
//		@ResponseBody
//		public String processEditForm(Students updatedStudent) {
//			studentRepository.save(updatedStudent);
//			return "Success";
//		}
//
//		@GetMapping("/add")
//		@ResponseBody
//		public String saveAddForm(Students newCourse) {
//			studentRepository.save(newCourse);
//			return "Success";
//		}
//
//		@PostMapping("/delete/{id}")
//		@ResponseBody
//		public String deleteStudent(int id) {
//			studentRepository.deleteById(id);
//			return "Success";
//		}
//
//	}
//
////	@Autowired
////	private TeacherRepository teacherRepository;
////
////	@GetMapping("/ViewAdTeachers")
////	public String ViewAdTeachers(Model model) {
////		model.addAttribute("ListCourses", teacherRepository.findAll());
////		return "teachers";
////	}
//
//	@RequestMapping("/ViewAdTeachers")
//	public class AdTeacherController {
//
//		@Autowired
//		private TeacherRepository teacherRepository;
//
//		@GetMapping("/View")
//		public String ViewAdTeachers(Model model) {
//			model.addAttribute("ListCourses", teacherRepository.findAll());
//			return "teachers";
//		}
//
//		@GetMapping("/editModel")
//		@ResponseBody
//		public ResponseEntity<Teachers> getCourseById(@RequestParam int id) {
//			Teachers teacher = teacherRepository.findById(id).orElse(null);
//			if (teacher != null) {
//				return ResponseEntity.ok(teacher);
//			} else {
//				return ResponseEntity.notFound().build();
//			}
//		}
//
//		@GetMapping("/edit")
//		@ResponseBody
//		public String processEditForm(Teachers updatedTeacher) {
//			teacherRepository.save(updatedTeacher);
//			return "Success";
//		}
//
//		@GetMapping("/add")
//		@ResponseBody
//		public String saveAddForm(Teachers newTeacher) {
//			teacherRepository.save(newTeacher);
//			return "Success";
//		}
//
//		@PostMapping("/delete/{id}")
//		@ResponseBody
//		public String deleteTeacher(int id) {
//			teacherRepository.deleteById(id);
//			return "Success";
//		}
//
//	}
//
////	@Autowired
////	private CourseRepository courseRepository;
////
////	@GetMapping("/ViewAdCourses")
////	public String ViewAdCourses(Model model) {
////		model.addAttribute("ListCourses", courseRepository.findAll());
////		return "course";
////	}
//	
//	@RequestMapping("/ViewAdCourses")
//	public class AdCourseController {
//		@Autowired
//		private CourseRepository courseRepository;
//
//		@GetMapping("/View")
//		public String ViewAdCourses(Model model) {
//			model.addAttribute("ListCourses", courseRepository.findAll());
//			return "course";
//		}
//
//		@GetMapping("/editModel")
//		@ResponseBody
//		public ResponseEntity<Courses> getCourseById(@RequestParam int id) {
//			Courses course = courseRepository.findById(id).orElse(null);
//			if (course != null) {
//				return ResponseEntity.ok(course);
//			} else {
//				return ResponseEntity.notFound().build();
//			}
//		}
//
//		@GetMapping("/edit")
//		@ResponseBody
//		public String processEditForm(Courses updatedCourse) {
//			courseRepository.save(updatedCourse);
//			return "Success";
//		}
//
////		// thêm khóa học
//		@GetMapping("/add")
//		@ResponseBody
//		public String saveAddForm(Courses newCourse) {
//			courseRepository.save(newCourse);
//			return "Success";
//		}
//
//		// xóa khóa học
//		@PostMapping("/delete/{id}")
//		@ResponseBody
//		public String deleteCourse(int id) {
//			courseRepository.deleteById(id);
//			return "Success";
//		}
//	}
//
//	@GetMapping("/showPermission")
//	public String showPermission() {
//		return "permission";
//	}
//
//}
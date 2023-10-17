package com.aptech.ProjectSem4.controllers;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aptech.ProjectSem4.ViewModel.StudentCourseModel;
import com.aptech.ProjectSem4.ViewModel.StudentNotiModel;
import com.aptech.ProjectSem4.ViewModel.StudentTaskModel;
import com.aptech.ProjectSem4.reponsitory.StudentRepository;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller

@RequestMapping("/User/students")
public class StudentController {
	@Autowired
	private StudentRepository studentsRepository;

	@GetMapping("/ViewStudents")
	public String ViewAdStudents(HttpServletRequest request, Model model) {
		HttpSession session = request.getSession();
		int studentId = (int) session.getAttribute("studentId");
		// lấy course
		List<Object[]> lst = studentsRepository.getStudentCourseInfoById(studentId);
		List<StudentCourseModel> listCourse = new ArrayList<>();

		for (Object[] result : lst) {
			StudentCourseModel studentCourseModel = new StudentCourseModel();
			studentCourseModel.setCourseId((Integer) result[0]);
			studentCourseModel.setCourseName((String) result[1]);
			studentCourseModel.setTeacherName((String) result[2]);
			listCourse.add(studentCourseModel);
		}
		model.addAttribute("listCourse", listCourse);
		// lấy thông báo
		List<Object[]> lstnoti = studentsRepository.getStudentNotiById(studentId);
		List<StudentNotiModel> listNoti = new ArrayList<>();

		for (Object[] result : lstnoti) {
			StudentNotiModel studentNotiModel = new StudentNotiModel();

			System.out.println(result[0]);
			studentNotiModel.setCourseId((int) result[0]);
			studentNotiModel.setCourseName((String) result[1]);
			studentNotiModel.setTeacherName((String) result[2]);
			Date createDate = (Date) result[3];
			studentNotiModel.setCreateDate(createDate);
			studentNotiModel.setTitle((String) result[4]);
			studentNotiModel.setContent((String) result[5]);

			listNoti.add(studentNotiModel);
		}

		model.addAttribute("listNoti", listNoti);

		
		// lấy task 
		
		 List<Object[]> tasksData = studentsRepository.getTasksForStudent(studentId);
	        List<StudentTaskModel> studentTasks = new ArrayList<>();

	        for (Object[] taskData : tasksData) {
	            StudentTaskModel studentTaskModel = new StudentTaskModel();
	            studentTaskModel.setCreatedBy((String) taskData[0]);
	            studentTaskModel.setTitle((String) taskData[1]);
	            studentTaskModel.setDescription((String) taskData[2]);
	            studentTaskModel.setCreateDate((Date) taskData[3]);
	            studentTaskModel.setDueDate((Date) taskData[4]);
	            studentTasks.add(studentTaskModel);
	        }

	        model.addAttribute("studentTasks", studentTasks);
		return "view-students";
	}

	@GetMapping("/ViewTeachers")
	public String ViewAdTeacher() {
		return "view-teachers";
	}
}

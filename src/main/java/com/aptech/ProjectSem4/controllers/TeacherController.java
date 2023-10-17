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
import com.aptech.ProjectSem4.ViewModel.TeacherCourseModel;
import com.aptech.ProjectSem4.ViewModel.TeacherNotiModel;
import com.aptech.ProjectSem4.ViewModel.TeacherTaskModel;
import com.aptech.ProjectSem4.reponsitory.TeacherRepository;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller

@RequestMapping("/User/teachers")
public class TeacherController {
	@Autowired
	TeacherRepository teacherRepository ;
	@GetMapping("/ViewTeachers")
	public String ViewAdStudents(HttpServletRequest request, Model model) {
		
		  HttpSession session = request.getSession(); int teacherId = (int)
		  session.getAttribute("teacherId"); 
		  List<Object[]> lts = teacherRepository.getCourseForTeacher(teacherId);
		  List<TeacherCourseModel> listCourse = new ArrayList<>();
			for (Object[] result : lts) {
				TeacherCourseModel teacherCourseModel = new TeacherCourseModel();
				teacherCourseModel.setId((Integer) result[0]);
				teacherCourseModel.setName((String) result[1]);
				teacherCourseModel.setDescription((String) result[2]);
				teacherCourseModel.setLinkOnline((String) result[3]);
				listCourse.add(teacherCourseModel);
			}
			model.addAttribute("listCourse", listCourse);
			
			List<Object[]> ltsTask = teacherRepository.getTaskForTeacher(teacherId);
			  List<TeacherTaskModel> listTask = new ArrayList<>();
				for (Object[] result : ltsTask) {
					TeacherTaskModel teacherTaskModel = new TeacherTaskModel();
					teacherTaskModel.setId((Integer) result[0]);
					teacherTaskModel.setCourseName((String) result[1]);
					teacherTaskModel.setTitle((String) result[2]);
					teacherTaskModel.setDescription((String) result[3]);
					Date createDate = (Date) result[4];
					Date dueDate = (Date) result[5];
					teacherTaskModel.setCreateDate(createDate);
					teacherTaskModel.setDueDate(dueDate) ;
					listTask.add(teacherTaskModel);
				}
				model.addAttribute("listTask", listTask);
				
				List<Object[]> ltsNoti = teacherRepository.getTaskForTeacher(teacherId);
				  List<TeacherNotiModel> listNoti = new ArrayList<>();
					for (Object[] result : ltsNoti) {
						TeacherNotiModel teacherNotiModel = new TeacherNotiModel();
						teacherNotiModel.setId((Integer) result[0]);
						teacherNotiModel.setCourseName((String) result[1]);
						teacherNotiModel.setTitle((String) result[2]);
						teacherNotiModel.setContent((String) result[3]);
						listNoti.add(teacherNotiModel);
					}
					model.addAttribute("listNoti", listNoti);
		 
		return "view-teachers";
		
		
	}
}

package com.aptech.ProjectSem4.service;

import java.util.List;
import java.util.Optional;

import com.aptech.ProjectSem4.entities.Courses;

public interface CourseService {
	List<Courses> getAllCourses();
	void saveCourses(Courses course);
	void deleteCourses(Integer id);
	Optional<Courses> findCourseByid(Integer id );
}

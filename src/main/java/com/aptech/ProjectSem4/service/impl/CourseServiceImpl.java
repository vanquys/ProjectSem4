package com.aptech.ProjectSem4.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aptech.ProjectSem4.entities.Courses;
import com.aptech.ProjectSem4.reponsitory.CourseRepository;
import com.aptech.ProjectSem4.service.CourseService;


@Service
public class CourseServiceImpl implements CourseService{
	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public List<Courses> getAllCourses() {

		return (List<Courses>) courseRepository.findAll();
	}

	@Override
	public void saveCourses(Courses course) {
		courseRepository.save(course);
		
	}

	@Override
	public void deleteCourses(Integer id) {
		courseRepository.deleteById(id);		
	}

	@Override
	public Optional<Courses> findCourseByid(Integer id) {
		return courseRepository.findById(id);
	}
	
}

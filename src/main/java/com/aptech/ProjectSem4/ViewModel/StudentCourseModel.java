package com.aptech.ProjectSem4.ViewModel;

public class StudentCourseModel {
	
	 int CourseId ;
	 String CourseName;
	 String TeacherName;
	
	 public StudentCourseModel(int courseId, String courseName, String teacherName) {
			super();
			CourseId = courseId;
			CourseName = courseName;
			TeacherName = teacherName;
		}
	public StudentCourseModel() {}
	 public int getCourseId() {
		return CourseId;
	}
	public void setCourseId(int courseId) {
		CourseId = courseId;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public String getTeacherName() {
		return TeacherName;
	}
	public void setTeacherName(String teacherName) {
		TeacherName = teacherName;
	}
	
}

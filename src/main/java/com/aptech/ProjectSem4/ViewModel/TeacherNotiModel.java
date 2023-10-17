package com.aptech.ProjectSem4.ViewModel;

public class TeacherNotiModel {
	int Id;
	String CourseName;
	String Title;
	String Content;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public TeacherNotiModel(int id, String courseName, String title, String content) {
		super();
		Id = id;
		CourseName = courseName;
		Title = title;
		Content = content;
	}
	public TeacherNotiModel() {
		super();
	}
	
	
	
}

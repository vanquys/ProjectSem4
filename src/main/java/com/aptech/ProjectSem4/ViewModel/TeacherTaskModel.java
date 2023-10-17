package com.aptech.ProjectSem4.ViewModel;

import java.sql.Date;

public class TeacherTaskModel {
	int id;
	String CourseName;
	String Title;
	String Description;
	Date CreateDate;
	Date DueDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Date getCreateDate() {
		return CreateDate;
	}
	public void setCreateDate(Date createDate) {
		CreateDate = createDate;
	}
	public Date getDueDate() {
		return DueDate;
	}
	public void setDueDate(Date dueDate) {
		DueDate = dueDate;
	}
	public TeacherTaskModel(int id, String courseName, String title, String description, Date createDate,
			Date dueDate) {
		super();
		this.id = id;
		CourseName = courseName;
		Title = title;
		Description = description;
		CreateDate = createDate;
		DueDate = dueDate;
	}
	public TeacherTaskModel() {
		super();
	}
	
}

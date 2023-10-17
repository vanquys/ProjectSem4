package com.aptech.ProjectSem4.ViewModel;

public class TeacherCourseModel {
	int id;
	String Name;
	String Description;
	String LinkOnline;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getLinkOnline() {
		return LinkOnline;
	}
	public void setLinkOnline(String linkOnline) {
		LinkOnline = linkOnline;
	}
	public TeacherCourseModel(int id, String name, String description, String linkOnline) {
		super();
		this.id = id;
		Name = name;
		Description = description;
		LinkOnline = linkOnline;
	}
	public TeacherCourseModel() {
		super();
	}
	
}

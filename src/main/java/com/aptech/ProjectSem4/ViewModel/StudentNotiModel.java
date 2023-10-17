package com.aptech.ProjectSem4.ViewModel;

import java.sql.Date;

public class StudentNotiModel {
	 private int courseId;
	    private String courseName;
	    private String teacherName;
	    private Date createDate;
	    private String title;
	    private String content;
		public int getCourseId() {
			return courseId;
		}
		public StudentNotiModel() {
			
		}
		public StudentNotiModel(int courseId, String courseName, String teacherName, Date createDate,
				String title, String content) {
			super();
			this.courseId = courseId;
			this.courseName = courseName;
			this.teacherName = teacherName;
			this.createDate = createDate;
			this.title = title;
			this.content = content;
		}
		public void setCourseId(int courseId) {
			this.courseId = courseId;
		}
		public String getCourseName() {
			return courseName;
		}
		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}
		public String getTeacherName() {
			return teacherName;
		}
		public void setTeacherName(String teacherName) {
			this.teacherName = teacherName;
		}
		
		public Date getCreateDate() {
			return createDate;
		}
		public void setCreateDate(Date createDate) {
			this.createDate = createDate;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
}

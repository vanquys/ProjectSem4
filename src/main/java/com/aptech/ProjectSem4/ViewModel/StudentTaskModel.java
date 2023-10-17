package com.aptech.ProjectSem4.ViewModel;

import java.sql.Date;

public class StudentTaskModel {
	 private String createdBy;
	    private String title;
	    private String description;
	    private Date createDate;
	    private Date dueDate;
		public StudentTaskModel() {
			super();
		}
		public StudentTaskModel(String createdBy, String title, String description, Date createDate, Date dueDate) {
			super();
			this.createdBy = createdBy;
			this.title = title;
			this.description = description;
			this.createDate = createDate;
			this.dueDate = dueDate;
		}
		public String getCreatedBy() {
			return createdBy;
		}
		public void setCreatedBy(String createdBy) {
			this.createdBy = createdBy;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public Date getCreateDate() {
			return createDate;
		}
		public void setCreateDate(Date createDate) {
			this.createDate = createDate;
		}
		public Date getDueDate() {
			return dueDate;
		}
		public void setDueDate(Date dueDate) {
			this.dueDate = dueDate;
		}
	    
}

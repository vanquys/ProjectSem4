package com.aptech.ProjectSem4.entities;
import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "CourseNoti")
public class CourseNoti {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_noti")
    private Notifications notification;

    @ManyToOne
    @JoinColumn(name = "id_course")
    private Courses course;

    @Column(name = "create_date")
    private Date createDate;

   public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Notifications getNotification() {
		return notification;
	}

	public void setNotification(Notifications notification) {
		this.notification = notification;
	}

	public Courses getCourse() {
		return course;
	}

	public void setCourse(Courses course) {
		this.course = course;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

public CourseNoti(int id, Notifications notification, Courses course, Date createDate) {
		super();
		this.id = id;
		this.notification = notification;
		this.course = course;
		this.createDate = createDate;
	}

public CourseNoti() {
	// TODO Auto-generated constructor stub
}
}

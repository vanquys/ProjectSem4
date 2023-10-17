package com.aptech.ProjectSem4.entities;


import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "Enrollees")
public class Enrollees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_student")
    private Students student;

    @ManyToOne
    @JoinColumn(name = "id_course")
    private Courses course;

    @Column(name = "create_date")
    private Date createDate;

	public Enrollees(int id, Students student, Courses course, Date createDate) {
		super();
		this.id = id;
		this.student = student;
		this.course = course;
		this.createDate = createDate;
	}

	public Enrollees() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Students getStudent() {
		return student;
	}

	public void setStudent(Students student) {
		this.student = student;
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
    
}

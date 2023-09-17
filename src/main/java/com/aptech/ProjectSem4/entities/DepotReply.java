package com.aptech.ProjectSem4.entities;
import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "DepotReply")
public class DepotReply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "IdStudent")
    private Students student;

    @ManyToOne
    @JoinColumn(name = "IdTask")
    private Tasks task;

    @Column(name = "FileSubmit")
    private String fileSubmit;

    @Column(name = "CreateDate")
    private Date createDate;

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

	public Tasks getTask() {
		return task;
	}

	public void setTask(Tasks task) {
		this.task = task;
	}

	public String getFileSubmit() {
		return fileSubmit;
	}

	public void setFileSubmit(String fileSubmit) {
		this.fileSubmit = fileSubmit;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public DepotReply(int id, Students student, Tasks task, String fileSubmit, Date createDate) {
		super();
		this.id = id;
		this.student = student;
		this.task = task;
		this.fileSubmit = fileSubmit;
		this.createDate = createDate;
	}

	public DepotReply() {
		super();
	}
    
    
}

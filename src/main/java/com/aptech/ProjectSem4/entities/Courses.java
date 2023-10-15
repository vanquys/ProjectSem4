package com.aptech.ProjectSem4.entities;
import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "Courses")
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String description;
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teachers teacher;

    @Column(name = "link_online")
    private String linkOnline;

    @Column(name = "create_date")
    private Date createDate;

	public Courses(int id, String name, String description, BigDecimal price, Teachers teacher, String linkOnline,
			Date createDate) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.teacher = teacher;
		this.linkOnline = linkOnline;
		this.createDate = createDate;
	}

	public Courses() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Teachers getTeacher() {
		return teacher;
	}

	public void setTeacher(Teachers teacher) {
		this.teacher = teacher;
	}

	public String getLinkOnline() {
		return linkOnline;
	}

	public void setLinkOnline(String linkOnline) {
		this.linkOnline = linkOnline;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

   
}

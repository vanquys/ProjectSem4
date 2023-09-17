package com.aptech.ProjectSem4.entities;
import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "Students")
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String fassword;

    @Column(name = "fullName")
    private String fullName;

    private String email;
    private long phone;

    @Column(name = "create_date")
    private Date createDate;

    private boolean Enable;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFassword() {
		return fassword;
	}

	public void setFassword(String fassword) {
		this.fassword = fassword;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public boolean isEnable() {
		return Enable;
	}

	public void setEnable(boolean enable) {
		Enable = enable;
	}

	public Students(int id, String fassword, String fullName, String email, long phone, Date createDate,
			boolean enable) {
		super();
		this.id = id;
		this.fassword = fassword;
		this.fullName = fullName;
		this.email = email;
		this.phone = phone;
		this.createDate = createDate;
		Enable = enable;
	}

	public Students() {
		super();
	}
    
}

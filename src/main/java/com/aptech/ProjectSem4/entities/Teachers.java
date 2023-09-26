<<<<<<< HEAD

package com.aptech.ProjectSem4.entities;
import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "Teachers")
public class Teachers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String password;

    @Column(name = "full_name")
    private String fullName;

    private String email;
    private String phone;

    @Column(name = "create_date")
    private Date createDate;

    private boolean Enable;

	public Teachers(int id, String password, String fullName, String email, String phone, Date createDate,
			boolean enable) {
		super();
		this.id = id;
		this.password = password;
		this.fullName = fullName;
		this.email = email;
		this.phone = phone;
		this.createDate = createDate;
		Enable = enable;
	}

	public Teachers() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
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

    
}
=======

package com.aptech.ProjectSem4.entities;
import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "Teachers")
public class Teachers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String password;

    @Column(name = "full_name")
    private String fullName;

    private String email;
    private String phone;

    @Column(name = "create_date")
    private Date createDate;

    private boolean Enable;

	public Teachers(int id, String password, String fullName, String email, String phone, Date createDate,
			boolean enable) {
		super();
		this.id = id;
		this.password = password;
		this.fullName = fullName;
		this.email = email;
		this.phone = phone;
		this.createDate = createDate;
		Enable = enable;
	}

	public Teachers() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
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

    
}
>>>>>>> 89ab4794566ec23c00ca819e1623b55a68bbd4e2

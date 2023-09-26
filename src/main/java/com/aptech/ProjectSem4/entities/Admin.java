<<<<<<< HEAD
package com.aptech.ProjectSem4.entities;
import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "Admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_name")
    private String userName;

    private String password;

    @Column(name = "create_date")
    private Date createDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Admin(int id, String userName, String password, Date createDate) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.createDate = createDate;
	}

	public Admin() {
		super();
	}

    
}
=======
package com.aptech.ProjectSem4.entities;
import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "Admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_name")
    private String userName;

    private String password;

    @Column(name = "create_date")
    private Date createDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Admin(int id, String userName, String password, Date createDate) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.createDate = createDate;
	}

	public Admin() {
		super();
	}

    
}
>>>>>>> 89ab4794566ec23c00ca819e1623b55a68bbd4e2


package com.aptech.ProjectSem4.reponsitory;

import org.springframework.data.repository.CrudRepository;

import com.aptech.ProjectSem4.entities.Admin;


public interface AdminRepository extends CrudRepository<Admin, Integer> {
	Admin findByUserNameAndPassword(String UserName, String Password);
}

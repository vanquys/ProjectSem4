
package com.aptech.ProjectSem4.reponsitory;


import org.springframework.data.repository.CrudRepository;

import com.aptech.ProjectSem4.entities.Students;

public interface StudentRepository extends CrudRepository<Students, Integer> {
	Students findByPhoneAndPassword(String Phone, String Password);
	Students findByEmailAndPassword(String Email, String Password);
	
}

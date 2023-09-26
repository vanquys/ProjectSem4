
package com.aptech.ProjectSem4.reponsitory;

import org.springframework.data.repository.CrudRepository;

import com.aptech.ProjectSem4.entities.Teachers;

public interface TeacherRepository extends CrudRepository<Teachers, Integer> {

	Teachers findByPhoneAndPassword(String Phone, String Password);
	Teachers findByEmailAndPassword(String Email, String Password);	
}

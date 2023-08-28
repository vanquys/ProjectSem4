
package com.aptech.ProjectSem4.reponsitory;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.aptech.ProjectSem4.entities.Courses;
import com.aptech.ProjectSem4.entities.Students;

public interface StudentRepository extends CrudRepository<Students, Integer> {

}

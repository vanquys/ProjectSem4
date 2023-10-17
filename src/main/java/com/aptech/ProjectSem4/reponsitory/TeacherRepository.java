
package com.aptech.ProjectSem4.reponsitory;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.aptech.ProjectSem4.entities.Teachers;

public interface TeacherRepository extends CrudRepository<Teachers, Integer> {

	Teachers findByPhoneOrEmail(String Phone, String Email);

	 @Query("SELECT ta.id , c.name , ta.title, ta.description, ta.createDate , ta.dueDate "
	  + "FROM Tasks ta " + "JOIN Courses c ON ta.course.id = c.id " +
	  "JOIN Enrollees e ON e.course.id = c.id " +
	  "JOIN Teachers t ON c.teacher.id = t.id " + "WHERE t.id = :teacherId")
	  List<Object[]> getTaskForTeacher(@Param("teacherId") int teacherId);
	  
	  @Query("SELECT c.id  , c.name , c.description , c.linkOnline " +
	  "FROM Courses c " + 
	  "JOIN Teachers t ON c.teacher.id = t.id " +
	  "WHERE t.id = :teacherId")
	  List<Object[]> getCourseForTeacher(@Param("teacherId") int teacherId);
	  
	  @Query("SELECT cn.id, c.name, n.title, n.content FROM CourseNoti cn " +
	           "JOIN cn.notification n " +
	           "JOIN cn.course c " +
	           "JOIN c.teacher t " +
	           "WHERE t.id = :teacherId")
	  List<Object[]> getNotiForTeacher(@Param("teacherId") int teacherId);
	 
}

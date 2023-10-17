
package com.aptech.ProjectSem4.reponsitory;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.aptech.ProjectSem4.entities.Students;

public interface StudentRepository extends CrudRepository<Students, Integer> {
	Students findByPhoneOrEmail(String Phone, String Email);


	@Query("SELECT c.id as CourseId, c.name as CourseName, t.fullName as TeacherName  FROM Enrollees e JOIN Students s ON e.student.id = s.id JOIN Courses c ON c.id = e.course.id JOIN Teachers t ON t.id = c.teacher.id  WHERE s.id = :studentId")
	List<Object[]> getStudentCourseInfoById(@Param("studentId") Integer studentId);

	@Query("SELECT c.id as CourseId,\r\n"
			+ "       c.name as CourseName,\r\n"
			+ "       t.fullName as TeacherName,\r\n"
			+ "       cn.createDate as CreateDate,\r\n"
			+ "       n.title as Title,\r\n"
			+ "       n.content as Content\r\n"
			+ "FROM Enrollees e\r\n"
			+ "JOIN Students s ON e.student.id = s.id\r\n"
			+ "JOIN Courses c ON c.id = e.course.id\r\n"
			+ "JOIN Teachers t ON t.id = c.teacher.id\r\n"
			+ "JOIN CourseNoti cn ON cn.course.id = c.id\r\n"
			+ "JOIN Notifications n ON n.id = cn.notification.id\r\n"
			+ "WHERE s.id = :studentId")
	List<Object[]> getStudentNotiById(@Param("studentId") Integer studentId);
	 
	
	@Query("SELECT t.fullName AS createdBy, ta.title, ta.description, ta.createDate AS createDate, ta.dueDate " +
	            "FROM Tasks ta " +
	            "JOIN Courses c ON ta.course.id = c.id " +
	            "JOIN Enrollees e ON e.course.id = c.id " +
	            "JOIN Students s ON s.id = e.student.id " +
	            "JOIN Teachers t ON c.teacher.id = t.id " +
	            "WHERE s.id = :studentId")
	    List<Object[]> getTasksForStudent(@Param("studentId") int studentId);
	
}

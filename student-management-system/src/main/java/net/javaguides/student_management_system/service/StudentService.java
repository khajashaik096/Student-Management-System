package net.javaguides.student_management_system.service;

import java.util.List;

import net.javaguides.student_management_system.entity.Student;

public interface StudentService {
	List<Student> getAllStudent();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteById(Long id);
}

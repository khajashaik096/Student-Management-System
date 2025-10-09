package net.javaguides.student_management_system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.student_management_system.entity.Student;
import net.javaguides.student_management_system.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		
//		Student s1=new Student("Ramesh","fadatare","ramesh@gmail.com");
//		studentRepository.save(s1);
//		
//		Student s2=new Student("sanjay","jadhav","sanjay.saaho@gmail.com");
//		studentRepository.save(s2);
//		
//		Student s3=new Student("tony","stark","tonystark@gmail.com");
//		studentRepository.save(s3);
		
	}

}

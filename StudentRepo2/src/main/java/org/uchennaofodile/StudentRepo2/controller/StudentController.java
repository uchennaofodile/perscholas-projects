package org.uchennaofodile.StudentRepo2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.uchennaofodile.StudentRepo2.model.Student;
import org.uchennaofodile.StudentRepo2.repository.StudentRepository;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@RestController
@FieldDefaults(level=AccessLevel.PRIVATE)
public class StudentController {


	final StudentRepository studentRepository;
	
	@Autowired
	public StudentController(StudentRepository studentRepository) {
		this.studentRepository =  studentRepository;
	}
	
	@GetMapping("/students")
	public List <Student> getAllStudents(){
		List<Student> students = studentRepository.findAll();
		return students;
		
	}
	
	@GetMapping("/students/{accountNo}")
	Student findStudent(@PathVariable Long accountNo) {
		return studentRepository.findByAccountNo(accountNo);
	}
	
	
}

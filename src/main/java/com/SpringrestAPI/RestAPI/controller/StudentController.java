package com.SpringrestAPI.RestAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringrestAPI.RestAPI.Services.StudentService;
import com.SpringrestAPI.RestAPI.entitys.Student;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentservice;
	
	@GetMapping("/student")
	public List<Student> getStudent()
	{
		return this.studentservice.getStudents();	
}
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student) {
		return this.studentservice.addStudent(student);
	}
	
	@PutMapping("/student")
	public Student updateStudent(@RequestBody Student student) {
		return this.studentservice.updateStudent(student);
	}
	
//	@DeleteMapping("/course/{courseId}")
//	public ResponseEntity<HttpStatus> deleteStudent(@PathVariable String studentId){
//	try {
//		this.studentservice.deleteStudent(Long.parseLong(studentId)));
//		return new ResponseEntity<>(HttpStatus.OK);
//	}catch (Exception e) {
//		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//	}
//	}
	
}
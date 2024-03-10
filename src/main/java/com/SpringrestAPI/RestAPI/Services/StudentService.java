package com.SpringrestAPI.RestAPI.Services;

import java.util.List;

import com.SpringrestAPI.RestAPI.entitys.Student;

public interface StudentService {
	
	public List<Student> getStudents();

	public Student addStudent(Student student);
	
	//public void deleteStudent(long parseLog);
	
	public Student updateStudent (Student student);
}

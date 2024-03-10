package com.SpringrestAPI.RestAPI.Services;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.SpringrestAPI.RestAPI.entitys.Student;

@Service
public class StudentServiceimpl implements StudentService {

	List<Student> list;
	
	 public StudentServiceimpl() {
		 list=new ArrayList<>();
		 list.add(new Student(1,"Rohit","Khandagale",23));
		 list.add(new Student(2,"Hrishi","Surwase",24));
		 list.add(new Student(3,"Lokesh","Vichave",23));
		 list.add(new Student(4,"Suyash","Kala",23));

	}
	 public List<Student> getStudents(){
		return list; 
	 }
	 
	 public Student addStudent(Student student) {
		 list.add(student);
		 return student;
	 }

	 
	 public Student updateStudent(Student student) {
		 list.add(student);
		 return student;
	 }
}

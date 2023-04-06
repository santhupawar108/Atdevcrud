package com.sun.service;


import java.util.List;
import com.sun.model.Student;

public interface Studentservice {

	public List<Student> findAll();

	public Student findById(int theid);

	public Student save(Student theEmployee);

	public void deleteById(int theid);
	
	
}

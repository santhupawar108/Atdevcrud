package com.sun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sun.model.*;
import com.sun.service.*;

@RestController
@RequestMapping("/students")
public class StudentController {

	private Studentservice studentService;
	
	//@Autowired
	//private AddressService addressService;

	public StudentController(Studentservice theStudentService) {
		
		studentService = theStudentService;
	}
	
	
	

	
	
	@GetMapping("/select")
	public List<Student> listStudent(Model theModel) 
	{
			
		return studentService.findAll();
		
	}
	
	
	
	
	@PostMapping("/update")
	 public Student showforUpdate(@RequestBody Student theStudent)
	 {
		 Student dbStudent = studentService.save(theStudent);
		 //theModel.addAttribute(theStudent);
		 return dbStudent;
	 }
	 
	@PostMapping("/insert")
	 public Student saveEmployee(@RequestBody Student theStudent)
	 {
		theStudent.setId(0);
		Student dbStudent = studentService.save(theStudent);
		 return dbStudent;
	 }
	
	@DeleteMapping("/delete/{theId}")
	public String delete(@PathVariable int theId)
	{
		Student theStudent = studentService.findById(theId);
		
		if(theStudent == null) {
			throw new RuntimeException("Student id not found - "+theId);
		}
		studentService.deleteById(theId);
		 return "Deleted Student id - " + theId;
	}
	
	
	 
	
	
}

package com.sun.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.model.Student;

import com.sun.dao.*;

@Service
public class StudentImpl implements Studentservice {

	
	private Studentrepo studentrepo;
	
	
	
	@Autowired
	public StudentImpl(Studentrepo theStudentrepo) {
		
		studentrepo = theStudentrepo;
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return studentrepo.findAll();
	}

	@Override
	public Student findById(int theid) {
		Optional<Student> result =studentrepo.findById(theid);
		Student theStudentrepo=null;
		if(result.isPresent()) 
		{
			theStudentrepo = result.get();
		}
		else {throw new RuntimeException("did not find student id- "+theid);}
		// TODO Auto-generated method stub
		return theStudentrepo;
	}

	@Override
	public Student save(Student theStudent) {
		// TODO Auto-generated method stub
		
		return studentrepo.save(theStudent);
		
	}

	@Override
	public void deleteById(int theid) {
		// TODO Auto-generated method stub
		
		studentrepo.deleteById(theid);
		
	}

}

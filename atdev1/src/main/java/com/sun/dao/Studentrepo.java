package com.sun.dao;

import com.sun.model.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Studentrepo extends JpaRepository<Student, Integer> {

}

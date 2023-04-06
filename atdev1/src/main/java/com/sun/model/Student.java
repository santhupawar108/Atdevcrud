package com.sun.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name="student")
public class Student {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String fristName;
	
	private String lastName;
	
	private String email;
	
	private long mobile;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	

	public Student(String fristName, String lastName, String email, long mobile) {
		super();
		this.fristName = fristName;
		this.lastName = lastName;
		this.email = email;
		this.mobile = mobile;
		
	}





	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public String getFristName() {
		return fristName;
	}





	public void setFristName(String fristName) {
		this.fristName = fristName;
	}





	public String getLastName() {
		return lastName;
	}





	public void setLastName(String lastName) {
		this.lastName = lastName;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	public long getMobile() {
		return mobile;
	}





	public void setMobile(long mobile) {
		this.mobile = mobile;
	}












	
	
	
	
	
	

}

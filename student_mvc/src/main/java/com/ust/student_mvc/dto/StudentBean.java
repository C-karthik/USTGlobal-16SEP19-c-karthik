package com.ust.student_mvc.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;



@Data
@Entity
@Table(name = "student")
public class StudentBean {
	
	@Id
	@Column
	@GeneratedValue    //autoincreament value
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String password;
	
	@Column(unique = true)
	private String email;
	
	@Column
	private Date doj;
	
	@Column
	private String gender;
}
package com.ustglobal.jpawithibernateapp.jpql.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "student")
@Data
public class Student {

	@Id
	@Column
	private int sid;

	@Column
	private String sname;

	@ManyToMany(cascade = CascadeType.ALL)
	
	//student_course is new table created automatically created by hbm2ddl.auto
	@JoinTable(name = "student_course" ,  joinColumns = @JoinColumn(name = "sid"),
	inverseJoinColumns = @JoinColumn(name = "cid"))

	private List<Course> course ;




}

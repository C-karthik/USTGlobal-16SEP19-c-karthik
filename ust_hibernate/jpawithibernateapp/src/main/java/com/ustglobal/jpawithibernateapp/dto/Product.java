package com.ustglobal.jpawithibernateapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")                 //for mapping

public class Product    {              //same as table name good practice
	
	@Id      //to make primary key
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column                      //@column(name = "pid") if different variables is used
	private int pid ;
	
	@Column
	private String pname;
	@Column
	private int quantity; 
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}

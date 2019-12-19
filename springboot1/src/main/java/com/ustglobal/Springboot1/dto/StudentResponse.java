package com.ustglobal.Springboot1.dto;

import java.util.List;

public class StudentResponse {

	private int statuscode;
	private String message;
	private String description;
	private List<StudentBean> studentBeans;

	public int getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<StudentBean> getStudentBeans() {
		return studentBeans;
	}
	public void setStudentBeans(List<StudentBean> studentBeans) {
		this.studentBeans = studentBeans;
	}

}

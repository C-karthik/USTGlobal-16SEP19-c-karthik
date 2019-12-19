package com.ustglobal.Springboot1.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ustglobal.Springboot1.dto.StudentResponse;

@RestControllerAdvice
public class HandleStudentException {
	
	@ExceptionHandler(Exception.class)
	public StudentResponse getException() {
		
		StudentResponse studentResponse = new StudentResponse();
		
		studentResponse.setStatuscode(500);
		studentResponse.setMessage("Internal Server Error");
		studentResponse.setDescription("An Exception Occured");
		
		return studentResponse;
		
		
	}

}

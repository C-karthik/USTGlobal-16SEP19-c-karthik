package com.ustglobal.spring_rest.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ustglobal.spring_rest.dto.EmployeeResponse;

@RestControllerAdvice
public class HandleException {
	
	@ExceptionHandler(Exception.class)
	public EmployeeResponse getException() {
		
		EmployeeResponse employeeResponse = new EmployeeResponse();
		employeeResponse.setStatuscode(501);
		employeeResponse.setMessage("Errors are occured");
		employeeResponse.setDescription("Got exception ");
		
		return employeeResponse;
	}

}

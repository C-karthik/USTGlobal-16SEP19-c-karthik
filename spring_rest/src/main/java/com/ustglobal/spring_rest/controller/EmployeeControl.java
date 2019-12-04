package com.ustglobal.spring_rest.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.spring_rest.dto.EmployeeBean;
import com.ustglobal.spring_rest.dto.EmployeeResponse;
import com.ustglobal.spring_rest.service.EmployeeService;

@RestController
public class EmployeeControl {
	public static final String SUCCESS_MESSAGE = "Success";

	@Autowired
	private EmployeeService service;

	@PostMapping(path = "/add" ,
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public  EmployeeResponse addEmpoyee(@RequestBody EmployeeBean bean) {
		EmployeeResponse employeeResponse = new EmployeeResponse();
		if(service.addEmpoyee(bean)) {

			employeeResponse.setStatuscode(201);
			employeeResponse.setMessage("Success");
			employeeResponse.setDescription("Data added to DB");
		}else {
			employeeResponse.setStatuscode(401);
			employeeResponse.setMessage("Failure");
			employeeResponse.setDescription("Data not added to DB");


		}
		return employeeResponse;

	}//end of add

	@PutMapping(path = "/modify" ,
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse modifyEmployee(@RequestBody EmployeeBean bean) {
		EmployeeResponse employeeResponse = new EmployeeResponse();
		if(service.modifyEmployee(bean)) {

			employeeResponse.setStatuscode(201);
			employeeResponse.setMessage("Success");
			employeeResponse.setDescription("Data modified to DB");
		}else {
			employeeResponse.setStatuscode(401);
			employeeResponse.setMessage("Failure");
			employeeResponse.setDescription("Data not Modified to DB");


		}
		return employeeResponse;

	}// end of modify

	@DeleteMapping(path = "/delete/{id}" , 
			produces = MediaType.APPLICATION_JSON_VALUE )
	public EmployeeResponse deleteEmployee(@PathVariable("id")int id) {
		EmployeeResponse employeeResponse = new EmployeeResponse();
		if(service.deleteEmployee(id)) {

			employeeResponse.setStatuscode(201);
			employeeResponse.setMessage("Success");
			employeeResponse.setDescription("Data Deleted from DB");
		}else {
			employeeResponse.setStatuscode(401);
			employeeResponse.setMessage("Failure");
			employeeResponse.setDescription("Data not Deleted to DB");


		}


		return employeeResponse;

	}//end of delete


	@GetMapping(path = "/get",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployeeBean(@RequestParam("id")int id) {
		EmployeeResponse employeeResponse = new EmployeeResponse();
		EmployeeBean bean = service.getEmployeeBean(id);
		if(bean!=null) {
			employeeResponse.setStatuscode(201);
			employeeResponse.setMessage("Success");
			employeeResponse.setDescription("Data found in DB");
			employeeResponse.setEmployeeBeans(Arrays.asList(bean)); // a single object to list type and stored
		}else {
			employeeResponse.setStatuscode(401);
			employeeResponse.setMessage("Failure");
			employeeResponse.setDescription("Data not found in DB");


		}
		return employeeResponse;
	}//end of get


	@GetMapping(path = "/get-all" , produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getAllEmployeeBeans(){

		EmployeeResponse employeeResponse = new EmployeeResponse();
		List<EmployeeBean> bean = service.getAllEmployeeBeans();
		if(!bean.isEmpty()) {
			employeeResponse.setStatuscode(201);
			employeeResponse.setMessage("Success");
			employeeResponse.setDescription("Data found in DB");
			employeeResponse.setEmployeeBeans(bean); // a single object to list type and stored
		}else {
			employeeResponse.setStatuscode(401);
			employeeResponse.setMessage("Failure");
			employeeResponse.setDescription("Data not found in DB");


		}
		return employeeResponse;
	}//end of get all

	@GetMapping(path = "/excep" , produces = MediaType.APPLICATION_JSON_VALUE)
	public void createException() {
		
		int i = 1/0;
	}//end of excep



}

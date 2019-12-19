package com.ustglobal.Springboot1.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.Springboot1.dto.StudentBean;
import com.ustglobal.Springboot1.dto.StudentResponse;
import com.ustglobal.Springboot1.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService service;

	StudentResponse studentResponse = new StudentResponse();

	@PostMapping(path = "/add" ,
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public StudentResponse addStudents( @RequestBody StudentBean bean) {

		if(service.addStudents(bean)) {

			studentResponse.setStatuscode(200);
			studentResponse.setMessage("success");
			studentResponse.setDescription("StudentsData Add to DB");
			studentResponse.setStudentBeans(Arrays.asList(bean));

		}else {

			studentResponse.setStatuscode(400);
			studentResponse.setMessage("Bad Request You Sent");
			studentResponse.setDescription("StudentData is not added to db");

		}
		return studentResponse;
	}
	@PutMapping(path = "/modify" ,
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public StudentResponse modifySudentData(@RequestBody StudentBean bean) {

		if(service.modifySudentData(bean)) {

			studentResponse.setStatuscode(200);
			studentResponse.setMessage("success");
			studentResponse.setDescription("StudentsData Updated in DB");
			studentResponse.setStudentBeans(Arrays.asList(bean));

		}else {

			studentResponse.setStatuscode(400);
			studentResponse.setMessage("Bad Request You Sent");
			studentResponse.setDescription("StudentData is not Updated in db");

		}

		return studentResponse;

	}

	public StudentResponse deleteStudent(int id) {
		if(service.deleteStudent(id)) {

			studentResponse.setStatuscode(200);
			studentResponse.setMessage("success");
			studentResponse.setDescription("StudentsData deleted from DB");

		}else {

			studentResponse.setStatuscode(400);
			studentResponse.setMessage("Bad Request You Sent");
			studentResponse.setDescription("StudentData is not deleted from db");

		}
		return studentResponse;
	}
	
	@DeleteMapping(path = "/get/{id}" , 
			produces = MediaType.APPLICATION_JSON_VALUE )

	public StudentResponse getStudent(@PathVariable("id") int id) {

		 StudentBean bean = service.getStudent(id);
		if(bean != null) {

			studentResponse.setStatuscode(200);
			studentResponse.setMessage("success");
			studentResponse.setDescription("StudentsData in  DB");
			studentResponse.setStudentBeans(Arrays.asList(bean));

		}else {

			studentResponse.setStatuscode(400);
			studentResponse.setMessage("Bad Request You Sent");
			studentResponse.setDescription("StudentData is not added to db");

		}
		return studentResponse;

	}

	@DeleteMapping(path = "/get-all" , 
			produces = MediaType.APPLICATION_JSON_VALUE )
	public  StudentResponse getAllStudents(){

		List<StudentBean> bean = service.getAllStudents();

		if(bean != null) {

			studentResponse.setStatuscode(200);
			studentResponse.setMessage("success");
			studentResponse.setDescription("StudentsData in  DB");
			studentResponse.setStudentBeans(bean);

		}else {

			studentResponse.setStatuscode(400);
			studentResponse.setMessage("Bad Request You Sent");
			studentResponse.setDescription("StudentData is not added to db");

		}
		return studentResponse;

	}





}

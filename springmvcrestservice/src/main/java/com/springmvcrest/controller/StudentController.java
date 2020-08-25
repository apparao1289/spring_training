package com.springmvcrest.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springmvcrest.business.StudentBusiness;
import com.springmvcrest.model.Result;
import com.springmvcrest.model.Student;

@Controller
public class StudentController {
	
	@Autowired
	private StudentBusiness studentBusiness;
	
	@GetMapping(value="/student/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Student getStudentDetailsById(@PathVariable("id") int id ) {
		
		return studentBusiness.getStudentDetailsById(id);
	}
	
	@PutMapping(value = "/student/{id}/{stand}" ,produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Result updateStudent(@PathVariable("id") int id, @PathVariable("stand") String stand) {
		
		return studentBusiness.updateStudent(id,stand);
	}
	
	@DeleteMapping(value = "/student/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Result deleteStudent(@PathVariable("id") int id) {
		
		return studentBusiness.deleteStudent(id);
	}
	
	@PostMapping(value="/student" ,consumes = MediaType.APPLICATION_JSON_VALUE ,produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Result createStudent(@RequestBody Student student) {
		
		return studentBusiness.createStudent(student);
	}
}

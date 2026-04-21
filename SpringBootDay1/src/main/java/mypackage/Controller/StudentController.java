package mypackage.Controller;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mypackage.model.*;
//import mypackage.Repository.*;
import mypackage.Services.*;


@RestController
@CrossOrigin(origins="*",methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE},allowedHeaders = "*")
public class StudentController {

	@Autowired
	StudentService studservice;
	
	
	@PostMapping("api/student")
	
	public Student Add(@RequestBody Student st) {
		return studservice.AddStudent(st);
		
	}
	
@PutMapping("api/student")
	
	public Student Update(@RequestBody Student st) {
		return studservice.AddStudent(st);
		
	}
@GetMapping("api/student")
public List<Student>GetAll(){
	return studservice.GetAllStudent();
	
}

@GetMapping("api/student/{id}")
 public Student GetBy(@PathVariable("id")int rno) {
	return  studservice.GetStudentById(rno);
	
	
}

@DeleteMapping("api/student/{id}")

public Student GetDelete(@PathVariable("id")int rno) {
	return studservice.DeleteStudent(rno);
	
}
	
}

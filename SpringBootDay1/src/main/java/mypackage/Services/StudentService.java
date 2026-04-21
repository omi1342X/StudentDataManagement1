package mypackage.Services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mypackage.model.*;
import mypackage.Repository.*;

@Service
public class StudentService {

	@Autowired
	StudentRepository studrepo;
	
	
	public Student AddStudent(Student st) {
		Student s=studrepo.save(st);
		return s;
		
	}
	
	public Student UpdateStudent(Student st) {
		
		Student s=studrepo.save(st);
		return s;
		
	}
	
	public List<Student>GetAllStudent(){
		return studrepo.findAll();

	}
	
	public Student GetStudentById(int rno) {
		return studrepo.findById(rno).get();
		
	}
	
	
	public Student DeleteStudent(int rno) {
		
		Student s=GetStudentById(rno);
		studrepo.delete(s);
		return s;
		
	}
	
	
}

package mypackage.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//import mypackage.model.*;
//import mypackage.Repository.*;
import mypackage.Services.*;
//import java.util.*;
@Controller
public class StudentDummyController {

	@Autowired
	StudentService studservice;
	
	@GetMapping("/student")
	
	public String Index() {
		return "Student";
	}
}

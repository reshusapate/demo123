package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//public class CollegeController {
//
////	public static void main(String[] args) {
////		// TODO Auto-generated method stub
//	
//	private static final String template="Hello";
//    
//	@PostMapping("/College")
//	Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {
//	    
//	    return repository.findById(id)
//	      .map(employee -> {
//	        employee.setName(newEmployee.getName());
//	        employee.setRole(newEmployee.getRole());
//	        return repository.save(employee);
//	      })
//	      .orElseGet(() -> {
//	        newEmployee.setId(id);
//	        return repository.save(newEmployee);
//	      });
//	  }
//	}
//
//}
@RestController
public class CollegeController {

@Autowired
private CollegeService collegeSerivice;

@GetMapping("/home")
public String home() {
	return "Welcome to courses application";
}

@PostMapping("/college")
public College addCourse (@RequestBody College college) {
return this.collegeSerivice.addCollege(college);
}

}


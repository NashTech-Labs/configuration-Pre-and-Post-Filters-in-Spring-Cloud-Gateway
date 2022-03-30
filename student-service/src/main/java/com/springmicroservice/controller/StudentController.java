package com.springmicroservice.controller;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	/**
     * Controller is used to invoke services and it's return json object as response.
     */

	@GetMapping("/records")
	public JSONObject test(@RequestHeader("student-request") String header) {
		JSONObject obj=new JSONObject();  
		  obj.put("subject_code","Math");   
		  obj.put("dept_name","CSE"); 
		  obj.put("name","Sumit");  
		  obj.put("id",new Integer(101));  
		  System.out.println("Student Service Invoked...");
		  System.out.println(header);
	return obj;
	}
}

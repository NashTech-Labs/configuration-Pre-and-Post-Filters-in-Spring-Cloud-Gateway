package com.springmicroservice.controller;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subject")
public class SubjectController {
	
	/**
     * Controller is used to invoke services and it's return json object as response.
     */
	
	@GetMapping("/records")
	public JSONObject test(@RequestHeader("subject-request") String header) {
		JSONObject obj=new JSONObject();   
		  obj.put("code","Math");   
		  obj.put("name","Mathematics");  
		  obj.put("subjectId",new Integer(101));  
		  System.out.println("Subject Service Invoked...");
		  System.out.println(header);
	return obj;
	}
}

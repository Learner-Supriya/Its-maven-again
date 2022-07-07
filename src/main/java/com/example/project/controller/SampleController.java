package com.example.project.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.pojoClassExample.greatLearning;
@RestController
public class SampleController {
	@GetMapping("/info")
//	@ResponseBody
	public greatLearning get() {
		greatLearning gl=new greatLearning();
		gl.setCourseId("1010");
		gl.setCourseName("ML");
		gl.setInstructor("samarth");
		return gl;
	}
	
	@PostMapping("custominfo")
	public greatLearning customInfo(String CourseType,String CourseId,String Instructor) {
		greatLearning gl=new greatLearning();
		gl.setCourseId(CourseId);
		gl.setCourseName(CourseType);
		gl.setInstructor(Instructor);
		return gl;
	}
}



	

	

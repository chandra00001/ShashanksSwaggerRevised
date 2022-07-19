package com.greatlearning.library.springbootlibrarydesign1.controller;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.library.springbootlibrarydesign1.model.GreatLearning;



//@Controller
@RestController("/")
public class ExampleController {

	@GetMapping("/info")
	// @ResponseBody
	public GreatLearning get() {
		GreatLearning greatLearning = new GreatLearning();
		greatLearning.setCourseName("Learn Controllers in Spring boot");
		greatLearning.setCourseType("Information Technology");
		greatLearning.setInstructorName("Samarth Narula");
		return greatLearning;
	}

	@PostMapping("customiInfo")
	public GreatLearning customiInfo(String courseName, String courseType, String instructorName) {

		GreatLearning greatLearning = new GreatLearning();
		greatLearning.setCourseName(courseName);
		greatLearning.setCourseType(courseType);
		greatLearning.setInstructorName(instructorName);
		return greatLearning;
	}
}

package com.greatlearning.library.springbootlibrarydesign1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.greatlearning.library.springbootlibrarydesign1.model.GreatLearning;



@SpringBootApplication
public class Springbootlibrarydesign1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springbootlibrarydesign1Application.class, args);
		System.out.println("Hello Spring Boot");
		System.out.println("Hello Dev tools");
	}
	public void run(String... args) throws Exception {

		GreatLearning greatLearning = new GreatLearning();
		greatLearning.setCourseName("test course");
		greatLearning.setCourseType("Information Technolgy");
		greatLearning.setInstructorName("Samarth Narula");
		System.out.println("Great Learning " + greatLearning);

		
		
		// greatLearning.getCourseName();
		// System.out.println("Course Name: " + greatLearning);

//		GreatLearning greatLearning = new GreatLearning();
//		greatLearning.setCourseName("Designing Microservices with Spring Boot");
//		greatLearning.setCourseType("Information Technolgy");
//		greatLearning.setInstructorName("Samarth Narula");
//
//		System.out.println("Great Learning Object" + greatLearning);
//		System.out.println("Get method for Course Name " + greatLearning.getCourseName());
//		System.out.println("Get Course Type " + greatLearning.getCourseType());
//		System.out.println("Get Instructor Name " + greatLearning.getInstructorName());
//
//		GreatLearning greatLearning = new GreatLearning("Designing Microservices with Spring Boot ", "Information Technolgy", "Samarth Narula");
//		
//		System.out.println("Great Learning object created using all args constructor " + greatLearning);

	}


}

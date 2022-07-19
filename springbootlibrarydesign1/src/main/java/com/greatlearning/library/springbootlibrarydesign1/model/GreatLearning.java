package com.greatlearning.library.springbootlibrarydesign1.model;

//import lombok.Data;
//import lombok.Getter;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;
//import lombok.Setter;

//@Getter
//@Setter
//@ToString

//@Data
/**
 * @author sheka
 *
 */
public class GreatLearning {

	private String courseName;
	private String courseType;
	private String instructorName;
	
	

	public GreatLearning() {

	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	@Override
	public String toString() {
		return "GreatLearning [courseName=" + courseName + ", courseType=" + courseType + ", instructorName="
				+ instructorName + "]";
	}

	public GreatLearning(String courseName, String courseType, String instructorName) {
		super();
		this.courseName = courseName;
		this.courseType = courseType;
		this.instructorName = instructorName;
	}

	
	
}

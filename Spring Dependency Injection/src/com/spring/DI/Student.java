package com.spring.DI;

public class Student {
	
	private String StudentName;
	
	
	
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}



	public void displayStudentInfo() {
		System.out.println("StudentName is: " + StudentName);
	}
	

}

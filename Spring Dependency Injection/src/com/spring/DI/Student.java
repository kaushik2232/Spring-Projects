package com.spring.DI;

public class Student {
	
	private String StudentName;
	private int id;
	private String Email;
	private int mobileno;
	

	public Student(int id, String Email) {
		
		this.id = id;
		this.Email = Email;
	}

	public void setStudentName(String studentName) {
		this.StudentName = studentName;
	}

	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}


	public void displayStudentInfo() {
		System.out.println("StudentName is: " + StudentName + " and id is: " + id 
				+ " email is: " + Email + " mobileno is: " + mobileno);
	}
	

}

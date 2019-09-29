package com.spring.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student st1 = context.getBean("student",Student.class);
		st1.displayStudentInfo();
	}
	

}

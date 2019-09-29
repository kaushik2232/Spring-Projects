package com.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		
//		Airtel airtel = new Airtel();
//		Vodaphone voda = new Vodaphone();
//		airtel.calling();
//		airtel.data();
//		voda.calling();
//		voda.data();
		
//		Sim sim = new Airtel();
//		sim.calling();
//		sim.data();
		
//		Airtel air = context.getBean("airtel", Airtel.class);
//		air.calling();
//		air.data();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config loaded");
		Sim sim = context.getBean("sim", Sim.class);
		sim.calling();
		sim.data();
	}

}

package com.spring.ioc;

public class Vodaphone implements Sim {

	@Override
	public void calling() {
		System.out.println("calling using vodaphone sim");
	}

	@Override
	public void data() {
		System.out.println("browsing using vodaphone sim");

	}

}

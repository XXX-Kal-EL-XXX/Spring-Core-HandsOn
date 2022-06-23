package com.springcore.auto.wire.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/autoannotationconfig.xml");
		Flight flight =  context.getBean("flight1",Flight.class);
		System.out.println(flight);
		context.close();
	}

}

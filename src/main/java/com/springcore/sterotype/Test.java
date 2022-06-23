package com.springcore.sterotype;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/sterotype/sterotypeconfig.xml");
		Student student =  context.getBean("object",Student.class);
		System.out.println(student);
		context.close();
	}

}

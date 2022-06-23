package com.springcore.spel;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/spel.xml");
		Demo demo =  context.getBean("test",Demo.class);
		Teacher teacher = context.getBean("obj",Teacher.class);
		System.out.println(demo);
		System.out.println(teacher);
		context.close();
	}

}

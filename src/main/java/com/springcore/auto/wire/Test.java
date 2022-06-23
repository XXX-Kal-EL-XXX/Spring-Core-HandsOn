package com.springcore.auto.wire;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/autoconfig.xml");
		
		
		//Type casting can be done in two ways
//		------------------------------------------------------------------
//		Student student =  context.getBean("student1",Student.class);
		
//		Student student1 = (Student) context.getBean("student1");
//		------------------------------------------------------------------
//		
//		System.out.println(student);
		
		
//		Student student2 = context.getBean("student2",Student.class);
//		System.out.println(student2);
		
		Student student3 = context.getBean("student3",Student.class);
		System.out.println(student3);
		context.close();
	}

}

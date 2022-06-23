package com.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructorinjection/ciconfig.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person);
		
		System.out.println();
		
		Person person1 = (Person) context.getBean("person1");
		System.out.println(person1);
		
		System.out.println();
		
		Person person2 = (Person) context.getBean("person2");
		System.out.println(person2);
		
		System.out.println();
		
		Person1 per = (Person1) context.getBean("per");
		System.out.println(per);
		
		System.out.println();
	
		Addition add1 = (Addition) context.getBean("addition");
		add1.add();
		
		System.out.println();
		
		Addition add2 = (Addition) context.getBean("addition1");
		add2.add();
		
		System.out.println();
		
		Addition add3 = (Addition) context.getBean("addition2");
		add3.add();
		
		
		
	}

}

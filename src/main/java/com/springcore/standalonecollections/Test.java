package com.springcore.standalonecollections;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalonecollections/standalone.xml");
		Person p = context.getBean("list1",Person.class);
		Person p1 = context.getBean("list2",Person.class);
		Person p2 = context.getBean("list3",Person.class);
		Person p3 = context.getBean("list4",Person.class);
		
		
		//Printing the type of List which spring uses by default
		System.out.println(p.getName().getClass().getName());
		System.out.println(p);
		
		System.out.println("=================================================================");
		
		System.out.println(p1.getName().getClass().getName());
		System.out.println(p1);
		
		System.out.println("=================================================================");
		
		System.out.println(p2.getSalary().getClass().getName());
		System.out.println(p2);
		
		System.out.println("=================================================================");
		
		System.out.println(p3.getProperties().getClass().getName());
		System.out.println(p3.getProperties());
		
		context.close();
		
		
	}

}

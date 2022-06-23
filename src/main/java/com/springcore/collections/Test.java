package com.springcore.collections;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
	Emp emp1 =(Emp) context.getBean("emp1");
	System.out.println(emp1.getName());
	System.out.println(emp1.getPhones());
	System.out.println(emp1.getAddress());
	System.out.println(emp1.getCourses());
	System.out.println(emp1.getProps());
	
	
	Person person = (Person) context.getBean("person");
	System.out.println(person);
	
	context.close();

	}

}

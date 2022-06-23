package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	 ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
	 A a = (A) context.getBean("aref");
	 System.out.println(a.getX());
	 System.out.println(a.getObj().getY());
	 System.out.println(a);
	 
	 System.out.println();
	 
	 A a1 = (A) context.getBean("aref1");
	 System.out.println(a1.getX());
	 System.out.println(a1.getObj().getY());
	 System.out.println(a1);
	 
	 System.out.println();
	 
	 A a2  = (A) context.getBean("aref2");
	 System.out.println(a2.getX());
	 System.out.println(a2.getObj().getY());
	 System.out.println(a2);
	

	}

}

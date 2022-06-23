package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
	context.registerShutdownHook();
	Product product = (Product) context.getBean("s1");
	System.out.println(product);
  
    
    System.out.println("---------------------------------------------------------");
    
    Cheetos ch = (Cheetos) context.getBean("c1");
    System.out.println(ch);
    
    
    System.out.println("---------------------------------------------------------");
    
    
   Example ex = (Example) context.getBean("ex1");
   System.out.println(ex);
   
   context.close();
    
    
	}

}

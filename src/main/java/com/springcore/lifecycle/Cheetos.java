package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Cheetos implements InitializingBean,DisposableBean {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Cheetos() {
		super();
	}

	@Override
	public String toString() {
		return "Cheetos [price=" + price + "]";
	}
	
	
	
	//Life Cycle method using Spring Interface i.e. InitializingBean and DisposalBean

	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside init method of Cheetos class");
		
	}

	public void destroy() throws Exception {
		System.out.println("Inside destroy method of Cheetos class");
		
	}
	
	
	
	
}

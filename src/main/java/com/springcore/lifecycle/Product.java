package com.springcore.lifecycle;

public class Product {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		System.out.println("Setting the price of the product");
	}

	public Product() {
		super();
	}

	@Override
	public String toString() {
		return "Product [price=" + price + "]";
	}
	
	
	
	//Life Cycle Method(It should not have any arguments inside method and method name can be anything)
	
	
	public void init() {
		System.out.println("Inside init method");
	}
	
	public void destroy() {
		System.out.println("Inside Destroy method");
	}
	
	
}

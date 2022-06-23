package com.springcore.auto.wire.annotation;

public class Information {
	private double price;
	private String name;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Information() {
		super();
	}
	public Information(double price, String name) {
		super();
		this.price = price;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Information [price=" + price + ", name=" + name + "]";
	}
	
	
	
}

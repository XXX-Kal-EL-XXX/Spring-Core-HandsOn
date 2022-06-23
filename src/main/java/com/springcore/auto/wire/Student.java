package com.springcore.auto.wire;

public class Student {

	private Information information;

	public Information getInformation() {
		return information;
	}

	public void setInformation(Information information) {
		System.out.println("Setting value using setter injection");
		this.information = information;
	}

	public Student() {
		super();
		
	}

	public Student(Information information) {
		super();
		System.out.println("Inside constructor injecting via constructor injection");
		this.information = information;
	}

	@Override
	public String toString() {
		return "Student [information=" + information + "]";
	}
	
}

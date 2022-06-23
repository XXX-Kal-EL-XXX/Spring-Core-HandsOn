package com.springcore.constructorinjection;

public class Person1 {
	private String personName;
	private int personId;
	private Certificate certi;
	
	public Person1(String personName, int personId, Certificate certi) {
		super();
		this.personName = personName;
		this.personId = personId;
		this.certi = certi;
	}

	@Override
	public String toString() {
	
		return this.personName+" : "+this.personId+ " { "+this.certi.name+" }";
	}
	
	
	
	
	
	

}

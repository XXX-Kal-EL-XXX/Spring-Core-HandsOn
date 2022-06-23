package com.springcore.collections;

import java.util.List;

public class Person {
	private String personName;
	private int personId;
	private List<String> list;
	public Person(String personName, int personId, List<String> list) {
		super();
		this.personName = personName;
		this.personId = personId;
		this.list = list;
	}
	@Override
	public String toString() {
	
		return this.personName+" : "+this.personId+" "+this.list;
	}
	
	
	
	

}

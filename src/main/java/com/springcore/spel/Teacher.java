package com.springcore.spel;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("obj")
public class Teacher {
	@Value("Clark Kent")
	private String name;
	
	@Value("Meghalaya")
	private String city;
	
	@Value("#{depart}")
	private List<String> department;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<String> getDepartment() {
		return department;
	}
	public void setDepartment(List<String> department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", city=" + city + ", department=" + department + "]";
	}
	
	

}

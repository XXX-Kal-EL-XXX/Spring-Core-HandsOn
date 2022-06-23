package com.springcore.standalonecollections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	private List<String> name;
	private Map<String, Double> salary;
	private Properties properties;
	
	
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	public List<String> getName() {
		return name;
	}
	public void setName(List<String> name) {
		this.name = name;
	}
	public Map<String, Double> getSalary() {
		return salary;
	}
	public void setSalary(Map<String, Double> salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", salary=" + salary + "]";
	}
	
	

}

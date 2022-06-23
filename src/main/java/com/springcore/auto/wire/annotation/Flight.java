package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Flight {
	@Autowired
	@Qualifier("information1")
	// Setting Value via Property Injection
	private Information information;
    
	public Information getInformation() {
		return information;
	}

//	@Autowired
	public void setInformation(Information information) {
		System.out.println("Setting Value via Setter Injection");
		this.information = information;
	}

//	@Autowired
	public Flight(Information information) {
		super();
		System.out.println("Setting Value via Construction Injection");
		this.information = information;
	}

	public Flight() {
		super();
	
	}

	@Override
	public String toString() {
		return "Flight [information=" + information + "]";
	}

}

package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("test")
public class Demo {
	@Value("#{22+22}")
	private int a;
	
	@Value("#{8>6? 07 : 0}")
	private int b;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "Demo [a=" + a + ", b=" + b + "]";
	}
	
	

}

package com.springcore.constructorinjection;

public class Addition {
	private int a;
	private int b;
	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Constructor of Type: int, int");
	}
	
	public Addition(double a, double b) {
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("Constructor of Type: double, double");
	}
	
	public Addition(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Constructor of Type: String, String");
	}
	
	public void add() {
		System.out.println("Value of a: "+this.a);
		System.out.println("Value of b: "+this.b);
		System.out.println("Sum is = "+(this.a + this.b));
	}

}

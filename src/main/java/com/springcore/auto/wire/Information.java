package com.springcore.auto.wire;

public class Information {
	private int rollNo;
	private String subject;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Information() {
		super();
	}
	public Information(int rollNo, String subject) {
		super();
		this.rollNo = rollNo;
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Information [rollNo=" + rollNo + ", subject=" + subject + "]";
	}
	
	
	

}

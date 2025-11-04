package com.task3;

public class Encapsulation {
	private int empid;
	private String empName;
	private int empsal;
	public int getEmpid() {
		return empid;
	}
	
	
	public Encapsulation(int empid, String empName, int empsal) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empsal = empsal;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpsal() {
		return empsal;
	}
	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}
	@Override
	public String toString() {
		return "Encapsulation [empid=" + empid + ", empName=" + empName + ", empsal=" + empsal + "]";
	}
	

}

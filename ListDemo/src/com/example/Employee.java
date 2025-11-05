package com.example;

public class Employee {
	private int Empid;
	private String Empname;
	private int Empsal;
	
	public Employee()

	{
		
	}
	
	
	public Employee(int empid, String empname, int empsal) {
		super();
		Empid = empid;
		Empname = empname;
		Empsal = empsal;
	}


	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	public int getEmpsal() {
		return Empsal;
	}
	public void setEmpsal(int empsal) {
		Empsal = empsal;
	}
	@Override
	public String toString() {
		return "Employee [Empid=" + Empid + ", Empname=" + Empname + ", Empsal=" + Empsal + "]";
	}
	
	
	

}

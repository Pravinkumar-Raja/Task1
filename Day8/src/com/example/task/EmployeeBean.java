package com.example.task;

import java.io.Serializable;

public class EmployeeBean implements Serializable{
	private transient int eid;
	private String ename;
	private  int salary;
	public EmployeeBean(int eid, String ename, int salary) {
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public String getEname() {
		return ename;
	}
	public int getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "EmployeeBean [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
	

}

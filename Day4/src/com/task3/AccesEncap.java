package com.task3;

public class AccesEncap {
	
	public static void main(String[] args) {
		Encapsulation e=new Encapsulation(102,"Vinoth",35000);
//		e.setEmpid(101);
//		e.setEmpName("Pavin");
//		e.setEmpsal(33000);
		System.out.println("Emp id: "+e.getEmpid()+" Emp Name: "+e.getEmpid()+" Emp Salary: "+e.getEmpsal());
		System.out.println(e);
	}

}

package com.example3;

public class Admission extends Student{

	void add()
	{
		super.add();
		System.out.println("1 students is added");
	}
	
	public static void main(String[] args) {
		Admission a=new Admission();
		
		a.add();
	}
}

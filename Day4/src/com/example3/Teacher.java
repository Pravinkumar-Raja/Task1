package com.example3;

public class Teacher extends School{
	void add()
	{
		super.add();
		System.out.println("New Teacher is joined");
	}
	public static void main(String[] args) {
		Teacher t=new Teacher();
		t.add();
	}

}

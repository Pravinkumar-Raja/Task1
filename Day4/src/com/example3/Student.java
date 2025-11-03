package com.example3;

public class Student extends School{
    int total=1501;
	void add()
	{
		System.out.println("Total number of students before admission: "+super.total);
		
		System.out.println("New transfer student is joined today");
		super.add();
	}
	void present()
	{
		System.out.println("All the students are present");
	}
	
	public static void main(String[] args) {
		Student s=new Student();
		s.add();
		s.present();
		System.out.println("The total number of students in the school: "+s.total);
	}
}

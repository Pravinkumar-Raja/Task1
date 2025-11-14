package com.example;

public class Example {
	
	record Employee(int empid,String empname)
	{
		
	}
public static void main(String[] args) {
	String str="""
			Hello This is Pravin.
			I am in the Java Training """;
	System.out.println(str);
	Employee e=new Employee(101,"Praivn");
	System.out.println(e);
}
}

package com.example3;

public class Simple {
	Simple()
	{
		this(5);
		System.out.println("Welcome");
	}
	Simple(int x)
	{
		this("PK");
		System.out.println(x*x);
	}
	Simple(String n)
	{
		
		System.out.println("The name is "+n);
		eat();
	}
	void eat()
	{
		System.out.println("Eats");
	}
	int x=22;
	void dip(int x)
	{
		this.x=x;
		System.out.println(x);
		System.out.println(this.x);
		
	}
	
	
	public static void main(String[] args) {
		Simple s=new Simple();
		System.out.println(s.x);
		s.dip(77);
		System.out.println(s.x);
	}

}

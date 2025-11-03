package com.example3;

class A{
	A()
	{
		System.out.println("A class constructor");
	}
	A(int x)
	{
		System.out.println(x+" is a A class number");
	}
}
public class B extends A{
	B()
	{
		super(5);
		System.out.println("B class constructor");
	}
	
	B(int x)
	{
		super(x);
		System.out.println("B class x is "+x);
	}
	public static void main(String[] args) {
		new B(22);
	}

}

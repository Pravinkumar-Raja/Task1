package com.example3;

public class Hi {
	void add()
	{
		System.out.println("This is addition");
	}
	int add(int x)
	{
		return x+x;
	}
	public static void main(String[] args) {
		Hi h=new Hi();
		h.add();
		System.out.println(h.add(5));
	}

}

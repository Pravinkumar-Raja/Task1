package com.example;

public class Global {
	static int amount=2000;

	public static void main(String[] args) {

		Global b1=new Global();

		Global b2=new Global();

		b1.amount+=5000;

		System.out.println("First Object "+b1.amount);

		System.out.println("Second Object "+b2.amount);

		System.out.println("Class Level "+Global.amount);
	}

}

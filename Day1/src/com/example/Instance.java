package com.example;

public class Instance {
	int amount=2000;

	public static void main(String[] args) {

		Instance b1=new Instance();

		Instance b2=new Instance();

		b1.amount+=5000;

		System.out.println("First Object "+b1.amount);

		System.out.println("Second Object "+b2.amount);

}
}

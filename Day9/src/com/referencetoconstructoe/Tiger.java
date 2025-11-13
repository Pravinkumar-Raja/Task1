package com.referencetoconstructoe;

public class Tiger {

	Tiger()
	{
		System.out.println("Reference to constructor");
	}
	public static void main(String[] args) {

		Animal a=Tiger::new;
		a.eat();
	}

}

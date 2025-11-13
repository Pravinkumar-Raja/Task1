package com.referncetostatic;

public class Tiger {

	public static void tigerEat()
	{
		System.out.println("Eats only Non Veg");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=Tiger::tigerEat;
		a.eat();

	}

}

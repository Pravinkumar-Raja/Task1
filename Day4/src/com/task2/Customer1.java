package com.task2;

public class Customer1 extends Hotel{
	
	public static void main(String[] args) {
		Customer1 c=new Customer1();
		c.chickenBiriyani();
		c.mandi();
		c.shawarma();
		c.meals();
		c.idly();
		c.chappati();
		c.bill();
		
		Veg v =new Customer1();
		v.meals();
		v.idly();
		v.chappati();
		
		
		NonVeg n=new Customer1();
		n.chickenBiriyani();
		n.shawarma();
		n.mandi();
		
		
	}

}

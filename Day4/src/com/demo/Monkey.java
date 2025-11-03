package com.demo;

public class Monkey extends Animal implements Tiger,Mammal{

	public void eat()
	{
		
		System.out.println("Eats bananas");
		super.eat();
	}
	
	public static void main(String[] args) {
		Monkey m=new Monkey();
		m.eat();
		m.run();
		m.live();
		m.hunt();
		System.out.println(Tiger.legs);
	}

	@Override
	public void live() {
		System.out.println("Lives in the forest");
	}
}

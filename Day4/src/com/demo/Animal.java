package com.demo;

public class Animal implements Tiger{

	@Override
	public void eat() {
		System.out.println("Animal eats veg and non veg");
	}

	@Override
	public void run() {
		System.out.println("Runs faster");
	}
	public static void main(String[] args) {
		Animal a=new Animal();
		a.eat();
		a.run();
		a.hunt();
		System.out.println("Tiger has "+Tiger.legs+" legs");
	}

	@Override
	public void hunt() {
		System.out.println("Animal do hunting");
	}

}

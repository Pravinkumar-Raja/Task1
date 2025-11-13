package com.example.demo;

import java.io.PrintStream;

public class Tiger {
public void tigerEat()
{
	System.out.println("Eats only non veg");
}
public static void main(String[] args) {
	Tiger t=new Tiger();
	Animal a=t::tigerEat;
	a.eat();
	PrintStream ps=new PrintStream(System.out);
	ps.println("This is Reference to instance Method");
}
}


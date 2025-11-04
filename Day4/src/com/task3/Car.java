package com.task3;

public abstract class Car {
public final void color()
{
	System.out.println("Blak Color");
}

public static void brandName()
{
	System.out.println("Thor");
}
 public abstract void start();
 public abstract void increaseSpeed();
 public abstract void stop();
 
 public static void main(String[] args) {
System.out.println("This is main method");
Car.brandName();
}
 
}

package com.task3;

public class Driver extends Car{

	@Override
	public void start() {
		System.out.println("Driver Starts the car");
		
	}

	@Override
	public void increaseSpeed() {
		System.out.println("Driver increases the speed");
		
	}

	@Override
	public void stop() {
System.out.println("Driver stops the car");		
	}
	
	public void traffic()
	{
		System.out.println("Driver stuck in the traffic");
	}
	
	public static void main(String[] args) {
		Car c=new Driver();
		c.color();
		c.brandName();
		c.start();
		c.increaseSpeed();
		c.stop();

		
		Driver d=new Driver();
		d.color();
		d.brandName();
		d.start();
		d.increaseSpeed();
		d.stop();
		d.traffic();
	}

}

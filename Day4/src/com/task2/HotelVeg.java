package com.task2;

public class HotelVeg implements Veg{

	@Override
	public void meals() {
		System.out.println(".....Today Afternoon Special.....");
		System.out.println("Meal with Fish - 100");
		
		
	}

	@Override
	public void idly() {
		System.out.println("......Today Morning Special......");
		System.out.println("Idly with sambar - 10");
		
	}

	@Override
	public void chappati() {
		System.out.println(".....Today Night Special.....");
		System.out.println("Chappati with Kadalakari - 70");
		
	}
	
	

}

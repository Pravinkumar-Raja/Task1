package com.task2;

public class Hotel implements Veg,NonVeg{
int total=0;
	@Override
	public void chickenBiriyani() {
		int cost =200;
		total+=cost;
		System.out.println("Today Special");
		System.out.println("Hyderabad Biriyani (Unlimited) "+cost);
		
		
	}

	@Override
	public void mandi() {
		int cost =250;
		total+=cost;
		System.out.println("Mandi Special");
		System.out.println("Mandi with Tandoori and Desert (Combo) "+cost);
		
	}

	@Override
	public void shawarma() {
		int cost=100;
		total+=cost;
		System.out.println("Shwarama Special");
		System.out.println("Large Shawarma with Desert (combo) "+100);
		
	}

	@Override
	public void meals() {
		int cost=80;
		total+=cost;
		System.out.println("Meal with Fish "+cost);
		
	}

	@Override
	public void idly() {
		int cost =10;
		total+=cost;
		System.out.println("Idly with sambar "+cost);
		
	}

	@Override
	public void chappati() {
		int cost=70;
		total+=cost;
		System.out.println("Chappati with Kadalakari "+cost);
		
	}
	public void bill()
	{

		System.out.println("The total amount is "+total);
	}
	

}

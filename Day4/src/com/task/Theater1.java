package com.task;

import java.util.Scanner;

public class Theater1 implements MalayalamMovies{

	@Override
	public void manjumelBoys(int x) {
		System.out.println("............................");
		System.out.println("Booked Manjummel Boys");
		System.out.println("The Total Ticket Cost is "+x);
		System.out.println("Enjoy the movie.....");
		System.out.println("............................");
		
	}

	@Override
	public void mangalvaram(int x) {
		System.out.println("............................");
		System.out.println("Booked Mangalvaram");
		System.out.println("The Total Ticket Cost is "+x);
		System.out.println("Enjoy the movie.....");
		System.out.println("............................");
		
	}

	@Override
	public void lokahChaper1(int x) {
		System.out.println("............................");
		System.out.println("Booked Lokah chapter 1");
		System.out.println("The Total Ticket Cost is "+x);
		System.out.println("Enjoy the movie.....");
		System.out.println("............................");
		
	}

	@Override
	public void brammayugam(int x) {
		System.out.println("............................");
		System.out.println("Booked Brammayugam");
		System.out.println("The Total Ticket Cost is "+x);
		System.out.println("Enjoy the movie.....");
		System.out.println("............................");
		
	}



	@Override
	public void coldCase(int x) {
		System.out.println("............................");
		System.out.println("Booked Cold Case");
		System.out.println("The Total Ticket Cost is "+x);
		System.out.println("Enjoy the movie.....");
		System.out.println("............................");
	}


	public void display() {

		System.out.println("......Movies for today......");
		System.out.println("1. Manjumel Boys - Ticket : 120");
		System.out.println("2. MangalVaram - Ticket : 100");
		System.out.println("3. Lokah chaper 1 - Ticket : 120");
		System.out.println("4. Cold Case - Ticket : 100");
		System.out.println("5. Brammayuagam - Ticket : 150");
		
	}

}

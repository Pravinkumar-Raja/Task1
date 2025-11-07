package com.example.task;

public class InsufficientAccountBalance extends Exception{

	int amount;

	public InsufficientAccountBalance(int amount) {
		
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "InsufficientAccountBalance [amount=" + amount + "]";
	}
	
}

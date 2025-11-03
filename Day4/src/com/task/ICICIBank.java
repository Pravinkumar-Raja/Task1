package com.task;

public class ICICIBank implements Loan{

	@Override
	public int interestRate(int amount) {
		int SI = (amount*2*10)/100;
		return SI;
	}
	

}

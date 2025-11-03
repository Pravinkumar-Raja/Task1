package com.example3;

public class Task {
	int amount=2000;
	void balance()
	{
		if(this.amount<0)
		{
			System.out.println("Invalid balance");
		}
		System.out.println("Your balance is "+amount);
	}
	
	void withdraw(int amount)
	{
		if(amount>this.amount)
		{
			System.out.println("Invalid amount, Try again");
			return;
		}
		this.amount=this.amount-amount;
		System.out.println("Withdrawn amount: "+amount);
	}
	
	void deposit(int amount)
	{
		this.amount=this.amount+amount;
		System.out.println("Deposited amount: "+amount);
		
	}
	
	public static void main(String[] args) {
		Task t=new Task();
		t.balance();
		t.withdraw(5000);
		t.balance();
		t.deposit(10000);
		t.balance();
	}

}

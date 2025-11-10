package com.example;

public class CustomerWait {
	int amount=2000;
	public synchronized void withdraw(int amount)
	{
		if(this.amount>=amount)
		{
			System.out.println("Withdrawn Successfull");
		}
		else
		{
			System.out.println("Insufficient account Balance");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Withdraw process continuing");
	}
	
	public synchronized void deposit(int amount)
	{
		this.amount+=amount;
		System.out.println("Amount deposited successfully");
		notify();
	}
	
	public static void main(String[] args) {
		CustomerWait c=new CustomerWait();
		new Thread()
		{
			public void run()
			{
				c.withdraw(4000);
			}
		}.start();
		
		new Thread()
		{
			public void run() {
				c.deposit(10000);
			}
		}.start();
		
	}

}

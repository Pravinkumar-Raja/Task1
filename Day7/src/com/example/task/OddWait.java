package com.example.task;

public class OddWait {
	public synchronized void odd(int num)
	{
		for(int i=1;i<=num;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i+" is odd");
				System.out.println("Waiting for even to complete");
			}
			else
			{
				
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			notify();
		}
	}
	
	public synchronized void even(int num)
	{
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" is even");
				System.out.println("Waiting for odd to complete");
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			notify();
		}
	}
	
	public static void main(String[] args) {
		OddWait o=new OddWait();
		new Thread()
		{
			public void run()
			{
				o.odd(10);
			}
		}.start();
		
		new Thread() {
			public void run()
			{
				o.even(10);
			}
		}.start();
	}

}

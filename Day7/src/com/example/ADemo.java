package com.example;

public class ADemo 
//extends Thread
{
//	public void run()
//	{
//		System.out.println(Thread.currentThread().getName()+" is running "+Thread.currentThread().getPriority()+" "+Thread.currentThread().isAlive());
//	}
public static synchronized void print(int x)//Method level Synchronization
{
	for(int i=1;i<=5;i++)
	{
		System.out.println(i*x);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public static synchronized void print(int x,int y)
{
//	synchronized(this)
//	{
	for(int i=1;i<=x;i++)
	{
	
		System.out.println(i*y);
		}
		
//	synchronized(this)
//	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//	}
//	}
}
}


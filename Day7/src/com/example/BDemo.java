package com.example;

public class BDemo extends Thread
{
	
//	ADemo b;
//	
////	public void run()
////	{
////		Thread t1=Thread.currentThread();
////		System.out.println(t1.getName()+" is running "+Thread.currentThread().getPriority());
////		
////	}
//	BDemo(ADemo b)
//	{
//		this.b=b;//b=ud(UserDemo) - ud(Reference variable of ADemo)
//	}
	public void run()
	{
		ADemo.print(100);//ud.print(100)
		
		ADemo.print(5, 8);
	}

}

package com.example;

public class AnanymousThread {
	public static void main(String[] args) {
		//without creating reference
		new Thread() {
			public void run()
		{
			System.out.println("First Thread");
		}
		}.start();
		
		//Anonymous with reference
		Thread t1=new Thread()
				{
			public void run()
			{
				System.out.println("Second Thread");
			}
				};
				
				t1.start();
		
		//Lambda function for Runnable
		Runnable rn=()->{System.out.println("Third Thread");};
		Thread t2=new Thread(rn);
		t2.start();
		
		//Anonymous without Thread reference and runnable reference
		new Thread(new Runnable() {
			public void run()
			{
				System.out.println("Fourth Thread");
			}
		}).start();;

		
	}

}

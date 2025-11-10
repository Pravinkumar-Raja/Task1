package com.example;

public class RunnableDemo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for(int i=1;i<=5;i++)
		{
			System.out.print(i+" ");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		RunnableDemo rd=new RunnableDemo();
		Thread th=new Thread(rd);
		th.start();
		Thread th1=new Thread(rd);
		th1.start();
		
	}

}

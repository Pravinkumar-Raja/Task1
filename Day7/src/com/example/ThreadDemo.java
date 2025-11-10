package com.example;

public class ThreadDemo extends Thread{
	public static ThreadDemo th;
public static void main(String[] args) {
	 th=new ThreadDemo();//New Born
	 ThreadDemo th1=new ThreadDemo();
	th.start();//Runnable
	th1.start();
	
}

public void run()
{
	for(int i=1;i<=5;i++)
	{
		System.out.print(i+" ");
		try {
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		th.suspend();
	}
}


}

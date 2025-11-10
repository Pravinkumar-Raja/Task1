package com.example;

public class User extends Thread{
	public void run()
	{
		System.out.println("User Method");
	}
	public static void main(String[] args) {
		
		Runnable at=()->{System.out.println("Runnable interface");};
		Thread t=new Thread(at);
		BThread bt=new BThread();
		User u=new User();
		
		t.start();
		bt.start();
		u.start();
	}

}

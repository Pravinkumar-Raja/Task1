package com.example;

public class UserDemo {
	public static void main(String[] args) {
//		ADemo ad=new ADemo();
//		BDemo bd=new BDemo();
////		ad.setName("First Thread");
//		bd.setName("Second Thread");
//		bd.setPriority(10);
//		
////		ad.start();
//		bd.start();
		
//		ADemo ud=new ADemo();
		BDemo bd=new BDemo();
		CDemo cd=new CDemo();
		bd.start();
		cd.start();
	}

}

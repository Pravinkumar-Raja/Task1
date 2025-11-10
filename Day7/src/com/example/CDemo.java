package com.example;

public class CDemo extends Thread{
//	ADemo b;
//	CDemo(ADemo t)
//	{
//		this.b=t;//b=t - b=ud - ud(Reference variable of ADemo)
//	}
	public void run()
	{
		ADemo.print(1000);//ud.print(1000)
		ADemo.print(5, 9);
	}

}

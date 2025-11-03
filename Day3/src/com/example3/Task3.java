package com.example3;

import java.util.Scanner;

public class Task3 {
	int prdno;
	String prdname;
	int prdprice;
	int stock;
    int n=5;
	
	Task3 ts[]=new Task3[n];
	Scanner sc=new Scanner(System.in);
	
	void add()
	{
		for(int i=0;i<n;i++)
		{
			ts[i]=new Task3();
			System.out.println("Enter the no");
			ts[i].prdno=sc.nextInt();
			System.out.println("Enter the name");
			ts[i].prdname=sc.next();
			System.out.println("Enter the price");
			ts[i].prdprice=sc.nextInt();
			System.out.println("Enter the stock");
			ts[i].stock=sc.nextInt();


		}
	}
	
	
	void update(int x)
	{
		for(int i=0;i<n;i++)
		{
			if(i==x)
			{
				ts[i].prdno=x+1;
				ts[i].prdname="Bucket";
				ts[i].prdprice=200;
				ts[i].stock=20;
			}
		}
		
	}
	void cart()
	{
		
		System.out.println("Enter the name");
		String s=sc.next();
		System.out.println("Enter the product needed");
		String name=sc.next();
		System.out.println("Enter the quantity need");
		int m=sc.nextInt();
		int total=0;
		for(int i=0;i<n;i++)
		{
			if(ts[i].prdname== name && ts[i].stock!=0)
			{
				total=m*ts[i].prdprice;
				ts[i].stock=ts[i].stock-m;
			}
			
			
		}
		System.out.println("Number of Product added to the cart is "+m);
		
	}
	void delete(int y)
	{
		for(int i=0;i<n;i++)
		{
			if(i==y)
			{
				n=ts.length-1;
			}
		}
		
	}
	void display()
	{
		for(int i=0;i<ts.length;i++)
		{
			System.out.println(ts[i]);
			System.out.println(ts[i].prdno);
			System.out.println(ts[i].prdname);
			System.out.println(ts[i].prdprice);
			System.out.println(ts[i].stock);

		}
	}
	

	@Override

	public String toString() {
	return "Products [prdno=" + prdno + ", prdname=" + prdname + ", prdprice=" + prdprice + ", stock= "+stock+"sc=" + sc + ", prd="+ "]\n";
	}
		
		
		public static void main(String[] args) {
		Task3 t=new Task3();
		t.add();
		t.display();
		t.update(3);
		t.display();
//		t.delete(1);
		t.cart();
		
	}

}

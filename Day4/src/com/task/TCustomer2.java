package com.task;

import java.util.Scanner;

public class TCustomer2 extends Theater2{
	

	
	public static void main(String[] args) {
		
		Theater2 t1=new TCustomer2();
		Scanner s=new Scanner(System.in);
		int ch,total,n;
		do {
			System.out.println("1.Display Movies");
			System.out.println("2.Book Movies");
			System.out.println("3.Exit");
			System.out.println("Enter your choice: ");
		    ch=s.nextInt();
			switch(ch)
			{
			case 1: t1.display();
			break;
			case 2: 
				System.out.println("Enter the movie choice");
				int c=s.nextInt();
				System.out.println("Enter the number of people");
				n=s.nextInt();
				switch(c)
				{
				case 1: if(c==1)
				{
					total=150*n;
					t1.varalaru(total);
					
				}
				break;
				case 2: if(c==2)
				{
					total=150*n;
					t1.citizen(n);
					
				}
				break;
				case 3: if(c==3)
				{
					total=120*n;
					t1.thoza(n);
					
				}
				break;
				case 4: if(c==4)
				{
					total=100*n;
					t1.aayirathilOruvan(n);
					
				}
				break;
				case 5: if(c==5)
				{
					total=150*n;
					t1.theeranAdhigaramOndru(n);
					
				}
				break;
				
				
				}
				
			case 3: System.exit(0); 
			
			}
			
		}while(ch!=3);
		
	
	}

}

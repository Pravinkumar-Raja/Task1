package com.task;

import java.util.Scanner;

public class TCustomer3 extends Theater3{
	
	void display()
	{
		System.out.println("......Movies for today......");
		System.out.println("........Malayalam.........");
		System.out.println("1. Manjumel Boys - Ticket : 120");
		System.out.println("2. MangalVaram - Ticket : 100");
		System.out.println("3. Lokah chaper 1 - Ticket : 120");
		System.out.println("4. Cold Case - Ticket : 100");
		System.out.println("5. Brammayuagam - Ticket : 150");
		System.out.println(".................................");
		System.out.println("......Movies for today......");
		System.out.println("........Tamil..........");
		System.out.println("1. Varalaru - Ticket : 150");
		System.out.println("2. Citizen - Ticket : 150");
		System.out.println("3. Thoza - Ticket : 120");
		System.out.println("4. Aayirathil Oruvan - Ticket : 100");
		System.out.println("5. Theeran Adhigaram Ondru - Ticket : 150");
	}

	public static void main(String[] args) {
		
		TCustomer3 t1=new TCustomer3();
		Scanner s=new Scanner(System.in);
		int ch,total,n;
		String lang="";
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
				System.out.println("Enter the language");
				lang=s.nextLine();
				if(lang.equals("Tamil"))
				{
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
				}
				if(lang.equals("Malayalam"))
				{
					switch(c)
					{
					case 1: if(c==1)
					{
						total=120*n;
						t1.manjumelBoys(total);
						
					}
					break;
					case 2: if(c==2)
					{
						total=100*n;
						t1.mangalvaram(total);
						
					}
					break;
					case 3: if(c==3)
					{
						total=120*n;
						t1.lokahChaper1(total);
						
					}
					break;
					case 4: if(c==4)
					{
						total=100*n;
						t1.coldCase(total);
						
					}
					break;
					case 5: if(c==5)
					{
						total=150*n;
						t1.brammayugam(total);
						
					}
					break;
					
					
					}
				}
				
			case 3: System.exit(0); 
			
			}
			
		}while(ch!=4);
	
	}

}

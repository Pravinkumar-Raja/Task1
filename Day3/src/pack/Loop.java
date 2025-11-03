package pack;

import java.util.Scanner;
public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		int count=0;
		System.out.println("Enter a number");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
		if(num%i==0)
		{
		count++;
		}
		}
		if(count==2)
		{
		System.out.println("Its a prime");
		}
		else
		{
		System.out.println("Not a prime");
		}
		
		//other
		
		for(int i=2;i<=Math.sqrt(num);i++)
		{
			if(num%i==0)
			{
				System.out.println("Not Prime");
				return;
			}
		}
		System.out.println("Prime number");

	}

}

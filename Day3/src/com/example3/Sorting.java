package com.example3;

public class Sorting {
	public int cube(int x)
	{
		return x*x*x*x/x;
	}
	public static void main(String[] args) {
		
		int result=new Sorting().cube(8);
		System.out.println(result);
		
		First:
			for(int i=0;i<5;i++)
			{
				Second:
					for(int j=0;j<5;j++)
					{
						if(j==2)
						{
						 break First;
						}
//						else if(j>2)
//						{
//							break Second;
//						}
						System.out.println("i: "+i+" j: "+j);
					}
			}
	}

}

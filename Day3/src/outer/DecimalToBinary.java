package outer;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int bin=0;
		//decimal to binary
		while(n>0)
		{
//			int r=i%10;
//			int d=r%2;
//			bin=d*10+bin;
//			n=n/10;
			int r=n%2;
			bin=bin*10+r;
			n=n/2;
		}
		System.out.println(bin);
		
		//2 power 3
		System.out.println((int)Math.pow(2, 3));
		
		//binary to decimal
		
		int b=0,i=0;
		while(bin>0)
		{
			int r=bin%10;
			b+=r*(int)Math.pow(2, i);
			bin=bin/10;
			i++;
		}
		System.out.println(b);
		
		//binary to octal
		
		int j=1;
	int oct=0;
		while(b>0)
		{
			int r=b%8;
			oct+=r*j;
			b=b/8;
			j*=10;
		}
		System.out.println(oct);
//		System.out.println(Integer.toOctalString(n));
	}

}

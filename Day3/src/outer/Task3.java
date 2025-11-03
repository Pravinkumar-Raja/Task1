package outer;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int fact=1;
		for(int i=n;i>0;i--)
		{
			fact*=i;
		}
		System.out.println(fact);
	}

}

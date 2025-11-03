package outer;

import java.util.Scanner;

public class Str {
	
	public static String extraEnd(String str)
	{
		if(str.length()>2)
		{
		int s=str.length();
		String st=str.substring((s/2)+1,s);
		return st+st+st;
		}
		return str+str+str;
	}
	public static void main(String[] args) {
		// String Problems
		//concatenation
		String str1="Welcome";
		System.out.println(str1.concat(" Pk"));
		
		//String reverse
		Scanner s=new Scanner(System.in);
		System.out.println(s);
		String str=s.nextLine();
		String rs="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rs+=str.charAt(i);
			
		}
		System.out.println(rs);
		
		// String buffer
		StringBuffer sb=new StringBuffer(str1);
		sb.reverse();
		System.out.println(sb);
		sb.append(" to java").append(" programming");
		System.out.println(sb);
		
		// Task
		char a='a';
		System.out.println((int)a);
		String str2="welCOmE";
		String ch="";
		for(int i=0;i<str2.length();i++)
		{
			char c=str2.charAt(i);
			
			System.out.println((int)c);
			if((int)c>=97 && (int)c<=124)
			{
				ch+=String.valueOf(c).toUpperCase();
			}
			else
			{
				ch+=String.valueOf(c).toLowerCase();
			}
			System.out.println(ch);
		}
		
		//another method
		String chan="";
		for(int i=0;i<str2.length();i++)
		{
			if(Character.isUpperCase(str2.charAt(i)))
			{
				chan+=Character.toLowerCase(str2.charAt(i));
			}
			else
			{
				chan+=Character.toUpperCase(str2.charAt(i));
			}
		}
		System.out.println(chan);
		
		//
		System.out.println(extraEnd("Hello"));
		
		// Task 2 welcome w-1,e-2,l-1,c-1,o-1,m-1
		
		String s1=s.nextLine();
		boolean b[]=new boolean[s1.length()];//b[7];
		for(int i=0;i<s1.length();i++)
		{
			int count=0;
			char chr=s1.charAt(i);
			if(b[i]) continue;//b[w] - storing the values in the boolean array
			for(int j=0;j<s1.length();j++)
			{
				if(chr==s1.charAt(j))
				{
					count++;
					b[j]=true;//b[w] - marking it as true so the value cannot be repeated
				}
			}
			System.out.println(chr+ " : "+count);
		}
		
		//how many vowels
		
		//palindrome or not 
		
		//factorial
	}

}

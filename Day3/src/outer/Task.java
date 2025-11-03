package outer;

public class Task {

	public static void main(String[] args) {
		//vowels
		
		String s1="Hello";
		String st="aeiou";
		char[] c1=st.toCharArray();
		String st2="AEIOU";
		char[] c2=st2.toCharArray();
//	
//		boolean[] b=new boolean[s1.length()];
		int total=0;
		
		for(int i=0;i<s1.length();i++)
		{
			int count =0;
			char c=s1.charAt(i);
//			System.out.println(c);
//			if(b[i])
//				{
//				System.out.println(b[i]);
//				continue;
//				}
			for(int j=0;j<s1.length();j++)
			{
//				System.out.println(c1[j]);
//				System.out.println(c2[j]);
			if(c==c1[j]||c==c2[j])
			{
				count++;
//				b[j]=true;
			}
			
			}
			System.out.println(c+" : "+count);
			total+=count;
		}
		System.out.println("The number of vowels in the string are : "+total);
	}
}

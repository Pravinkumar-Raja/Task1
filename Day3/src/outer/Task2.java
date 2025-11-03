package outer;

public class Task2 {
	public static void main(String[] args) {
		String s="hello";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
		}
		System.out.println(rev);
		if(s.equals(rev))
		{
			System.out.println("It is palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
	}

}

package pack;

public class Calc {
	public static int a=100;
	private int n=100;
	protected int m=100;
	int l=100;

	public static void add(int x,int y)
	{
	System.out.println("The addition of "+x+" and "+y+" is "+(x+y));
	}

	private void sub(int x,int y)
	{
	System.out.println("The subtraction of "+x+" and "+y+" is "+(x-y));
	}

	protected int mul(int x,int y)
	{
	return(x*y);
	}
	static void div(int x, int y)
	{
		System.out.println("The division of "+x+" and "+y+" is "+(x/y));
	}

	public static void main(String[] args) {
	Calc.add(22,33);
	Calc c=new Calc();
	c.sub(33,11);
	System.out.println(c.mul(22, 2));
	
	}

}

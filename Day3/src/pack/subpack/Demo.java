package pack.subpack;

import pack.Calc;

public class Demo extends Calc{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc.add(67, 88);
		Demo d=new Demo();
		System.out.println(d.mul(9, 9));
		System.out.println(Calc.a+d.m);
		
		

	}

}

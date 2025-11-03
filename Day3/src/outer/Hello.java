package outer;

import pack.Calc;

public class Hello extends Calc{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc.add(89, 9);
		Hello h=new Hello();
		System.out.println(h.mul(88, 88));
		System.out.println(Calc.a+h.m);
		

	}

}

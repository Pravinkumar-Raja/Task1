package com.example.calc;

public class Calculator {
private CalCSrevice d;
public Calculator(CalCSrevice c)
{
	this.d=c;
}
public int addOperation(int x,int y)
{
	int z=d.add(x, y);
	return z;
}
}

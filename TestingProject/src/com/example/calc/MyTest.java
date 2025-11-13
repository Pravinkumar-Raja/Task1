package com.example.calc;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
public class MyTest {
	Calc c=new Calc();
	
@After
public void print2()
{
	System.out.println("After Test2");
}
@Test

public void test1()
{
	assertEquals(25,c.add(13,12));
	assertEquals(7,c.add(-7, 14));
	
}
@Before
public void print()
{
	System.out.println("After Test1 and Before Test2");
}
@Test
public void test2()
{
	assertEquals(125,c.cube(5));
}
}

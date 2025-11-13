package com.example.calc;

import org.mockito.Mockito;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class MockitoTesting {
	CalCSrevice cserv=Mockito.mock(CalCSrevice.class);
	Calculator c=new Calculator(cserv);
//	Calculator c=Mockito.mock(Calculator.class);
@Test
public void test1()
{
	assertEquals(25,c.addOperation(12, 14));
}
	
}

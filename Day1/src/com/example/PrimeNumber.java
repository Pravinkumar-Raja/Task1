package com.example;

import javax.swing.JOptionPane;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// odd or even
String s1=JOptionPane.showInputDialog("Enter the number");
int a=Integer.parseInt(s1);
if(a%2!=0) {
	JOptionPane.showMessageDialog(null, "The number is odd ");
}
else 
{
	JOptionPane.showMessageDialog(null, "The number is even");
}

// prime numbers
if(a>1) {
if (a%2==0 || a%3==0)
{
	JOptionPane.showMessageDialog(null, "The number is not a prime");
}
else {
	JOptionPane.showMessageDialog(null, "The number is a prime number");
}
}
	}

}
